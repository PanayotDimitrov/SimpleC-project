// Generated from C:/Users/pacet/Desktop/SimpleC-project/src/main/java/com/example/SimpleC.g4 by ANTLR 4.13.2
package com.example;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SimpleCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, Ident=14, Number=15, Whitespace=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "Ident", "Number", "Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'++'", "'--'", "'printf'", "'('", "')'", "'scanf'", 
			"'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Ident", "Number", "Whitespace"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SimpleCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0010Y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0005\rI\b\r\n\r\f\rL\t\r\u0001\u000e\u0004\u000eO"+
		"\b\u000e\u000b\u000e\f\u000eP\u0001\u000f\u0004\u000fT\b\u000f\u000b\u000f"+
		"\f\u000fU\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"\u0001\u0000\u0004\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u00000"+
		"9\u0003\u0000\t\n\r\r  [\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000"+
		"\u0005%\u0001\u0000\u0000\u0000\u0007(\u0001\u0000\u0000\u0000\t+\u0001"+
		"\u0000\u0000\u0000\u000b2\u0001\u0000\u0000\u0000\r4\u0001\u0000\u0000"+
		"\u0000\u000f6\u0001\u0000\u0000\u0000\u0011<\u0001\u0000\u0000\u0000\u0013"+
		">\u0001\u0000\u0000\u0000\u0015@\u0001\u0000\u0000\u0000\u0017B\u0001"+
		"\u0000\u0000\u0000\u0019D\u0001\u0000\u0000\u0000\u001bF\u0001\u0000\u0000"+
		"\u0000\u001dN\u0001\u0000\u0000\u0000\u001fS\u0001\u0000\u0000\u0000!"+
		"\"\u0005;\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005=\u0000\u0000"+
		"$\u0004\u0001\u0000\u0000\u0000%&\u0005+\u0000\u0000&\'\u0005+\u0000\u0000"+
		"\'\u0006\u0001\u0000\u0000\u0000()\u0005-\u0000\u0000)*\u0005-\u0000\u0000"+
		"*\b\u0001\u0000\u0000\u0000+,\u0005p\u0000\u0000,-\u0005r\u0000\u0000"+
		"-.\u0005i\u0000\u0000./\u0005n\u0000\u0000/0\u0005t\u0000\u000001\u0005"+
		"f\u0000\u00001\n\u0001\u0000\u0000\u000023\u0005(\u0000\u00003\f\u0001"+
		"\u0000\u0000\u000045\u0005)\u0000\u00005\u000e\u0001\u0000\u0000\u0000"+
		"67\u0005s\u0000\u000078\u0005c\u0000\u000089\u0005a\u0000\u00009:\u0005"+
		"n\u0000\u0000:;\u0005f\u0000\u0000;\u0010\u0001\u0000\u0000\u0000<=\u0005"+
		"+\u0000\u0000=\u0012\u0001\u0000\u0000\u0000>?\u0005-\u0000\u0000?\u0014"+
		"\u0001\u0000\u0000\u0000@A\u0005*\u0000\u0000A\u0016\u0001\u0000\u0000"+
		"\u0000BC\u0005/\u0000\u0000C\u0018\u0001\u0000\u0000\u0000DE\u0005%\u0000"+
		"\u0000E\u001a\u0001\u0000\u0000\u0000FJ\u0007\u0000\u0000\u0000GI\u0007"+
		"\u0001\u0000\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u001c\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000MO\u0007\u0002\u0000\u0000NM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000Q\u001e\u0001\u0000\u0000\u0000RT\u0007\u0003"+
		"\u0000\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WX\u0006\u000f\u0000\u0000X \u0001\u0000\u0000\u0000\u0004\u0000JPU\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}