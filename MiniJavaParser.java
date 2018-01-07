// Generated from MiniJava.g4 by ANTLR 4.0

import java.util.*;

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
		T__33=1, T__32=2, T__31=3, T__30=4, T__29=5, T__28=6, T__27=7, T__26=8, 
		T__25=9, T__24=10, T__23=11, T__22=12, T__21=13, T__20=14, T__19=15, T__18=16, 
		T__17=17, T__16=18, T__15=19, T__14=20, T__13=21, T__12=22, T__11=23, 
		T__10=24, T__9=25, T__8=26, T__7=27, T__6=28, T__5=29, T__4=30, T__3=31, 
		T__2=32, T__1=33, T__0=34, INT=35, DIGIT=36, UNDERSCORE=37, LETTER=38, 
		ADD_MINUS=39, AND=40, WS=41;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'length'", "'true'", "'return'", "'new'", "'class'", 
		"'void'", "';'", "'while'", "'{'", "'extends'", "'='", "'}'", "'if'", 
		"'int'", "'('", "'*'", "','", "'this'", "'false'", "'.'", "'boolean'", 
		"'System.out.println'", "'['", "'String'", "'public'", "']'", "'>'", "'!'", 
		"'static'", "'else'", "')'", "'+'", "'-'", "INT", "DIGIT", "'_'", "LETTER", 
		"ADD_MINUS", "'&&'", "WS"
	};
	public static final int
		RULE_t = 0, RULE_expr_neg = 1, RULE_expr_cmp = 2, RULE_expr_am = 3, RULE_expr_time = 4, 
		RULE_expr_and = 5, RULE_expr_arith = 6, RULE_array = 7, RULE_expr_length = 8, 
		RULE_expr_this = 9, RULE_expr_new = 10, RULE_expr_unit = 11, RULE_expr_para = 12, 
		RULE_expr = 13, RULE_stat = 14, RULE_varDef = 15, RULE_methodDef = 16, 
		RULE_classDef = 17, RULE_mainClass = 18, RULE_prog = 19, RULE_bool = 20, 
		RULE_calculate = 21, RULE_id = 22, RULE_type = 23;
	public static final String[] ruleNames = {
		"t", "expr_neg", "expr_cmp", "expr_am", "expr_time", "expr_and", "expr_arith", 
		"array", "expr_length", "expr_this", "expr_new", "expr_unit", "expr_para", 
		"expr", "stat", "varDef", "methodDef", "classDef", "mainClass", "prog", 
		"bool", "calculate", "id", "type"
	};

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	    void print(int num){
	        System.out.println(num);
	    }
	    HashMap<String, Object> valueMap = new HashMap<String, Object>();

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TContext extends ParserRuleContext {
		public int v;
		public Token num;
		public Expr_amContext arith_am;
		public IdContext name;
		public Expr_negContext arith_neg;
		public TContext arith_t;
		public Expr_negContext expr_neg() {
			return getRuleContext(Expr_negContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Expr_amContext expr_am() {
			return getRuleContext(Expr_amContext.class,0);
		}
		public TerminalNode INT() { return getToken(MiniJavaParser.INT, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitT(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_t);
		try {
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); ((TContext)_localctx).num = match(INT);
				((TContext)_localctx).v =  (((TContext)_localctx).num!=null?Integer.valueOf(((TContext)_localctx).num.getText()):0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50); match(16);
				setState(51); ((TContext)_localctx).arith_am = expr_am();
				setState(52); match(32);
				((TContext)_localctx).v =  ((TContext)_localctx).arith_am.v;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55); ((TContext)_localctx).name = id();

				    try{
				        int value = (int)valueMap.get((((TContext)_localctx).name!=null?_input.getText(((TContext)_localctx).name.start,((TContext)_localctx).name.stop):null));
				        ((TContext)_localctx).v =  value;
				    }catch(NullPointerException e){
				        notifyErrorListeners("Variable "+(((TContext)_localctx).name!=null?_input.getText(((TContext)_localctx).name.start,((TContext)_localctx).name.stop):null)+" not defined.");
				    }

				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58); ((TContext)_localctx).arith_neg = expr_neg();

				    ((TContext)_localctx).v =  ((TContext)_localctx).arith_neg.v;

				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61); match(16);
				setState(62); ((TContext)_localctx).arith_t = t();
				setState(63); match(32);

				    ((TContext)_localctx).v =  ((TContext)_localctx).arith_t.v;

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
		public int v;
		public TContext arith_t;
		public Expr_andContext arith_and;
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
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpr_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpr_neg(this);
		}
	}

	public final Expr_negContext expr_neg() throws RecognitionException {
		Expr_negContext _localctx = new Expr_negContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr_neg);
		try {
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); match(29);
				setState(69); ((Expr_negContext)_localctx).arith_t = t();
				((Expr_negContext)_localctx).v =  ((Expr_negContext)_localctx).arith_t.v>0?0:1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72); match(29);
				setState(73); ((Expr_negContext)_localctx).arith_and = expr_and();
				((Expr_negContext)_localctx).v =  ((Expr_negContext)_localctx).arith_and.v>0?0:1;
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

	public static class Expr_cmpContext extends ParserRuleContext {
		public int v;
		public TContext num1;
		public TContext num2;
		public Expr_cmpContext arith;
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
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpr_cmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpr_cmp(this);
		}
	}

	public final Expr_cmpContext expr_cmp() throws RecognitionException {
		Expr_cmpContext _localctx = new Expr_cmpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr_cmp);
		try {
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); ((Expr_cmpContext)_localctx).num1 = t();
				setState(79); match(28);
				setState(80); ((Expr_cmpContext)_localctx).num2 = t();

				    ((Expr_cmpContext)_localctx).v =  ((Expr_cmpContext)_localctx).num1.v>((Expr_cmpContext)_localctx).num2.v? 1:0;

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83); match(16);
				setState(84); ((Expr_cmpContext)_localctx).arith = expr_cmp();
				setState(85); match(32);

				    ((Expr_cmpContext)_localctx).v =  ((Expr_cmpContext)_localctx).arith.v;

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88); match(16);
				setState(89); expr_cmp();
				notifyErrorListeners("Missing closing ')'");

				    ((Expr_cmpContext)_localctx).v =  -1;

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
		public int v;
		public Expr_timeContext num11;
		public Expr_amContext num12;
		public Expr_timeContext num21;
		public Expr_amContext num22;
		public Expr_amContext num3;
		public Expr_timeContext num4;
		public Expr_timeContext expr_time() {
			return getRuleContext(Expr_timeContext.class,0);
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
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpr_am(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpr_am(this);
		}
	}

	public final Expr_amContext expr_am() throws RecognitionException {
		Expr_amContext _localctx = new Expr_amContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr_am);
		try {
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); ((Expr_amContext)_localctx).num11 = expr_time();
				setState(96); match(33);
				setState(97); ((Expr_amContext)_localctx).num12 = expr_am();
				((Expr_amContext)_localctx).v =  ((Expr_amContext)_localctx).num11.v+((Expr_amContext)_localctx).num12.v;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); ((Expr_amContext)_localctx).num21 = expr_time();
				setState(101); match(34);
				setState(102); ((Expr_amContext)_localctx).num22 = expr_am();
				((Expr_amContext)_localctx).v =  ((Expr_amContext)_localctx).num21.v-((Expr_amContext)_localctx).num22.v;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105); match(16);
				setState(106); ((Expr_amContext)_localctx).num3 = expr_am();
				setState(107); match(32);
				((Expr_amContext)_localctx).v =  ((Expr_amContext)_localctx).num3.v;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110); match(16);
				setState(111); expr_am();
				notifyErrorListeners("Missing closing ')'");
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114); ((Expr_amContext)_localctx).num4 = expr_time();
				((Expr_amContext)_localctx).v =  ((Expr_amContext)_localctx).num4.v;
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
		public int v;
		public TContext num11;
		public Expr_timeContext num12;
		public Expr_timeContext num2;
		public TContext num3;
		public TContext t() {
			return getRuleContext(TContext.class,0);
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
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpr_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpr_time(this);
		}
	}

	public final Expr_timeContext expr_time() throws RecognitionException {
		Expr_timeContext _localctx = new Expr_timeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr_time);
		try {
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119); ((Expr_timeContext)_localctx).num11 = t();
				setState(120); match(17);
				setState(121); ((Expr_timeContext)_localctx).num12 = expr_time();
				((Expr_timeContext)_localctx).v =  ((Expr_timeContext)_localctx).num11.v * ((Expr_timeContext)_localctx).num12.v;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); match(16);
				setState(125); ((Expr_timeContext)_localctx).num2 = expr_time();
				setState(126); match(32);
				((Expr_timeContext)_localctx).v =  ((Expr_timeContext)_localctx).num2.v;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129); match(16);
				setState(130); expr_time();
				notifyErrorListeners("Missing closing ')'");
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133); ((Expr_timeContext)_localctx).num3 = t();
				((Expr_timeContext)_localctx).v =  ((Expr_timeContext)_localctx).num3.v;
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
		public int v;
		public BoolContext num11;
		public BoolContext num12;
		public Expr_andContext num2;
		public BoolContext num3;
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public TerminalNode AND() { return getToken(MiniJavaParser.AND, 0); }
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpr_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpr_and(this);
		}
	}

	public final Expr_andContext expr_and() throws RecognitionException {
		Expr_andContext _localctx = new Expr_andContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr_and);
		try {
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138); ((Expr_andContext)_localctx).num11 = bool();
				setState(139); match(AND);
				setState(140); ((Expr_andContext)_localctx).num12 = bool();
				((Expr_andContext)_localctx).v = (((Expr_andContext)_localctx).num11.v==1)&&(((Expr_andContext)_localctx).num12.v==1)?1:0;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143); match(16);
				setState(144); ((Expr_andContext)_localctx).num2 = expr_and();
				setState(145); match(32);
				((Expr_andContext)_localctx).v =  ((Expr_andContext)_localctx).num2.v;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148); match(16);
				setState(149); expr_and();
				notifyErrorListeners("Missing closing ')'");
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152); ((Expr_andContext)_localctx).num3 = bool();
				((Expr_andContext)_localctx).v =  ((Expr_andContext)_localctx).num3.v;
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
		public int v;
		public Expr_amContext num1;
		public Expr_andContext num2;
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
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpr_arith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpr_arith(this);
		}
	}

	public final Expr_arithContext expr_arith() throws RecognitionException {
		Expr_arithContext _localctx = new Expr_arithContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr_arith);
		try {
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157); ((Expr_arithContext)_localctx).num1 = expr_am();
				((Expr_arithContext)_localctx).v =  ((Expr_arithContext)_localctx).num1.v;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160); ((Expr_arithContext)_localctx).num2 = expr_and();
				((Expr_arithContext)_localctx).v =  ((Expr_arithContext)_localctx).num2.v;
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
		public ArrayList v;
		public Expr_arithContext expr_arith() {
			return getRuleContext(Expr_arithContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array);
		try {
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165); id();
				setState(166); match(24);
				setState(167); expr_arith();
				setState(168); match(27);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170); id();
				setState(171); match(24);
				setState(172); expr_arith();
				notifyErrorListeners("Missing closing ']'");
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175); match(16);
				setState(176); array();
				setState(177); match(32);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179); match(16);
				setState(180); array();
				notifyErrorListeners("Missing closing ')'");
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

	public static class Expr_lengthContext extends ParserRuleContext {
		public int v = 0;
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Expr_lengthContext expr_length() {
			return getRuleContext(Expr_lengthContext.class,0);
		}
		public Expr_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpr_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpr_length(this);
		}
	}

	public final Expr_lengthContext expr_length() throws RecognitionException {
		Expr_lengthContext _localctx = new Expr_lengthContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_length);
		try {
			setState(200);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(185); array();
					}
					break;

				case 2:
					{
					setState(186); id();
					}
					break;
				}
				setState(189); match(21);
				setState(190); match(2);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192); match(16);
				setState(193); expr_length();
				setState(194); match(32);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196); match(16);
				setState(197); expr_length();
				notifyErrorListeners("Missing closing ')'");
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
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpr_this(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpr_this(this);
		}
	}

	public final Expr_thisContext expr_this() throws RecognitionException {
		Expr_thisContext _localctx = new Expr_thisContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr_this);
		try {
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); match(19);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203); match(16);
				setState(204); expr_this();
				setState(205); match(32);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207); match(16);
				setState(208); expr_this();
				notifyErrorListeners("Missing closing ')'");
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

	public static class Expr_newContext extends ParserRuleContext {
		public Expr_arithContext expr_arith() {
			return getRuleContext(Expr_arithContext.class,0);
		}
		public Expr_newContext expr_new() {
			return getRuleContext(Expr_newContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Expr_newContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_new; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpr_new(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpr_new(this);
		}
	}

	public final Expr_newContext expr_new() throws RecognitionException {
		Expr_newContext _localctx = new Expr_newContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr_new);
		try {
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213); match(5);
				setState(214); type();
				setState(215); match(24);
				setState(216); expr_arith();
				setState(217); match(27);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219); match(5);
				setState(220); type();
				setState(221); match(24);
				setState(222); expr_arith();
				setState(223); match(27);
				notifyErrorListeners("Missing closing ']'");
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226); match(5);
				setState(227); id();
				setState(228); match(16);
				setState(229); match(32);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231); match(5);
				setState(232); id();
				setState(233); match(16);
				notifyErrorListeners("Missing closing ')'");
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236); match(16);
				setState(237); expr_new();
				setState(238); match(32);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(240); match(16);
				setState(241); expr_new();
				notifyErrorListeners("Missing closing ')'");
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
		public int v;
		public Expr_arithContext num;
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
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpr_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpr_unit(this);
		}
	}

	public final Expr_unitContext expr_unit() throws RecognitionException {
		Expr_unitContext _localctx = new Expr_unitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_unit);
		try {
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246); ((Expr_unitContext)_localctx).num = expr_arith();
				((Expr_unitContext)_localctx).v =  ((Expr_unitContext)_localctx).num.v;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249); array();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250); expr_length();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(251); expr_this();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(252); expr_new();
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

	public static class Expr_paraContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpr_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpr_para(this);
		}
	}

	public final Expr_paraContext expr_para() throws RecognitionException {
		Expr_paraContext _localctx = new Expr_paraContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr_para);
		int _la;
		try {
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255); expr_unit();
				setState(256); match(21);
				setState(257); id();
				setState(258); match(16);
				setState(267);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 29) | (1L << INT) | (1L << DIGIT) | (1L << UNDERSCORE) | (1L << LETTER))) != 0)) {
					{
					setState(259); expr_unit();
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==18) {
						{
						{
						setState(260); match(18);
						setState(261); expr_unit();
						}
						}
						setState(266);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(269); match(32);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271); expr_unit();
				setState(272); match(21);
				setState(273); id();
				setState(274); match(16);
				setState(283);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(275); expr_unit();
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==18) {
						{
						{
						setState(276); match(18);
						setState(277); expr_unit();
						}
						}
						setState(282);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				notifyErrorListeners("Missing closing ')'");
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

	public static class ExprContext extends ParserRuleContext {
		public int v;
		public Expr_unitContext num1;
		public ExprContext num2;
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
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			setState(302);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289); ((ExprContext)_localctx).num1 = expr_unit();
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).num1.v;print(_localctx.v);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292); expr_para();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293); match(16);
				setState(294); ((ExprContext)_localctx).num2 = expr();
				setState(295); match(32);
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).num2.v;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(298); match(16);
				setState(299); expr();
				notifyErrorListeners("Missing closing ')'");
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
		public IdContext name1;
		public ExprContext num1;
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stat);
		try {
			setState(353);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304); match(10);
				setState(305); stat();
				setState(306); match(13);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308); match(10);
				setState(309); stat();
				notifyErrorListeners("Missing closing '}'");
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(312); match(14);
				setState(313); match(16);
				setState(314); expr();
				setState(315); match(32);
				setState(316); stat();
				setState(317); match(31);
				setState(318); stat();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(320); match(9);
				setState(321); match(16);
				setState(322); expr();
				setState(323); match(32);
				setState(324); stat();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(326); match(23);
				setState(327); match(16);
				setState(328); expr();
				setState(329); match(32);
				setState(330); match(8);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(332); ((StatContext)_localctx).name1 = id();
				setState(333); match(12);
				setState(334); ((StatContext)_localctx).num1 = expr();
				setState(335); match(8);

				    try{
				        int value = (int)valueMap.get((((StatContext)_localctx).name1!=null?_input.getText(((StatContext)_localctx).name1.start,((StatContext)_localctx).name1.stop):null));
				        valueMap.put((((StatContext)_localctx).name1!=null?_input.getText(((StatContext)_localctx).name1.start,((StatContext)_localctx).name1.stop):null), ((StatContext)_localctx).num1.v);
				    }catch(NullPointerException e){
				        notifyErrorListeners("Variable "+(((StatContext)_localctx).name1!=null?_input.getText(((StatContext)_localctx).name1.start,((StatContext)_localctx).name1.stop):null)+" not defined.");
				    }

				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(338); id();
				setState(339); match(12);
				setState(340); expr();
				notifyErrorListeners("Missing ';'");
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(343); array();
				setState(344); match(12);
				setState(345); expr();
				setState(346); match(8);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(348); array();
				setState(349); match(12);
				setState(350); expr();
				notifyErrorListeners("Missing ';'");
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

	public static class VarDefContext extends ParserRuleContext {
		public IdContext name;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDef(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varDef);
		try {
			setState(364);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355); type();
				setState(356); ((VarDefContext)_localctx).name = id();
				setState(357); match(8);
				valueMap.put((((VarDefContext)_localctx).name!=null?_input.getText(((VarDefContext)_localctx).name.start,((VarDefContext)_localctx).name.stop):null),0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360); type();
				setState(361); id();
				notifyErrorListeners("Missing ';'");
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

	public static class MethodDefContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public MethodDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDef(this);
		}
	}

	public final MethodDefContext methodDef() throws RecognitionException {
		MethodDefContext _localctx = new MethodDefContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodDef);
		int _la;
		try {
			setState(428);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366); match(26);
				setState(367); type();
				setState(368); id();
				setState(369); match(16);
				setState(381);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 15) | (1L << 22) | (1L << DIGIT) | (1L << UNDERSCORE) | (1L << LETTER))) != 0)) {
					{
					setState(370); type();
					setState(371); id();
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==18) {
						{
						{
						setState(372); match(18);
						setState(373); type();
						setState(374); id();
						}
						}
						setState(380);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(383); match(32);
				setState(384); match(10);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 10) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 22) | (1L << 23) | (1L << DIGIT) | (1L << UNDERSCORE) | (1L << LETTER))) != 0)) {
					{
					setState(387);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(385); varDef();
						}
						break;

					case 2:
						{
						setState(386); stat();
						}
						break;
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(392); match(4);
				setState(393); expr();
				setState(394); match(8);
				setState(395); match(13);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397); match(26);
				setState(398); type();
				setState(399); id();
				setState(400); match(16);
				setState(412);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 15) | (1L << 22) | (1L << DIGIT) | (1L << UNDERSCORE) | (1L << LETTER))) != 0)) {
					{
					setState(401); type();
					setState(402); id();
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==18) {
						{
						{
						setState(403); match(18);
						setState(404); type();
						setState(405); id();
						}
						}
						setState(411);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(414); match(32);
				setState(415); match(10);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 10) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 22) | (1L << 23) | (1L << DIGIT) | (1L << UNDERSCORE) | (1L << LETTER))) != 0)) {
					{
					setState(418);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(416); varDef();
						}
						break;

					case 2:
						{
						setState(417); stat();
						}
						break;
					}
					}
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(423); match(4);
				setState(424); expr();
				setState(425); match(8);
				notifyErrorListeners("Missing ';'");
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

	public static class ClassDefContext extends ParserRuleContext {
		public MethodDefContext methodDef(int i) {
			return getRuleContext(MethodDefContext.class,i);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<MethodDefContext> methodDef() {
			return getRuleContexts(MethodDefContext.class);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDef(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classDef);
		int _la;
		try {
			setState(462);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430); match(6);
				setState(431); id();
				setState(434);
				_la = _input.LA(1);
				if (_la==11) {
					{
					setState(432); match(11);
					setState(433); id();
					}
				}

				setState(436); match(10);
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 15) | (1L << 22) | (1L << 26) | (1L << DIGIT) | (1L << UNDERSCORE) | (1L << LETTER))) != 0)) {
					{
					setState(439);
					switch (_input.LA(1)) {
					case 15:
					case 22:
					case DIGIT:
					case UNDERSCORE:
					case LETTER:
						{
						setState(437); varDef();
						}
						break;
					case 26:
						{
						setState(438); methodDef();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(444); match(13);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(446); match(6);
				setState(447); id();
				setState(450);
				_la = _input.LA(1);
				if (_la==11) {
					{
					setState(448); match(11);
					setState(449); id();
					}
				}

				setState(452); match(10);
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 15) | (1L << 22) | (1L << 26) | (1L << DIGIT) | (1L << UNDERSCORE) | (1L << LETTER))) != 0)) {
					{
					setState(455);
					switch (_input.LA(1)) {
					case 15:
					case 22:
					case DIGIT:
					case UNDERSCORE:
					case LETTER:
						{
						setState(453); varDef();
						}
						break;
					case 26:
						{
						setState(454); methodDef();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				notifyErrorListeners("Missing ';'");
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

	public static class MainClassContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
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
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mainClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); match(6);
			setState(465); id();
			setState(468);
			_la = _input.LA(1);
			if (_la==11) {
				{
				setState(466); match(11);
				setState(467); id();
				}
			}

			setState(470); match(10);
			setState(471); match(26);
			setState(472); match(30);
			setState(473); match(7);
			setState(474); match(1);
			setState(475); match(16);
			setState(476); match(25);
			setState(477); match(24);
			setState(478); match(27);
			setState(479); id();
			setState(480); match(32);
			setState(481); match(10);
			setState(482); stat();
			setState(483); match(13);
			setState(484); match(13);
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

	public static class ProgContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public List<ClassDefContext> classDef() {
			return getRuleContexts(ClassDefContext.class);
		}
		public ClassDefContext classDef(int i) {
			return getRuleContext(ClassDefContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486); mainClass();
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==6) {
				{
				{
				setState(487); classDef();
				}
				}
				setState(492);
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

	public static class BoolContext extends ParserRuleContext {
		public int v;
		public Expr_cmpContext num;
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bool);
		try {
			setState(500);
			switch (_input.LA(1)) {
			case 3:
				enterOuterAlt(_localctx, 1);
				{
				setState(493); match(3);
				((BoolContext)_localctx).v =  1;
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 2);
				{
				setState(495); match(20);
				((BoolContext)_localctx).v =  0;
				}
				break;
			case 16:
			case 29:
			case INT:
			case DIGIT:
			case UNDERSCORE:
			case LETTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(497); ((BoolContext)_localctx).num = expr_cmp();
				((BoolContext)_localctx).v =  ((BoolContext)_localctx).num.v;
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

	public static class CalculateContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public CalculateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterCalculate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitCalculate(this);
		}
	}

	public final CalculateContext calculate() throws RecognitionException {
		CalculateContext _localctx = new CalculateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_calculate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(505);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(502); stat();
					}
					break;

				case 2:
					{
					setState(503); expr();
					}
					break;

				case 3:
					{
					setState(504); varDef();
					}
					break;
				}
				}
				setState(507); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 9) | (1L << 10) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 22) | (1L << 23) | (1L << 29) | (1L << INT) | (1L << DIGIT) | (1L << UNDERSCORE) | (1L << LETTER))) != 0) );
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
		public TerminalNode LETTER(int i) {
			return getToken(MiniJavaParser.LETTER, i);
		}
		public List<TerminalNode> LETTER() { return getTokens(MiniJavaParser.LETTER); }
		public List<TerminalNode> UNDERSCORE() { return getTokens(MiniJavaParser.UNDERSCORE); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(MiniJavaParser.UNDERSCORE, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(MiniJavaParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MiniJavaParser.DIGIT, i);
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
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_id);
		int _la;
		try {
			int _alt;
			setState(524);
			switch (_input.LA(1)) {
			case LETTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(509); match(LETTER);
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(510);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << UNDERSCORE) | (1L << LETTER))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						} 
					}
					setState(515);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				}
				break;
			case DIGIT:
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				_la = _input.LA(1);
				if ( !(_la==DIGIT || _la==UNDERSCORE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(517);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << UNDERSCORE) | (1L << LETTER))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						} 
					}
					setState(522);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				notifyErrorListeners("ID should start with a letter!");
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

	public static class TypeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		try {
			setState(532);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(526); match(15);
				setState(527); match(24);
				setState(528); match(27);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(529); match(22);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(530); match(15);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(531); id();
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
		"\2\3+\u0219\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\5\2E\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4`\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5x\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008b\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009e\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u00a6\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ba\n\t\3\n\3\n\5\n\u00be\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00cb\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00d6\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f7\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u0100\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0109\n\16\f\16\16"+
		"\16\u010c\13\16\5\16\u010e\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u0119\n\16\f\16\16\16\u011c\13\16\5\16\u011e\n\16\3\16\3\16"+
		"\5\16\u0122\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0131\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0164"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u016f\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u017b\n\22\f\22\16"+
		"\22\u017e\13\22\5\22\u0180\n\22\3\22\3\22\3\22\3\22\7\22\u0186\n\22\f"+
		"\22\16\22\u0189\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u019a\n\22\f\22\16\22\u019d\13\22\5\22"+
		"\u019f\n\22\3\22\3\22\3\22\3\22\7\22\u01a5\n\22\f\22\16\22\u01a8\13\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u01af\n\22\3\23\3\23\3\23\3\23\5\23\u01b5"+
		"\n\23\3\23\3\23\3\23\7\23\u01ba\n\23\f\23\16\23\u01bd\13\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u01c5\n\23\3\23\3\23\3\23\7\23\u01ca\n\23\f"+
		"\23\16\23\u01cd\13\23\3\23\3\23\5\23\u01d1\n\23\3\24\3\24\3\24\3\24\5"+
		"\24\u01d7\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\7\25\u01eb\n\25\f\25\16\25\u01ee\13"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01f7\n\26\3\27\3\27\3\27"+
		"\6\27\u01fc\n\27\r\27\16\27\u01fd\3\30\3\30\7\30\u0202\n\30\f\30\16\30"+
		"\u0205\13\30\3\30\3\30\7\30\u0209\n\30\f\30\16\30\u020c\13\30\3\30\5\30"+
		"\u020f\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0217\n\31\3\31\2\32\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\5\3&(\3&\'\3&(\u0251"+
		"\2D\3\2\2\2\4N\3\2\2\2\6_\3\2\2\2\bw\3\2\2\2\n\u008a\3\2\2\2\f\u009d\3"+
		"\2\2\2\16\u00a5\3\2\2\2\20\u00b9\3\2\2\2\22\u00ca\3\2\2\2\24\u00d5\3\2"+
		"\2\2\26\u00f6\3\2\2\2\30\u00ff\3\2\2\2\32\u0121\3\2\2\2\34\u0130\3\2\2"+
		"\2\36\u0163\3\2\2\2 \u016e\3\2\2\2\"\u01ae\3\2\2\2$\u01d0\3\2\2\2&\u01d2"+
		"\3\2\2\2(\u01e8\3\2\2\2*\u01f6\3\2\2\2,\u01fb\3\2\2\2.\u020e\3\2\2\2\60"+
		"\u0216\3\2\2\2\62\63\7%\2\2\63E\b\2\1\2\64\65\7\22\2\2\65\66\5\b\5\2\66"+
		"\67\7\"\2\2\678\b\2\1\28E\3\2\2\29:\5.\30\2:;\b\2\1\2;E\3\2\2\2<=\5\4"+
		"\3\2=>\b\2\1\2>E\3\2\2\2?@\7\22\2\2@A\5\2\2\2AB\7\"\2\2BC\b\2\1\2CE\3"+
		"\2\2\2D\62\3\2\2\2D\64\3\2\2\2D9\3\2\2\2D<\3\2\2\2D?\3\2\2\2E\3\3\2\2"+
		"\2FG\7\37\2\2GH\5\2\2\2HI\b\3\1\2IO\3\2\2\2JK\7\37\2\2KL\5\f\7\2LM\b\3"+
		"\1\2MO\3\2\2\2NF\3\2\2\2NJ\3\2\2\2O\5\3\2\2\2PQ\5\2\2\2QR\7\36\2\2RS\5"+
		"\2\2\2ST\b\4\1\2T`\3\2\2\2UV\7\22\2\2VW\5\6\4\2WX\7\"\2\2XY\b\4\1\2Y`"+
		"\3\2\2\2Z[\7\22\2\2[\\\5\6\4\2\\]\b\4\1\2]^\b\4\1\2^`\3\2\2\2_P\3\2\2"+
		"\2_U\3\2\2\2_Z\3\2\2\2`\7\3\2\2\2ab\5\n\6\2bc\7#\2\2cd\5\b\5\2de\b\5\1"+
		"\2ex\3\2\2\2fg\5\n\6\2gh\7$\2\2hi\5\b\5\2ij\b\5\1\2jx\3\2\2\2kl\7\22\2"+
		"\2lm\5\b\5\2mn\7\"\2\2no\b\5\1\2ox\3\2\2\2pq\7\22\2\2qr\5\b\5\2rs\b\5"+
		"\1\2sx\3\2\2\2tu\5\n\6\2uv\b\5\1\2vx\3\2\2\2wa\3\2\2\2wf\3\2\2\2wk\3\2"+
		"\2\2wp\3\2\2\2wt\3\2\2\2x\t\3\2\2\2yz\5\2\2\2z{\7\23\2\2{|\5\n\6\2|}\b"+
		"\6\1\2}\u008b\3\2\2\2~\177\7\22\2\2\177\u0080\5\n\6\2\u0080\u0081\7\""+
		"\2\2\u0081\u0082\b\6\1\2\u0082\u008b\3\2\2\2\u0083\u0084\7\22\2\2\u0084"+
		"\u0085\5\n\6\2\u0085\u0086\b\6\1\2\u0086\u008b\3\2\2\2\u0087\u0088\5\2"+
		"\2\2\u0088\u0089\b\6\1\2\u0089\u008b\3\2\2\2\u008ay\3\2\2\2\u008a~\3\2"+
		"\2\2\u008a\u0083\3\2\2\2\u008a\u0087\3\2\2\2\u008b\13\3\2\2\2\u008c\u008d"+
		"\5*\26\2\u008d\u008e\7*\2\2\u008e\u008f\5*\26\2\u008f\u0090\b\7\1\2\u0090"+
		"\u009e\3\2\2\2\u0091\u0092\7\22\2\2\u0092\u0093\5\f\7\2\u0093\u0094\7"+
		"\"\2\2\u0094\u0095\b\7\1\2\u0095\u009e\3\2\2\2\u0096\u0097\7\22\2\2\u0097"+
		"\u0098\5\f\7\2\u0098\u0099\b\7\1\2\u0099\u009e\3\2\2\2\u009a\u009b\5*"+
		"\26\2\u009b\u009c\b\7\1\2\u009c\u009e\3\2\2\2\u009d\u008c\3\2\2\2\u009d"+
		"\u0091\3\2\2\2\u009d\u0096\3\2\2\2\u009d\u009a\3\2\2\2\u009e\r\3\2\2\2"+
		"\u009f\u00a0\5\b\5\2\u00a0\u00a1\b\b\1\2\u00a1\u00a6\3\2\2\2\u00a2\u00a3"+
		"\5\f\7\2\u00a3\u00a4\b\b\1\2\u00a4\u00a6\3\2\2\2\u00a5\u009f\3\2\2\2\u00a5"+
		"\u00a2\3\2\2\2\u00a6\17\3\2\2\2\u00a7\u00a8\5.\30\2\u00a8\u00a9\7\32\2"+
		"\2\u00a9\u00aa\5\16\b\2\u00aa\u00ab\7\35\2\2\u00ab\u00ba\3\2\2\2\u00ac"+
		"\u00ad\5.\30\2\u00ad\u00ae\7\32\2\2\u00ae\u00af\5\16\b\2\u00af\u00b0\b"+
		"\t\1\2\u00b0\u00ba\3\2\2\2\u00b1\u00b2\7\22\2\2\u00b2\u00b3\5\20\t\2\u00b3"+
		"\u00b4\7\"\2\2\u00b4\u00ba\3\2\2\2\u00b5\u00b6\7\22\2\2\u00b6\u00b7\5"+
		"\20\t\2\u00b7\u00b8\b\t\1\2\u00b8\u00ba\3\2\2\2\u00b9\u00a7\3\2\2\2\u00b9"+
		"\u00ac\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba\21\3\2\2"+
		"\2\u00bb\u00be\5\20\t\2\u00bc\u00be\5.\30\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\27\2\2\u00c0\u00c1\7"+
		"\4\2\2\u00c1\u00cb\3\2\2\2\u00c2\u00c3\7\22\2\2\u00c3\u00c4\5\22\n\2\u00c4"+
		"\u00c5\7\"\2\2\u00c5\u00cb\3\2\2\2\u00c6\u00c7\7\22\2\2\u00c7\u00c8\5"+
		"\22\n\2\u00c8\u00c9\b\n\1\2\u00c9\u00cb\3\2\2\2\u00ca\u00bd\3\2\2\2\u00ca"+
		"\u00c2\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb\23\3\2\2\2\u00cc\u00d6\7\25\2"+
		"\2\u00cd\u00ce\7\22\2\2\u00ce\u00cf\5\24\13\2\u00cf\u00d0\7\"\2\2\u00d0"+
		"\u00d6\3\2\2\2\u00d1\u00d2\7\22\2\2\u00d2\u00d3\5\24\13\2\u00d3\u00d4"+
		"\b\13\1\2\u00d4\u00d6\3\2\2\2\u00d5\u00cc\3\2\2\2\u00d5\u00cd\3\2\2\2"+
		"\u00d5\u00d1\3\2\2\2\u00d6\25\3\2\2\2\u00d7\u00d8\7\7\2\2\u00d8\u00d9"+
		"\5\60\31\2\u00d9\u00da\7\32\2\2\u00da\u00db\5\16\b\2\u00db\u00dc\7\35"+
		"\2\2\u00dc\u00f7\3\2\2\2\u00dd\u00de\7\7\2\2\u00de\u00df\5\60\31\2\u00df"+
		"\u00e0\7\32\2\2\u00e0\u00e1\5\16\b\2\u00e1\u00e2\7\35\2\2\u00e2\u00e3"+
		"\b\f\1\2\u00e3\u00f7\3\2\2\2\u00e4\u00e5\7\7\2\2\u00e5\u00e6\5.\30\2\u00e6"+
		"\u00e7\7\22\2\2\u00e7\u00e8\7\"\2\2\u00e8\u00f7\3\2\2\2\u00e9\u00ea\7"+
		"\7\2\2\u00ea\u00eb\5.\30\2\u00eb\u00ec\7\22\2\2\u00ec\u00ed\b\f\1\2\u00ed"+
		"\u00f7\3\2\2\2\u00ee\u00ef\7\22\2\2\u00ef\u00f0\5\26\f\2\u00f0\u00f1\7"+
		"\"\2\2\u00f1\u00f7\3\2\2\2\u00f2\u00f3\7\22\2\2\u00f3\u00f4\5\26\f\2\u00f4"+
		"\u00f5\b\f\1\2\u00f5\u00f7\3\2\2\2\u00f6\u00d7\3\2\2\2\u00f6\u00dd\3\2"+
		"\2\2\u00f6\u00e4\3\2\2\2\u00f6\u00e9\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6"+
		"\u00f2\3\2\2\2\u00f7\27\3\2\2\2\u00f8\u00f9\5\16\b\2\u00f9\u00fa\b\r\1"+
		"\2\u00fa\u0100\3\2\2\2\u00fb\u0100\5\20\t\2\u00fc\u0100\5\22\n\2\u00fd"+
		"\u0100\5\24\13\2\u00fe\u0100\5\26\f\2\u00ff\u00f8\3\2\2\2\u00ff\u00fb"+
		"\3\2\2\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\31\3\2\2\2\u0101\u0102\5\30\r\2\u0102\u0103\7\27\2\2\u0103\u0104\5.\30"+
		"\2\u0104\u010d\7\22\2\2\u0105\u010a\5\30\r\2\u0106\u0107\7\24\2\2\u0107"+
		"\u0109\5\30\r\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3"+
		"\2\2\2\u010a\u010b\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u0105\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7\""+
		"\2\2\u0110\u0122\3\2\2\2\u0111\u0112\5\30\r\2\u0112\u0113\7\27\2\2\u0113"+
		"\u0114\5.\30\2\u0114\u011d\7\22\2\2\u0115\u011a\5\30\r\2\u0116\u0117\7"+
		"\24\2\2\u0117\u0119\5\30\r\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011d\u0115\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0120\b\16\1\2\u0120\u0122\3\2\2\2\u0121\u0101\3\2\2\2\u0121\u0111\3"+
		"\2\2\2\u0122\33\3\2\2\2\u0123\u0124\5\30\r\2\u0124\u0125\b\17\1\2\u0125"+
		"\u0131\3\2\2\2\u0126\u0131\5\32\16\2\u0127\u0128\7\22\2\2\u0128\u0129"+
		"\5\34\17\2\u0129\u012a\7\"\2\2\u012a\u012b\b\17\1\2\u012b\u0131\3\2\2"+
		"\2\u012c\u012d\7\22\2\2\u012d\u012e\5\34\17\2\u012e\u012f\b\17\1\2\u012f"+
		"\u0131\3\2\2\2\u0130\u0123\3\2\2\2\u0130\u0126\3\2\2\2\u0130\u0127\3\2"+
		"\2\2\u0130\u012c\3\2\2\2\u0131\35\3\2\2\2\u0132\u0133\7\f\2\2\u0133\u0134"+
		"\5\36\20\2\u0134\u0135\7\17\2\2\u0135\u0164\3\2\2\2\u0136\u0137\7\f\2"+
		"\2\u0137\u0138\5\36\20\2\u0138\u0139\b\20\1\2\u0139\u0164\3\2\2\2\u013a"+
		"\u013b\7\20\2\2\u013b\u013c\7\22\2\2\u013c\u013d\5\34\17\2\u013d\u013e"+
		"\7\"\2\2\u013e\u013f\5\36\20\2\u013f\u0140\7!\2\2\u0140\u0141\5\36\20"+
		"\2\u0141\u0164\3\2\2\2\u0142\u0143\7\13\2\2\u0143\u0144\7\22\2\2\u0144"+
		"\u0145\5\34\17\2\u0145\u0146\7\"\2\2\u0146\u0147\5\36\20\2\u0147\u0164"+
		"\3\2\2\2\u0148\u0149\7\31\2\2\u0149\u014a\7\22\2\2\u014a\u014b\5\34\17"+
		"\2\u014b\u014c\7\"\2\2\u014c\u014d\7\n\2\2\u014d\u0164\3\2\2\2\u014e\u014f"+
		"\5.\30\2\u014f\u0150\7\16\2\2\u0150\u0151\5\34\17\2\u0151\u0152\7\n\2"+
		"\2\u0152\u0153\b\20\1\2\u0153\u0164\3\2\2\2\u0154\u0155\5.\30\2\u0155"+
		"\u0156\7\16\2\2\u0156\u0157\5\34\17\2\u0157\u0158\b\20\1\2\u0158\u0164"+
		"\3\2\2\2\u0159\u015a\5\20\t\2\u015a\u015b\7\16\2\2\u015b\u015c\5\34\17"+
		"\2\u015c\u015d\7\n\2\2\u015d\u0164\3\2\2\2\u015e\u015f\5\20\t\2\u015f"+
		"\u0160\7\16\2\2\u0160\u0161\5\34\17\2\u0161\u0162\b\20\1\2\u0162\u0164"+
		"\3\2\2\2\u0163\u0132\3\2\2\2\u0163\u0136\3\2\2\2\u0163\u013a\3\2\2\2\u0163"+
		"\u0142\3\2\2\2\u0163\u0148\3\2\2\2\u0163\u014e\3\2\2\2\u0163\u0154\3\2"+
		"\2\2\u0163\u0159\3\2\2\2\u0163\u015e\3\2\2\2\u0164\37\3\2\2\2\u0165\u0166"+
		"\5\60\31\2\u0166\u0167\5.\30\2\u0167\u0168\7\n\2\2\u0168\u0169\b\21\1"+
		"\2\u0169\u016f\3\2\2\2\u016a\u016b\5\60\31\2\u016b\u016c\5.\30\2\u016c"+
		"\u016d\b\21\1\2\u016d\u016f\3\2\2\2\u016e\u0165\3\2\2\2\u016e\u016a\3"+
		"\2\2\2\u016f!\3\2\2\2\u0170\u0171\7\34\2\2\u0171\u0172\5\60\31\2\u0172"+
		"\u0173\5.\30\2\u0173\u017f\7\22\2\2\u0174\u0175\5\60\31\2\u0175\u017c"+
		"\5.\30\2\u0176\u0177\7\24\2\2\u0177\u0178\5\60\31\2\u0178\u0179\5.\30"+
		"\2\u0179\u017b\3\2\2\2\u017a\u0176\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a"+
		"\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017f"+
		"\u0174\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\7\""+
		"\2\2\u0182\u0187\7\f\2\2\u0183\u0186\5 \21\2\u0184\u0186\5\36\20\2\u0185"+
		"\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a"+
		"\u018b\7\6\2\2\u018b\u018c\5\34\17\2\u018c\u018d\7\n\2\2\u018d\u018e\7"+
		"\17\2\2\u018e\u01af\3\2\2\2\u018f\u0190\7\34\2\2\u0190\u0191\5\60\31\2"+
		"\u0191\u0192\5.\30\2\u0192\u019e\7\22\2\2\u0193\u0194\5\60\31\2\u0194"+
		"\u019b\5.\30\2\u0195\u0196\7\24\2\2\u0196\u0197\5\60\31\2\u0197\u0198"+
		"\5.\30\2\u0198\u019a\3\2\2\2\u0199\u0195\3\2\2\2\u019a\u019d\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2"+
		"\2\2\u019e\u0193\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a1\7\"\2\2\u01a1\u01a6\7\f\2\2\u01a2\u01a5\5 \21\2\u01a3\u01a5\5\36"+
		"\20\2\u01a4\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a6\3\2"+
		"\2\2\u01a9\u01aa\7\6\2\2\u01aa\u01ab\5\34\17\2\u01ab\u01ac\7\n\2\2\u01ac"+
		"\u01ad\b\22\1\2\u01ad\u01af\3\2\2\2\u01ae\u0170\3\2\2\2\u01ae\u018f\3"+
		"\2\2\2\u01af#\3\2\2\2\u01b0\u01b1\7\b\2\2\u01b1\u01b4\5.\30\2\u01b2\u01b3"+
		"\7\r\2\2\u01b3\u01b5\5.\30\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01bb\7\f\2\2\u01b7\u01ba\5 \21\2\u01b8\u01ba\5\""+
		"\22\2\u01b9\u01b7\3\2\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bb\3\2"+
		"\2\2\u01be\u01bf\7\17\2\2\u01bf\u01d1\3\2\2\2\u01c0\u01c1\7\b\2\2\u01c1"+
		"\u01c4\5.\30\2\u01c2\u01c3\7\r\2\2\u01c3\u01c5\5.\30\2\u01c4\u01c2\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01cb\7\f\2\2\u01c7"+
		"\u01ca\5 \21\2\u01c8\u01ca\5\"\22\2\u01c9\u01c7\3\2\2\2\u01c9\u01c8\3"+
		"\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01ce\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01cf\b\23\1\2\u01cf\u01d1\3"+
		"\2\2\2\u01d0\u01b0\3\2\2\2\u01d0\u01c0\3\2\2\2\u01d1%\3\2\2\2\u01d2\u01d3"+
		"\7\b\2\2\u01d3\u01d6\5.\30\2\u01d4\u01d5\7\r\2\2\u01d5\u01d7\5.\30\2\u01d6"+
		"\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\7\f"+
		"\2\2\u01d9\u01da\7\34\2\2\u01da\u01db\7 \2\2\u01db\u01dc\7\t\2\2\u01dc"+
		"\u01dd\7\3\2\2\u01dd\u01de\7\22\2\2\u01de\u01df\7\33\2\2\u01df\u01e0\7"+
		"\32\2\2\u01e0\u01e1\7\35\2\2\u01e1\u01e2\5.\30\2\u01e2\u01e3\7\"\2\2\u01e3"+
		"\u01e4\7\f\2\2\u01e4\u01e5\5\36\20\2\u01e5\u01e6\7\17\2\2\u01e6\u01e7"+
		"\7\17\2\2\u01e7\'\3\2\2\2\u01e8\u01ec\5&\24\2\u01e9\u01eb\5$\23\2\u01ea"+
		"\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2"+
		"\2\2\u01ed)\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f0\7\5\2\2\u01f0\u01f7"+
		"\b\26\1\2\u01f1\u01f2\7\26\2\2\u01f2\u01f7\b\26\1\2\u01f3\u01f4\5\6\4"+
		"\2\u01f4\u01f5\b\26\1\2\u01f5\u01f7\3\2\2\2\u01f6\u01ef\3\2\2\2\u01f6"+
		"\u01f1\3\2\2\2\u01f6\u01f3\3\2\2\2\u01f7+\3\2\2\2\u01f8\u01fc\5\36\20"+
		"\2\u01f9\u01fc\5\34\17\2\u01fa\u01fc\5 \21\2\u01fb\u01f8\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fb\3\2"+
		"\2\2\u01fd\u01fe\3\2\2\2\u01fe-\3\2\2\2\u01ff\u0203\7(\2\2\u0200\u0202"+
		"\t\2\2\2\u0201\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u020f\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u020a\t\3"+
		"\2\2\u0207\u0209\t\4\2\2\u0208\u0207\3\2\2\2\u0209\u020c\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\3\2\2\2\u020c\u020a\3\2"+
		"\2\2\u020d\u020f\b\30\1\2\u020e\u01ff\3\2\2\2\u020e\u0206\3\2\2\2\u020f"+
		"/\3\2\2\2\u0210\u0211\7\21\2\2\u0211\u0212\7\32\2\2\u0212\u0217\7\35\2"+
		"\2\u0213\u0217\7\30\2\2\u0214\u0217\7\21\2\2\u0215\u0217\5.\30\2\u0216"+
		"\u0210\3\2\2\2\u0216\u0213\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0215\3\2"+
		"\2\2\u0217\61\3\2\2\2\60DN_w\u008a\u009d\u00a5\u00b9\u00bd\u00ca\u00d5"+
		"\u00f6\u00ff\u010a\u010d\u011a\u011d\u0121\u0130\u0163\u016e\u017c\u017f"+
		"\u0185\u0187\u019b\u019e\u01a4\u01a6\u01ae\u01b4\u01b9\u01bb\u01c4\u01c9"+
		"\u01cb\u01d0\u01d6\u01ec\u01f6\u01fb\u01fd\u0203\u020a\u020e\u0216";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}