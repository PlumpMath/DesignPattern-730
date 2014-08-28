// Generated from D:\workspace\Netbean\Grep\src\com\samsung\dsl\grep\Grep.g4 by ANTLR 4.0
package behavior.visitor.grep;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrepParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, ID=6, WS=7, COMMENT=8, LINE_COMMENT=9;
	public static final String[] tokenNames = {
		"<INVALID>", "'from'", "'.'", "','", "'*'", "'grep'", "ID", "WS", "COMMENT", 
		"LINE_COMMENT"
	};
	public static final int
		RULE_grep = 0, RULE_pattern = 1, RULE_target = 2, RULE_string = 3, RULE_star = 4, 
		RULE_dot = 5;
	public static final String[] ruleNames = {
		"grep", "pattern", "target", "string", "star", "dot"
	};

	@Override
	public String getGrammarFileName() { return "Grep.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrepParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GrepContext extends ParserRuleContext {
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public TargetContext target(int i) {
			return getRuleContext(TargetContext.class,i);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public List<TerminalNode> WS() { return getTokens(GrepParser.WS); }
		public List<TargetContext> target() {
			return getRuleContexts(TargetContext.class);
		}
		public TerminalNode WS(int i) {
			return getToken(GrepParser.WS, i);
		}
		public TerminalNode EOF() { return getToken(GrepParser.EOF, 0); }
		public GrepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grep; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrepVisitor ) return ((GrepVisitor<? extends T>)visitor).visitGrep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrepContext grep() throws RecognitionException {
		GrepContext _localctx = new GrepContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); match(5);
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(13); match(WS);
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19); pattern();
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << ID))) != 0) );
			setState(24); match(1);
			setState(25); target();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(26); match(3);
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(27); match(WS);
					}
					}
					setState(32);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(33); target();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(39); match(WS);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StarContext star() {
			return getRuleContext(StarContext.class,0);
		}
		public DotContext dot() {
			return getRuleContext(DotContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrepVisitor ) return ((GrepVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pattern);
		try {
			setState(50);
			switch (_input.LA(1)) {
			case 4:
				enterOuterAlt(_localctx, 1);
				{
				setState(47); star();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48); dot();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(49); string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TargetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrepParser.ID, 0); }
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrepVisitor ) return ((GrepVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrepParser.ID, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrepVisitor ) return ((GrepVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StarContext extends ParserRuleContext {
		public StarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrepVisitor ) return ((GrepVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarContext star() throws RecognitionException {
		StarContext _localctx = new StarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_star);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotContext extends ParserRuleContext {
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrepVisitor ) return ((GrepVisitor<? extends T>)visitor).visitDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3\13?\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\7\2\21"+
		"\n\2\f\2\16\2\24\13\2\3\2\6\2\27\n\2\r\2\16\2\30\3\2\3\2\3\2\3\2\7\2\37"+
		"\n\2\f\2\16\2\"\13\2\3\2\7\2%\n\2\f\2\16\2(\13\2\3\2\7\2+\n\2\f\2\16\2"+
		".\13\2\3\2\3\2\3\3\3\3\3\3\5\3\65\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\2\b\2\4\6\b\n\f\2\2?\2\16\3\2\2\2\4\64\3\2\2\2\6\66\3\2\2\2\b8\3"+
		"\2\2\2\n:\3\2\2\2\f<\3\2\2\2\16\22\7\7\2\2\17\21\7\t\2\2\20\17\3\2\2\2"+
		"\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2"+
		"\25\27\5\4\3\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2"+
		"\31\32\3\2\2\2\32\33\7\3\2\2\33&\5\6\4\2\34 \7\5\2\2\35\37\7\t\2\2\36"+
		"\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#%"+
		"\5\6\4\2$\34\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\',\3\2\2\2(&\3\2\2"+
		"\2)+\7\t\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2"+
		"\2/\60\7\1\2\2\60\3\3\2\2\2\61\65\5\n\6\2\62\65\5\f\7\2\63\65\5\b\5\2"+
		"\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\5\3\2\2\2\66\67\7\b\2\2"+
		"\67\7\3\2\2\289\7\b\2\29\t\3\2\2\2:;\7\6\2\2;\13\3\2\2\2<=\7\4\2\2=\r"+
		"\3\2\2\2\b\22\30 &,\64";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}