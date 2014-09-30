// Generated from /Users/probst/Documents/Work/Classes/2014/02332/assignments/MiniJava.g4 by ANTLR 4.1
package compiler.Frontend;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#typeInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(@NotNull MiniJavaParser.TypeIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull MiniJavaParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionIdentifier(@NotNull MiniJavaParser.ExpressionIdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull MiniJavaParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionUnaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionUnaryMinus(@NotNull MiniJavaParser.ExpressionUnaryMinusContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionConstantInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionConstantInteger(@NotNull MiniJavaParser.ExpressionConstantIntegerContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionConstantFalse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionConstantFalse(@NotNull MiniJavaParser.ExpressionConstantFalseContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull MiniJavaParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statementAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssign(@NotNull MiniJavaParser.StatementAssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#level5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel5(@NotNull MiniJavaParser.Level5Context ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#level4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel4(@NotNull MiniJavaParser.Level4Context ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull MiniJavaParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#level2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel2(@NotNull MiniJavaParser.Level2Context ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#level3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel3(@NotNull MiniJavaParser.Level3Context ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#level1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel1(@NotNull MiniJavaParser.Level1Context ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(@NotNull MiniJavaParser.MainClassContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#idThis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdThis(@NotNull MiniJavaParser.IdThisContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull MiniJavaParser.MethodDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(@NotNull MiniJavaParser.VarDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionConstantTrue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionConstantTrue(@NotNull MiniJavaParser.ExpressionConstantTrueContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull MiniJavaParser.ClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#typeClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeClass(@NotNull MiniJavaParser.TypeClassContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionParentheses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionParentheses(@NotNull MiniJavaParser.ExpressionParenthesesContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#typeBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBoolean(@NotNull MiniJavaParser.TypeBooleanContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull MiniJavaParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#idIDENT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdIDENT(@NotNull MiniJavaParser.IdIDENTContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull MiniJavaParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionConstantString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionConstantString(@NotNull MiniJavaParser.ExpressionConstantStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statementReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementReturn(@NotNull MiniJavaParser.StatementReturnContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#typeVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVoid(@NotNull MiniJavaParser.TypeVoidContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull MiniJavaParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull MiniJavaParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statementPrintln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementPrintln(@NotNull MiniJavaParser.StatementPrintlnContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#procType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcType(@NotNull MiniJavaParser.ProcTypeContext ctx);
}