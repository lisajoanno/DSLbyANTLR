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
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, SYMBOL=9, 
		NOTE=10, WHITESPACE=11, COLOR=12, NOTE_NAME=13, TEXT=14, LETTER=15, PIN=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "SYMBOL", 
		"NOTE", "WHITESPACE", "COLOR", "NOTE_NAME", "TEXT", "LETTER", "PIN"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22\u0084\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\5\13N\n\13\3\f\6\fQ\n\f\r\f\16\fR\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rc\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16t\n\16"+
		"\3\17\6\17w\n\17\r\17\16\17x\3\20\6\20|\n\20\r\20\16\20}\3\21\6\21\u0081"+
		"\n\21\r\21\16\21\u0082\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\5\4\2,,BB\5\2\13\f\16\17\""+
		"\"\4\2C\\c|\u0090\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\3#\3\2\2\2\5&\3\2\2\2\7.\3\2\2\2\t\64\3\2\2\2\13;\3\2\2\2\r"+
		"=\3\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27P\3\2\2\2"+
		"\31b\3\2\2\2\33s\3\2\2\2\35v\3\2\2\2\37{\3\2\2\2!\u0080\3\2\2\2#$\7/\2"+
		"\2$%\7\"\2\2%\4\3\2\2\2&\'\7u\2\2\'(\7e\2\2()\7t\2\2)*\7g\2\2*+\7g\2\2"+
		"+,\7p\2\2,-\7\"\2\2-\6\3\2\2\2./\7u\2\2/\60\7e\2\2\60\61\7q\2\2\61\62"+
		"\7t\2\2\62\63\7g\2\2\63\b\3\2\2\2\64\65\7e\2\2\65\66\7q\2\2\66\67\7n\2"+
		"\2\678\7q\2\289\7t\2\29:\7\"\2\2:\n\3\2\2\2;<\7}\2\2<\f\3\2\2\2=>\7\177"+
		"\2\2>\16\3\2\2\2?@\7/\2\2@\20\3\2\2\2AB\7d\2\2BC\7w\2\2CD\7|\2\2DE\7|"+
		"\2\2EF\7g\2\2FG\7t\2\2GH\7\"\2\2H\22\3\2\2\2IJ\t\2\2\2J\24\3\2\2\2KM\5"+
		"\33\16\2LN\7\"\2\2ML\3\2\2\2MN\3\2\2\2N\26\3\2\2\2OQ\t\3\2\2PO\3\2\2\2"+
		"QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\b\f\2\2U\30\3\2\2\2VW\7t\2"+
		"\2WX\7g\2\2Xc\7f\2\2YZ\7i\2\2Z[\7t\2\2[\\\7g\2\2\\]\7g\2\2]c\7p\2\2^_"+
		"\7d\2\2_`\7n\2\2`a\7w\2\2ac\7g\2\2bV\3\2\2\2bY\3\2\2\2b^\3\2\2\2c\32\3"+
		"\2\2\2de\7f\2\2et\7q\2\2fg\7t\2\2gt\7g\2\2hi\7o\2\2it\7k\2\2jk\7h\2\2"+
		"kt\7c\2\2lm\7u\2\2mn\7q\2\2nt\7n\2\2op\7n\2\2pt\7c\2\2qr\7u\2\2rt\7k\2"+
		"\2sd\3\2\2\2sf\3\2\2\2sh\3\2\2\2sj\3\2\2\2sl\3\2\2\2so\3\2\2\2sq\3\2\2"+
		"\2t\34\3\2\2\2uw\5\37\20\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\36"+
		"\3\2\2\2z|\t\4\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~ \3\2\2\2\177"+
		"\u0081\4\63;\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\"\3\2\2\2\n\2MRbsx}\u0082\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}