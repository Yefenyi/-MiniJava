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
		T__2=1, T__1=2, T__0=3, ID=4, INT=5, FLOAT=6, LETTER=7, DIGIT=8, OPR=9, 
		DEL=10, WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'('", "')'", "';'", "ID", "INT", "FLOAT", "LETTER", "DIGIT", "OPR", "DEL", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "ID", "INT", "FLOAT", "LETTER", "DIGIT", "OPR", 
		"DEL", "WS"
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
		case 10: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\rY\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\7"+
		"\5#\n\5\f\5\16\5&\13\5\3\6\3\6\7\6*\n\6\f\6\16\6-\13\6\3\6\5\6\60\n\6"+
		"\3\7\3\7\3\7\7\7\65\n\7\f\7\16\78\13\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nO\n\n\3\13\3\13"+
		"\3\f\6\fT\n\f\r\f\16\fU\3\f\3\f\2\r\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b"+
		"\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\2\3\2\n\3\63;\3\62;\3\63;\4C\\c|"+
		"\3\62;\6,-//\61\61>>\13*+..\60\60==??]]__}}\177\177\4\13\f\17\17f\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31"+
		"\3\2\2\2\5\33\3\2\2\2\7\35\3\2\2\2\t\37\3\2\2\2\13/\3\2\2\2\r\61\3\2\2"+
		"\2\17;\3\2\2\2\21=\3\2\2\2\23N\3\2\2\2\25P\3\2\2\2\27S\3\2\2\2\31\32\7"+
		"*\2\2\32\4\3\2\2\2\33\34\7+\2\2\34\6\3\2\2\2\35\36\7=\2\2\36\b\3\2\2\2"+
		"\37$\5\17\b\2 #\5\17\b\2!#\5\21\t\2\" \3\2\2\2\"!\3\2\2\2#&\3\2\2\2$\""+
		"\3\2\2\2$%\3\2\2\2%\n\3\2\2\2&$\3\2\2\2\'+\t\2\2\2(*\5\21\t\2)(\3\2\2"+
		"\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\60\3\2\2\2-+\3\2\2\2.\60\5\21\t\2/\'"+
		"\3\2\2\2/.\3\2\2\2\60\f\3\2\2\2\61\62\5\13\6\2\62\66\7\60\2\2\63\65\t"+
		"\3\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2"+
		"\28\66\3\2\2\29:\t\4\2\2:\16\3\2\2\2;<\t\5\2\2<\20\3\2\2\2=>\t\6\2\2>"+
		"\22\3\2\2\2?O\t\7\2\2@A\7>\2\2AO\7?\2\2BC\7@\2\2CO\7?\2\2DO\7@\2\2EF\7"+
		"?\2\2FO\7?\2\2GH\7#\2\2HO\7?\2\2IJ\7(\2\2JO\7(\2\2KL\7~\2\2LO\7~\2\2M"+
		"O\7#\2\2N?\3\2\2\2N@\3\2\2\2NB\3\2\2\2ND\3\2\2\2NE\3\2\2\2NG\3\2\2\2N"+
		"I\3\2\2\2NK\3\2\2\2NM\3\2\2\2O\24\3\2\2\2PQ\t\b\2\2Q\26\3\2\2\2RT\t\t"+
		"\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\b\f\2\2X\30\3"+
		"\2\2\2\n\2\"$+/\66NU";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}