// Generated from MiniJava.g4 by ANTLR 4.0

import java.util.*;

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
		T__33=1, T__32=2, T__31=3, T__30=4, T__29=5, T__28=6, T__27=7, T__26=8, 
		T__25=9, T__24=10, T__23=11, T__22=12, T__21=13, T__20=14, T__19=15, T__18=16, 
		T__17=17, T__16=18, T__15=19, T__14=20, T__13=21, T__12=22, T__11=23, 
		T__10=24, T__9=25, T__8=26, T__7=27, T__6=28, T__5=29, T__4=30, T__3=31, 
		T__2=32, T__1=33, T__0=34, INT=35, DIGIT=36, UNDERSCORE=37, LETTER=38, 
		ADD_MINUS=39, AND=40, WS=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'main'", "'length'", "'true'", "'return'", "'new'", "'class'", "'void'", 
		"';'", "'while'", "'{'", "'extends'", "'='", "'}'", "'if'", "'int'", "'('", 
		"'*'", "','", "'this'", "'false'", "'.'", "'boolean'", "'System.out.println'", 
		"'['", "'String'", "'public'", "']'", "'>'", "'!'", "'static'", "'else'", 
		"')'", "'+'", "'-'", "INT", "DIGIT", "'_'", "LETTER", "ADD_MINUS", "'&&'", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__33", "T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", 
		"T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", 
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "INT", "DIGIT", "UNDERSCORE", "LETTER", "ADD_MINUS", "AND", "WS"
	};


	    void print(int num){
	        System.out.println(num);
	    }
	    HashMap<String, Object> valueMap = new HashMap<String, Object>();


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
		case 40: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4+\u010d\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3$\5$\u00f1\n$\3$\3$\6$\u00f5\n$\r$\16$\u00f6\3$\5$\u00fa\n"+
		"$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\6*\u0108\n*\r*\16*\u0109\3*\3"+
		"*\2+\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1"+
		"\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1"+
		"+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1"+
		"A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\2\3\2\t\3\63;\3\62;\3\62;\3\62"+
		";\4C\\c|\4--//\5\13\f\17\17\"\"\u0110\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5Z\3\2\2\2\7a\3\2\2\2\t"+
		"f\3\2\2\2\13m\3\2\2\2\rq\3\2\2\2\17w\3\2\2\2\21|\3\2\2\2\23~\3\2\2\2\25"+
		"\u0084\3\2\2\2\27\u0086\3\2\2\2\31\u008e\3\2\2\2\33\u0090\3\2\2\2\35\u0092"+
		"\3\2\2\2\37\u0095\3\2\2\2!\u0099\3\2\2\2#\u009b\3\2\2\2%\u009d\3\2\2\2"+
		"\'\u009f\3\2\2\2)\u00a4\3\2\2\2+\u00aa\3\2\2\2-\u00ac\3\2\2\2/\u00b4\3"+
		"\2\2\2\61\u00c7\3\2\2\2\63\u00c9\3\2\2\2\65\u00d0\3\2\2\2\67\u00d7\3\2"+
		"\2\29\u00d9\3\2\2\2;\u00db\3\2\2\2=\u00dd\3\2\2\2?\u00e4\3\2\2\2A\u00e9"+
		"\3\2\2\2C\u00eb\3\2\2\2E\u00ed\3\2\2\2G\u00f9\3\2\2\2I\u00fb\3\2\2\2K"+
		"\u00fd\3\2\2\2M\u00ff\3\2\2\2O\u0101\3\2\2\2Q\u0103\3\2\2\2S\u0107\3\2"+
		"\2\2UV\7o\2\2VW\7c\2\2WX\7k\2\2XY\7p\2\2Y\4\3\2\2\2Z[\7n\2\2[\\\7g\2\2"+
		"\\]\7p\2\2]^\7i\2\2^_\7v\2\2_`\7j\2\2`\6\3\2\2\2ab\7v\2\2bc\7t\2\2cd\7"+
		"w\2\2de\7g\2\2e\b\3\2\2\2fg\7t\2\2gh\7g\2\2hi\7v\2\2ij\7w\2\2jk\7t\2\2"+
		"kl\7p\2\2l\n\3\2\2\2mn\7p\2\2no\7g\2\2op\7y\2\2p\f\3\2\2\2qr\7e\2\2rs"+
		"\7n\2\2st\7c\2\2tu\7u\2\2uv\7u\2\2v\16\3\2\2\2wx\7x\2\2xy\7q\2\2yz\7k"+
		"\2\2z{\7f\2\2{\20\3\2\2\2|}\7=\2\2}\22\3\2\2\2~\177\7y\2\2\177\u0080\7"+
		"j\2\2\u0080\u0081\7k\2\2\u0081\u0082\7n\2\2\u0082\u0083\7g\2\2\u0083\24"+
		"\3\2\2\2\u0084\u0085\7}\2\2\u0085\26\3\2\2\2\u0086\u0087\7g\2\2\u0087"+
		"\u0088\7z\2\2\u0088\u0089\7v\2\2\u0089\u008a\7g\2\2\u008a\u008b\7p\2\2"+
		"\u008b\u008c\7f\2\2\u008c\u008d\7u\2\2\u008d\30\3\2\2\2\u008e\u008f\7"+
		"?\2\2\u008f\32\3\2\2\2\u0090\u0091\7\177\2\2\u0091\34\3\2\2\2\u0092\u0093"+
		"\7k\2\2\u0093\u0094\7h\2\2\u0094\36\3\2\2\2\u0095\u0096\7k\2\2\u0096\u0097"+
		"\7p\2\2\u0097\u0098\7v\2\2\u0098 \3\2\2\2\u0099\u009a\7*\2\2\u009a\"\3"+
		"\2\2\2\u009b\u009c\7,\2\2\u009c$\3\2\2\2\u009d\u009e\7.\2\2\u009e&\3\2"+
		"\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7j\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3"+
		"\7u\2\2\u00a3(\3\2\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7"+
		"\7n\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7g\2\2\u00a9*\3\2\2\2\u00aa\u00ab"+
		"\7\60\2\2\u00ab,\3\2\2\2\u00ac\u00ad\7d\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af"+
		"\7q\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7c\2\2\u00b2"+
		"\u00b3\7p\2\2\u00b3.\3\2\2\2\u00b4\u00b5\7U\2\2\u00b5\u00b6\7{\2\2\u00b6"+
		"\u00b7\7u\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7o\2\2"+
		"\u00ba\u00bb\7\60\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be"+
		"\7v\2\2\u00be\u00bf\7\60\2\2\u00bf\u00c0\7r\2\2\u00c0\u00c1\7t\2\2\u00c1"+
		"\u00c2\7k\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7n\2\2"+
		"\u00c5\u00c6\7p\2\2\u00c6\60\3\2\2\2\u00c7\u00c8\7]\2\2\u00c8\62\3\2\2"+
		"\2\u00c9\u00ca\7U\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd"+
		"\7k\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7i\2\2\u00cf\64\3\2\2\2\u00d0\u00d1"+
		"\7r\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3\7d\2\2\u00d3\u00d4\7n\2\2\u00d4"+
		"\u00d5\7k\2\2\u00d5\u00d6\7e\2\2\u00d6\66\3\2\2\2\u00d7\u00d8\7_\2\2\u00d8"+
		"8\3\2\2\2\u00d9\u00da\7@\2\2\u00da:\3\2\2\2\u00db\u00dc\7#\2\2\u00dc<"+
		"\3\2\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7c\2\2\u00e0"+
		"\u00e1\7v\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7e\2\2\u00e3>\3\2\2\2\u00e4"+
		"\u00e5\7g\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7g\2\2"+
		"\u00e8@\3\2\2\2\u00e9\u00ea\7+\2\2\u00eaB\3\2\2\2\u00eb\u00ec\7-\2\2\u00ec"+
		"D\3\2\2\2\u00ed\u00ee\7/\2\2\u00eeF\3\2\2\2\u00ef\u00f1\7/\2\2\u00f0\u00ef"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\t\2\2\2\u00f3"+
		"\u00f5\t\3\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00fa\t\4\2\2\u00f9"+
		"\u00f0\3\2\2\2\u00f9\u00f8\3\2\2\2\u00faH\3\2\2\2\u00fb\u00fc\t\5\2\2"+
		"\u00fcJ\3\2\2\2\u00fd\u00fe\7a\2\2\u00feL\3\2\2\2\u00ff\u0100\t\6\2\2"+
		"\u0100N\3\2\2\2\u0101\u0102\t\7\2\2\u0102P\3\2\2\2\u0103\u0104\7(\2\2"+
		"\u0104\u0105\7(\2\2\u0105R\3\2\2\2\u0106\u0108\t\b\2\2\u0107\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010c\b*\2\2\u010cT\3\2\2\2\7\2\u00f0\u00f6\u00f9"+
		"\u0109";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}