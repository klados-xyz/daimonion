package xyz.klados.antlr4;// Generated from Entity.g4 by ANTLR 4.13.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class EntityLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, IDENTIFIER=17, 
		NUMBER=18, STRING=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "IDENTIFIER", 
			"NUMBER", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'entity'", "';'", "'@'", "'('", "')'", "'struct'", "'func'", "'->'", 
			"'{'", "'}'", "'='", "','", "'['", "']'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "IDENTIFIER", "NUMBER", "STRING", "WS"
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


	public EntityLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Entity.g4"; }

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
		"\u0004\u0000\u0014\u0084\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0005\u0010a\b\u0010\n\u0010\f\u0010d\t\u0010"+
		"\u0001\u0011\u0004\u0011g\b\u0011\u000b\u0011\f\u0011h\u0001\u0011\u0001"+
		"\u0011\u0004\u0011m\b\u0011\u000b\u0011\f\u0011n\u0003\u0011q\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012w\b\u0012"+
		"\n\u0012\f\u0012z\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013"+
		"\u007f\b\u0013\u000b\u0013\f\u0013\u0080\u0001\u0013\u0001\u0013\u0000"+
		"\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001\u0000"+
		"\u0005\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0002\u0000"+
		"\"\"\\\\\u0003\u0000\t\n\r\r  \u008a\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0001)\u0001\u0000\u0000\u0000\u00030\u0001\u0000\u0000\u0000\u0005"+
		"2\u0001\u0000\u0000\u0000\u00074\u0001\u0000\u0000\u0000\t6\u0001\u0000"+
		"\u0000\u0000\u000b8\u0001\u0000\u0000\u0000\r?\u0001\u0000\u0000\u0000"+
		"\u000fD\u0001\u0000\u0000\u0000\u0011G\u0001\u0000\u0000\u0000\u0013I"+
		"\u0001\u0000\u0000\u0000\u0015K\u0001\u0000\u0000\u0000\u0017M\u0001\u0000"+
		"\u0000\u0000\u0019O\u0001\u0000\u0000\u0000\u001bQ\u0001\u0000\u0000\u0000"+
		"\u001dS\u0001\u0000\u0000\u0000\u001fX\u0001\u0000\u0000\u0000!^\u0001"+
		"\u0000\u0000\u0000#f\u0001\u0000\u0000\u0000%r\u0001\u0000\u0000\u0000"+
		"\'~\u0001\u0000\u0000\u0000)*\u0005e\u0000\u0000*+\u0005n\u0000\u0000"+
		"+,\u0005t\u0000\u0000,-\u0005i\u0000\u0000-.\u0005t\u0000\u0000./\u0005"+
		"y\u0000\u0000/\u0002\u0001\u0000\u0000\u000001\u0005;\u0000\u00001\u0004"+
		"\u0001\u0000\u0000\u000023\u0005@\u0000\u00003\u0006\u0001\u0000\u0000"+
		"\u000045\u0005(\u0000\u00005\b\u0001\u0000\u0000\u000067\u0005)\u0000"+
		"\u00007\n\u0001\u0000\u0000\u000089\u0005s\u0000\u00009:\u0005t\u0000"+
		"\u0000:;\u0005r\u0000\u0000;<\u0005u\u0000\u0000<=\u0005c\u0000\u0000"+
		"=>\u0005t\u0000\u0000>\f\u0001\u0000\u0000\u0000?@\u0005f\u0000\u0000"+
		"@A\u0005u\u0000\u0000AB\u0005n\u0000\u0000BC\u0005c\u0000\u0000C\u000e"+
		"\u0001\u0000\u0000\u0000DE\u0005-\u0000\u0000EF\u0005>\u0000\u0000F\u0010"+
		"\u0001\u0000\u0000\u0000GH\u0005{\u0000\u0000H\u0012\u0001\u0000\u0000"+
		"\u0000IJ\u0005}\u0000\u0000J\u0014\u0001\u0000\u0000\u0000KL\u0005=\u0000"+
		"\u0000L\u0016\u0001\u0000\u0000\u0000MN\u0005,\u0000\u0000N\u0018\u0001"+
		"\u0000\u0000\u0000OP\u0005[\u0000\u0000P\u001a\u0001\u0000\u0000\u0000"+
		"QR\u0005]\u0000\u0000R\u001c\u0001\u0000\u0000\u0000ST\u0005t\u0000\u0000"+
		"TU\u0005r\u0000\u0000UV\u0005u\u0000\u0000VW\u0005e\u0000\u0000W\u001e"+
		"\u0001\u0000\u0000\u0000XY\u0005f\u0000\u0000YZ\u0005a\u0000\u0000Z[\u0005"+
		"l\u0000\u0000[\\\u0005s\u0000\u0000\\]\u0005e\u0000\u0000] \u0001\u0000"+
		"\u0000\u0000^b\u0007\u0000\u0000\u0000_a\u0007\u0001\u0000\u0000`_\u0001"+
		"\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000c\"\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000eg\u0007\u0002\u0000\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ip\u0001"+
		"\u0000\u0000\u0000jl\u0005.\u0000\u0000km\u0007\u0002\u0000\u0000lk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pj\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000q$\u0001\u0000\u0000\u0000rx\u0005\"\u0000"+
		"\u0000sw\b\u0003\u0000\u0000tu\u0005\\\u0000\u0000uw\t\u0000\u0000\u0000"+
		"vs\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000"+
		"\u0000\u0000zx\u0001\u0000\u0000\u0000{|\u0005\"\u0000\u0000|&\u0001\u0000"+
		"\u0000\u0000}\u007f\u0007\u0004\u0000\u0000~}\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0006\u0013\u0000\u0000\u0083(\u0001\u0000\u0000\u0000\b\u0000"+
		"bhnpvx\u0080\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}