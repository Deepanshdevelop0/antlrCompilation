package org.example;



public class Visitor extends ExpressionsBaseVisitor<Integer> {

    @Override
    public Integer visitStart(ExpressionsParser.StartContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitOpExpr(ExpressionsParser.OpExprContext ctx) {
        int left = visit(ctx.left);
        int right = visit(ctx.right);
        String op = ctx.op.getText();
        final int result;
        switch (op.charAt(0)) {
            case '*' : result = left * right; break;
            case '/' : result = left / right; break;
            case '+' : result = left + right; break;
            case '-' : result = left - right; break;
            default: throw new IllegalArgumentException("Unkown opeator " + op);
        }
        return result;
    }

    @Override
    public Integer visitAtomExpr(ExpressionsParser.AtomExprContext ctx) {
        Integer atom = new Integer(ctx.atom.getText());
        return atom;
    }

}
