package compiler.IR;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import compiler.Frontend.MiniJavaParser;
import compiler.Frontend.MiniJavaParser.ExpressionArrayAccessContext;
import compiler.Frontend.MiniJavaParser.ExpressionContext;
import compiler.Frontend.MiniJavaParser.ExpressionIdentifierContext;
import compiler.Frontend.MiniJavaParser.ExpressionMethodCallContext;
import compiler.Frontend.MiniJavaParser.ExpressionNegationContext;
import compiler.Frontend.MiniJavaParser.ExpressionNewIntArrayContext;
import compiler.Frontend.MiniJavaParser.ExpressionNewObjectContext;
import compiler.Frontend.MiniJavaParser.IdContext;
import compiler.Frontend.MiniJavaParser.ReturnCallContext;
import compiler.Frontend.MiniJavaParser.StatementArrayAssignmentContext;
import compiler.Frontend.MiniJavaParser.StatementBlockContext;
import compiler.Frontend.MiniJavaParser.StatementIfContext;
import compiler.Frontend.MiniJavaParser.StatementMethodCallContext;
import compiler.Frontend.MiniJavaParser.StatementPrintContext;
import compiler.Frontend.MiniJavaParser.StatementWhileContext;
import compiler.Frontend.MiniJavaVisitor;

