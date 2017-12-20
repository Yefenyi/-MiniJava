// Generated from Hello.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface HelloListener extends ParseTreeListener {
	void enterExpr_arith(HelloParser.Expr_arithContext ctx);
	void exitExpr_arith(HelloParser.Expr_arithContext ctx);

	void enterExpr_new(HelloParser.Expr_newContext ctx);
	void exitExpr_new(HelloParser.Expr_newContext ctx);

	void enterStat(HelloParser.StatContext ctx);
	void exitStat(HelloParser.StatContext ctx);

	void enterBool(HelloParser.BoolContext ctx);
	void exitBool(HelloParser.BoolContext ctx);

	void enterExpr_cmp(HelloParser.Expr_cmpContext ctx);
	void exitExpr_cmp(HelloParser.Expr_cmpContext ctx);

	void enterExpr_this(HelloParser.Expr_thisContext ctx);
	void exitExpr_this(HelloParser.Expr_thisContext ctx);

	void enterExpr_am(HelloParser.Expr_amContext ctx);
	void exitExpr_am(HelloParser.Expr_amContext ctx);

	void enterExpr_length(HelloParser.Expr_lengthContext ctx);
	void exitExpr_length(HelloParser.Expr_lengthContext ctx);

	void enterExpr_unit(HelloParser.Expr_unitContext ctx);
	void exitExpr_unit(HelloParser.Expr_unitContext ctx);

	void enterExpr_neg(HelloParser.Expr_negContext ctx);
	void exitExpr_neg(HelloParser.Expr_negContext ctx);

	void enterT(HelloParser.TContext ctx);
	void exitT(HelloParser.TContext ctx);

	void enterExpr_para(HelloParser.Expr_paraContext ctx);
	void exitExpr_para(HelloParser.Expr_paraContext ctx);

	void enterArray(HelloParser.ArrayContext ctx);
	void exitArray(HelloParser.ArrayContext ctx);

	void enterExpr_time(HelloParser.Expr_timeContext ctx);
	void exitExpr_time(HelloParser.Expr_timeContext ctx);

	void enterExpr_and(HelloParser.Expr_andContext ctx);
	void exitExpr_and(HelloParser.Expr_andContext ctx);

	void enterExpr(HelloParser.ExprContext ctx);
	void exitExpr(HelloParser.ExprContext ctx);
}