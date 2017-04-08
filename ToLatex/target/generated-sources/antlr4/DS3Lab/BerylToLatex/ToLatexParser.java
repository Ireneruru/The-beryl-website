// Generated from DS3Lab/BerylToLatex/ToLatex.g4 by ANTLR 4.5.3
package DS3Lab.BerylToLatex;

import java.io.*;
import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ToLatexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ID=20, STRING=21, INT=22, FLOAT=23, WS=24;
	public static final int
		RULE_program = 0, RULE_index = 1, RULE_set_index = 2, RULE_var_desc = 3, 
		RULE_var_range = 4, RULE_statement = 5, RULE_const_def = 6, RULE_schema = 7, 
		RULE_tensor = 8, RULE_assignment = 9, RULE_expression = 10, RULE_expression_m = 11, 
		RULE_expression_o = 12, RULE_expression_t = 13, RULE_params = 14, RULE_feed = 15, 
		RULE_evaluation = 16, RULE_num = 17;
	public static final String[] ruleNames = {
		"program", "index", "set_index", "var_desc", "var_range", "statement", 
		"const_def", "schema", "tensor", "assignment", "expression", "expression_m", 
		"expression_o", "expression_t", "params", "feed", "evaluation", "num"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "','", "'}'", "'='", "'...'", "':='", "'in'", "'^'", "'_'", 
		"'+'", "'-'", "'*'", "'.'", "'/'", "'''", "'('", "')'", "'~'", "'min'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "ID", "STRING", "INT", 
		"FLOAT", "WS"
	};
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
	public String getGrammarFileName() { return "ToLatex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	FileWriter open(String s) {
	    try {
	        return new FileWriter(s, false);
	    }
	    catch (IOException e) {
	        throw new ParseCancellationException(e);
	    }
	}

	FileWriter f = open("latex.txt");

	void wr(String s) {
	    try {
	        f.write(s);
	        f.flush();
	    }
	    catch (IOException e) {
	        throw new ParseCancellationException(e);
	    }
	}

	public ToLatexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			            wr("\\documentclass{article}\n\\usepackage{CJK}\n\\usepackage{amsmath}\n\\pagestyle{empty}\n\\allowdisplaybreaks\n\\begin{document}\n\\begin{align*}\n");
			        
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__15) | (1L << T__18) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				{
				 wr("&  "); 
				setState(38);
				statement();
				 wr(" \\\\\n"); 
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			            wr("\\end{align*}\n\\end{document}\n");
			        
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

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ToLatexParser.ID, 0); }
		public TerminalNode INT() { return getToken(ToLatexParser.INT, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Set_indexContext extends ParserRuleContext {
		public IndexContext index;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public Set_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).enterSet_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).exitSet_index(this);
		}
	}

	public final Set_indexContext set_index() throws RecognitionException {
		Set_indexContext _localctx = new Set_indexContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_set_index);
		int _la;
		try {
			setState(67);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(T__0);
				wr("{ ");
				setState(52);
				expression(0);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(53);
					match(T__1);
					wr(", ");
					setState(55);
					expression(0);
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(61);
				match(T__2);
				wr("} ");
				}
				break;
			case ID:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				((Set_indexContext)_localctx).index = index();
				wr((((Set_indexContext)_localctx).index!=null?_input.getText(((Set_indexContext)_localctx).index.start,((Set_indexContext)_localctx).index.stop):null));
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

	public static class Var_descContext extends ParserRuleContext {
		public List<Var_rangeContext> var_range() {
			return getRuleContexts(Var_rangeContext.class);
		}
		public Var_rangeContext var_range(int i) {
			return getRuleContext(Var_rangeContext.class,i);
		}
		public Var_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).enterVar_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).exitVar_desc(this);
		}
	}

	public final Var_descContext var_desc() throws RecognitionException {
		Var_descContext _localctx = new Var_descContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			var_range();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(70);
				match(T__1);
				wr(", \\ ");
				setState(72);
				var_range();
				}
				}
				setState(77);
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

	public static class Var_rangeContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(ToLatexParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Var_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).enterVar_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).exitVar_range(this);
		}
	}

	public final Var_rangeContext var_range() throws RecognitionException {
		Var_rangeContext _localctx = new Var_rangeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((Var_rangeContext)_localctx).ID = match(ID);
			wr((((Var_rangeContext)_localctx).ID!=null?((Var_rangeContext)_localctx).ID.getText():null));
			setState(80);
			match(T__3);
			wr("=");
			setState(82);
			expression(0);
			setState(83);
			match(T__4);
			wr("...");
			setState(85);
			expression(0);
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

	public static class StatementContext extends ParserRuleContext {
		public Const_defContext const_def;
		public Const_defContext const_def() {
			return getRuleContext(Const_defContext.class,0);
		}
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FeedContext feed() {
			return getRuleContext(FeedContext.class,0);
		}
		public EvaluationContext evaluation() {
			return getRuleContext(EvaluationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				((StatementContext)_localctx).const_def = const_def();
				wr((((StatementContext)_localctx).const_def!=null?_input.getText(((StatementContext)_localctx).const_def.start,((StatementContext)_localctx).const_def.stop):null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				schema();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				feed();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				evaluation();
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

	public static class Const_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ToLatexParser.ID, 0); }
		public TerminalNode INT() { return getToken(ToLatexParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ToLatexParser.FLOAT, 0); }
		public Const_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).enterConst_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).exitConst_def(this);
		}
	}

	public final Const_defContext const_def() throws RecognitionException {
		Const_defContext _localctx = new Const_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_const_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(ID);
			setState(97);
			match(T__5);
			setState(98);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class SchemaContext extends ParserRuleContext {
		public TensorContext tensor;
		public Token ID;
		public List<TensorContext> tensor() {
			return getRuleContexts(TensorContext.class);
		}
		public TensorContext tensor(int i) {
			return getRuleContext(TensorContext.class,i);
		}
		public TerminalNode ID() { return getToken(ToLatexParser.ID, 0); }
		public Set_indexContext set_index() {
			return getRuleContext(Set_indexContext.class,0);
		}
		public Var_descContext var_desc() {
			return getRuleContext(Var_descContext.class,0);
		}
		public SchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).enterSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).exitSchema(this);
		}
	}

	public final SchemaContext schema() throws RecognitionException {
		SchemaContext _localctx = new SchemaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			((SchemaContext)_localctx).tensor = tensor();
			wr((((SchemaContext)_localctx).tensor!=null?_input.getText(((SchemaContext)_localctx).tensor.start,((SchemaContext)_localctx).tensor.stop):null)+' ');
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(102);
				match(T__1);
				wr(",\\ ");
				setState(104);
				((SchemaContext)_localctx).tensor = tensor();
				wr((((SchemaContext)_localctx).tensor!=null?_input.getText(((SchemaContext)_localctx).tensor.start,((SchemaContext)_localctx).tensor.stop):null)+ ' ');
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(T__6);
			wr("\\in ");
			setState(114);
			((SchemaContext)_localctx).ID = match(ID);
			wr((((SchemaContext)_localctx).ID!=null?((SchemaContext)_localctx).ID.getText():null));
			setState(119);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(116);
				match(T__7);
				wr("^");
				setState(118);
				set_index();
				}
			}

			setState(124);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(121);
				match(T__1);
				wr(",\\  ");
				setState(123);
				var_desc();
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

	public static class TensorContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ToLatexParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ToLatexParser.ID, i);
		}
		public TensorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tensor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).enterTensor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).exitTensor(this);
		}
	}

	public final TensorContext tensor() throws RecognitionException {
		TensorContext _localctx = new TensorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tensor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(ID);
			setState(141);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(127);
				match(T__8);
				setState(139);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(128);
					match(ID);
					}
					break;
				case T__0:
					{
					setState(129);
					match(T__0);
					setState(130);
					match(ID);
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(131);
						match(T__1);
						setState(132);
						match(ID);
						}
						}
						setState(137);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(138);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class AssignmentContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(ToLatexParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Set_indexContext set_index() {
			return getRuleContext(Set_indexContext.class,0);
		}
		public Var_descContext var_desc() {
			return getRuleContext(Var_descContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			((AssignmentContext)_localctx).ID = match(ID);
			wr((((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null));
			setState(148);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(145);
				match(T__8);
				wr("_");
				setState(147);
				set_index();
				}
			}

			setState(150);
			match(T__3);
			wr("\\ =\\ ");
			setState(152);
			expression(0);
			setState(156);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(153);
				match(T__1);
				wr(",\\ ");
				setState(155);
				var_desc();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression_mContext expression_m() {
			return getRuleContext(Expression_mContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(159);
			expression_m(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(161);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(162);
						match(T__9);
						wr("+");
						setState(164);
						expression_m(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(166);
						match(T__10);
						wr("-");
						setState(168);
						expression_m(0);
						}
						break;
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Expression_mContext extends ParserRuleContext {
		public Expression_oContext expression_o() {
			return getRuleContext(Expression_oContext.class,0);
		}
		public Expression_mContext expression_m() {
			return getRuleContext(Expression_mContext.class,0);
		}
		public Expression_mContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_m; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).enterExpression_m(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).exitExpression_m(this);
		}
	}

	public final Expression_mContext expression_m() throws RecognitionException {
		return expression_m(0);
	}

	private Expression_mContext expression_m(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_mContext _localctx = new Expression_mContext(_ctx, _parentState);
		Expression_mContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression_m, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(175);
			expression_o();
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new Expression_mContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_m);
						setState(177);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(178);
						match(T__11);
						wr("*");
						setState(180);
						expression_o();
						}
						break;
					case 2:
						{
						_localctx = new Expression_mContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_m);
						setState(181);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(182);
						match(T__12);
						wr("\\cdot ");
						setState(184);
						expression_o();
						}
						break;
					case 3:
						{
						_localctx = new Expression_mContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_m);
						setState(185);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(186);
						match(T__13);
						wr("/");
						setState(188);
						expression_o();
						}
						break;
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class Expression_oContext extends ParserRuleContext {
		public Expression_tContext expression_t() {
			return getRuleContext(Expression_tContext.class,0);
		}
		public Expression_oContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_o; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).enterExpression_o(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).exitExpression_o(this);
		}
	}

	public final Expression_oContext expression_o() throws RecognitionException {
		Expression_oContext _localctx = new Expression_oContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression_o);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(T__10);
				wr("-");
				setState(196);
				expression_t();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				expression_t();
				setState(198);
				match(T__14);
				wr("^{\\rm T}");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				expression_t();
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

	public static class Expression_tContext extends ParserRuleContext {
		public Token ID;
		public NumContext num;
		public List<TerminalNode> ID() { return getTokens(ToLatexParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ToLatexParser.ID, i);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Set_indexContext set_index() {
			return getRuleContext(Set_indexContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public Expression_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).enterExpression_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).exitExpression_t(this);
		}
	}

	public final Expression_tContext expression_t() throws RecognitionException {
		Expression_tContext _localctx = new Expression_tContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression_t);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				((Expression_tContext)_localctx).ID = match(ID);
				wr((((Expression_tContext)_localctx).ID!=null?((Expression_tContext)_localctx).ID.getText():null));
				setState(206);
				match(T__15);
				wr("(");
				setState(209);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__15) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					setState(208);
					params();
					}
				}

				setState(211);
				match(T__16);
				wr(")");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				((Expression_tContext)_localctx).ID = match(ID);
				wr("\\"+(((Expression_tContext)_localctx).ID!=null?((Expression_tContext)_localctx).ID.getText():null));
				setState(215);
				match(T__8);
				setState(216);
				match(T__0);
				wr("_{");
				setState(218);
				((Expression_tContext)_localctx).ID = match(ID);
				wr((((Expression_tContext)_localctx).ID!=null?((Expression_tContext)_localctx).ID.getText():null));
				setState(220);
				match(T__3);
				wr("=");
				setState(222);
				expression(0);
				setState(223);
				match(T__2);
				setState(224);
				match(T__7);
				wr("}^{");
				setState(226);
				match(T__0);
				setState(227);
				expression(0);
				setState(228);
				match(T__2);
				setState(229);
				match(T__0);
				wr("}{");
				setState(231);
				expression(0);
				setState(232);
				match(T__2);
				wr("}");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(T__15);
				wr("(");
				setState(237);
				expression(0);
				setState(238);
				match(T__16);
				wr(")");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				((Expression_tContext)_localctx).ID = match(ID);
				wr((((Expression_tContext)_localctx).ID!=null?((Expression_tContext)_localctx).ID.getText():null));
				setState(246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(243);
					match(T__8);
					wr("_");
					setState(245);
					set_index();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				((Expression_tContext)_localctx).num = num();
				wr((((Expression_tContext)_localctx).num!=null?_input.getText(((Expression_tContext)_localctx).num.start,((Expression_tContext)_localctx).num.stop):null));
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			expression(0);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(254);
				match(T__1);
				wr(",\\ ");
				setState(256);
				expression(0);
				}
				}
				setState(261);
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

	public static class FeedContext extends ParserRuleContext {
		public Token ID;
		public Token STRING;
		public List<TerminalNode> ID() { return getTokens(ToLatexParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ToLatexParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(ToLatexParser.STRING, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FeedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).enterFeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).exitFeed(this);
		}
	}

	public final FeedContext feed() throws RecognitionException {
		FeedContext _localctx = new FeedContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_feed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			((FeedContext)_localctx).ID = match(ID);
			wr((((FeedContext)_localctx).ID!=null?((FeedContext)_localctx).ID.getText():null));
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(264);
				match(T__1);
				wr(",\\ ");
				setState(266);
				((FeedContext)_localctx).ID = match(ID);
				wr((((FeedContext)_localctx).ID!=null?((FeedContext)_localctx).ID.getText():null));
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(T__17);
			wr("\\ \\sim \\  ");
			setState(286);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(275);
				((FeedContext)_localctx).STRING = match(STRING);
				wr((((FeedContext)_localctx).STRING!=null?((FeedContext)_localctx).STRING.getText():null));
				}
				break;
			case ID:
				{
				setState(277);
				((FeedContext)_localctx).ID = match(ID);
				wr((((FeedContext)_localctx).ID!=null?((FeedContext)_localctx).ID.getText():null));
				setState(279);
				match(T__15);
				wr("(");
				setState(282);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__15) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					setState(281);
					params();
					}
				}

				setState(284);
				match(T__16);
				wr(")");
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class EvaluationContext extends ParserRuleContext {
		public Token ID;
		public List<TerminalNode> ID() { return getTokens(ToLatexParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ToLatexParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaluation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).enterEvaluation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).exitEvaluation(this);
		}
	}

	public final EvaluationContext evaluation() throws RecognitionException {
		EvaluationContext _localctx = new EvaluationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_evaluation);
		int _la;
		try {
			setState(313);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(T__18);
				wr("\\min");
				setState(290);
				match(T__8);
				wr("_");
				setState(292);
				match(T__0);
				wr("{");
				setState(294);
				((EvaluationContext)_localctx).ID = match(ID);
				wr((((EvaluationContext)_localctx).ID!=null?((EvaluationContext)_localctx).ID.getText():null));
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(296);
					match(T__1);
					wr(",");
					setState(298);
					((EvaluationContext)_localctx).ID = match(ID);
					wr((((EvaluationContext)_localctx).ID!=null?((EvaluationContext)_localctx).ID.getText():null));
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(305);
				match(T__2);
				setState(306);
				match(T__0);
				wr("}{ ");
				setState(308);
				expression(0);
				setState(309);
				match(T__2);
				 wr("}"); 
				}
				break;
			case T__10:
			case T__15:
			case ID:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				expression(0);
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ToLatexParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ToLatexParser.FLOAT, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToLatexListener ) ((ToLatexListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 11:
			return expression_m_sempred((Expression_mContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_m_sempred(Expression_mContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u0140\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4F\n\4\3\5\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7a\n\7\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\tz\n\t\3\t\3\t\3\t\5\t\177\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\7\n\u0088\n\n\f\n\16\n\u008b\13\n\3\n\5\n\u008e\n\n\5\n\u0090\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u0097\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u009f\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ac"+
		"\n\f\f\f\16\f\u00af\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u00c0\n\r\f\r\16\r\u00c3\13\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00cd\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00d4"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f9\n\17\3\17\3\17\3\17"+
		"\5\17\u00fe\n\17\3\20\3\20\3\20\3\20\7\20\u0104\n\20\f\20\16\20\u0107"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u010f\n\21\f\21\16\21\u0112"+
		"\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u011d\n\21\3"+
		"\21\3\21\5\21\u0121\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u012f\n\22\f\22\16\22\u0132\13\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u013c\n\22\3\23\3\23\3\23\2\4\26\30\24"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\4\4\2\26\26\30\30\3\2\30"+
		"\31\u0150\2&\3\2\2\2\4\62\3\2\2\2\6E\3\2\2\2\bG\3\2\2\2\nP\3\2\2\2\f`"+
		"\3\2\2\2\16b\3\2\2\2\20f\3\2\2\2\22\u0080\3\2\2\2\24\u0091\3\2\2\2\26"+
		"\u00a0\3\2\2\2\30\u00b0\3\2\2\2\32\u00cc\3\2\2\2\34\u00fd\3\2\2\2\36\u00ff"+
		"\3\2\2\2 \u0108\3\2\2\2\"\u013b\3\2\2\2$\u013d\3\2\2\2&-\b\2\1\2\'(\b"+
		"\2\1\2()\5\f\7\2)*\b\2\1\2*,\3\2\2\2+\'\3\2\2\2,/\3\2\2\2-+\3\2\2\2-."+
		"\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\b\2\1\2\61\3\3\2\2\2\62\63\t\2\2"+
		"\2\63\5\3\2\2\2\64\65\7\3\2\2\65\66\b\4\1\2\66<\5\26\f\2\678\7\4\2\28"+
		"9\b\4\1\29;\5\26\f\2:\67\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2"+
		"\2><\3\2\2\2?@\7\5\2\2@A\b\4\1\2AF\3\2\2\2BC\5\4\3\2CD\b\4\1\2DF\3\2\2"+
		"\2E\64\3\2\2\2EB\3\2\2\2F\7\3\2\2\2GM\5\n\6\2HI\7\4\2\2IJ\b\5\1\2JL\5"+
		"\n\6\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\t\3\2\2\2OM\3\2\2\2PQ"+
		"\7\26\2\2QR\b\6\1\2RS\7\6\2\2ST\b\6\1\2TU\5\26\f\2UV\7\7\2\2VW\b\6\1\2"+
		"WX\5\26\f\2X\13\3\2\2\2YZ\5\16\b\2Z[\b\7\1\2[a\3\2\2\2\\a\5\20\t\2]a\5"+
		"\24\13\2^a\5 \21\2_a\5\"\22\2`Y\3\2\2\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2"+
		"`_\3\2\2\2a\r\3\2\2\2bc\7\26\2\2cd\7\b\2\2de\t\3\2\2e\17\3\2\2\2fg\5\22"+
		"\n\2go\b\t\1\2hi\7\4\2\2ij\b\t\1\2jk\5\22\n\2kl\b\t\1\2ln\3\2\2\2mh\3"+
		"\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\t\2\2st\b"+
		"\t\1\2tu\7\26\2\2uy\b\t\1\2vw\7\n\2\2wx\b\t\1\2xz\5\6\4\2yv\3\2\2\2yz"+
		"\3\2\2\2z~\3\2\2\2{|\7\4\2\2|}\b\t\1\2}\177\5\b\5\2~{\3\2\2\2~\177\3\2"+
		"\2\2\177\21\3\2\2\2\u0080\u008f\7\26\2\2\u0081\u008d\7\13\2\2\u0082\u008e"+
		"\7\26\2\2\u0083\u0084\7\3\2\2\u0084\u0089\7\26\2\2\u0085\u0086\7\4\2\2"+
		"\u0086\u0088\7\26\2\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008e\7\5\2\2\u008d\u0082\3\2\2\2\u008d\u0083\3\2\2\2\u008e\u0090\3\2"+
		"\2\2\u008f\u0081\3\2\2\2\u008f\u0090\3\2\2\2\u0090\23\3\2\2\2\u0091\u0092"+
		"\7\26\2\2\u0092\u0096\b\13\1\2\u0093\u0094\7\13\2\2\u0094\u0095\b\13\1"+
		"\2\u0095\u0097\5\6\4\2\u0096\u0093\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\7\6\2\2\u0099\u009a\b\13\1\2\u009a\u009e\5\26\f\2"+
		"\u009b\u009c\7\4\2\2\u009c\u009d\b\13\1\2\u009d\u009f\5\b\5\2\u009e\u009b"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\25\3\2\2\2\u00a0\u00a1\b\f\1\2\u00a1"+
		"\u00a2\5\30\r\2\u00a2\u00ad\3\2\2\2\u00a3\u00a4\f\5\2\2\u00a4\u00a5\7"+
		"\f\2\2\u00a5\u00a6\b\f\1\2\u00a6\u00ac\5\30\r\2\u00a7\u00a8\f\4\2\2\u00a8"+
		"\u00a9\7\r\2\2\u00a9\u00aa\b\f\1\2\u00aa\u00ac\5\30\r\2\u00ab\u00a3\3"+
		"\2\2\2\u00ab\u00a7\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\27\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\b\r\1"+
		"\2\u00b1\u00b2\5\32\16\2\u00b2\u00c1\3\2\2\2\u00b3\u00b4\f\6\2\2\u00b4"+
		"\u00b5\7\16\2\2\u00b5\u00b6\b\r\1\2\u00b6\u00c0\5\32\16\2\u00b7\u00b8"+
		"\f\5\2\2\u00b8\u00b9\7\17\2\2\u00b9\u00ba\b\r\1\2\u00ba\u00c0\5\32\16"+
		"\2\u00bb\u00bc\f\4\2\2\u00bc\u00bd\7\20\2\2\u00bd\u00be\b\r\1\2\u00be"+
		"\u00c0\5\32\16\2\u00bf\u00b3\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00bb\3"+
		"\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\31\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\r\2\2\u00c5\u00c6\b\16\1"+
		"\2\u00c6\u00cd\5\34\17\2\u00c7\u00c8\5\34\17\2\u00c8\u00c9\7\21\2\2\u00c9"+
		"\u00ca\b\16\1\2\u00ca\u00cd\3\2\2\2\u00cb\u00cd\5\34\17\2\u00cc\u00c4"+
		"\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\33\3\2\2\2\u00ce"+
		"\u00cf\7\26\2\2\u00cf\u00d0\b\17\1\2\u00d0\u00d1\7\22\2\2\u00d1\u00d3"+
		"\b\17\1\2\u00d2\u00d4\5\36\20\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2"+
		"\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\23\2\2\u00d6\u00fe\b\17\1\2\u00d7"+
		"\u00d8\7\26\2\2\u00d8\u00d9\b\17\1\2\u00d9\u00da\7\13\2\2\u00da\u00db"+
		"\7\3\2\2\u00db\u00dc\b\17\1\2\u00dc\u00dd\7\26\2\2\u00dd\u00de\b\17\1"+
		"\2\u00de\u00df\7\6\2\2\u00df\u00e0\b\17\1\2\u00e0\u00e1\5\26\f\2\u00e1"+
		"\u00e2\7\5\2\2\u00e2\u00e3\7\n\2\2\u00e3\u00e4\b\17\1\2\u00e4\u00e5\7"+
		"\3\2\2\u00e5\u00e6\5\26\f\2\u00e6\u00e7\7\5\2\2\u00e7\u00e8\7\3\2\2\u00e8"+
		"\u00e9\b\17\1\2\u00e9\u00ea\5\26\f\2\u00ea\u00eb\7\5\2\2\u00eb\u00ec\b"+
		"\17\1\2\u00ec\u00fe\3\2\2\2\u00ed\u00ee\7\22\2\2\u00ee\u00ef\b\17\1\2"+
		"\u00ef\u00f0\5\26\f\2\u00f0\u00f1\7\23\2\2\u00f1\u00f2\b\17\1\2\u00f2"+
		"\u00fe\3\2\2\2\u00f3\u00f4\7\26\2\2\u00f4\u00f8\b\17\1\2\u00f5\u00f6\7"+
		"\13\2\2\u00f6\u00f7\b\17\1\2\u00f7\u00f9\5\6\4\2\u00f8\u00f5\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fe\3\2\2\2\u00fa\u00fb\5$\23\2\u00fb\u00fc\b\17"+
		"\1\2\u00fc\u00fe\3\2\2\2\u00fd\u00ce\3\2\2\2\u00fd\u00d7\3\2\2\2\u00fd"+
		"\u00ed\3\2\2\2\u00fd\u00f3\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fe\35\3\2\2"+
		"\2\u00ff\u0105\5\26\f\2\u0100\u0101\7\4\2\2\u0101\u0102\b\20\1\2\u0102"+
		"\u0104\5\26\f\2\u0103\u0100\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\37\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u0109\7\26\2\2\u0109\u0110\b\21\1\2\u010a\u010b\7\4\2\2\u010b\u010c\b"+
		"\21\1\2\u010c\u010d\7\26\2\2\u010d\u010f\b\21\1\2\u010e\u010a\3\2\2\2"+
		"\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\24\2\2\u0114\u0120\b\21\1\2"+
		"\u0115\u0116\7\27\2\2\u0116\u0121\b\21\1\2\u0117\u0118\7\26\2\2\u0118"+
		"\u0119\b\21\1\2\u0119\u011a\7\22\2\2\u011a\u011c\b\21\1\2\u011b\u011d"+
		"\5\36\20\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2"+
		"\u011e\u011f\7\23\2\2\u011f\u0121\b\21\1\2\u0120\u0115\3\2\2\2\u0120\u0117"+
		"\3\2\2\2\u0121!\3\2\2\2\u0122\u0123\7\25\2\2\u0123\u0124\b\22\1\2\u0124"+
		"\u0125\7\13\2\2\u0125\u0126\b\22\1\2\u0126\u0127\7\3\2\2\u0127\u0128\b"+
		"\22\1\2\u0128\u0129\7\26\2\2\u0129\u0130\b\22\1\2\u012a\u012b\7\4\2\2"+
		"\u012b\u012c\b\22\1\2\u012c\u012d\7\26\2\2\u012d\u012f\b\22\1\2\u012e"+
		"\u012a\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7\5\2\2\u0134"+
		"\u0135\7\3\2\2\u0135\u0136\b\22\1\2\u0136\u0137\5\26\f\2\u0137\u0138\7"+
		"\5\2\2\u0138\u0139\b\22\1\2\u0139\u013c\3\2\2\2\u013a\u013c\5\26\f\2\u013b"+
		"\u0122\3\2\2\2\u013b\u013a\3\2\2\2\u013c#\3\2\2\2\u013d\u013e\t\3\2\2"+
		"\u013e%\3\2\2\2\35-<EM`oy~\u0089\u008d\u008f\u0096\u009e\u00ab\u00ad\u00bf"+
		"\u00c1\u00cc\u00d3\u00f8\u00fd\u0105\u0110\u011c\u0120\u0130\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}