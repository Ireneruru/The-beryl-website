// Generated from DS3Lab/BerylToLatex/ToLatex.g4 by ANTLR 4.5.3
package DS3Lab.BerylToLatex;

import java.io.*;
import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ToLatexParser}.
 */
public interface ToLatexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ToLatexParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ToLatexParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToLatexParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ToLatexParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToLatexParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(ToLatexParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToLatexParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(ToLatexParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToLatexParser#set_index}.
	 * @param ctx the parse tree
	 */
	void enterSet_index(ToLatexParser.Set_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToLatexParser#set_index}.
	 * @param ctx the parse tree
	 */
	void exitSet_index(ToLatexParser.Set_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToLatexParser#var_desc}.
	 * @param ctx the parse tree
	 */
	void enterVar_desc(ToLatexParser.Var_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToLatexParser#var_desc}.
	 * @param ctx the parse tree
	 */
	void exitVar_desc(ToLatexParser.Var_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToLatexParser#var_range}.
	 * @param ctx the parse tree
	 */
	void enterVar_range(ToLatexParser.Var_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToLatexParser#var_range}.
	 * @param ctx the parse tree
	 */
	void exitVar_range(ToLatexParser.Var_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToLatexParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ToLatexParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToLatexParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ToLatexParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToLatexParser#const_def}.
	 * @param ctx the parse tree
	 */
	void enterConst_def(ToLatexParser.Const_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToLatexParser#const_def}.
	 * @param ctx the parse tree
	 */
	void exitConst_def(ToLatexParser.Const_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToLatexParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSchema(ToLatexParser.SchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToLatexParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSchema(ToLatexParser.SchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToLatexParser#tensor}.
	 * @param ctx the parse tree
	 */
	void enterTensor(ToLatexParser.TensorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToLatexParser#tensor}.
	 * @param ctx the parse tree
	 */
	void exitTensor(ToLatexParser.TensorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToLatexParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ToLatexParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToLatexParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ToLatexParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToLatexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ToLatexParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToLatexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ToLatexParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToLatexParser#expression_m}.
	 * @param ctx the parse tree
	 */
	void enterExpression_m(ToLatexParser.Expression_mContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToLatexParser#expression_m}.
	 * @param ctx the parse tree
	 */
	void exitExpression_m(ToLatexParser.Expression_mContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToLatexParser#expression_o}.
	 * @param ctx the parse tree
	 */
	void enterExpression_o(ToLatexParser.Expression_oContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToLatexParser#expression_o}.
	 * @param ctx the parse tree
	 */
	void exitExpression_o(ToLatexParser.Expression_oContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToLatexParser#expression_t}.
	 * @param ctx the parse tree
	 */
	void enterExpression_t(ToLatexParser.Expression_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToLatexParser#expression_t}.
	 * @param ctx the parse tree
	 */
	void exitExpression_t(ToLatexParser.Expression_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToLatexParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(ToLatexParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToLatexParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(ToLatexParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToLatexParser#feed}.
	 * @param ctx the parse tree
	 */
	void enterFeed(ToLatexParser.FeedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToLatexParser#feed}.
	 * @param ctx the parse tree
	 */
	void exitFeed(ToLatexParser.FeedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToLatexParser#evaluation}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation(ToLatexParser.EvaluationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToLatexParser#evaluation}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation(ToLatexParser.EvaluationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToLatexParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(ToLatexParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToLatexParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(ToLatexParser.NumContext ctx);
}