// Generated from D:\workspace\Netbean\Grep\src\com\samsung\dsl\grep\Grep.g4 by ANTLR 4.0
package behavior.visitor.grep;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrepLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, ID=6, WS=7, COMMENT=8, LINE_COMMENT=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'from'", "'.'", "','", "'*'", "'grep'", "ID", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "ID", "LETTER", "DIGIT", "WS", 
		"COMMENT", "LINE_COMMENT"
	};


	public GrepLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grep.g4"; }

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
		case 8: WS_action((RuleContext)_localctx, actionIndex); break;

		case 9: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 10: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: _channel = HIDDEN;  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\13Z\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\6\7,\n\7\r\7\16\7-\3\b\3\b\3\t\3\t"+
		"\3\n\6\n\65\n\n\r\n\16\n\66\3\n\3\n\3\13\3\13\3\13\3\13\7\13?\n\13\f\13"+
		"\16\13B\13\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\fM\n\f\f\f\16"+
		"\fP\13\f\3\f\5\fS\n\f\3\f\3\f\5\fW\n\f\3\f\3\f\3@\r\3\3\1\5\4\1\7\5\1"+
		"\t\6\1\13\7\1\r\b\1\17\2\1\21\2\1\23\t\2\25\n\3\27\13\4\3\2\6\4C\\c|\3"+
		"\62;\5\13\f\17\17\"\"\4\f\f\17\17^\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\3\31\3\2\2\2\5\36\3\2\2\2\7 \3\2\2\2\t\"\3\2\2\2\13$\3\2\2\2\r"+
		"+\3\2\2\2\17/\3\2\2\2\21\61\3\2\2\2\23\64\3\2\2\2\25:\3\2\2\2\27H\3\2"+
		"\2\2\31\32\7h\2\2\32\33\7t\2\2\33\34\7q\2\2\34\35\7o\2\2\35\4\3\2\2\2"+
		"\36\37\7\60\2\2\37\6\3\2\2\2 !\7.\2\2!\b\3\2\2\2\"#\7,\2\2#\n\3\2\2\2"+
		"$%\7i\2\2%&\7t\2\2&\'\7g\2\2\'(\7r\2\2(\f\3\2\2\2),\5\17\b\2*,\5\21\t"+
		"\2+)\3\2\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\16\3\2\2\2/\60\t"+
		"\2\2\2\60\20\3\2\2\2\61\62\t\3\2\2\62\22\3\2\2\2\63\65\t\4\2\2\64\63\3"+
		"\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\b\n\2\2"+
		"9\24\3\2\2\2:;\7\61\2\2;<\7,\2\2<@\3\2\2\2=?\13\2\2\2>=\3\2\2\2?B\3\2"+
		"\2\2@A\3\2\2\2@>\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7,\2\2DE\7\61\2\2EF\3\2"+
		"\2\2FG\b\13\3\2G\26\3\2\2\2HI\7\61\2\2IJ\7\61\2\2JN\3\2\2\2KM\n\5\2\2"+
		"LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OV\3\2\2\2PN\3\2\2\2QS\7\17\2"+
		"\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TW\7\f\2\2UW\7\1\2\2VR\3\2\2\2VU\3\2\2"+
		"\2WX\3\2\2\2XY\b\f\4\2Y\30\3\2\2\2\n\2+-\66@NRV";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}