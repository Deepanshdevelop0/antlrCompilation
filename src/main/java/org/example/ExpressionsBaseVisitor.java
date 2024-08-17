// Generated from Expressions.g4 by ANTLR 4.0
package org.example;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class ExpressionsBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ExpressionsVisitor<T> {
	@Override public T visitOpExpr(ExpressionsParser.OpExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitStart(ExpressionsParser.StartContext ctx) { return visitChildren(ctx); }

	@Override public T visitAtomExpr(ExpressionsParser.AtomExprContext ctx) { return visitChildren(ctx); }
}