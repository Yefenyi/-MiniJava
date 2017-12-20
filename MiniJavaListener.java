// Generated from MiniJava.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface MiniJavaListener extends ParseTreeListener {
	void enterExpr_arith(MiniJavaParser.Expr_arithContext ctx);
	void exitExpr_arith(MiniJavaParser.Expr_arithContext ctx);

	void enterExpr_new(MiniJavaParser.Expr_newContext ctx);
	void exitExpr_new(MiniJavaParser.Expr_newContext ctx);

	void enterStat(MiniJavaParser.StatContext ctx);
	void exitStat(MiniJavaParser.StatContext ctx);

	void enterBool(MiniJavaParser.BoolContext ctx);
	void exitBool(MiniJavaParser.BoolContext ctx);

	void enterMainClass(MiniJavaParser.MainClassContext ctx);
	void exitMainClass(MiniJavaParser.MainClassContext ctx);

	void enterExpr_cmp(MiniJavaParser.Expr_cmpContext ctx);
	void exitExpr_cmp(MiniJavaParser.Expr_cmpContext ctx);

	void enterExpr_this(MiniJavaParser.Expr_thisContext ctx);
	void exitExpr_this(MiniJavaParser.Expr_thisContext ctx);

	void enterClassDef(MiniJavaParser.ClassDefContext ctx);
	void exitClassDef(MiniJavaParser.ClassDefContext ctx);

	void enterMethodDef(MiniJavaParser.MethodDefContext ctx);
	void exitMethodDef(MiniJavaParser.MethodDefContext ctx);

	void enterExpr_am(MiniJavaParser.Expr_amContext ctx);
	void exitExpr_am(MiniJavaParser.Expr_amContext ctx);

	void enterExpr_length(MiniJavaParser.Expr_lengthContext ctx);
	void exitExpr_length(MiniJavaParser.Expr_lengthContext ctx);

	void enterExpr_unit(MiniJavaParser.Expr_unitContext ctx);
	void exitExpr_unit(MiniJavaParser.Expr_unitContext ctx);

	void enterProg(MiniJavaParser.ProgContext ctx);
	void exitProg(MiniJavaParser.ProgContext ctx);

	void enterExpr_neg(MiniJavaParser.Expr_negContext ctx);
	void exitExpr_neg(MiniJavaParser.Expr_negContext ctx);

	void enterT(MiniJavaParser.TContext ctx);
	void exitT(MiniJavaParser.TContext ctx);

	void enterExpr_para(MiniJavaParser.Expr_paraContext ctx);
	void exitExpr_para(MiniJavaParser.Expr_paraContext ctx);

	void enterArray(MiniJavaParser.ArrayContext ctx);
	void exitArray(MiniJavaParser.ArrayContext ctx);

	void enterExpr_time(MiniJavaParser.Expr_timeContext ctx);
	void exitExpr_time(MiniJavaParser.Expr_timeContext ctx);

	void enterExpr_and(MiniJavaParser.Expr_andContext ctx);
	void exitExpr_and(MiniJavaParser.Expr_andContext ctx);

	void enterVarDef(MiniJavaParser.VarDefContext ctx);
	void exitVarDef(MiniJavaParser.VarDefContext ctx);

	void enterExpr(MiniJavaParser.ExprContext ctx);
	void exitExpr(MiniJavaParser.ExprContext ctx);
}