// Generated from /Users/redlez.shadow/Documents/Red Work/AlgTPy/algo.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class algoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, NUMBER=84, BOOLEAN=85, CHAR=86, STRING=87, 
		TDNT=88, TDO=89, IDENTIFIER=90, LINE_COMMENT=91, BLOCK_COMMENT=92, NEWLINE=93, 
		WS=94;
	public static final int
		RULE_program = 0, RULE_tdntDecl = 1, RULE_newTypeDecl = 2, RULE_tdoDecl = 3, 
		RULE_varDecl = 4, RULE_block = 5, RULE_statement = 6, RULE_openFileStmt = 7, 
		RULE_closeFileStmt = 8, RULE_inputStmt = 9, RULE_outputStmt = 10, RULE_ifStmt = 11, 
		RULE_whileStmt = 12, RULE_forStmt = 13, RULE_jusquaStmt = 14, RULE_selonStmt = 15, 
		RULE_procedureDecl = 16, RULE_functionDecl = 17, RULE_paramList = 18, 
		RULE_param = 19, RULE_funcCall = 20, RULE_expr = 21, RULE_assignStmt = 22, 
		RULE_typeName = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "tdntDecl", "newTypeDecl", "tdoDecl", "varDecl", "block", 
			"statement", "openFileStmt", "closeFileStmt", "inputStmt", "outputStmt", 
			"ifStmt", "whileStmt", "forStmt", "jusquaStmt", "selonStmt", "procedureDecl", 
			"functionDecl", "paramList", "param", "funcCall", "expr", "assignStmt", 
			"typeName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algorithme'", "'d\\u00E9but'", "'Debut'", "'fin'", "'Fin'", "':'", 
			"'fin_tdnt'", "'='", "'enregistrement'", "','", "'tableau'", "'de'", 
			"'fin_tdo'", "'ouvrir'", "'('", "'r'", "'w'", "'a'", "'rb'", "'wb'", 
			"'ab'", "')'", "'fermer'", "'lire'", "'\\u00E9crire'", "'ecrire'", "'si'", 
			"'alors'", "'sinon'", "'fin_si'", "'tant'", "'que'", "'faire'", "'fin_tant_que'", 
			"'pour'", "'Pour'", "'\\u00E0'", "'pas'", "'fin_pour'", "'r\\u00E9p\\u00E9ter'", 
			"'repeter'", "'jusqu\\u2019\\u00E0'", "'jusqua'", "'selon'", "'cas'", 
			"'autres'", "'fin_selon'", "'procedure'", "'proc\\u00E9dure'", "'Proc\\u00E9dure'", 
			"'Procedure'", "'fonction'", "'Fonction'", "'retourner'", "'@'", "'*'", 
			"'/'", "'+'", "'-'", "'<'", "'\\u2264'", "'>'", "'\\u2265'", "'\\u2260'", 
			"'\\u2208'", "'et'", "'ou'", "'ouex'", "'non'", "'['", "']'", "'<-'", 
			"'entier'", "'r\\u00E9el'", "'reel'", "'bool\\u00E9en'", "'booleen'", 
			"'bool'", "'caract\\u00E8re'", "'caractere'", "'cha\\u00EEne'", "'chaine'", 
			"'fichier'", null, null, null, null, "'TDNT'", "'TDO'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NUMBER", "BOOLEAN", "CHAR", "STRING", "TDNT", "TDO", "IDENTIFIER", "LINE_COMMENT", 
			"BLOCK_COMMENT", "NEWLINE", "WS"
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

	@Override
	public String getGrammarFileName() { return "algo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public algoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(algoParser.IDENTIFIER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(algoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(algoParser.NEWLINE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TdntDeclContext> tdntDecl() {
			return getRuleContexts(TdntDeclContext.class);
		}
		public TdntDeclContext tdntDecl(int i) {
			return getRuleContext(TdntDeclContext.class,i);
		}
		public List<TdoDeclContext> tdoDecl() {
			return getRuleContexts(TdoDeclContext.class);
		}
		public TdoDeclContext tdoDecl(int i) {
			return getRuleContext(TdoDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__0);
			setState(49);
			match(IDENTIFIER);
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				match(NEWLINE);
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TDNT || _la==TDO) {
				{
				{
				setState(57);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TDNT:
					{
					setState(55);
					tdntDecl();
					}
					break;
				case TDO:
					{
					setState(56);
					tdoDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(59);
					match(NEWLINE);
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(71);
			match(NEWLINE);
			setState(72);
			block();
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TdntDeclContext extends ParserRuleContext {
		public TerminalNode TDNT() { return getToken(algoParser.TDNT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(algoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(algoParser.NEWLINE, i);
		}
		public List<NewTypeDeclContext> newTypeDecl() {
			return getRuleContexts(NewTypeDeclContext.class);
		}
		public NewTypeDeclContext newTypeDecl(int i) {
			return getRuleContext(NewTypeDeclContext.class,i);
		}
		public TdntDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tdntDecl; }
	}

	public final TdntDeclContext tdntDecl() throws RecognitionException {
		TdntDeclContext _localctx = new TdntDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tdntDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(TDNT);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(76);
				match(T__5);
				}
			}

			setState(79);
			match(NEWLINE);
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				newTypeDecl();
				setState(81);
				match(NEWLINE);
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(87);
				match(T__6);
				setState(88);
				match(NEWLINE);
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class NewTypeDeclContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(algoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(algoParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(algoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(algoParser.NEWLINE, i);
		}
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(algoParser.NUMBER, 0); }
		public NewTypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newTypeDecl; }
	}

	public final NewTypeDeclContext newTypeDecl() throws RecognitionException {
		NewTypeDeclContext _localctx = new NewTypeDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_newTypeDecl);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(IDENTIFIER);
				setState(92);
				match(T__7);
				setState(93);
				match(T__8);
				setState(94);
				match(NEWLINE);
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(95);
					match(IDENTIFIER);
					setState(96);
					match(T__5);
					setState(97);
					typeName();
					setState(98);
					match(T__9);
					setState(99);
					match(NEWLINE);
					}
					}
					setState(103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(105);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(IDENTIFIER);
				setState(108);
				match(T__7);
				setState(109);
				match(T__10);
				setState(110);
				match(T__11);
				setState(111);
				match(NUMBER);
				setState(112);
				typeName();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TdoDeclContext extends ParserRuleContext {
		public TerminalNode TDO() { return getToken(algoParser.TDO, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(algoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(algoParser.NEWLINE, i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public TdoDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tdoDecl; }
	}

	public final TdoDeclContext tdoDecl() throws RecognitionException {
		TdoDeclContext _localctx = new TdoDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tdoDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(TDO);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(116);
				match(T__5);
				}
			}

			setState(119);
			match(NEWLINE);
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				varDecl();
				setState(121);
				match(NEWLINE);
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(127);
				match(T__12);
				setState(128);
				match(NEWLINE);
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(algoParser.IDENTIFIER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(algoParser.NUMBER, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDecl);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(IDENTIFIER);
				setState(132);
				match(T__5);
				setState(133);
				typeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(IDENTIFIER);
				setState(135);
				match(T__5);
				setState(136);
				match(T__10);
				setState(137);
				match(T__11);
				setState(138);
				match(NUMBER);
				setState(139);
				typeName();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(algoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(algoParser.NEWLINE, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17753919740461056L) != 0) || _la==IDENTIFIER || _la==NEWLINE) {
				{
				setState(146);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__30:
				case T__34:
				case T__35:
				case T__39:
				case T__40:
				case T__43:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case IDENTIFIER:
					{
					setState(142);
					statement();
					setState(143);
					match(NEWLINE);
					}
					break;
				case NEWLINE:
					{
					setState(145);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpenFileStatementContext extends StatementContext {
		public OpenFileStmtContext openFileStmt() {
			return getRuleContext(OpenFileStmtContext.class,0);
		}
		public OpenFileStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JusquaStatementContext extends StatementContext {
		public JusquaStmtContext jusquaStmt() {
			return getRuleContext(JusquaStmtContext.class,0);
		}
		public JusquaStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends StatementContext {
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CloseFileStatementContext extends StatementContext {
		public CloseFileStmtContext closeFileStmt() {
			return getRuleContext(CloseFileStmtContext.class,0);
		}
		public CloseFileStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatementContext extends StatementContext {
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public AssignStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputStatementContext extends StatementContext {
		public OutputStmtContext outputStmt() {
			return getRuleContext(OutputStmtContext.class,0);
		}
		public OutputStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends StatementContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends StatementContext {
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public FunctionDeclarationContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureDeclarationContext extends StatementContext {
		public ProcedureDeclContext procedureDecl() {
			return getRuleContext(ProcedureDeclContext.class,0);
		}
		public ProcedureDeclarationContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallStatementContext extends StatementContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public FunctionCallStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelonStatementContext extends StatementContext {
		public SelonStmtContext selonStmt() {
			return getRuleContext(SelonStmtContext.class,0);
		}
		public SelonStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputStatementContext extends StatementContext {
		public InputStmtContext inputStmt() {
			return getRuleContext(InputStmtContext.class,0);
		}
		public InputStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends StatementContext {
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new InputStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				inputStmt();
				}
				break;
			case 2:
				_localctx = new OutputStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				outputStmt();
				}
				break;
			case 3:
				_localctx = new OpenFileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				openFileStmt();
				}
				break;
			case 4:
				_localctx = new CloseFileStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				closeFileStmt();
				}
				break;
			case 5:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				ifStmt();
				}
				break;
			case 6:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				whileStmt();
				}
				break;
			case 7:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(157);
				forStmt();
				}
				break;
			case 8:
				_localctx = new JusquaStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(158);
				jusquaStmt();
				}
				break;
			case 9:
				_localctx = new SelonStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(159);
				selonStmt();
				}
				break;
			case 10:
				_localctx = new ProcedureDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(160);
				procedureDecl();
				}
				break;
			case 11:
				_localctx = new FunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(161);
				functionDecl();
				}
				break;
			case 12:
				_localctx = new FunctionCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(162);
				funcCall();
				}
				break;
			case 13:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(163);
				assignStmt();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpenFileStmtContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(algoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(algoParser.IDENTIFIER, i);
		}
		public OpenFileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openFileStmt; }
	}

	public final OpenFileStmtContext openFileStmt() throws RecognitionException {
		OpenFileStmtContext _localctx = new OpenFileStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_openFileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__13);
			setState(167);
			match(T__14);
			setState(168);
			match(IDENTIFIER);
			setState(169);
			match(T__9);
			setState(170);
			match(IDENTIFIER);
			setState(171);
			match(T__9);
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4128768L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(173);
			match(T__21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CloseFileStmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(algoParser.IDENTIFIER, 0); }
		public CloseFileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeFileStmt; }
	}

	public final CloseFileStmtContext closeFileStmt() throws RecognitionException {
		CloseFileStmtContext _localctx = new CloseFileStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_closeFileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__22);
			setState(176);
			match(T__14);
			setState(177);
			match(IDENTIFIER);
			setState(178);
			match(T__21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputStmtContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(algoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(algoParser.IDENTIFIER, i);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public InputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStmt; }
	}

	public final InputStmtContext inputStmt() throws RecognitionException {
		InputStmtContext _localctx = new InputStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inputStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__23);
			setState(181);
			match(T__14);
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(182);
				match(IDENTIFIER);
				setState(183);
				match(T__9);
				}
				break;
			}
			setState(186);
			match(IDENTIFIER);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(187);
				match(T__5);
				setState(188);
				typeName();
				}
			}

			setState(191);
			match(T__21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OutputStmtContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(algoParser.IDENTIFIER, 0); }
		public OutputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStmt; }
	}

	public final OutputStmtContext outputStmt() throws RecognitionException {
		OutputStmtContext _localctx = new OutputStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_outputStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(194);
			match(T__14);
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(195);
				match(IDENTIFIER);
				setState(196);
				match(T__9);
				}
				break;
			}
			setState(199);
			expr(0);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(200);
				match(T__9);
				setState(201);
				expr(0);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(T__21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(algoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(algoParser.NEWLINE, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__26);
			setState(210);
			expr(0);
			setState(211);
			match(T__27);
			setState(212);
			match(NEWLINE);
			setState(213);
			block();
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(214);
					match(T__28);
					setState(215);
					match(T__26);
					setState(216);
					expr(0);
					setState(217);
					match(T__27);
					setState(218);
					match(NEWLINE);
					setState(219);
					block();
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(226);
				match(T__28);
				setState(227);
				match(NEWLINE);
				setState(228);
				block();
				}
			}

			setState(231);
			match(T__29);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(algoParser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__30);
			setState(234);
			match(T__31);
			setState(235);
			expr(0);
			setState(236);
			match(T__32);
			setState(237);
			match(NEWLINE);
			setState(238);
			block();
			setState(239);
			match(T__33);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(algoParser.IDENTIFIER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(algoParser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !(_la==T__34 || _la==T__35) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(242);
			match(IDENTIFIER);
			setState(243);
			match(T__11);
			setState(244);
			expr(0);
			setState(245);
			match(T__36);
			setState(246);
			expr(0);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(247);
				match(T__37);
				setState(248);
				expr(0);
				}
			}

			setState(251);
			match(T__32);
			setState(252);
			match(NEWLINE);
			setState(253);
			block();
			setState(254);
			match(T__38);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JusquaStmtContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(algoParser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public JusquaStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jusquaStmt; }
	}

	public final JusquaStmtContext jusquaStmt() throws RecognitionException {
		JusquaStmtContext _localctx = new JusquaStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jusquaStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !(_la==T__39 || _la==T__40) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(257);
			match(NEWLINE);
			setState(258);
			block();
			setState(259);
			_la = _input.LA(1);
			if ( !(_la==T__41 || _la==T__42) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(260);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelonStmtContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(algoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(algoParser.NEWLINE, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public SelonStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selonStmt; }
	}

	public final SelonStmtContext selonStmt() throws RecognitionException {
		SelonStmtContext _localctx = new SelonStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selonStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__43);
			setState(263);
			expr(0);
			setState(264);
			match(NEWLINE);
			setState(271); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(265);
				match(T__44);
				setState(266);
				expr(0);
				setState(267);
				match(T__5);
				setState(268);
				match(NEWLINE);
				setState(269);
				block();
				}
				}
				setState(273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__44 );
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(275);
				match(T__45);
				setState(276);
				match(T__5);
				setState(277);
				match(NEWLINE);
				setState(278);
				block();
				}
			}

			setState(281);
			match(T__46);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(algoParser.IDENTIFIER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(algoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(algoParser.NEWLINE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ProcedureDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDecl; }
	}

	public final ProcedureDeclContext procedureDecl() throws RecognitionException {
		ProcedureDeclContext _localctx = new ProcedureDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_procedureDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4222124650659840L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(284);
			match(IDENTIFIER);
			setState(285);
			match(T__14);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__54 || _la==IDENTIFIER) {
				{
				setState(286);
				paramList();
				}
			}

			setState(289);
			match(T__21);
			setState(290);
			match(NEWLINE);
			setState(291);
			match(T__2);
			setState(292);
			match(NEWLINE);
			setState(293);
			block();
			setState(294);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(algoParser.IDENTIFIER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(algoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(algoParser.NEWLINE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !(_la==T__51 || _la==T__52) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(297);
			match(IDENTIFIER);
			setState(298);
			match(T__14);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__54 || _la==IDENTIFIER) {
				{
				setState(299);
				paramList();
				}
			}

			setState(302);
			match(T__21);
			setState(303);
			match(T__5);
			setState(304);
			typeName();
			setState(305);
			match(NEWLINE);
			setState(306);
			match(T__2);
			setState(307);
			match(NEWLINE);
			setState(308);
			block();
			setState(309);
			match(T__53);
			setState(310);
			expr(0);
			setState(311);
			match(NEWLINE);
			setState(312);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			param();
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(315);
				match(T__9);
				setState(316);
				param();
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(algoParser.IDENTIFIER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__54) {
				{
				setState(322);
				match(T__54);
				}
			}

			setState(325);
			match(IDENTIFIER);
			setState(326);
			match(T__5);
			setState(327);
			typeName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(algoParser.IDENTIFIER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(IDENTIFIER);
			setState(330);
			match(T__14);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14 || _la==T__54 || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 2588673L) != 0)) {
				{
				{
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__54) {
					{
					setState(331);
					match(T__54);
					}
				}

				setState(334);
				expr(0);
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(336);
					match(T__9);
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__54) {
						{
						setState(337);
						match(T__54);
						}
					}

					setState(340);
					expr(0);
					}
					}
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(348);
			match(T__21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(algoParser.IDENTIFIER, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LogicalContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(algoParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IndexContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(algoParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(algoParser.NUMBER, 0); }
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparisonContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharContext extends ExprContext {
		public TerminalNode CHAR() { return getToken(algoParser.CHAR, 0); }
		public CharContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegateContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(algoParser.BOOLEAN, 0); }
		public BooleanContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallExprContext extends ExprContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public FuncCallExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(351);
				match(T__68);
				setState(352);
				expr(9);
				}
				break;
			case 2:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(353);
				match(T__14);
				setState(354);
				expr(0);
				setState(355);
				match(T__21);
				}
				break;
			case 3:
				{
				_localctx = new IndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(357);
				match(IDENTIFIER);
				setState(358);
				match(T__69);
				setState(359);
				expr(0);
				setState(360);
				match(T__70);
				}
				break;
			case 4:
				{
				_localctx = new FuncCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(362);
				funcCall();
				}
				break;
			case 5:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(363);
				match(NUMBER);
				}
				break;
			case 6:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(364);
				match(BOOLEAN);
				}
				break;
			case 7:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(365);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366);
				match(CHAR);
				}
				break;
			case 9:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(367);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(382);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(370);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(371);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__55 || _la==T__56) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(372);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(373);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(374);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__57 || _la==T__58) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(375);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(376);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(377);
						((ComparisonContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 283726776524341249L) != 0)) ) {
							((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(378);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new LogicalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(379);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(380);
						((LogicalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 7L) != 0)) ) {
							((LogicalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(381);
						expr(11);
						}
						break;
					}
					} 
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignStmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(algoParser.IDENTIFIER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(IDENTIFIER);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__69) {
				{
				setState(388);
				match(T__69);
				setState(389);
				expr(0);
				setState(390);
				match(T__70);
				}
			}

			setState(394);
			match(T__71);
			setState(395);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeName);
		int _la;
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__72:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(T__72);
				}
				break;
			case T__73:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(T__73);
				}
				break;
			case T__74:
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				match(T__74);
				}
				break;
			case T__75:
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				match(T__75);
				}
				break;
			case T__76:
				enterOuterAlt(_localctx, 5);
				{
				setState(401);
				match(T__76);
				}
				break;
			case T__77:
				enterOuterAlt(_localctx, 6);
				{
				setState(402);
				match(T__77);
				}
				break;
			case T__78:
				enterOuterAlt(_localctx, 7);
				{
				setState(403);
				match(T__78);
				}
				break;
			case T__79:
				enterOuterAlt(_localctx, 8);
				{
				setState(404);
				match(T__79);
				}
				break;
			case T__80:
				enterOuterAlt(_localctx, 9);
				{
				setState(405);
				match(T__80);
				}
				break;
			case T__81:
				enterOuterAlt(_localctx, 10);
				{
				setState(406);
				match(T__81);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 11);
				{
				setState(407);
				match(T__8);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 12);
				{
				setState(408);
				match(T__10);
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8 || _la==T__10 || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 2047L) != 0)) {
					{
					setState(409);
					typeName();
					}
				}

				}
				break;
			case T__82:
				enterOuterAlt(_localctx, 13);
				{
				setState(412);
				match(T__82);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001^\u01a0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0004\u00004\b\u0000\u000b\u0000\f\u00005\u0001\u0000\u0001"+
		"\u0000\u0003\u0000:\b\u0000\u0001\u0000\u0005\u0000=\b\u0000\n\u0000\f"+
		"\u0000@\t\u0000\u0005\u0000B\b\u0000\n\u0000\f\u0000E\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001N\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001T\b\u0001\u000b\u0001\f\u0001U\u0001\u0001\u0001\u0001\u0003"+
		"\u0001Z\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004"+
		"\u0002f\b\u0002\u000b\u0002\f\u0002g\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"r\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003v\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0004\u0003|\b\u0003\u000b\u0003\f\u0003"+
		"}\u0001\u0003\u0001\u0003\u0003\u0003\u0082\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u008d\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u0093\b\u0005\n\u0005\f\u0005\u0096\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00a5\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00b9\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u00be\b\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c6\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00cb\b\n\n\n\f\n\u00ce\t\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00de\b\u000b\n\u000b\f\u000b\u00e1\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00e6\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00fa\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f"+
		"\u0110\b\u000f\u000b\u000f\f\u000f\u0111\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0118\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0120\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u012d"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u013e\b\u0012\n"+
		"\u0012\f\u0012\u0141\t\u0012\u0001\u0013\u0003\u0013\u0144\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u014d\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0153\b\u0014\u0001\u0014\u0005\u0014\u0156\b\u0014"+
		"\n\u0014\f\u0014\u0159\t\u0014\u0003\u0014\u015b\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0171\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u017f\b\u0015\n\u0015\f\u0015"+
		"\u0182\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0189\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u019b\b\u0017\u0001\u0017\u0003\u0017\u019e\b\u0017\u0001"+
		"\u0017\u0000\u0001*\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\r\u0001\u0000\u0002"+
		"\u0003\u0001\u0000\u0004\u0005\u0001\u0000\u0010\u0015\u0001\u0000\u0019"+
		"\u001a\u0001\u0000#$\u0001\u0000()\u0001\u0000*+\u0001\u000003\u0001\u0000"+
		"45\u0001\u000089\u0001\u0000:;\u0002\u0000\b\b<A\u0001\u0000BD\u01cd\u0000"+
		"0\u0001\u0000\u0000\u0000\u0002K\u0001\u0000\u0000\u0000\u0004q\u0001"+
		"\u0000\u0000\u0000\u0006s\u0001\u0000\u0000\u0000\b\u008c\u0001\u0000"+
		"\u0000\u0000\n\u0094\u0001\u0000\u0000\u0000\f\u00a4\u0001\u0000\u0000"+
		"\u0000\u000e\u00a6\u0001\u0000\u0000\u0000\u0010\u00af\u0001\u0000\u0000"+
		"\u0000\u0012\u00b4\u0001\u0000\u0000\u0000\u0014\u00c1\u0001\u0000\u0000"+
		"\u0000\u0016\u00d1\u0001\u0000\u0000\u0000\u0018\u00e9\u0001\u0000\u0000"+
		"\u0000\u001a\u00f1\u0001\u0000\u0000\u0000\u001c\u0100\u0001\u0000\u0000"+
		"\u0000\u001e\u0106\u0001\u0000\u0000\u0000 \u011b\u0001\u0000\u0000\u0000"+
		"\"\u0128\u0001\u0000\u0000\u0000$\u013a\u0001\u0000\u0000\u0000&\u0143"+
		"\u0001\u0000\u0000\u0000(\u0149\u0001\u0000\u0000\u0000*\u0170\u0001\u0000"+
		"\u0000\u0000,\u0183\u0001\u0000\u0000\u0000.\u019d\u0001\u0000\u0000\u0000"+
		"01\u0005\u0001\u0000\u000013\u0005Z\u0000\u000024\u0005]\u0000\u00003"+
		"2\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u00006C\u0001\u0000\u0000\u00007:\u0003\u0002"+
		"\u0001\u00008:\u0003\u0006\u0003\u000097\u0001\u0000\u0000\u000098\u0001"+
		"\u0000\u0000\u0000:>\u0001\u0000\u0000\u0000;=\u0005]\u0000\u0000<;\u0001"+
		"\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000A9\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000FG\u0007\u0000\u0000\u0000GH\u0005]\u0000\u0000HI\u0003"+
		"\n\u0005\u0000IJ\u0007\u0001\u0000\u0000J\u0001\u0001\u0000\u0000\u0000"+
		"KM\u0005X\u0000\u0000LN\u0005\u0006\u0000\u0000ML\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OS\u0005]\u0000\u0000"+
		"PQ\u0003\u0004\u0002\u0000QR\u0005]\u0000\u0000RT\u0001\u0000\u0000\u0000"+
		"SP\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WX\u0005\u0007"+
		"\u0000\u0000XZ\u0005]\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000Z\u0003\u0001\u0000\u0000\u0000[\\\u0005Z\u0000\u0000\\]\u0005"+
		"\b\u0000\u0000]^\u0005\t\u0000\u0000^e\u0005]\u0000\u0000_`\u0005Z\u0000"+
		"\u0000`a\u0005\u0006\u0000\u0000ab\u0003.\u0017\u0000bc\u0005\n\u0000"+
		"\u0000cd\u0005]\u0000\u0000df\u0001\u0000\u0000\u0000e_\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0005\u0004\u0000\u0000jr\u0001"+
		"\u0000\u0000\u0000kl\u0005Z\u0000\u0000lm\u0005\b\u0000\u0000mn\u0005"+
		"\u000b\u0000\u0000no\u0005\f\u0000\u0000op\u0005T\u0000\u0000pr\u0003"+
		".\u0017\u0000q[\u0001\u0000\u0000\u0000qk\u0001\u0000\u0000\u0000r\u0005"+
		"\u0001\u0000\u0000\u0000su\u0005Y\u0000\u0000tv\u0005\u0006\u0000\u0000"+
		"ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000w{\u0005]\u0000\u0000xy\u0003\b\u0004\u0000yz\u0005]\u0000\u0000"+
		"z|\u0001\u0000\u0000\u0000{x\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0081\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005\r\u0000\u0000\u0080\u0082\u0005]"+
		"\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0007\u0001\u0000\u0000\u0000\u0083\u0084\u0005Z\u0000"+
		"\u0000\u0084\u0085\u0005\u0006\u0000\u0000\u0085\u008d\u0003.\u0017\u0000"+
		"\u0086\u0087\u0005Z\u0000\u0000\u0087\u0088\u0005\u0006\u0000\u0000\u0088"+
		"\u0089\u0005\u000b\u0000\u0000\u0089\u008a\u0005\f\u0000\u0000\u008a\u008b"+
		"\u0005T\u0000\u0000\u008b\u008d\u0003.\u0017\u0000\u008c\u0083\u0001\u0000"+
		"\u0000\u0000\u008c\u0086\u0001\u0000\u0000\u0000\u008d\t\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0003\f\u0006\u0000\u008f\u0090\u0005]\u0000\u0000"+
		"\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u0093\u0005]\u0000\u0000\u0092"+
		"\u008e\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u000b\u0001\u0000\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0097\u00a5\u0003\u0012\t\u0000\u0098\u00a5"+
		"\u0003\u0014\n\u0000\u0099\u00a5\u0003\u000e\u0007\u0000\u009a\u00a5\u0003"+
		"\u0010\b\u0000\u009b\u00a5\u0003\u0016\u000b\u0000\u009c\u00a5\u0003\u0018"+
		"\f\u0000\u009d\u00a5\u0003\u001a\r\u0000\u009e\u00a5\u0003\u001c\u000e"+
		"\u0000\u009f\u00a5\u0003\u001e\u000f\u0000\u00a0\u00a5\u0003 \u0010\u0000"+
		"\u00a1\u00a5\u0003\"\u0011\u0000\u00a2\u00a5\u0003(\u0014\u0000\u00a3"+
		"\u00a5\u0003,\u0016\u0000\u00a4\u0097\u0001\u0000\u0000\u0000\u00a4\u0098"+
		"\u0001\u0000\u0000\u0000\u00a4\u0099\u0001\u0000\u0000\u0000\u00a4\u009a"+
		"\u0001\u0000\u0000\u0000\u00a4\u009b\u0001\u0000\u0000\u0000\u00a4\u009c"+
		"\u0001\u0000\u0000\u0000\u00a4\u009d\u0001\u0000\u0000\u0000\u00a4\u009e"+
		"\u0001\u0000\u0000\u0000\u00a4\u009f\u0001\u0000\u0000\u0000\u00a4\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\r\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0005\u000e\u0000\u0000\u00a7\u00a8\u0005"+
		"\u000f\u0000\u0000\u00a8\u00a9\u0005Z\u0000\u0000\u00a9\u00aa\u0005\n"+
		"\u0000\u0000\u00aa\u00ab\u0005Z\u0000\u0000\u00ab\u00ac\u0005\n\u0000"+
		"\u0000\u00ac\u00ad\u0007\u0002\u0000\u0000\u00ad\u00ae\u0005\u0016\u0000"+
		"\u0000\u00ae\u000f\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0017\u0000"+
		"\u0000\u00b0\u00b1\u0005\u000f\u0000\u0000\u00b1\u00b2\u0005Z\u0000\u0000"+
		"\u00b2\u00b3\u0005\u0016\u0000\u0000\u00b3\u0011\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0005\u0018\u0000\u0000\u00b5\u00b8\u0005\u000f\u0000\u0000"+
		"\u00b6\u00b7\u0005Z\u0000\u0000\u00b7\u00b9\u0005\n\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bd\u0005Z\u0000\u0000\u00bb\u00bc"+
		"\u0005\u0006\u0000\u0000\u00bc\u00be\u0003.\u0017\u0000\u00bd\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0005\u0016\u0000\u0000\u00c0\u0013\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0007\u0003\u0000\u0000\u00c2\u00c5\u0005"+
		"\u000f\u0000\u0000\u00c3\u00c4\u0005Z\u0000\u0000\u00c4\u00c6\u0005\n"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00cc\u0003*\u0015"+
		"\u0000\u00c8\u00c9\u0005\n\u0000\u0000\u00c9\u00cb\u0003*\u0015\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000"+
		"\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0005\u0016\u0000\u0000\u00d0\u0015\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0005\u001b\u0000\u0000\u00d2\u00d3\u0003*\u0015\u0000\u00d3"+
		"\u00d4\u0005\u001c\u0000\u0000\u00d4\u00d5\u0005]\u0000\u0000\u00d5\u00df"+
		"\u0003\n\u0005\u0000\u00d6\u00d7\u0005\u001d\u0000\u0000\u00d7\u00d8\u0005"+
		"\u001b\u0000\u0000\u00d8\u00d9\u0003*\u0015\u0000\u00d9\u00da\u0005\u001c"+
		"\u0000\u0000\u00da\u00db\u0005]\u0000\u0000\u00db\u00dc\u0003\n\u0005"+
		"\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00d6\u0001\u0000\u0000"+
		"\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u001d\u0000"+
		"\u0000\u00e3\u00e4\u0005]\u0000\u0000\u00e4\u00e6\u0003\n\u0005\u0000"+
		"\u00e5\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u001e\u0000\u0000"+
		"\u00e8\u0017\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u001f\u0000\u0000"+
		"\u00ea\u00eb\u0005 \u0000\u0000\u00eb\u00ec\u0003*\u0015\u0000\u00ec\u00ed"+
		"\u0005!\u0000\u0000\u00ed\u00ee\u0005]\u0000\u0000\u00ee\u00ef\u0003\n"+
		"\u0005\u0000\u00ef\u00f0\u0005\"\u0000\u0000\u00f0\u0019\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0007\u0004\u0000\u0000\u00f2\u00f3\u0005Z\u0000\u0000"+
		"\u00f3\u00f4\u0005\f\u0000\u0000\u00f4\u00f5\u0003*\u0015\u0000\u00f5"+
		"\u00f6\u0005%\u0000\u0000\u00f6\u00f9\u0003*\u0015\u0000\u00f7\u00f8\u0005"+
		"&\u0000\u0000\u00f8\u00fa\u0003*\u0015\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0005!\u0000\u0000\u00fc\u00fd\u0005]\u0000\u0000\u00fd"+
		"\u00fe\u0003\n\u0005\u0000\u00fe\u00ff\u0005\'\u0000\u0000\u00ff\u001b"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0007\u0005\u0000\u0000\u0101\u0102"+
		"\u0005]\u0000\u0000\u0102\u0103\u0003\n\u0005\u0000\u0103\u0104\u0007"+
		"\u0006\u0000\u0000\u0104\u0105\u0003*\u0015\u0000\u0105\u001d\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0005,\u0000\u0000\u0107\u0108\u0003*\u0015\u0000"+
		"\u0108\u010f\u0005]\u0000\u0000\u0109\u010a\u0005-\u0000\u0000\u010a\u010b"+
		"\u0003*\u0015\u0000\u010b\u010c\u0005\u0006\u0000\u0000\u010c\u010d\u0005"+
		"]\u0000\u0000\u010d\u010e\u0003\n\u0005\u0000\u010e\u0110\u0001\u0000"+
		"\u0000\u0000\u010f\u0109\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000"+
		"\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000"+
		"\u0000\u0000\u0112\u0117\u0001\u0000\u0000\u0000\u0113\u0114\u0005.\u0000"+
		"\u0000\u0114\u0115\u0005\u0006\u0000\u0000\u0115\u0116\u0005]\u0000\u0000"+
		"\u0116\u0118\u0003\n\u0005\u0000\u0117\u0113\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0005/\u0000\u0000\u011a\u001f\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\u0007\u0007\u0000\u0000\u011c\u011d\u0005Z\u0000\u0000\u011d\u011f\u0005"+
		"\u000f\u0000\u0000\u011e\u0120\u0003$\u0012\u0000\u011f\u011e\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0005\u0016\u0000\u0000\u0122\u0123\u0005]\u0000"+
		"\u0000\u0123\u0124\u0005\u0003\u0000\u0000\u0124\u0125\u0005]\u0000\u0000"+
		"\u0125\u0126\u0003\n\u0005\u0000\u0126\u0127\u0005\u0005\u0000\u0000\u0127"+
		"!\u0001\u0000\u0000\u0000\u0128\u0129\u0007\b\u0000\u0000\u0129\u012a"+
		"\u0005Z\u0000\u0000\u012a\u012c\u0005\u000f\u0000\u0000\u012b\u012d\u0003"+
		"$\u0012\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u0016"+
		"\u0000\u0000\u012f\u0130\u0005\u0006\u0000\u0000\u0130\u0131\u0003.\u0017"+
		"\u0000\u0131\u0132\u0005]\u0000\u0000\u0132\u0133\u0005\u0003\u0000\u0000"+
		"\u0133\u0134\u0005]\u0000\u0000\u0134\u0135\u0003\n\u0005\u0000\u0135"+
		"\u0136\u00056\u0000\u0000\u0136\u0137\u0003*\u0015\u0000\u0137\u0138\u0005"+
		"]\u0000\u0000\u0138\u0139\u0005\u0005\u0000\u0000\u0139#\u0001\u0000\u0000"+
		"\u0000\u013a\u013f\u0003&\u0013\u0000\u013b\u013c\u0005\n\u0000\u0000"+
		"\u013c\u013e\u0003&\u0013\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e"+
		"\u0141\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f"+
		"\u0140\u0001\u0000\u0000\u0000\u0140%\u0001\u0000\u0000\u0000\u0141\u013f"+
		"\u0001\u0000\u0000\u0000\u0142\u0144\u00057\u0000\u0000\u0143\u0142\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0005Z\u0000\u0000\u0146\u0147\u0005\u0006"+
		"\u0000\u0000\u0147\u0148\u0003.\u0017\u0000\u0148\'\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0005Z\u0000\u0000\u014a\u015a\u0005\u000f\u0000\u0000"+
		"\u014b\u014d\u00057\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0003*\u0015\u0000\u014f\u0157\u0001\u0000\u0000\u0000\u0150\u0152"+
		"\u0005\n\u0000\u0000\u0151\u0153\u00057\u0000\u0000\u0152\u0151\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0154\u0001"+
		"\u0000\u0000\u0000\u0154\u0156\u0003*\u0015\u0000\u0155\u0150\u0001\u0000"+
		"\u0000\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000"+
		"\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015b\u0001\u0000"+
		"\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u014c\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0005\u0016\u0000\u0000\u015d)\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0006\u0015\uffff\uffff\u0000\u015f\u0160\u0005E\u0000"+
		"\u0000\u0160\u0171\u0003*\u0015\t\u0161\u0162\u0005\u000f\u0000\u0000"+
		"\u0162\u0163\u0003*\u0015\u0000\u0163\u0164\u0005\u0016\u0000\u0000\u0164"+
		"\u0171\u0001\u0000\u0000\u0000\u0165\u0166\u0005Z\u0000\u0000\u0166\u0167"+
		"\u0005F\u0000\u0000\u0167\u0168\u0003*\u0015\u0000\u0168\u0169\u0005G"+
		"\u0000\u0000\u0169\u0171\u0001\u0000\u0000\u0000\u016a\u0171\u0003(\u0014"+
		"\u0000\u016b\u0171\u0005T\u0000\u0000\u016c\u0171\u0005U\u0000\u0000\u016d"+
		"\u0171\u0005W\u0000\u0000\u016e\u0171\u0005V\u0000\u0000\u016f\u0171\u0005"+
		"Z\u0000\u0000\u0170\u015e\u0001\u0000\u0000\u0000\u0170\u0161\u0001\u0000"+
		"\u0000\u0000\u0170\u0165\u0001\u0000\u0000\u0000\u0170\u016a\u0001\u0000"+
		"\u0000\u0000\u0170\u016b\u0001\u0000\u0000\u0000\u0170\u016c\u0001\u0000"+
		"\u0000\u0000\u0170\u016d\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000"+
		"\u0000\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0171\u0180\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\n\r\u0000\u0000\u0173\u0174\u0007\t\u0000\u0000"+
		"\u0174\u017f\u0003*\u0015\u000e\u0175\u0176\n\f\u0000\u0000\u0176\u0177"+
		"\u0007\n\u0000\u0000\u0177\u017f\u0003*\u0015\r\u0178\u0179\n\u000b\u0000"+
		"\u0000\u0179\u017a\u0007\u000b\u0000\u0000\u017a\u017f\u0003*\u0015\f"+
		"\u017b\u017c\n\n\u0000\u0000\u017c\u017d\u0007\f\u0000\u0000\u017d\u017f"+
		"\u0003*\u0015\u000b\u017e\u0172\u0001\u0000\u0000\u0000\u017e\u0175\u0001"+
		"\u0000\u0000\u0000\u017e\u0178\u0001\u0000\u0000\u0000\u017e\u017b\u0001"+
		"\u0000\u0000\u0000\u017f\u0182\u0001\u0000\u0000\u0000\u0180\u017e\u0001"+
		"\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181+\u0001\u0000"+
		"\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183\u0188\u0005Z\u0000"+
		"\u0000\u0184\u0185\u0005F\u0000\u0000\u0185\u0186\u0003*\u0015\u0000\u0186"+
		"\u0187\u0005G\u0000\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u0184"+
		"\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0005H\u0000\u0000\u018b\u018c\u0003"+
		"*\u0015\u0000\u018c-\u0001\u0000\u0000\u0000\u018d\u019e\u0005I\u0000"+
		"\u0000\u018e\u019e\u0005J\u0000\u0000\u018f\u019e\u0005K\u0000\u0000\u0190"+
		"\u019e\u0005L\u0000\u0000\u0191\u019e\u0005M\u0000\u0000\u0192\u019e\u0005"+
		"N\u0000\u0000\u0193\u019e\u0005O\u0000\u0000\u0194\u019e\u0005P\u0000"+
		"\u0000\u0195\u019e\u0005Q\u0000\u0000\u0196\u019e\u0005R\u0000\u0000\u0197"+
		"\u019e\u0005\t\u0000\u0000\u0198\u019a\u0005\u000b\u0000\u0000\u0199\u019b"+
		"\u0003.\u0017\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019a\u019b\u0001"+
		"\u0000\u0000\u0000\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019e\u0005"+
		"S\u0000\u0000\u019d\u018d\u0001\u0000\u0000\u0000\u019d\u018e\u0001\u0000"+
		"\u0000\u0000\u019d\u018f\u0001\u0000\u0000\u0000\u019d\u0190\u0001\u0000"+
		"\u0000\u0000\u019d\u0191\u0001\u0000\u0000\u0000\u019d\u0192\u0001\u0000"+
		"\u0000\u0000\u019d\u0193\u0001\u0000\u0000\u0000\u019d\u0194\u0001\u0000"+
		"\u0000\u0000\u019d\u0195\u0001\u0000\u0000\u0000\u019d\u0196\u0001\u0000"+
		"\u0000\u0000\u019d\u0197\u0001\u0000\u0000\u0000\u019d\u0198\u0001\u0000"+
		"\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e/\u0001\u0000\u0000"+
		"\u0000\'59>CMUYgqu}\u0081\u008c\u0092\u0094\u00a4\u00b8\u00bd\u00c5\u00cc"+
		"\u00df\u00e5\u00f9\u0111\u0117\u011f\u012c\u013f\u0143\u014c\u0152\u0157"+
		"\u015a\u0170\u017e\u0180\u0188\u019a\u019d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}