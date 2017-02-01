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
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, SYMBOL=14, SYMBOL_REPEAT=15, NOTE=16, 
		COLOR=17, NOTE_NAME=18, TEXT=19, DIGIT=20, LETTER=21, WHITESPACE=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'"
	};
	public static final String[] ruleNames = {
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "SYMBOL", "SYMBOL_REPEAT", "NOTE", "COLOR", 
		"NOTE_NAME", "TEXT", "DIGIT", "LETTER", "WHITESPACE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00ad\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\7\20j\n\20\f\20\16\20m\13\20\3\20\7\20p\n\20\f\20"+
		"\16\20s\13\20\5\20u\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0085\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0096\n\23\3\24\6\24"+
		"\u0099\n\24\r\24\16\24\u009a\3\25\6\25\u009e\n\25\r\25\16\25\u009f\3\26"+
		"\6\26\u00a3\n\26\r\26\16\26\u00a4\3\27\6\27\u00a8\n\27\r\27\16\27\u00a9"+
		"\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\5\4\2%%\u00a6\u00a6"+
		"\4\2C\\c|\4\2\13\f\16\17\u00bb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\62\3\2\2\2\7\67\3\2\2\2\t@\3\2\2\2\13"+
		"H\3\2\2\2\rM\3\2\2\2\17O\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2\25Y\3\2\2\2\27"+
		"`\3\2\2\2\31b\3\2\2\2\33d\3\2\2\2\35f\3\2\2\2\37t\3\2\2\2!v\3\2\2\2#\u0084"+
		"\3\2\2\2%\u0095\3\2\2\2\'\u0098\3\2\2\2)\u009d\3\2\2\2+\u00a2\3\2\2\2"+
		"-\u00a7\3\2\2\2/\60\7/\2\2\60\61\7\"\2\2\61\4\3\2\2\2\62\63\7m\2\2\63"+
		"\64\7g\2\2\64\65\7{\2\2\65\66\7\"\2\2\66\6\3\2\2\2\678\7u\2\289\7r\2\2"+
		"9:\7g\2\2:;\7c\2\2;<\7m\2\2<=\7g\2\2=>\7t\2\2>?\7\"\2\2?\b\3\2\2\2@A\7"+
		"u\2\2AB\7e\2\2BC\7t\2\2CD\7g\2\2DE\7g\2\2EF\7p\2\2FG\7\"\2\2G\n\3\2\2"+
		"\2HI\7d\2\2IJ\7r\2\2JK\7o\2\2KL\7\"\2\2L\f\3\2\2\2MN\7}\2\2N\16\3\2\2"+
		"\2OP\7\177\2\2P\20\3\2\2\2QR\7\"\2\2R\22\3\2\2\2ST\7u\2\2TU\7e\2\2UV\7"+
		"q\2\2VW\7t\2\2WX\7g\2\2X\24\3\2\2\2YZ\7e\2\2Z[\7q\2\2[\\\7n\2\2\\]\7q"+
		"\2\2]^\7t\2\2^_\7\"\2\2_\26\3\2\2\2`a\7-\2\2a\30\3\2\2\2bc\7/\2\2c\32"+
		"\3\2\2\2de\7\60\2\2e\34\3\2\2\2fg\t\2\2\2g\36\3\2\2\2hj\7\u00a6\2\2ih"+
		"\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lu\3\2\2\2mk\3\2\2\2np\7%\2\2on"+
		"\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tk\3\2\2\2t"+
		"q\3\2\2\2u \3\2\2\2vw\5%\23\2w\"\3\2\2\2xy\7t\2\2yz\7g\2\2z\u0085\7f\2"+
		"\2{|\7i\2\2|}\7t\2\2}~\7g\2\2~\177\7g\2\2\177\u0085\7p\2\2\u0080\u0081"+
		"\7d\2\2\u0081\u0082\7n\2\2\u0082\u0083\7w\2\2\u0083\u0085\7g\2\2\u0084"+
		"x\3\2\2\2\u0084{\3\2\2\2\u0084\u0080\3\2\2\2\u0085$\3\2\2\2\u0086\u0087"+
		"\7f\2\2\u0087\u0096\7q\2\2\u0088\u0089\7t\2\2\u0089\u0096\7g\2\2\u008a"+
		"\u008b\7o\2\2\u008b\u0096\7k\2\2\u008c\u008d\7h\2\2\u008d\u0096\7c\2\2"+
		"\u008e\u008f\7u\2\2\u008f\u0090\7q\2\2\u0090\u0096\7n\2\2\u0091\u0092"+
		"\7n\2\2\u0092\u0096\7c\2\2\u0093\u0094\7u\2\2\u0094\u0096\7k\2\2\u0095"+
		"\u0086\3\2\2\2\u0095\u0088\3\2\2\2\u0095\u008a\3\2\2\2\u0095\u008c\3\2"+
		"\2\2\u0095\u008e\3\2\2\2\u0095\u0091\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"&\3\2\2\2\u0097\u0099\5+\26\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2"+
		"\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b(\3\2\2\2\u009c\u009e\4"+
		"\62;\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0*\3\2\2\2\u00a1\u00a3\t\3\2\2\u00a2\u00a1\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5,\3"+
		"\2\2\2\u00a6\u00a8\t\4\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\27"+
		"\2\2\u00ac.\3\2\2\2\f\2kqt\u0084\u0095\u009a\u009f\u00a4\u00a9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}