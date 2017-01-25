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
		T__1=10, T__0=11, SYMBOL=12, NOTE=13, COLOR=14, NOTE_NAME=15, TEXT=16, 
		DIGIT=17, LETTER=18, WHITESPACE=19;
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
		"T__1", "T__0", "SYMBOL", "NOTE", "COLOR", "NOTE_NAME", "TEXT", "DIGIT", 
		"LETTER", "WHITESPACE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u008f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17g\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20x\n\20\3\21\6\21{\n\21\r\21\16\21|\3\22\6\22"+
		"\u0080\n\22\r\22\16\22\u0081\3\23\6\23\u0085\n\23\r\23\16\23\u0086\3\24"+
		"\6\24\u008a\n\24\r\24\16\24\u008b\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25\3\2\5\4\2%%\u00a6\u00a6\4\2C\\c|\4\2\13\f\16\17\u009a\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\3)\3\2\2\2\5,\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\13?\3\2"+
		"\2\2\rE\3\2\2\2\17L\3\2\2\2\21N\3\2\2\2\23P\3\2\2\2\25R\3\2\2\2\27T\3"+
		"\2\2\2\31V\3\2\2\2\33X\3\2\2\2\35f\3\2\2\2\37w\3\2\2\2!z\3\2\2\2#\177"+
		"\3\2\2\2%\u0084\3\2\2\2\'\u0089\3\2\2\2)*\7/\2\2*+\7\"\2\2+\4\3\2\2\2"+
		",-\7u\2\2-.\7r\2\2./\7g\2\2/\60\7c\2\2\60\61\7m\2\2\61\62\7g\2\2\62\63"+
		"\7t\2\2\63\64\7\"\2\2\64\6\3\2\2\2\65\66\7\"\2\2\66\b\3\2\2\2\678\7u\2"+
		"\289\7e\2\29:\7t\2\2:;\7g\2\2;<\7g\2\2<=\7p\2\2=>\7\"\2\2>\n\3\2\2\2?"+
		"@\7u\2\2@A\7e\2\2AB\7q\2\2BC\7t\2\2CD\7g\2\2D\f\3\2\2\2EF\7e\2\2FG\7q"+
		"\2\2GH\7n\2\2HI\7q\2\2IJ\7t\2\2JK\7\"\2\2K\16\3\2\2\2LM\7-\2\2M\20\3\2"+
		"\2\2NO\7}\2\2O\22\3\2\2\2PQ\7\177\2\2Q\24\3\2\2\2RS\7/\2\2S\26\3\2\2\2"+
		"TU\7\60\2\2U\30\3\2\2\2VW\t\2\2\2W\32\3\2\2\2XY\5\37\20\2Y\34\3\2\2\2"+
		"Z[\7t\2\2[\\\7g\2\2\\g\7f\2\2]^\7i\2\2^_\7t\2\2_`\7g\2\2`a\7g\2\2ag\7"+
		"p\2\2bc\7d\2\2cd\7n\2\2de\7w\2\2eg\7g\2\2fZ\3\2\2\2f]\3\2\2\2fb\3\2\2"+
		"\2g\36\3\2\2\2hi\7f\2\2ix\7q\2\2jk\7t\2\2kx\7g\2\2lm\7o\2\2mx\7k\2\2n"+
		"o\7h\2\2ox\7c\2\2pq\7u\2\2qr\7q\2\2rx\7n\2\2st\7n\2\2tx\7c\2\2uv\7u\2"+
		"\2vx\7k\2\2wh\3\2\2\2wj\3\2\2\2wl\3\2\2\2wn\3\2\2\2wp\3\2\2\2ws\3\2\2"+
		"\2wu\3\2\2\2x \3\2\2\2y{\5%\23\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2"+
		"\2}\"\3\2\2\2~\u0080\4\63;\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082$\3\2\2\2\u0083\u0085\t\3\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087&\3\2\2\2\u0088\u008a\t\4\2\2\u0089\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\b\24\2\2\u008e(\3\2\2\2\t\2fw|\u0081\u0086\u008b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}