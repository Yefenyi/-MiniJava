// Generated from Hello.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, INT=24, 
		DIGIT=25, UNDERSCORE=26, LETTER=27, ID=28, TYPE=29, ADD_MINUS=30, AND=31, 
		WS=32;
	public static final String[] tokenNames = {
		"<INVALID>", "'length'", "'new'", "'true'", "'System.out.println'", "';'", 
		"'while'", "'{'", "'['", "'='", "'}'", "']'", "'if'", "'>'", "'!'", "'int'", 
		"'else'", "'('", "')'", "'*'", "','", "'this'", "'.'", "'false'", "INT", 
		"DIGIT", "'_'", "LETTER", "ID", "TYPE", "ADD_MINUS", "'&&'", "WS"
	};
	public static final int
		RULE_bool = 0, RULE_t = 1, RULE_expr_neg = 2, RULE_expr_cmp = 3, RULE_expr_am = 4, 
		RULE_expr_time = 5, RULE_expr_and = 6, RULE_expr_arith = 7, RULE_array = 8, 
		RULE_expr_length = 9, RULE_expr_this = 10, RULE_expr_new = 11, RULE_expr_unit = 12, 
		RULE_expr_para = 13, RULE_expr = 14, RULE_stat = 15;
	public static final String[] ruleNames = {
		"bool", "t", "expr_neg", "expr_cmp", "expr_am", "expr_time", "expr_and", 
		"expr_arith", "array", "expr_length", "expr_this", "expr_new", "expr_unit", 
		"expr_para", "expr", "stat"
	};

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BoolContext extends ParserRuleContext {
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_bool);
		try {
			setState(35);
			switch (_input.LA(1)) {
			case 3:
				enterOuterAlt(_localctx, 1);
				{
				setState(32); match(3);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 2);
				{
				setState(33); match(23);
				}
				break;
			case 14:
			case 17:
			case INT:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(34); expr_cmp();
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

	public static class TContext extends ParserRuleContext {
		public Expr_negContext expr_neg() {
			return getRuleContext(Expr_negContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public Expr_amContext expr_am() {
			return getRuleContext(Expr_amContext.class,0);
		}
		public TerminalNode INT() { return getToken(HelloParser.INT, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitT(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_t);
		try {
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37); match(INT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38); match(17);
				setState(39); expr_am();
				setState(40); match(18);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42); match(ID);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43); expr_neg();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44); match(17);
				setState(45); t();
				setState(46); match(18);
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

	public static class Expr_negContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr_neg(this);
		}
	}

	public final Expr_negContext expr_neg() throws RecognitionException {
		Expr_negContext _localctx = new Expr_negContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr_neg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(50); match(14);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(53); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(57);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(55); t();
				}
				break;

			case 2:
				{
				setState(56); expr_and();
				}
				break;
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

	public static class Expr_cmpContext extends ParserRuleContext {
		public TContext t(int i) {
			return getRuleContext(TContext.class,i);
		}
		public List<TContext> t() {
			return getRuleContexts(TContext.class);
		}
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Expr_cmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr_cmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr_cmp(this);
		}
	}

	public final Expr_cmpContext expr_cmp() throws RecognitionException {
		Expr_cmpContext _localctx = new Expr_cmpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr_cmp);
		try {
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59); t();
				setState(60); match(13);
				setState(61); t();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63); match(17);
				setState(64); expr_cmp();
				setState(65); match(18);
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

	public static class Expr_amContext extends ParserRuleContext {
		public List<TerminalNode> ADD_MINUS() { return getTokens(HelloParser.ADD_MINUS); }
		public TerminalNode ADD_MINUS(int i) {
			return getToken(HelloParser.ADD_MINUS, i);
		}
		public List<Expr_timeContext> expr_time() {
			return getRuleContexts(Expr_timeContext.class);
		}
		public Expr_timeContext expr_time(int i) {
			return getRuleContext(Expr_timeContext.class,i);
		}
		public Expr_amContext expr_am() {
			return getRuleContext(Expr_amContext.class,0);
		}
		public Expr_amContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_am; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr_am(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr_am(this);
		}
	}

	public final Expr_amContext expr_am() throws RecognitionException {
		Expr_amContext _localctx = new Expr_amContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr_am);
		int _la;
		try {
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); expr_time();
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD_MINUS) {
					{
					{
					setState(70); match(ADD_MINUS);
					setState(71); expr_time();
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); match(17);
				setState(78); expr_am();
				setState(79); match(18);
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

	public static class Expr_timeContext extends ParserRuleContext {
		public TContext t(int i) {
			return getRuleContext(TContext.class,i);
		}
		public List<TContext> t() {
			return getRuleContexts(TContext.class);
		}
		public Expr_timeContext expr_time() {
			return getRuleContext(Expr_timeContext.class,0);
		}
		public Expr_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr_time(this);
		}
	}

	public final Expr_timeContext expr_time() throws RecognitionException {
		Expr_timeContext _localctx = new Expr_timeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr_time);
		int _la;
		try {
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83); t();
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(84); match(19);
					setState(85); t();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91); match(17);
				setState(92); expr_time();
				setState(93); match(18);
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

	public static class Expr_andContext extends ParserRuleContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public TerminalNode AND(int i) {
			return getToken(HelloParser.AND, i);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(HelloParser.AND); }
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr_and(this);
		}
	}

	public final Expr_andContext expr_and() throws RecognitionException {
		Expr_andContext _localctx = new Expr_andContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr_and);
		try {
			int _alt;
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97); bool();
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(98); match(AND);
						setState(99); bool();
						}
						} 
					}
					setState(104);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105); match(17);
				setState(106); expr_and();
				setState(107); match(18);
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

	public static class Expr_arithContext extends ParserRuleContext {
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_amContext expr_am() {
			return getRuleContext(Expr_amContext.class,0);
		}
		public Expr_arithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_arith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr_arith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr_arith(this);
		}
	}

	public final Expr_arithContext expr_arith() throws RecognitionException {
		Expr_arithContext _localctx = new Expr_arithContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr_arith);
		try {
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111); expr_am();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); expr_and();
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

	public static class ArrayContext extends ParserRuleContext {
		public Expr_arithContext expr_arith() {
			return getRuleContext(Expr_arithContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array);
		try {
			setState(124);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(115); match(ID);
				setState(116); match(8);
				setState(117); expr_arith();
				setState(118); match(11);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 2);
				{
				setState(120); match(17);
				setState(121); array();
				setState(122); match(18);
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

	public static class Expr_lengthContext extends ParserRuleContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public Expr_lengthContext expr_length() {
			return getRuleContext(Expr_lengthContext.class,0);
		}
		public Expr_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr_length(this);
		}
	}

	public final Expr_lengthContext expr_length() throws RecognitionException {
		Expr_lengthContext _localctx = new Expr_lengthContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr_length);
		try {
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(126); array();
					}
					break;

				case 2:
					{
					setState(127); match(ID);
					}
					break;
				}
				setState(130); match(22);
				setState(131); match(1);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132); match(17);
				setState(133); expr_length();
				setState(134); match(18);
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

	public static class Expr_thisContext extends ParserRuleContext {
		public Expr_thisContext expr_this() {
			return getRuleContext(Expr_thisContext.class,0);
		}
		public Expr_thisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_this; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr_this(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr_this(this);
		}
	}

	public final Expr_thisContext expr_this() throws RecognitionException {
		Expr_thisContext _localctx = new Expr_thisContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr_this);
		try {
			setState(143);
			switch (_input.LA(1)) {
			case 21:
				enterOuterAlt(_localctx, 1);
				{
				setState(138); match(21);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 2);
				{
				setState(139); match(17);
				setState(140); expr_this();
				setState(141); match(18);
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

	public static class Expr_newContext extends ParserRuleContext {
		public Expr_arithContext expr_arith() {
			return getRuleContext(Expr_arithContext.class,0);
		}
		public Expr_newContext expr_new() {
			return getRuleContext(Expr_newContext.class,0);
		}
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public Expr_newContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_new; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr_new(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr_new(this);
		}
	}

	public final Expr_newContext expr_new() throws RecognitionException {
		Expr_newContext _localctx = new Expr_newContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_new);
		try {
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145); match(2);
				setState(146); match(15);
				setState(147); match(8);
				setState(148); expr_arith();
				setState(149); match(11);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151); match(2);
				setState(152); match(ID);
				setState(153); match(17);
				setState(154); match(18);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155); match(17);
				setState(156); expr_new();
				setState(157); match(18);
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

	public static class Expr_unitContext extends ParserRuleContext {
		public Expr_arithContext expr_arith() {
			return getRuleContext(Expr_arithContext.class,0);
		}
		public Expr_newContext expr_new() {
			return getRuleContext(Expr_newContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Expr_thisContext expr_this() {
			return getRuleContext(Expr_thisContext.class,0);
		}
		public Expr_lengthContext expr_length() {
			return getRuleContext(Expr_lengthContext.class,0);
		}
		public Expr_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr_unit(this);
		}
	}

	public final Expr_unitContext expr_unit() throws RecognitionException {
		Expr_unitContext _localctx = new Expr_unitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(161); expr_arith();
				}
				break;

			case 2:
				{
				setState(162); array();
				}
				break;

			case 3:
				{
				setState(163); expr_length();
				}
				break;

			case 4:
				{
				setState(164); expr_this();
				}
				break;

			case 5:
				{
				setState(165); expr_new();
				}
				break;
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

	public static class Expr_paraContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public List<Expr_unitContext> expr_unit() {
			return getRuleContexts(Expr_unitContext.class);
		}
		public Expr_unitContext expr_unit(int i) {
			return getRuleContext(Expr_unitContext.class,i);
		}
		public Expr_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr_para(this);
		}
	}

	public final Expr_paraContext expr_para() throws RecognitionException {
		Expr_paraContext _localctx = new Expr_paraContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); expr_unit();
			setState(169); match(22);
			setState(170); match(ID);
			setState(171); match(17);
			setState(180);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 14) | (1L << 17) | (1L << 21) | (1L << 23) | (1L << INT) | (1L << ID))) != 0)) {
				{
				setState(172); expr_unit();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==20) {
					{
					{
					setState(173); match(20);
					setState(174); expr_unit();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(182); match(18);
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

	public static class ExprContext extends ParserRuleContext {
		public Expr_paraContext expr_para() {
			return getRuleContext(Expr_paraContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_unitContext expr_unit() {
			return getRuleContext(Expr_unitContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		try {
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184); expr_unit();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185); expr_para();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186); match(17);
				setState(187); expr();
				setState(188); match(18);
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

	public static class StatContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stat);
		try {
			setState(229);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192); match(7);
				setState(193); stat();
				setState(194); match(10);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196); match(12);
				setState(197); match(17);
				setState(198); expr();
				setState(199); match(18);
				setState(200); stat();
				setState(201); match(16);
				setState(202); stat();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204); match(6);
				setState(205); match(17);
				setState(206); expr();
				setState(207); match(18);
				setState(208); stat();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210); match(4);
				setState(211); match(17);
				setState(212); expr();
				setState(213); match(18);
				setState(214); match(5);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(216); match(ID);
				setState(217); match(9);
				setState(218); expr();
				setState(219); match(5);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(221); match(ID);
				setState(222); match(8);
				setState(223); expr();
				setState(224); match(11);
				setState(225); match(9);
				setState(226); expr();
				setState(227); match(5);
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

	public static final String _serializedATN =
		"\2\3\"\u00ea\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\3\2\3\2\3\2\5\2&\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\63\n\3\3\4\6\4\66\n\4\r\4\16\4\67\3\4\3\4\5\4<\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5F\n\5\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6"+
		"\3\6\3\6\3\6\3\6\5\6T\n\6\3\7\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3\7\3\7"+
		"\3\7\3\7\5\7b\n\7\3\b\3\b\3\b\7\bg\n\b\f\b\16\bj\13\b\3\b\3\b\3\b\3\b"+
		"\5\bp\n\b\3\t\3\t\5\tt\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\177"+
		"\n\n\3\13\3\13\5\13\u0083\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008b"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u0092\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a2\n\r\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00a9\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00b2\n\17\f\17\16"+
		"\17\u00b5\13\17\5\17\u00b7\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00c1\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e8"+
		"\n\21\3\21\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\u00fc\2%\3"+
		"\2\2\2\4\62\3\2\2\2\6\65\3\2\2\2\bE\3\2\2\2\nS\3\2\2\2\fa\3\2\2\2\16o"+
		"\3\2\2\2\20s\3\2\2\2\22~\3\2\2\2\24\u008a\3\2\2\2\26\u0091\3\2\2\2\30"+
		"\u00a1\3\2\2\2\32\u00a8\3\2\2\2\34\u00aa\3\2\2\2\36\u00c0\3\2\2\2 \u00e7"+
		"\3\2\2\2\"&\7\5\2\2#&\7\31\2\2$&\5\b\5\2%\"\3\2\2\2%#\3\2\2\2%$\3\2\2"+
		"\2&\3\3\2\2\2\'\63\7\32\2\2()\7\23\2\2)*\5\n\6\2*+\7\24\2\2+\63\3\2\2"+
		"\2,\63\7\36\2\2-\63\5\6\4\2./\7\23\2\2/\60\5\4\3\2\60\61\7\24\2\2\61\63"+
		"\3\2\2\2\62\'\3\2\2\2\62(\3\2\2\2\62,\3\2\2\2\62-\3\2\2\2\62.\3\2\2\2"+
		"\63\5\3\2\2\2\64\66\7\20\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2"+
		"\678\3\2\2\28;\3\2\2\29<\5\4\3\2:<\5\16\b\2;9\3\2\2\2;:\3\2\2\2<\7\3\2"+
		"\2\2=>\5\4\3\2>?\7\17\2\2?@\5\4\3\2@F\3\2\2\2AB\7\23\2\2BC\5\b\5\2CD\7"+
		"\24\2\2DF\3\2\2\2E=\3\2\2\2EA\3\2\2\2F\t\3\2\2\2GL\5\f\7\2HI\7 \2\2IK"+
		"\5\f\7\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MT\3\2\2\2NL\3\2\2\2O"+
		"P\7\23\2\2PQ\5\n\6\2QR\7\24\2\2RT\3\2\2\2SG\3\2\2\2SO\3\2\2\2T\13\3\2"+
		"\2\2UZ\5\4\3\2VW\7\25\2\2WY\5\4\3\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3"+
		"\2\2\2[b\3\2\2\2\\Z\3\2\2\2]^\7\23\2\2^_\5\f\7\2_`\7\24\2\2`b\3\2\2\2"+
		"aU\3\2\2\2a]\3\2\2\2b\r\3\2\2\2ch\5\2\2\2de\7!\2\2eg\5\2\2\2fd\3\2\2\2"+
		"gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ip\3\2\2\2jh\3\2\2\2kl\7\23\2\2lm\5\16\b"+
		"\2mn\7\24\2\2np\3\2\2\2oc\3\2\2\2ok\3\2\2\2p\17\3\2\2\2qt\5\n\6\2rt\5"+
		"\16\b\2sq\3\2\2\2sr\3\2\2\2t\21\3\2\2\2uv\7\36\2\2vw\7\n\2\2wx\5\20\t"+
		"\2xy\7\r\2\2y\177\3\2\2\2z{\7\23\2\2{|\5\22\n\2|}\7\24\2\2}\177\3\2\2"+
		"\2~u\3\2\2\2~z\3\2\2\2\177\23\3\2\2\2\u0080\u0083\5\22\n\2\u0081\u0083"+
		"\7\36\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0085\7\30\2\2\u0085\u008b\7\3\2\2\u0086\u0087\7\23\2\2\u0087\u0088"+
		"\5\24\13\2\u0088\u0089\7\24\2\2\u0089\u008b\3\2\2\2\u008a\u0082\3\2\2"+
		"\2\u008a\u0086\3\2\2\2\u008b\25\3\2\2\2\u008c\u0092\7\27\2\2\u008d\u008e"+
		"\7\23\2\2\u008e\u008f\5\26\f\2\u008f\u0090\7\24\2\2\u0090\u0092\3\2\2"+
		"\2\u0091\u008c\3\2\2\2\u0091\u008d\3\2\2\2\u0092\27\3\2\2\2\u0093\u0094"+
		"\7\4\2\2\u0094\u0095\7\21\2\2\u0095\u0096\7\n\2\2\u0096\u0097\5\20\t\2"+
		"\u0097\u0098\7\r\2\2\u0098\u00a2\3\2\2\2\u0099\u009a\7\4\2\2\u009a\u009b"+
		"\7\36\2\2\u009b\u009c\7\23\2\2\u009c\u00a2\7\24\2\2\u009d\u009e\7\23\2"+
		"\2\u009e\u009f\5\30\r\2\u009f\u00a0\7\24\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u0093\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2\31\3\2\2"+
		"\2\u00a3\u00a9\5\20\t\2\u00a4\u00a9\5\22\n\2\u00a5\u00a9\5\24\13\2\u00a6"+
		"\u00a9\5\26\f\2\u00a7\u00a9\5\30\r\2\u00a8\u00a3\3\2\2\2\u00a8\u00a4\3"+
		"\2\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\33\3\2\2\2\u00aa\u00ab\5\32\16\2\u00ab\u00ac\7\30\2\2\u00ac\u00ad\7\36"+
		"\2\2\u00ad\u00b6\7\23\2\2\u00ae\u00b3\5\32\16\2\u00af\u00b0\7\26\2\2\u00b0"+
		"\u00b2\5\32\16\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00ae\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\24"+
		"\2\2\u00b9\35\3\2\2\2\u00ba\u00c1\5\32\16\2\u00bb\u00c1\5\34\17\2\u00bc"+
		"\u00bd\7\23\2\2\u00bd\u00be\5\36\20\2\u00be\u00bf\7\24\2\2\u00bf\u00c1"+
		"\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1"+
		"\37\3\2\2\2\u00c2\u00c3\7\t\2\2\u00c3\u00c4\5 \21\2\u00c4\u00c5\7\f\2"+
		"\2\u00c5\u00e8\3\2\2\2\u00c6\u00c7\7\16\2\2\u00c7\u00c8\7\23\2\2\u00c8"+
		"\u00c9\5\36\20\2\u00c9\u00ca\7\24\2\2\u00ca\u00cb\5 \21\2\u00cb\u00cc"+
		"\7\22\2\2\u00cc\u00cd\5 \21\2\u00cd\u00e8\3\2\2\2\u00ce\u00cf\7\b\2\2"+
		"\u00cf\u00d0\7\23\2\2\u00d0\u00d1\5\36\20\2\u00d1\u00d2\7\24\2\2\u00d2"+
		"\u00d3\5 \21\2\u00d3\u00e8\3\2\2\2\u00d4\u00d5\7\6\2\2\u00d5\u00d6\7\23"+
		"\2\2\u00d6\u00d7\5\36\20\2\u00d7\u00d8\7\24\2\2\u00d8\u00d9\7\7\2\2\u00d9"+
		"\u00e8\3\2\2\2\u00da\u00db\7\36\2\2\u00db\u00dc\7\13\2\2\u00dc\u00dd\5"+
		"\36\20\2\u00dd\u00de\7\7\2\2\u00de\u00e8\3\2\2\2\u00df\u00e0\7\36\2\2"+
		"\u00e0\u00e1\7\n\2\2\u00e1\u00e2\5\36\20\2\u00e2\u00e3\7\r\2\2\u00e3\u00e4"+
		"\7\13\2\2\u00e4\u00e5\5\36\20\2\u00e5\u00e6\7\7\2\2\u00e6\u00e8\3\2\2"+
		"\2\u00e7\u00c2\3\2\2\2\u00e7\u00c6\3\2\2\2\u00e7\u00ce\3\2\2\2\u00e7\u00d4"+
		"\3\2\2\2\u00e7\u00da\3\2\2\2\u00e7\u00df\3\2\2\2\u00e8!\3\2\2\2\30%\62"+
		"\67;ELSZahos~\u0082\u008a\u0091\u00a1\u00a8\u00b3\u00b6\u00c0\u00e7";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}