public class IRbuilder extends AbstractParseTreeVisitor<IR> implements
		MiniJavaVisitor<IR> {

	// program
	// : mainClass ( classDeclaration )*
	// ;

	public MJProgram visitProgram(MiniJavaParser.ProgramContext ctx) {

		LinkedList<MJClass> classDeclarations = new LinkedList<MJClass>();

		classDeclarations.add(visitMainClass(ctx.mainClass()));

		for (MiniJavaParser.ClassDeclarationContext c : ctx.classDeclaration()) {
			classDeclarations.add(visitClassDeclaration(c));
		}

		return new MJProgram(classDeclarations);
	}

	// classDeclaration
	// : 'class' className=IDENT ( 'extends' superClassName=IDENT )?
	// '{' ( varDeclaration
	// )*
	// ( methodDeclaration
	// )*
	// '}'
	// ;

	public MJClass visitClassDeclaration(
			MiniJavaParser.ClassDeclarationContext ctx) {

		String className = ctx.className.getText();
		String superClassName = "Object";

		if (ctx.superClassName != null) {
			superClassName = ctx.superClassName.getText();
		}

		LinkedList<MJVariable> variableDeclarations = new LinkedList<MJVariable>();
		for (MiniJavaParser.VarDeclarationContext c : ctx.varDeclaration()) {
			variableDeclarations.add(visitVarDeclaration(c));
		}

		LinkedList<MJMethod> methods = new LinkedList<MJMethod>();
		for (MiniJavaParser.MethodDeclarationContext c : ctx
				.methodDeclaration()) {
			methods.add(visitMethodDeclaration(c));
		}

		return new MJClass(className, superClassName, variableDeclarations,
				methods);
	}

	// mainClass
	// : 'class' className=IDENT
	// '{'
	// 'public' 'static' 'void' 'main' '(' 'String' '[' ']' parameterName=IDENT
	// ')'
	// block
	// '}'
	// ;

	public MJMainClass visitMainClass(MiniJavaParser.MainClassContext ctx) {

		String className = ctx.className.getText();
		String parameterName = ctx.parameterName.getText();
		MJBlock body = visitBlock(ctx.block());

		return new MJMainClass(className, parameterName, body);
	}

	// block
	// : '{' ( varDeclaration )*
	// ( statement )*
	// '}'
	// ;

	public MJBlock visitBlock(MiniJavaParser.BlockContext ctx) {

		LinkedList<MJVariable> variableDeclarations = new LinkedList<MJVariable>();
		for (MiniJavaParser.VarDeclarationContext c : ctx.varDeclaration()) {
			variableDeclarations.add(visitVarDeclaration(c));
		}

		LinkedList<MJStatement> statements = new LinkedList<MJStatement>();
		for (MiniJavaParser.StatementContext c : ctx.statement()) {
			statements.add(visitStatement(c));
		}

		return new MJBlock(variableDeclarations, statements);
	}

	// varDeclaration
	// : variable ';'
	// ;

	public MJVariable visitVarDeclaration(
			MiniJavaParser.VarDeclarationContext ctx) {
		return (MJVariable) visitChildren(ctx);
	}

	// variable : type variableName=IDENT
	// ;

	public MJVariable visitVariable(MiniJavaParser.VariableContext ctx) {

		MJType variableType = visitType(ctx.type());
		String variableName = ctx.IDENT().getText();

		return new MJVariable(variableType, variableName);
	}

	// type
	// : typeBoolean
	// | typeInt
	// | typeClass
	// ;
	//
	// typeBoolean : 'boolean' ;
	// typeInt : 'int' ;
	// typeClass : className=IDENT;

	public MJType visitType(MiniJavaParser.TypeContext ctx) {
		return (MJType) visitChildren(ctx);
	}

	public MJType visitTypeBoolean(MiniJavaParser.TypeBooleanContext ctx) {
		return MJType.getBooleanType();
	}

	public MJType visitTypeInt(MiniJavaParser.TypeIntContext ctx) {
		return MJType.getIntType();
	}

	public MJType visitTypeClass(MiniJavaParser.TypeClassContext ctx) {
		return MJType.getClassType(ctx.className.getText());
	}

	public MJType visitVoidType(MiniJavaParser.TypeVoidContext ctx) {
		return MJType.getVoidType();
	}

	// methodDeclaration
	// : ( isPublic='public' )?
	// ( isStatic='static' )?
	// procType methodName=IDENT
	// '('
	// ( variable ( ',' variable )* )?
	// ')'
	// '{' ( varDeclaration )*
	// ( statement )*
	// statementReturn
	// '}'
	// ;

	public MJMethod visitMethodDeclaration(
			MiniJavaParser.MethodDeclarationContext ctx) {

		boolean isPublic = (ctx.isPublic != null);
		boolean isStatic = (ctx.isStatic != null);

		MJType returnType = visitProcType(ctx.procType());

		String methodName = ctx.methodName.getText();

		LinkedList<MJVariable> parameterList = new LinkedList<MJVariable>();
		for (MiniJavaParser.VariableContext c : ctx.variable()) {
			parameterList.add(visitVariable(c));
		}

		LinkedList<MJVariable> variableDeclarations = new LinkedList<MJVariable>();
		for (MiniJavaParser.VarDeclarationContext c : ctx.varDeclaration()) {
			variableDeclarations.add(visitVarDeclaration(c));
		}

		LinkedList<MJStatement> statements = new LinkedList<MJStatement>();
		for (MiniJavaParser.StatementContext c : ctx.statement()) {
			statements.add(visitStatement(c));
		}

		// TODO indset navn på context når gramatik er opdateret
		MJReturn returnCall = (MJReturn) visitReturnCall(ctx.returnCall());
		

		MJMethod method = new MJMethod(returnType, methodName, parameterList,
				variableDeclarations, statements, returnCall, isPublic, isStatic);

		return method;
	}

	// procType
	// : type
	// | voidtype
	// ;
	//
	// voidtype: 'void' ;

	public MJType visitProcType(MiniJavaParser.ProcTypeContext ctx) {
		return (MJType) visitChildren(ctx);
	}

	public MJType visitTypeVoid(MiniJavaParser.TypeVoidContext ctx) {
		return MJType.getVoidType();
	}

	// statement
	// : statementAssign
	// | statementPrintln
	// ;
	//
	// statementAssign : lhs=id '=' rhs=expression ';' ;
	// statementPrintln : 'System.out.println' '(' argument=expression ')' ';' ;
	// statementReturn : 'return' ('(' argument=expression ')')? ';' ;

	public MJStatement visitStatement(MiniJavaParser.StatementContext ctx) {
		return (MJStatement) visitChildren(ctx);
	}

	public MJStatement visitStatementAssign(
			MiniJavaParser.StatementAssignContext ctx) {

		MJIdentifier leftHandSide = (MJIdentifier) visitIdentifier(ctx.lhs);
		MJExpression rightHandSide = (MJExpression) visitExpression(ctx.rhs);

		return new MJAssign(leftHandSide, rightHandSide);
	}

	public MJStatement visitStatementPrintln(
			MiniJavaParser.StatementPrintlnContext ctx) {

		MJExpression argument = (MJExpression) visitExpression(ctx.argument);

		return new MJPrintln(argument);
	}

	public MJStatement visitReturn(
			MiniJavaParser.ReturnCallContext ctx) {

		ExpressionContext expression = ctx.argument;
		
		MJExpression argument = null;
		if (expression != null)
			argument = visitExpression(expression);
				
		return new MJReturn(argument);
	}

	// expression
	// : head=level1 ( '&&' tail+=level1 )*
	// ;

	public MJExpression visitExpression(MiniJavaParser.ExpressionContext ctx) {

		MJExpression root = visitLevel1(ctx.head);

		for (MiniJavaParser.Level1Context c : ctx.tail) {
			MJExpression newRoot = new MJAnd(root, visitLevel1(c));
			root = newRoot;
		}

		return root;
	}

	// level1
	// : head=level2 ( '==' tail+=level2 )*
	// ;

	public MJExpression visitLevel1(MiniJavaParser.Level1Context ctx) {

		MJExpression root = visitLevel2(ctx.head);

		for (MiniJavaParser.Level2Context c : ctx.tail) {
			MJExpression newRoot = new MJEqual(root, visitLevel2(c));
			root = newRoot;
		}

		return root;
	}

	// level2
	// : head=level3
	// ;

	public MJExpression visitLevel2(MiniJavaParser.Level2Context ctx) {

		MJExpression root = visitLevel3(ctx.head);

		return root;
	}

	// level3
	// : head=level4 ( '+' tail+=level4 )*
	// ;

	public MJExpression visitLevel3(MiniJavaParser.Level3Context ctx) {

		MJExpression root = visitLevel4(ctx.head);

		for (MiniJavaParser.Level4Context c : ctx.tail) {
			MJExpression newRoot = new MJPlus(root, visitLevel4(c));
			root = newRoot;
		}

		return root;
	}

	// level4
	// : head=level5
	// ;

	public MJExpression visitLevel4(MiniJavaParser.Level4Context ctx) {

		MJExpression root = visitLevel5(ctx.head);

		return root;
	}

	// level5
	// : expressionUnaryMinus
	// | expressionIdentifier
	// | expressionParentheses
	// | expressionConstantTrue
	// | expressionConstantFalse
	// | expressionConstantInteger
	// | expressionConstantString
	// ;
	//
	// expressionUnaryMinus : '-' argument=level5 ;
	// expressionIdentifier : identifier ;
	// expressionParentheses : '(' argument=expression ')' ;
	// expressionConstantTrue : 'true' ;
	// expressionConstantFalse : 'false' ;
	// expressionConstantInteger : value=INT ;
	// expressionConstantString : value=STRING ;

	public MJExpression visitLevel5(MiniJavaParser.Level5Context ctx) {
		return (MJExpression) visitChildren(ctx);
	}

	public MJExpression visitExpressionUnaryMinus(
			MiniJavaParser.ExpressionUnaryMinusContext ctx) {
		return new MJUnaryMinus(visitLevel5(ctx.argument));
	}

	public MJExpression visitExpressionParentheses(
			MiniJavaParser.ExpressionParenthesesContext ctx) {
		return new MJUnaryMinus(visitExpression(ctx.argument));
	}

	public MJExpression visitExpressionConstantTrue(
			MiniJavaParser.ExpressionConstantTrueContext ctx) {
		return MJBoolean.True;
	}

	public MJExpression visitExpressionConstantFalse(
			MiniJavaParser.ExpressionConstantFalseContext ctx) {
		return MJBoolean.False;
	}

	public MJExpression visitExpressionConstantInteger(
			MiniJavaParser.ExpressionConstantIntegerContext ctx) {
		return new MJInteger(ctx.value.getText());
	}

	public MJExpression visitExpressionConstantString(
			MiniJavaParser.ExpressionConstantStringContext ctx) {
		return new MJString(ctx.value.getText());
	}

	// identifier
	// : id ( '.' selectors+=IDENT )*
	// ;
	//
	// id
	// : idThis
	// | idIDENT
	// ;
	//
	// idThis : 'this' ;
	// idIDENT : name=IDENT ;

	public MJIdentifier visitIdentifier(MiniJavaParser.IdentifierContext ctx) {
		MJIdentifier id = (MJIdentifier) visitId(ctx.id());

		for (Token t : ctx.selectors) {
			MJIdentifier selector = new MJIdentifier(t.getText());
			MJSelector s = new MJSelector(id, selector);
			id = s;
		}

		return id;
	}

	public MJIdentifier visitId(IdContext lhs) {
		return (MJIdentifier) visitChildren(lhs);
	}

	public MJIdentifier visitIdThis(MiniJavaParser.IdThisContext ctx) {
		return new MJIdentifier("this");
	}

	public MJIdentifier visitIdIDENT(MiniJavaParser.IdIDENTContext ctx) {
		return new MJIdentifier(ctx.name.getText());
	}

	// statementBlock
	// : block;
	public MJBlock visitStatementBlock(StatementBlockContext ctx) {
		return visitBlock(ctx.block());
	}

	// expressionNewObject
	// : 'new' IDENT '('')' ;
	public MJNewObjectExpression visitExpressionNewObject(
			ExpressionNewObjectContext ctx) {
		String className = ctx.IDENT().getText();
		MJType objectType = MJType.getClassType(className);
		return new MJNewObjectExpression(objectType);
	}

	// statementMethodCall
	//		: expressionMethodCall;
	public MJMethodCall visitStatementMethodCall(StatementMethodCallContext ctx) {
		return (MJMethodCall) visitExpressionMethodCall(ctx.expressionMethodCall());
	}

	// statementPrint
	//		: 'System.out.print' '(' argument = expression ')' ';';
	public MJPrint visitStatementPrint(StatementPrintContext ctx) {
		MJExpression argument = (MJExpression) visitExpression(ctx.argument);

		return new MJPrint(argument);
	}

	// expressionIdentifier
	//		: identifier ;
	public MJIdentifier visitExpressionIdentifier(ExpressionIdentifierContext ctx) {
		return (MJIdentifier) visitIdentifier(ctx.identifier());
	}

	// expressionNegation
	//		: '!' argument=level5;
	public MJNegate visitExpressionNegation(ExpressionNegationContext ctx) {
		return (MJNegate) visitLevel5(ctx.argument);
	}

	// expressionNewIntArray
	//		: 'new' 'int' '[' size=expression ']' ;
	public MJNewArray visitExpressionNewIntArray(ExpressionNewIntArrayContext ctx) {
		MJExpression size = visitExpression(ctx.size);
		return new MJNewArray(size);
	}

	// expressionArrayAccess
	//		: identifier '[' adress=expression ']';
	public MJArray visitExpressionArrayAccess(ExpressionArrayAccessContext ctx) {
		MJIdentifier array = visitIdentifier(ctx.identifier());
		MJExpression index = visitExpression(ctx.adress);
		return new MJArray(array, index);
	}

	// statementWhile              
	//		: 'while' '(' condition = expression ')' whilestatement = statement;
	public MJWhile visitStatementWhile(StatementWhileContext ctx) {
		MJExpression condition = visitExpression(ctx.condition);
		MJStatement statement = visitStatement(ctx.whilestatement);
		return new MJWhile(condition, statement);
	}

	// statementIf
	//		: 'if' '(' condition = expression ')' ifblock = block ('else'  elseblock = block)?;
	public IR visitStatementIf(StatementIfContext ctx) {
		MJExpression condition = visitExpression(ctx.condition); 
		MJBlock ifblock = visitBlock(ctx.ifblock);
		MJBlock elseblock = visitBlock(ctx.elseblock);
		
		if(elseblock != null) {
			return new MJIfElse(condition, ifblock, elseblock);
		}
		else {
			return new MJIf(condition, ifblock);
		}
	}

	// StatementArrayAssignment
	// statementArrayAssignment    : identifier '[' arrayexpression = expression ']'
	// '=' identifierExpression = expression ';'; 

	public IR visitStatementArrayAssignment(StatementArrayAssignmentContext ctx) {
		MJIdentifier identifier = visitIdentifier(ctx.identifier());
		MJExpression arrayExpression = visitExpression(ctx.arrayexpression);
		MJExpression identifierExpression = visitExpression(ctx.identifierExpression);
		return new MJArrayAssign(identifier,arrayExpression,identifierExpression);
	}

	// expressionMethodCall      
	// : (identifier '.')? 
	// IDENT '(' (reqExpression = expression(',' optExpression = expression)* )? ')'; 
	public IR visitExpressionMethodCall(ExpressionMethodCallContext ctx) {
		
		LinkedList<MJExpression> optExpressionList = new LinkedList<MJExpression>();
		String methodName = ctx.IDENT().getText();
		MJIdentifier identifier = visitIdentifier(ctx.identifier());
		MJExpression reqExpression = visitExpression(ctx.reqExpression);
		
		for (MiniJavaParser.ExpressionContext c : ctx.expression()) {
			optExpressionList.add(visitExpression(c));
		}
		
		
		return new MJMethodCall(identifier,methodName,reqExpression,optExpressionList);
	}

	@Override
	public IR visitReturnCall(ReturnCallContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

}
