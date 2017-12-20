// Generated from MiniJava.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, INT=24, 
		DIGIT=25, UNDERSCORE=26, LETTER=27, ID=28, TYPE=29, ADD_MINUS=30, AND=31, 
		WS=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'length'", "'new'", "'true'", "'System.out.println'", "';'", "'while'", 
		"'{'", "'['", "'='", "'}'", "']'", "'if'", "'>'", "'!'", "'int'", "'else'", 
		"'('", "')'", "'*'", "','", "'this'", "'.'", "'false'", "INT", "DIGIT", 
		"'_'", "LETTER", "ID", "TYPE", "ADD_MINUS", "'&&'", "WS"
	};
	public static final String[] ruleNames = {
		"T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", 
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "INT", "DIGIT", "UNDERSCORE", 
		"LETTER", "ID", "TYPE", "ADD_MINUS", "AND", "WS"
	};


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 31: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\"\u00d7\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\5\31\u009f\n\31\3\31\3\31\6\31\u00a3\n\31\r\31\16\31\u00a4"+
		"\3\31\5\31\u00a8\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\7\35\u00b4\n\35\f\35\16\35\u00b7\13\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00ca\n\36"+
		"\3\37\3\37\3 \3 \3 \3!\6!\u00d2\n!\r!\16!\u00d3\3!\3!\2\"\3\3\1\5\4\1"+
		"\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1"+
		"\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31"+
		"\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\2\3\2\t\3\63"+
		";\3\62;\3\62;\3\62;\4C\\c|\4--//\4\13\f\17\17\u00e0\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5J\3\2\2\2\7N\3\2\2\2\tS\3\2\2\2\13f\3"+
		"\2\2\2\rh\3\2\2\2\17n\3\2\2\2\21p\3\2\2\2\23r\3\2\2\2\25t\3\2\2\2\27v"+
		"\3\2\2\2\31x\3\2\2\2\33{\3\2\2\2\35}\3\2\2\2\37\177\3\2\2\2!\u0083\3\2"+
		"\2\2#\u0088\3\2\2\2%\u008a\3\2\2\2\'\u008c\3\2\2\2)\u008e\3\2\2\2+\u0090"+
		"\3\2\2\2-\u0095\3\2\2\2/\u0097\3\2\2\2\61\u00a7\3\2\2\2\63\u00a9\3\2\2"+
		"\2\65\u00ab\3\2\2\2\67\u00ad\3\2\2\29\u00af\3\2\2\2;\u00c9\3\2\2\2=\u00cb"+
		"\3\2\2\2?\u00cd\3\2\2\2A\u00d1\3\2\2\2CD\7n\2\2DE\7g\2\2EF\7p\2\2FG\7"+
		"i\2\2GH\7v\2\2HI\7j\2\2I\4\3\2\2\2JK\7p\2\2KL\7g\2\2LM\7y\2\2M\6\3\2\2"+
		"\2NO\7v\2\2OP\7t\2\2PQ\7w\2\2QR\7g\2\2R\b\3\2\2\2ST\7U\2\2TU\7{\2\2UV"+
		"\7u\2\2VW\7v\2\2WX\7g\2\2XY\7o\2\2YZ\7\60\2\2Z[\7q\2\2[\\\7w\2\2\\]\7"+
		"v\2\2]^\7\60\2\2^_\7r\2\2_`\7t\2\2`a\7k\2\2ab\7p\2\2bc\7v\2\2cd\7n\2\2"+
		"de\7p\2\2e\n\3\2\2\2fg\7=\2\2g\f\3\2\2\2hi\7y\2\2ij\7j\2\2jk\7k\2\2kl"+
		"\7n\2\2lm\7g\2\2m\16\3\2\2\2no\7}\2\2o\20\3\2\2\2pq\7]\2\2q\22\3\2\2\2"+
		"rs\7?\2\2s\24\3\2\2\2tu\7\177\2\2u\26\3\2\2\2vw\7_\2\2w\30\3\2\2\2xy\7"+
		"k\2\2yz\7h\2\2z\32\3\2\2\2{|\7@\2\2|\34\3\2\2\2}~\7#\2\2~\36\3\2\2\2\177"+
		"\u0080\7k\2\2\u0080\u0081\7p\2\2\u0081\u0082\7v\2\2\u0082 \3\2\2\2\u0083"+
		"\u0084\7g\2\2\u0084\u0085\7n\2\2\u0085\u0086\7u\2\2\u0086\u0087\7g\2\2"+
		"\u0087\"\3\2\2\2\u0088\u0089\7*\2\2\u0089$\3\2\2\2\u008a\u008b\7+\2\2"+
		"\u008b&\3\2\2\2\u008c\u008d\7,\2\2\u008d(\3\2\2\2\u008e\u008f\7.\2\2\u008f"+
		"*\3\2\2\2\u0090\u0091\7v\2\2\u0091\u0092\7j\2\2\u0092\u0093\7k\2\2\u0093"+
		"\u0094\7u\2\2\u0094,\3\2\2\2\u0095\u0096\7\60\2\2\u0096.\3\2\2\2\u0097"+
		"\u0098\7h\2\2\u0098\u0099\7c\2\2\u0099\u009a\7n\2\2\u009a\u009b\7u\2\2"+
		"\u009b\u009c\7g\2\2\u009c\60\3\2\2\2\u009d\u009f\7/\2\2\u009e\u009d\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\t\2\2\2\u00a1"+
		"\u00a3\t\3\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a8\t\4\2\2\u00a7"+
		"\u009e\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\62\3\2\2\2\u00a9\u00aa\t\5\2"+
		"\2\u00aa\64\3\2\2\2\u00ab\u00ac\7a\2\2\u00ac\66\3\2\2\2\u00ad\u00ae\t"+
		"\6\2\2\u00ae8\3\2\2\2\u00af\u00b5\5\67\34\2\u00b0\u00b4\5\67\34\2\u00b1"+
		"\u00b4\5\63\32\2\u00b2\u00b4\5\65\33\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6:\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7k\2\2\u00b9"+
		"\u00ba\7p\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7]\2"+
		"\2\u00bd\u00ca\7_\2\2\u00be\u00bf\7d\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1"+
		"\7q\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7c\2\2\u00c4"+
		"\u00ca\7p\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7p\2\2\u00c7\u00ca\7v\2\2"+
		"\u00c8\u00ca\59\35\2\u00c9\u00b8\3\2\2\2\u00c9\u00be\3\2\2\2\u00c9\u00c5"+
		"\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca<\3\2\2\2\u00cb\u00cc\t\7\2\2\u00cc"+
		">\3\2\2\2\u00cd\u00ce\7(\2\2\u00ce\u00cf\7(\2\2\u00cf@\3\2\2\2\u00d0\u00d2"+
		"\t\b\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b!\2\2\u00d6B\3\2\2\2\n"+
		"\2\u009e\u00a4\u00a7\u00b3\u00b5\u00c9\u00d3";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}