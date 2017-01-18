package grammar;
// Generated from RuleSetGrammar.g4 by ANTLR 4.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleSetGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, SYMBOL=12, NOTE=13, WHITESPACE=14, COLOR=15, NOTE_NAME=16, 
		TEXT=17, LETTER=18, DIGIT=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'"
	};
	public static final String[] ruleNames = {
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "SYMBOL", "NOTE", "WHITESPACE", "COLOR", "NOTE_NAME", 
		"TEXT", "LETTER", "DIGIT"
	};


	public RuleSetGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RuleSetGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\6\17[\n\17\r\17\16\17\\\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20m\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"~\n\21\3\22\6\22\u0081\n\22\r\22\16\22\u0082\3\23\6\23\u0086\n\23\r\23"+
		"\16\23\u0087\3\24\6\24\u008b\n\24\r\24\16\24\u008c\2\2\25\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25\3\2\5\4\2%%\u00a6\u00a6\5\2\13\f\16\17\"\"\4\2C\\c|\u0099\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5,\3\2\2\2\7.\3\2\2\2\t\66\3\2\2"+
		"\2\13<\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25K\3\2"+
		"\2\2\27S\3\2\2\2\31U\3\2\2\2\33W\3\2\2\2\35Z\3\2\2\2\37l\3\2\2\2!}\3\2"+
		"\2\2#\u0080\3\2\2\2%\u0085\3\2\2\2\'\u008a\3\2\2\2)*\7/\2\2*+\7\"\2\2"+
		"+\4\3\2\2\2,-\7\"\2\2-\6\3\2\2\2./\7u\2\2/\60\7e\2\2\60\61\7t\2\2\61\62"+
		"\7g\2\2\62\63\7g\2\2\63\64\7p\2\2\64\65\7\"\2\2\65\b\3\2\2\2\66\67\7u"+
		"\2\2\678\7e\2\289\7q\2\29:\7t\2\2:;\7g\2\2;\n\3\2\2\2<=\7e\2\2=>\7q\2"+
		"\2>?\7n\2\2?@\7q\2\2@A\7t\2\2AB\7\"\2\2B\f\3\2\2\2CD\7-\2\2D\16\3\2\2"+
		"\2EF\7}\2\2F\20\3\2\2\2GH\7\177\2\2H\22\3\2\2\2IJ\7/\2\2J\24\3\2\2\2K"+
		"L\7d\2\2LM\7w\2\2MN\7|\2\2NO\7|\2\2OP\7g\2\2PQ\7t\2\2QR\7\"\2\2R\26\3"+
		"\2\2\2ST\7\60\2\2T\30\3\2\2\2UV\t\2\2\2V\32\3\2\2\2WX\5!\21\2X\34\3\2"+
		"\2\2Y[\t\3\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_"+
		"\b\17\2\2_\36\3\2\2\2`a\7t\2\2ab\7g\2\2bm\7f\2\2cd\7i\2\2de\7t\2\2ef\7"+
		"g\2\2fg\7g\2\2gm\7p\2\2hi\7d\2\2ij\7n\2\2jk\7w\2\2km\7g\2\2l`\3\2\2\2"+
		"lc\3\2\2\2lh\3\2\2\2m \3\2\2\2no\7f\2\2o~\7q\2\2pq\7t\2\2q~\7g\2\2rs\7"+
		"o\2\2s~\7k\2\2tu\7h\2\2u~\7c\2\2vw\7u\2\2wx\7q\2\2x~\7n\2\2yz\7n\2\2z"+
		"~\7c\2\2{|\7u\2\2|~\7k\2\2}n\3\2\2\2}p\3\2\2\2}r\3\2\2\2}t\3\2\2\2}v\3"+
		"\2\2\2}y\3\2\2\2}{\3\2\2\2~\"\3\2\2\2\177\u0081\5%\23\2\u0080\177\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"$\3\2\2\2\u0084\u0086\t\4\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2"+
		"\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088&\3\2\2\2\u0089\u008b\4"+
		"\63;\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d(\3\2\2\2\t\2\\l}\u0082\u0087\u008c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}