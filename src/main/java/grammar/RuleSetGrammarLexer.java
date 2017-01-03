// Generated from RuleSetGrammar.g4 by ANTLR 4.3

package grammar;

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
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, WHITESPACE=6, TEXT=7, DIGIT=8, 
		LETTER=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "WHITESPACE", "TEXT", "DIGIT", 
		"LETTER"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13D\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\6\7\62\n\7\r\7\16\7\63\3\7\3\7\3\b"+
		"\3\b\6\b:\n\b\r\b\16\b;\3\t\3\t\3\n\6\nA\n\n\r\n\16\nB\2\2\13\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\4\5\2\13\f\16\17\"\"\4\2C\\c|G\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\31\3\2\2\2\7"+
		"\37\3\2\2\2\t&\3\2\2\2\13*\3\2\2\2\r\61\3\2\2\2\179\3\2\2\2\21=\3\2\2"+
		"\2\23@\3\2\2\2\25\26\7f\2\2\26\27\7q\2\2\27\30\7<\2\2\30\4\3\2\2\2\31"+
		"\32\7k\2\2\32\33\7p\2\2\33\34\7k\2\2\34\35\7v\2\2\35\36\7<\2\2\36\6\3"+
		"\2\2\2\37 \7k\2\2 !\7u\2\2!\"\7p\2\2\"#\7q\2\2#$\7y\2\2$%\7<\2\2%\b\3"+
		"\2\2\2&\'\7k\2\2\'(\7u\2\2()\7<\2\2)\n\3\2\2\2*+\7y\2\2+,\7j\2\2,-\7g"+
		"\2\2-.\7p\2\2./\7<\2\2/\f\3\2\2\2\60\62\t\2\2\2\61\60\3\2\2\2\62\63\3"+
		"\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\b\7\2\2\66\16\3"+
		"\2\2\2\67:\5\21\t\28:\5\23\n\29\67\3\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2"+
		"\2;<\3\2\2\2<\20\3\2\2\2=>\4\62;\2>\22\3\2\2\2?A\t\3\2\2@?\3\2\2\2AB\3"+
		"\2\2\2B@\3\2\2\2BC\3\2\2\2C\24\3\2\2\2\7\2\639;B\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}