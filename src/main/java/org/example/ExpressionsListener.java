package org.example;

// Generated from Expressions.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionsParser}.
 */
public interface ExpressionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(ExpressionsParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(ExpressionsParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(ExpressionsParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(ExpressionsParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link ExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(ExpressionsParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link ExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(ExpressionsParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(ExpressionsParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ExpressionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(ExpressionsParser.IntContext ctx);
}