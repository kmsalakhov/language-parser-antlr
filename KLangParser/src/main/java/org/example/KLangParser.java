// Generated from /Users/kamilsalakhov/Desktop/5sem/MT/KLangParser/src/main/antlr4/org.example/KLang.g4 by ANTLR 4.13.1

package org.example;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class KLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		LESS=18, GREATER=19, EQ=20, NEQ=21, LE=22, GE=23, ID=24, INT=25, WS=26;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_sout = 2, RULE_declaration = 3, 
		RULE_assignment = 4, RULE_ifStatement = 5, RULE_while = 6, RULE_forn = 7, 
		RULE_condition = 8, RULE_expression = 9, RULE_term = 10, RULE_factor = 11, 
		RULE_functionCall = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "sout", "declaration", "assignment", "ifStatement", 
			"while", "forn", "condition", "expression", "term", "factor", "functionCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "';'", "'var'", "'='", "'if'", "'('", "')'", "'{'", "'}'", 
			"'else'", "'while'", "'forn'", "'+'", "'-'", "'*'", "'/'", "','", "'<'", 
			"'>'", "'=='", "'!='", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "LESS", "GREATER", "EQ", "NEQ", "LE", 
			"GE", "ID", "INT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "KLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private void print(String s) {
	        System.out.print(s);
	    }

	    private void println(String s) {
	        System.out.println(s);
	    }

	public KLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(KLangParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KLangVisitor ) return ((KLangVisitor<? extends T>)visitor).visitProgram(this);
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
			 println("#include <stdio.h>\nint main() {");
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				statement();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 50337898L) != 0) );
			setState(32);
			match(EOF);
			 println("return 0;\n}");
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FornContext forn() {
			return getRuleContext(FornContext.class,0);
		}
		public SoutContext sout() {
			return getRuleContext(SoutContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KLangVisitor ) return ((KLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				while_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				forn();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(41);
				sout();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class SoutContext extends ParserRuleContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).enterSout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).exitSout(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KLangVisitor ) return ((KLangVisitor<? extends T>)visitor).visitSout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoutContext sout() throws RecognitionException {
		SoutContext _localctx = new SoutContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(45);
			((SoutContext)_localctx).expression = expression();
			setState(46);
			match(T__1);

			print("printf(\"%d\", ");
			print((((SoutContext)_localctx).expression!=null?_input.getText(((SoutContext)_localctx).expression.start,((SoutContext)_localctx).expression.stop):null));
			println(")");

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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(KLangParser.ID, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KLangVisitor ) return ((KLangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__2);
			setState(50);
			((DeclarationContext)_localctx).ID = match(ID);
			setState(51);
			match(T__1);
			println("int " + (((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null) + ";");
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(KLangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KLangVisitor ) return ((KLangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(55);
			match(T__3);
			setState(56);
			((AssignmentContext)_localctx).expression = expression();
			setState(57);
			match(T__1);
			println((((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null) + " = " + (((AssignmentContext)_localctx).expression!=null?_input.getText(((AssignmentContext)_localctx).expression.start,((AssignmentContext)_localctx).expression.stop):null) + ";");
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KLangVisitor ) return ((KLangVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 print("if ("); 
			setState(61);
			match(T__4);
			setState(62);
			match(T__5);
			setState(63);
			condition();
			setState(64);
			match(T__6);
			 println(") {"); 
			setState(66);
			match(T__7);
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				statement();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 50337898L) != 0) );
			setState(72);
			match(T__8);
			 println("}"); 
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				 println("else {"); 
				setState(75);
				match(T__9);
				setState(76);
				match(T__7);
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(77);
					statement();
					}
					}
					setState(80); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 50337898L) != 0) );
				setState(82);
				match(T__8);
				 println("}"); 
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KLangVisitor ) return ((KLangVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 print("while ("); 
			setState(88);
			match(T__10);
			setState(89);
			match(T__5);
			setState(90);
			condition();
			setState(91);
			match(T__6);
			 println(") {"); 
			setState(93);
			match(T__7);
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				statement();
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 50337898L) != 0) );
			setState(99);
			match(T__8);
			 println("}"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class FornContext extends ParserRuleContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FornContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).enterForn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).exitForn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KLangVisitor ) return ((KLangVisitor<? extends T>)visitor).visitForn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FornContext forn() throws RecognitionException {
		FornContext _localctx = new FornContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__11);
			setState(103);
			match(T__5);
			setState(104);
			((FornContext)_localctx).expression = expression();
			setState(105);
			match(T__6);
			print("for (int i = 0; i < ");
			     print((((FornContext)_localctx).expression!=null?_input.getText(((FornContext)_localctx).expression.start,((FornContext)_localctx).expression.stop):null));
			     println("; ++i) {");
			setState(107);
			match(T__7);
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				statement();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 50337898L) != 0) );
			setState(113);
			match(T__8);
			println("}");
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS() { return getToken(KLangParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(KLangParser.GREATER, 0); }
		public TerminalNode EQ() { return getToken(KLangParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(KLangParser.NEQ, 0); }
		public TerminalNode LE() { return getToken(KLangParser.LE, 0); }
		public TerminalNode GE() { return getToken(KLangParser.GE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KLangVisitor ) return ((KLangVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			expression();
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16515072L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(118);
			expression();
			}
			print(_input.getText(_localctx.start, _input.LT(-1)));
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KLangVisitor ) return ((KLangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			term();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__13) {
				{
				{
				setState(123);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(124);
				term();
				}
				}
				setState(129);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KLangVisitor ) return ((KLangVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			factor();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__15) {
				{
				{
				setState(131);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				factor();
				}
				}
				setState(137);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(KLangParser.INT, 0); }
		public TerminalNode ID() { return getToken(KLangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KLangVisitor ) return ((KLangVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_factor);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(INT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(ID);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(T__5);
				setState(141);
				expression();
				setState(142);
				match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KLangListener ) ((KLangListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KLangVisitor ) return ((KLangVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			expression();
			setState(147);
			match(T__5);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 50331712L) != 0)) {
				{
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(148);
						expression();
						setState(149);
						match(T__16);
						}
						} 
					}
					setState(155);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(156);
				expression();
				}
			}

			setState(159);
			match(T__6);
			setState(160);
			match(T__1);
			println(_input.getText(_localctx.start, _input.LT(-1)));
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
		"\u0004\u0001\u001a\u00a4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0004\u0000\u001d\b\u0000\u000b"+
		"\u0000\f\u0000\u001e\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001+\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0004\u0005E\b\u0005\u000b\u0005\f\u0005F\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005"+
		"O\b\u0005\u000b\u0005\f\u0005P\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005V\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006`\b\u0006\u000b"+
		"\u0006\f\u0006a\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004"+
		"\u0007n\b\u0007\u000b\u0007\f\u0007o\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0005\t~\b\t\n\t\f\t\u0081\t\t\u0001\n\u0001\n\u0001\n\u0005\n\u0086"+
		"\b\n\n\n\f\n\u0089\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0091\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u0098\b\f\n\f\f\f\u009b\t\f\u0001\f\u0003\f"+
		"\u009e\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0003"+
		"\u0001\u0000\u0012\u0017\u0001\u0000\r\u000e\u0001\u0000\u000f\u0010\u00a8"+
		"\u0000\u001a\u0001\u0000\u0000\u0000\u0002*\u0001\u0000\u0000\u0000\u0004"+
		",\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000\b6\u0001\u0000"+
		"\u0000\u0000\n<\u0001\u0000\u0000\u0000\fW\u0001\u0000\u0000\u0000\u000e"+
		"f\u0001\u0000\u0000\u0000\u0010t\u0001\u0000\u0000\u0000\u0012z\u0001"+
		"\u0000\u0000\u0000\u0014\u0082\u0001\u0000\u0000\u0000\u0016\u0090\u0001"+
		"\u0000\u0000\u0000\u0018\u0092\u0001\u0000\u0000\u0000\u001a\u001c\u0006"+
		"\u0000\uffff\uffff\u0000\u001b\u001d\u0003\u0002\u0001\u0000\u001c\u001b"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001c"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 !\u0005\u0000\u0000\u0001!\"\u0006\u0000\uffff\uffff"+
		"\u0000\"\u0001\u0001\u0000\u0000\u0000#+\u0003\u0006\u0003\u0000$+\u0003"+
		"\b\u0004\u0000%+\u0003\n\u0005\u0000&+\u0003\f\u0006\u0000\'+\u0003\u0018"+
		"\f\u0000(+\u0003\u000e\u0007\u0000)+\u0003\u0004\u0002\u0000*#\u0001\u0000"+
		"\u0000\u0000*$\u0001\u0000\u0000\u0000*%\u0001\u0000\u0000\u0000*&\u0001"+
		"\u0000\u0000\u0000*\'\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000"+
		"*)\u0001\u0000\u0000\u0000+\u0003\u0001\u0000\u0000\u0000,-\u0005\u0001"+
		"\u0000\u0000-.\u0003\u0012\t\u0000./\u0005\u0002\u0000\u0000/0\u0006\u0002"+
		"\uffff\uffff\u00000\u0005\u0001\u0000\u0000\u000012\u0005\u0003\u0000"+
		"\u000023\u0005\u0018\u0000\u000034\u0005\u0002\u0000\u000045\u0006\u0003"+
		"\uffff\uffff\u00005\u0007\u0001\u0000\u0000\u000067\u0005\u0018\u0000"+
		"\u000078\u0005\u0004\u0000\u000089\u0003\u0012\t\u00009:\u0005\u0002\u0000"+
		"\u0000:;\u0006\u0004\uffff\uffff\u0000;\t\u0001\u0000\u0000\u0000<=\u0006"+
		"\u0005\uffff\uffff\u0000=>\u0005\u0005\u0000\u0000>?\u0005\u0006\u0000"+
		"\u0000?@\u0003\u0010\b\u0000@A\u0005\u0007\u0000\u0000AB\u0006\u0005\uffff"+
		"\uffff\u0000BD\u0005\b\u0000\u0000CE\u0003\u0002\u0001\u0000DC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0005\t\u0000\u0000IU\u0006"+
		"\u0005\uffff\uffff\u0000JK\u0006\u0005\uffff\uffff\u0000KL\u0005\n\u0000"+
		"\u0000LN\u0005\b\u0000\u0000MO\u0003\u0002\u0001\u0000NM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0005\t\u0000\u0000ST\u0006\u0005"+
		"\uffff\uffff\u0000TV\u0001\u0000\u0000\u0000UJ\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000V\u000b\u0001\u0000\u0000\u0000WX\u0006\u0006"+
		"\uffff\uffff\u0000XY\u0005\u000b\u0000\u0000YZ\u0005\u0006\u0000\u0000"+
		"Z[\u0003\u0010\b\u0000[\\\u0005\u0007\u0000\u0000\\]\u0006\u0006\uffff"+
		"\uffff\u0000]_\u0005\b\u0000\u0000^`\u0003\u0002\u0001\u0000_^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0005\t\u0000\u0000de\u0006"+
		"\u0006\uffff\uffff\u0000e\r\u0001\u0000\u0000\u0000fg\u0005\f\u0000\u0000"+
		"gh\u0005\u0006\u0000\u0000hi\u0003\u0012\t\u0000ij\u0005\u0007\u0000\u0000"+
		"jk\u0006\u0007\uffff\uffff\u0000km\u0005\b\u0000\u0000ln\u0003\u0002\u0001"+
		"\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0005"+
		"\t\u0000\u0000rs\u0006\u0007\uffff\uffff\u0000s\u000f\u0001\u0000\u0000"+
		"\u0000tu\u0003\u0012\t\u0000uv\u0007\u0000\u0000\u0000vw\u0003\u0012\t"+
		"\u0000wx\u0001\u0000\u0000\u0000xy\u0006\b\uffff\uffff\u0000y\u0011\u0001"+
		"\u0000\u0000\u0000z\u007f\u0003\u0014\n\u0000{|\u0007\u0001\u0000\u0000"+
		"|~\u0003\u0014\n\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0013\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0082\u0087\u0003\u0016\u000b\u0000\u0083\u0084\u0007\u0002\u0000\u0000"+
		"\u0084\u0086\u0003\u0016\u000b\u0000\u0085\u0083\u0001\u0000\u0000\u0000"+
		"\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0015\u0001\u0000\u0000\u0000"+
		"\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u0091\u0005\u0019\u0000\u0000"+
		"\u008b\u0091\u0005\u0018\u0000\u0000\u008c\u008d\u0005\u0006\u0000\u0000"+
		"\u008d\u008e\u0003\u0012\t\u0000\u008e\u008f\u0005\u0007\u0000\u0000\u008f"+
		"\u0091\u0001\u0000\u0000\u0000\u0090\u008a\u0001\u0000\u0000\u0000\u0090"+
		"\u008b\u0001\u0000\u0000\u0000\u0090\u008c\u0001\u0000\u0000\u0000\u0091"+
		"\u0017\u0001\u0000\u0000\u0000\u0092\u0093\u0003\u0012\t\u0000\u0093\u009d"+
		"\u0005\u0006\u0000\u0000\u0094\u0095\u0003\u0012\t\u0000\u0095\u0096\u0005"+
		"\u0011\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0094\u0001"+
		"\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001"+
		"\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009e\u0003"+
		"\u0012\t\u0000\u009d\u0099\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0007"+
		"\u0000\u0000\u00a0\u00a1\u0005\u0002\u0000\u0000\u00a1\u00a2\u0006\f\uffff"+
		"\uffff\u0000\u00a2\u0019\u0001\u0000\u0000\u0000\f\u001e*FPUao\u007f\u0087"+
		"\u0090\u0099\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}