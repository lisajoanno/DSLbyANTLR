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
		T__1=10, T__0=11, SYMBOL=12, SYMBOL_REPEAT=13, NOTE=14, COLOR=15, NOTE_NAME=16, 
		SILENCE=17, TEXT=18, DIGIT=19, LETTER=20, WHITESPACE=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'"
	};
	public static final String[] ruleNames = {
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "SYMBOL", "SYMBOL_REPEAT", "NOTE", "COLOR", "NOTE_NAME", 
		"SILENCE", "TEXT", "DIGIT", "LETTER", "WHITESPACE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\7\16^\n\16\f\16\16\16a\13\16\3\16\7\16"+
		"d\n\16\f\16\16\16g\13\16\5\16i\n\16\3\17\3\17\5\17m\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20{\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u008c"+
		"\n\21\3\22\3\22\3\23\6\23\u0091\n\23\r\23\16\23\u0092\3\24\6\24\u0096"+
		"\n\24\r\24\16\24\u0097\3\25\6\25\u009b\n\25\r\25\16\25\u009c\3\26\6\26"+
		"\u00a0\n\26\r\26\16\26\u00a1\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27\3\2\5\4\2%%\u00a6\u00a6\4\2C\\c|\5\2\13\f\16\17\"\"\u00b4\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\65\3\2\2\2\79\3"+
		"\2\2\2\t?\3\2\2\2\13E\3\2\2\2\rI\3\2\2\2\17P\3\2\2\2\21R\3\2\2\2\23T\3"+
		"\2\2\2\25V\3\2\2\2\27X\3\2\2\2\31Z\3\2\2\2\33h\3\2\2\2\35l\3\2\2\2\37"+
		"z\3\2\2\2!\u008b\3\2\2\2#\u008d\3\2\2\2%\u0090\3\2\2\2\'\u0095\3\2\2\2"+
		")\u009a\3\2\2\2+\u009f\3\2\2\2-.\7u\2\2./\7r\2\2/\60\7g\2\2\60\61\7c\2"+
		"\2\61\62\7m\2\2\62\63\7g\2\2\63\64\7t\2\2\64\4\3\2\2\2\65\66\7d\2\2\66"+
		"\67\7r\2\2\678\7o\2\28\6\3\2\2\29:\7u\2\2:;\7e\2\2;<\7q\2\2<=\7t\2\2="+
		">\7g\2\2>\b\3\2\2\2?@\7e\2\2@A\7q\2\2AB\7n\2\2BC\7q\2\2CD\7t\2\2D\n\3"+
		"\2\2\2EF\7m\2\2FG\7g\2\2GH\7{\2\2H\f\3\2\2\2IJ\7u\2\2JK\7e\2\2KL\7t\2"+
		"\2LM\7g\2\2MN\7g\2\2NO\7p\2\2O\16\3\2\2\2PQ\7-\2\2Q\20\3\2\2\2RS\7}\2"+
		"\2S\22\3\2\2\2TU\7\177\2\2U\24\3\2\2\2VW\7/\2\2W\26\3\2\2\2XY\7\60\2\2"+
		"Y\30\3\2\2\2Z[\t\2\2\2[\32\3\2\2\2\\^\7\u00a6\2\2]\\\3\2\2\2^a\3\2\2\2"+
		"_]\3\2\2\2_`\3\2\2\2`i\3\2\2\2a_\3\2\2\2bd\7%\2\2cb\3\2\2\2dg\3\2\2\2"+
		"ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2h_\3\2\2\2he\3\2\2\2i\34\3\2\2"+
		"\2jm\5!\21\2km\5#\22\2lj\3\2\2\2lk\3\2\2\2m\36\3\2\2\2no\7t\2\2op\7g\2"+
		"\2p{\7f\2\2qr\7i\2\2rs\7t\2\2st\7g\2\2tu\7g\2\2u{\7p\2\2vw\7d\2\2wx\7"+
		"n\2\2xy\7w\2\2y{\7g\2\2zn\3\2\2\2zq\3\2\2\2zv\3\2\2\2{ \3\2\2\2|}\7f\2"+
		"\2}\u008c\7q\2\2~\177\7t\2\2\177\u008c\7g\2\2\u0080\u0081\7o\2\2\u0081"+
		"\u008c\7k\2\2\u0082\u0083\7h\2\2\u0083\u008c\7c\2\2\u0084\u0085\7u\2\2"+
		"\u0085\u0086\7q\2\2\u0086\u008c\7n\2\2\u0087\u0088\7n\2\2\u0088\u008c"+
		"\7c\2\2\u0089\u008a\7u\2\2\u008a\u008c\7k\2\2\u008b|\3\2\2\2\u008b~\3"+
		"\2\2\2\u008b\u0080\3\2\2\2\u008b\u0082\3\2\2\2\u008b\u0084\3\2\2\2\u008b"+
		"\u0087\3\2\2\2\u008b\u0089\3\2\2\2\u008c\"\3\2\2\2\u008d\u008e\7&\2\2"+
		"\u008e$\3\2\2\2\u008f\u0091\5)\25\2\u0090\u008f\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093&\3\2\2\2\u0094\u0096"+
		"\4\62;\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098(\3\2\2\2\u0099\u009b\t\3\2\2\u009a\u0099\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d*\3"+
		"\2\2\2\u009e\u00a0\t\4\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\26"+
		"\2\2\u00a4,\3\2\2\2\r\2_ehlz\u008b\u0092\u0097\u009c\u00a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}