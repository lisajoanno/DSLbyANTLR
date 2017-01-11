// Generated from RuleSetGrammar.g4 by ANTLR 4.3

package grammarGenerated;

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
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, DIGIT=13, WHITESPACE=14, TEXT=15, LETTER=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "DIGIT", "WHITESPACE", "TEXT", "LETTER"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\5\16"+
		"Y\n\16\3\16\6\16\\\n\16\r\16\16\16]\3\17\6\17a\n\17\r\17\16\17b\3\17\3"+
		"\17\3\20\6\20h\n\20\r\20\16\20i\3\21\6\21m\n\21\r\21\16\21n\2\2\22\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22\3\2\4\5\2\13\f\16\17\"\"\5\2\62;C\\c|t\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5,\3\2\2\2\7\62\3\2\2"+
		"\2\t\65\3\2\2\2\138\3\2\2\2\r=\3\2\2\2\17C\3\2\2\2\21F\3\2\2\2\23J\3\2"+
		"\2\2\25L\3\2\2\2\27N\3\2\2\2\31P\3\2\2\2\33X\3\2\2\2\35`\3\2\2\2\37g\3"+
		"\2\2\2!l\3\2\2\2#$\7c\2\2$%\7e\2\2%&\7v\2\2&\'\7w\2\2\'(\7c\2\2()\7v\2"+
		"\2)*\7q\2\2*+\7t\2\2+\4\3\2\2\2,-\7u\2\2-.\7v\2\2./\7c\2\2/\60\7v\2\2"+
		"\60\61\7g\2\2\61\6\3\2\2\2\62\63\7?\2\2\63\64\7@\2\2\64\b\3\2\2\2\65\66"+
		"\7>\2\2\66\67\7?\2\2\67\n\3\2\2\289\7y\2\29:\7j\2\2:;\7g\2\2;<\7p\2\2"+
		"<\f\3\2\2\2=>\7k\2\2>?\7p\2\2?@\7k\2\2@A\7v\2\2AB\7<\2\2B\16\3\2\2\2C"+
		"D\7k\2\2DE\7u\2\2E\20\3\2\2\2FG\7c\2\2GH\7p\2\2HI\7f\2\2I\22\3\2\2\2J"+
		"K\7<\2\2K\24\3\2\2\2LM\7}\2\2M\26\3\2\2\2NO\7\177\2\2O\30\3\2\2\2PQ\7"+
		"u\2\2QR\7g\2\2RS\7p\2\2ST\7u\2\2TU\7q\2\2UV\7t\2\2V\32\3\2\2\2WY\4\63"+
		";\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z\\\4\62;\2[Z\3\2\2\2\\]\3\2\2\2][\3"+
		"\2\2\2]^\3\2\2\2^\34\3\2\2\2_a\t\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2b"+
		"c\3\2\2\2cd\3\2\2\2de\b\17\2\2e\36\3\2\2\2fh\5!\21\2gf\3\2\2\2hi\3\2\2"+
		"\2ig\3\2\2\2ij\3\2\2\2j \3\2\2\2km\t\3\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2"+
		"\2no\3\2\2\2o\"\3\2\2\2\b\2X]bin\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}