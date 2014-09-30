// Generated from /Users/probst/Documents/Work/Classes/2014/02332/assignments/MiniJava.g4 by ANTLR 4.1
package compiler.Frontend;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__27=1, T__26=2, T__25=3, T__24=4, T__23=5, T__22=6, T__21=7, T__20=8, 
		T__19=9, T__18=10, T__17=11, T__16=12, T__15=13, T__14=14, T__13=15, T__12=16, 
		T__11=17, T__10=18, T__9=19, T__8=20, T__7=21, T__6=22, T__5=23, T__4=24, 
		T__3=25, T__2=26, T__1=27, T__0=28, IDENT=29, INT=30, STRING=31, COMMENT=32, 
		WHITESPACE=33;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'public'", "','", "'-'", "'['", "'('", "'int'", "'main'", 
		"'false'", "'void'", "'{'", "'extends'", "'boolean'", "'}'", "'true'", 
		"'static'", "'System.out.println'", "')'", "'.'", "'+'", "'return'", "'='", 
		"'String'", "';'", "'&&'", "'this'", "'=='", "'class'", "IDENT", "INT", 
		"STRING", "COMMENT", "WHITESPACE"
	};
	public static final int
		RULE_program = 0, RULE_classDeclaration = 1, RULE_mainClass = 2, RULE_block = 3, 
		RULE_varDeclaration = 4, RULE_variable = 5, RULE_type = 6, RULE_typeBoolean = 7, 
		RULE_typeInt = 8, RULE_typeClass = 9, RULE_methodDeclaration = 10, RULE_procType = 11, 
		RULE_typeVoid = 12, RULE_statement = 13, RULE_statementAssign = 14, RULE_statementPrintln = 15, 
		RULE_statementReturn = 16, RULE_expression = 17, RULE_level1 = 18, RULE_level2 = 19, 
		RULE_level3 = 20, RULE_level4 = 21, RULE_level5 = 22, RULE_expressionUnaryMinus = 23, 
		RULE_expressionIdentifier = 24, RULE_expressionParentheses = 25, RULE_expressionConstantTrue = 26, 
		RULE_expressionConstantFalse = 27, RULE_expressionConstantInteger = 28, 
		RULE_expressionConstantString = 29, RULE_identifier = 30, RULE_id = 31, 
		RULE_idThis = 32, RULE_idIDENT = 33;
	public static final String[] ruleNames = {
		"program", "classDeclaration", "mainClass", "block", "varDeclaration", 
		"variable", "type", "typeBoolean", "typeInt", "typeClass", "methodDeclaration", 
		"procType", "typeVoid", "statement", "statementAssign", "statementPrintln", 
		"statementReturn", "expression", "level1", "level2", "level3", "level4", 
		"level5", "expressionUnaryMinus", "expressionIdentifier", "expressionParentheses", 
		"expressionConstantTrue", "expressionConstantFalse", "expressionConstantInteger", 
		"expressionConstantString", "identifier", "id", "idThis", "idIDENT"
	};

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); mainClass();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==28) {
				{
				{
				setState(69); classDeclaration();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public Token className;
		public Token superClassName;
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiniJavaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MiniJavaParser.IDENT, i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(28);
			setState(76); ((ClassDeclarationContext)_localctx).className = match(IDENT);
			setState(79);
			_la = _input.LA(1);
			if (_la==12) {
				{
				setState(77); match(12);
				setState(78); ((ClassDeclarationContext)_localctx).superClassName = match(IDENT);
				}
			}

			setState(81); match(11);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(82); varDeclaration();
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 7) | (1L << 10) | (1L << 13) | (1L << 16) | (1L << IDENT))) != 0)) {
				{
				{
				setState(88); methodDeclaration();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94); match(14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainClassContext extends ParserRuleContext {
		public Token className;
		public Token parameterName;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiniJavaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MiniJavaParser.IDENT, i);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(28);
			setState(97); ((MainClassContext)_localctx).className = match(IDENT);
			setState(98); match(11);
			setState(99); match(2);
			setState(100); match(16);
			setState(101); match(10);
			setState(102); match(8);
			setState(103); match(6);
			setState(104); match(23);
			setState(105); match(5);
			setState(106); match(1);
			setState(107); ((MainClassContext)_localctx).parameterName = match(IDENT);
			setState(108); match(18);
			setState(109); block();
			setState(110); match(14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(11);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(113); varDeclaration();
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 26) | (1L << IDENT))) != 0)) {
				{
				{
				setState(119); statement();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125); match(14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); variable();
			setState(128); match(24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public Token variableName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); type();
			setState(131); ((VariableContext)_localctx).variableName = match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeBooleanContext typeBoolean() {
			return getRuleContext(TypeBooleanContext.class,0);
		}
		public TypeClassContext typeClass() {
			return getRuleContext(TypeClassContext.class,0);
		}
		public TypeIntContext typeInt() {
			return getRuleContext(TypeIntContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(136);
			switch (_input.LA(1)) {
			case 13:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); typeBoolean();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(134); typeInt();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(135); typeClass();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBooleanContext extends ParserRuleContext {
		public TypeBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBooleanContext typeBoolean() throws RecognitionException {
		TypeBooleanContext _localctx = new TypeBooleanContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeBoolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIntContext extends ParserRuleContext {
		public TypeIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIntContext typeInt() throws RecognitionException {
		TypeIntContext _localctx = new TypeIntContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeClassContext extends ParserRuleContext {
		public Token className;
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public TypeClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeClassContext typeClass() throws RecognitionException {
		TypeClassContext _localctx = new TypeClassContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); ((TypeClassContext)_localctx).className = match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public Token isPublic;
		public Token isStatic;
		public Token methodName;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public ProcTypeContext procType() {
			return getRuleContext(ProcTypeContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public StatementReturnContext statementReturn() {
			return getRuleContext(StatementReturnContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if (_la==2) {
				{
				setState(144); ((MethodDeclarationContext)_localctx).isPublic = match(2);
				}
			}

			setState(148);
			_la = _input.LA(1);
			if (_la==16) {
				{
				setState(147); ((MethodDeclarationContext)_localctx).isStatic = match(16);
				}
			}

			setState(150); procType();
			setState(151); ((MethodDeclarationContext)_localctx).methodName = match(IDENT);
			setState(152); match(6);
			setState(161);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 13) | (1L << IDENT))) != 0)) {
				{
				setState(153); variable();
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(154); match(3);
					setState(155); variable();
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(163); match(18);
			setState(164); match(11);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(165); varDeclaration();
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 26) | (1L << IDENT))) != 0)) {
				{
				{
				setState(171); statement();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177); statementReturn();
			setState(178); match(14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeVoidContext typeVoid() {
			return getRuleContext(TypeVoidContext.class,0);
		}
		public ProcTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProcType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProcType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitProcType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcTypeContext procType() throws RecognitionException {
		ProcTypeContext _localctx = new ProcTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_procType);
		try {
			setState(182);
			switch (_input.LA(1)) {
			case 10:
				enterOuterAlt(_localctx, 1);
				{
				setState(180); typeVoid();
				}
				break;
			case 7:
			case 13:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(181); type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVoidContext extends ParserRuleContext {
		public TypeVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTypeVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTypeVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTypeVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVoidContext typeVoid() throws RecognitionException {
		TypeVoidContext _localctx = new TypeVoidContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeVoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); match(10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementPrintlnContext statementPrintln() {
			return getRuleContext(StatementPrintlnContext.class,0);
		}
		public StatementAssignContext statementAssign() {
			return getRuleContext(StatementAssignContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(188);
			switch (_input.LA(1)) {
			case 26:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(186); statementAssign();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 2);
				{
				setState(187); statementPrintln();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementAssignContext extends ParserRuleContext {
		public IdContext lhs;
		public ExpressionContext rhs;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignContext statementAssign() throws RecognitionException {
		StatementAssignContext _localctx = new StatementAssignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statementAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); ((StatementAssignContext)_localctx).lhs = id();
			setState(191); match(22);
			setState(192); ((StatementAssignContext)_localctx).rhs = expression();
			setState(193); match(24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementPrintlnContext extends ParserRuleContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementPrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPrintln; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPrintlnContext statementPrintln() throws RecognitionException {
		StatementPrintlnContext _localctx = new StatementPrintlnContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statementPrintln);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(17);
			setState(196); match(6);
			setState(197); ((StatementPrintlnContext)_localctx).argument = expression();
			setState(198); match(18);
			setState(199); match(24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementReturnContext extends ParserRuleContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementReturnContext statementReturn() throws RecognitionException {
		StatementReturnContext _localctx = new StatementReturnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statementReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(21);
			setState(206);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(202); match(6);
				setState(203); ((StatementReturnContext)_localctx).argument = expression();
				setState(204); match(18);
				}
			}

			setState(208); match(24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Level1Context head;
		public Level1Context level1;
		public List<Level1Context> tail = new ArrayList<Level1Context>();
		public List<Level1Context> level1() {
			return getRuleContexts(Level1Context.class);
		}
		public Level1Context level1(int i) {
			return getRuleContext(Level1Context.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); ((ExpressionContext)_localctx).head = level1();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==25) {
				{
				{
				setState(211); match(25);
				setState(212); ((ExpressionContext)_localctx).level1 = level1();
				((ExpressionContext)_localctx).tail.add(((ExpressionContext)_localctx).level1);
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Level1Context extends ParserRuleContext {
		public Level2Context head;
		public Level2Context level2;
		public List<Level2Context> tail = new ArrayList<Level2Context>();
		public Level2Context level2(int i) {
			return getRuleContext(Level2Context.class,i);
		}
		public List<Level2Context> level2() {
			return getRuleContexts(Level2Context.class);
		}
		public Level1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level1Context level1() throws RecognitionException {
		Level1Context _localctx = new Level1Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_level1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); ((Level1Context)_localctx).head = level2();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==27) {
				{
				{
				setState(219); match(27);
				setState(220); ((Level1Context)_localctx).level2 = level2();
				((Level1Context)_localctx).tail.add(((Level1Context)_localctx).level2);
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Level2Context extends ParserRuleContext {
		public Level3Context head;
		public Level3Context level3() {
			return getRuleContext(Level3Context.class,0);
		}
		public Level2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level2Context level2() throws RecognitionException {
		Level2Context _localctx = new Level2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_level2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); ((Level2Context)_localctx).head = level3();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Level3Context extends ParserRuleContext {
		public Level4Context head;
		public Level4Context level4;
		public List<Level4Context> tail = new ArrayList<Level4Context>();
		public Level4Context level4(int i) {
			return getRuleContext(Level4Context.class,i);
		}
		public List<Level4Context> level4() {
			return getRuleContexts(Level4Context.class);
		}
		public Level3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level3Context level3() throws RecognitionException {
		Level3Context _localctx = new Level3Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_level3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); ((Level3Context)_localctx).head = level4();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==20) {
				{
				{
				setState(229); match(20);
				setState(230); ((Level3Context)_localctx).level4 = level4();
				((Level3Context)_localctx).tail.add(((Level3Context)_localctx).level4);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Level4Context extends ParserRuleContext {
		public Level5Context head;
		public Level5Context level5() {
			return getRuleContext(Level5Context.class,0);
		}
		public Level4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level4Context level4() throws RecognitionException {
		Level4Context _localctx = new Level4Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_level4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); ((Level4Context)_localctx).head = level5();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Level5Context extends ParserRuleContext {
		public ExpressionConstantTrueContext expressionConstantTrue() {
			return getRuleContext(ExpressionConstantTrueContext.class,0);
		}
		public ExpressionConstantFalseContext expressionConstantFalse() {
			return getRuleContext(ExpressionConstantFalseContext.class,0);
		}
		public ExpressionUnaryMinusContext expressionUnaryMinus() {
			return getRuleContext(ExpressionUnaryMinusContext.class,0);
		}
		public ExpressionConstantStringContext expressionConstantString() {
			return getRuleContext(ExpressionConstantStringContext.class,0);
		}
		public ExpressionConstantIntegerContext expressionConstantInteger() {
			return getRuleContext(ExpressionConstantIntegerContext.class,0);
		}
		public ExpressionParenthesesContext expressionParentheses() {
			return getRuleContext(ExpressionParenthesesContext.class,0);
		}
		public ExpressionIdentifierContext expressionIdentifier() {
			return getRuleContext(ExpressionIdentifierContext.class,0);
		}
		public Level5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLevel5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLevel5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLevel5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level5Context level5() throws RecognitionException {
		Level5Context _localctx = new Level5Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_level5);
		try {
			setState(245);
			switch (_input.LA(1)) {
			case 4:
				enterOuterAlt(_localctx, 1);
				{
				setState(238); expressionUnaryMinus();
				}
				break;
			case 26:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(239); expressionIdentifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 3);
				{
				setState(240); expressionParentheses();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 4);
				{
				setState(241); expressionConstantTrue();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 5);
				{
				setState(242); expressionConstantFalse();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 6);
				{
				setState(243); expressionConstantInteger();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 7);
				{
				setState(244); expressionConstantString();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionUnaryMinusContext extends ParserRuleContext {
		public Level5Context argument;
		public Level5Context level5() {
			return getRuleContext(Level5Context.class,0);
		}
		public ExpressionUnaryMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionUnaryMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionUnaryMinusContext expressionUnaryMinus() throws RecognitionException {
		ExpressionUnaryMinusContext _localctx = new ExpressionUnaryMinusContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionUnaryMinus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); match(4);
			setState(248); ((ExpressionUnaryMinusContext)_localctx).argument = level5();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionIdentifierContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionIdentifierContext expressionIdentifier() throws RecognitionException {
		ExpressionIdentifierContext _localctx = new ExpressionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionParenthesesContext extends ParserRuleContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionParentheses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionParentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionParenthesesContext expressionParentheses() throws RecognitionException {
		ExpressionParenthesesContext _localctx = new ExpressionParenthesesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expressionParentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(6);
			setState(253); ((ExpressionParenthesesContext)_localctx).argument = expression();
			setState(254); match(18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionConstantTrueContext extends ParserRuleContext {
		public ExpressionConstantTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantTrueContext expressionConstantTrue() throws RecognitionException {
		ExpressionConstantTrueContext _localctx = new ExpressionConstantTrueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressionConstantTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); match(15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionConstantFalseContext extends ParserRuleContext {
		public ExpressionConstantFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantFalseContext expressionConstantFalse() throws RecognitionException {
		ExpressionConstantFalseContext _localctx = new ExpressionConstantFalseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expressionConstantFalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); match(9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionConstantIntegerContext extends ParserRuleContext {
		public Token value;
		public TerminalNode INT() { return getToken(MiniJavaParser.INT, 0); }
		public ExpressionConstantIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantIntegerContext expressionConstantInteger() throws RecognitionException {
		ExpressionConstantIntegerContext _localctx = new ExpressionConstantIntegerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressionConstantInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260); ((ExpressionConstantIntegerContext)_localctx).value = match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionConstantStringContext extends ParserRuleContext {
		public Token value;
		public TerminalNode STRING() { return getToken(MiniJavaParser.STRING, 0); }
		public ExpressionConstantStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionConstantString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionConstantString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionConstantString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantStringContext expressionConstantString() throws RecognitionException {
		ExpressionConstantStringContext _localctx = new ExpressionConstantStringContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionConstantString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); ((ExpressionConstantStringContext)_localctx).value = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public Token IDENT;
		public List<Token> selectors = new ArrayList<Token>();
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiniJavaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MiniJavaParser.IDENT, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); id();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==19) {
				{
				{
				setState(265); match(19);
				setState(266); ((IdentifierContext)_localctx).IDENT = match(IDENT);
				((IdentifierContext)_localctx).selectors.add(((IdentifierContext)_localctx).IDENT);
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public IdThisContext idThis() {
			return getRuleContext(IdThisContext.class,0);
		}
		public IdIDENTContext idIDENT() {
			return getRuleContext(IdIDENTContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_id);
		try {
			setState(274);
			switch (_input.LA(1)) {
			case 26:
				enterOuterAlt(_localctx, 1);
				{
				setState(272); idThis();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(273); idIDENT();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdThisContext extends ParserRuleContext {
		public IdThisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idThis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdThis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdThisContext idThis() throws RecognitionException {
		IdThisContext _localctx = new IdThisContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_idThis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); match(26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdIDENTContext extends ParserRuleContext {
		public Token name;
		public TerminalNode IDENT() { return getToken(MiniJavaParser.IDENT, 0); }
		public IdIDENTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idIDENT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdIDENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdIDENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdIDENT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdIDENTContext idIDENT() throws RecognitionException {
		IdIDENTContext _localctx = new IdIDENTContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_idIDENT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); ((IdIDENTContext)_localctx).name = match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3#\u011b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\3\3\3\3\3\3\3\5\3"+
		"R\n\3\3\3\3\3\7\3V\n\3\f\3\16\3Y\13\3\3\3\7\3\\\n\3\f\3\16\3_\13\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\7\5u\n\5\f\5\16\5x\13\5\3\5\7\5{\n\5\f\5\16\5~\13\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u008b\n\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\5\f\u0094\n\f\3\f\5\f\u0097\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009f"+
		"\n\f\f\f\16\f\u00a2\13\f\5\f\u00a4\n\f\3\f\3\f\3\f\7\f\u00a9\n\f\f\f\16"+
		"\f\u00ac\13\f\3\f\7\f\u00af\n\f\f\f\16\f\u00b2\13\f\3\f\3\f\3\f\3\r\3"+
		"\r\5\r\u00b9\n\r\3\16\3\16\3\17\3\17\5\17\u00bf\n\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00d1"+
		"\n\22\3\22\3\22\3\23\3\23\3\23\7\23\u00d8\n\23\f\23\16\23\u00db\13\23"+
		"\3\24\3\24\3\24\7\24\u00e0\n\24\f\24\16\24\u00e3\13\24\3\25\3\25\3\26"+
		"\3\26\3\26\7\26\u00ea\n\26\f\26\16\26\u00ed\13\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u00f8\n\30\3\31\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \7 \u010e"+
		"\n \f \16 \u0111\13 \3!\3!\5!\u0115\n!\3\"\3\"\3#\3#\3#\2$\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\2\u0114\2F\3"+
		"\2\2\2\4M\3\2\2\2\6b\3\2\2\2\br\3\2\2\2\n\u0081\3\2\2\2\f\u0084\3\2\2"+
		"\2\16\u008a\3\2\2\2\20\u008c\3\2\2\2\22\u008e\3\2\2\2\24\u0090\3\2\2\2"+
		"\26\u0093\3\2\2\2\30\u00b8\3\2\2\2\32\u00ba\3\2\2\2\34\u00be\3\2\2\2\36"+
		"\u00c0\3\2\2\2 \u00c5\3\2\2\2\"\u00cb\3\2\2\2$\u00d4\3\2\2\2&\u00dc\3"+
		"\2\2\2(\u00e4\3\2\2\2*\u00e6\3\2\2\2,\u00ee\3\2\2\2.\u00f7\3\2\2\2\60"+
		"\u00f9\3\2\2\2\62\u00fc\3\2\2\2\64\u00fe\3\2\2\2\66\u0102\3\2\2\28\u0104"+
		"\3\2\2\2:\u0106\3\2\2\2<\u0108\3\2\2\2>\u010a\3\2\2\2@\u0114\3\2\2\2B"+
		"\u0116\3\2\2\2D\u0118\3\2\2\2FJ\5\6\4\2GI\5\4\3\2HG\3\2\2\2IL\3\2\2\2"+
		"JH\3\2\2\2JK\3\2\2\2K\3\3\2\2\2LJ\3\2\2\2MN\7\36\2\2NQ\7\37\2\2OP\7\16"+
		"\2\2PR\7\37\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2SW\7\r\2\2TV\5\n\6\2UT\3"+
		"\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X]\3\2\2\2YW\3\2\2\2Z\\\5\26\f\2["+
		"Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\20\2"+
		"\2a\5\3\2\2\2bc\7\36\2\2cd\7\37\2\2de\7\r\2\2ef\7\4\2\2fg\7\22\2\2gh\7"+
		"\f\2\2hi\7\n\2\2ij\7\b\2\2jk\7\31\2\2kl\7\7\2\2lm\7\3\2\2mn\7\37\2\2n"+
		"o\7\24\2\2op\5\b\5\2pq\7\20\2\2q\7\3\2\2\2rv\7\r\2\2su\5\n\6\2ts\3\2\2"+
		"\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w|\3\2\2\2xv\3\2\2\2y{\5\34\17\2zy\3\2"+
		"\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7"+
		"\20\2\2\u0080\t\3\2\2\2\u0081\u0082\5\f\7\2\u0082\u0083\7\32\2\2\u0083"+
		"\13\3\2\2\2\u0084\u0085\5\16\b\2\u0085\u0086\7\37\2\2\u0086\r\3\2\2\2"+
		"\u0087\u008b\5\20\t\2\u0088\u008b\5\22\n\2\u0089\u008b\5\24\13\2\u008a"+
		"\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\17\3\2\2"+
		"\2\u008c\u008d\7\17\2\2\u008d\21\3\2\2\2\u008e\u008f\7\t\2\2\u008f\23"+
		"\3\2\2\2\u0090\u0091\7\37\2\2\u0091\25\3\2\2\2\u0092\u0094\7\4\2\2\u0093"+
		"\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0097\7\22"+
		"\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\5\30\r\2\u0099\u009a\7\37\2\2\u009a\u00a3\7\b\2\2\u009b\u00a0\5"+
		"\f\7\2\u009c\u009d\7\5\2\2\u009d\u009f\5\f\7\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a4\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\7\24\2\2\u00a6\u00aa\7\r\2\2\u00a7\u00a9\5"+
		"\n\6\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00b0\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\5\34"+
		"\17\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\5\""+
		"\22\2\u00b4\u00b5\7\20\2\2\u00b5\27\3\2\2\2\u00b6\u00b9\5\32\16\2\u00b7"+
		"\u00b9\5\16\b\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\31\3\2\2"+
		"\2\u00ba\u00bb\7\f\2\2\u00bb\33\3\2\2\2\u00bc\u00bf\5\36\20\2\u00bd\u00bf"+
		"\5 \21\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\35\3\2\2\2\u00c0"+
		"\u00c1\5@!\2\u00c1\u00c2\7\30\2\2\u00c2\u00c3\5$\23\2\u00c3\u00c4\7\32"+
		"\2\2\u00c4\37\3\2\2\2\u00c5\u00c6\7\23\2\2\u00c6\u00c7\7\b\2\2\u00c7\u00c8"+
		"\5$\23\2\u00c8\u00c9\7\24\2\2\u00c9\u00ca\7\32\2\2\u00ca!\3\2\2\2\u00cb"+
		"\u00d0\7\27\2\2\u00cc\u00cd\7\b\2\2\u00cd\u00ce\5$\23\2\u00ce\u00cf\7"+
		"\24\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\7\32\2\2\u00d3#\3\2\2\2\u00d4\u00d9\5&\24\2"+
		"\u00d5\u00d6\7\33\2\2\u00d6\u00d8\5&\24\2\u00d7\u00d5\3\2\2\2\u00d8\u00db"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da%\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00e1\5(\25\2\u00dd\u00de\7\35\2\2\u00de\u00e0\5"+
		"(\25\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\'\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\5*\26\2"+
		"\u00e5)\3\2\2\2\u00e6\u00eb\5,\27\2\u00e7\u00e8\7\26\2\2\u00e8\u00ea\5"+
		",\27\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec+\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\5.\30\2"+
		"\u00ef-\3\2\2\2\u00f0\u00f8\5\60\31\2\u00f1\u00f8\5\62\32\2\u00f2\u00f8"+
		"\5\64\33\2\u00f3\u00f8\5\66\34\2\u00f4\u00f8\58\35\2\u00f5\u00f8\5:\36"+
		"\2\u00f6\u00f8\5<\37\2\u00f7\u00f0\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f2"+
		"\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8/\3\2\2\2\u00f9\u00fa\7\6\2\2\u00fa\u00fb\5.\30\2"+
		"\u00fb\61\3\2\2\2\u00fc\u00fd\5@!\2\u00fd\63\3\2\2\2\u00fe\u00ff\7\b\2"+
		"\2\u00ff\u0100\5$\23\2\u0100\u0101\7\24\2\2\u0101\65\3\2\2\2\u0102\u0103"+
		"\7\21\2\2\u0103\67\3\2\2\2\u0104\u0105\7\13\2\2\u01059\3\2\2\2\u0106\u0107"+
		"\7 \2\2\u0107;\3\2\2\2\u0108\u0109\7!\2\2\u0109=\3\2\2\2\u010a\u010f\5"+
		"@!\2\u010b\u010c\7\25\2\2\u010c\u010e\7\37\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110?\3\2\2\2"+
		"\u0111\u010f\3\2\2\2\u0112\u0115\5B\"\2\u0113\u0115\5D#\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0113\3\2\2\2\u0115A\3\2\2\2\u0116\u0117\7\34\2\2\u0117"+
		"C\3\2\2\2\u0118\u0119\7\37\2\2\u0119E\3\2\2\2\30JQW]v|\u008a\u0093\u0096"+
		"\u00a0\u00a3\u00aa\u00b0\u00b8\u00be\u00d0\u00d9\u00e1\u00eb\u00f7\u010f"+
		"\u0114";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}