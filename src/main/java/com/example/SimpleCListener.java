// Generated from C:/Users/pacet/Desktop/SimpleC-project/src/main/java/com/example/SimpleC.g4 by ANTLR 4.13.2
package com.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleCParser}.
 */
public interface SimpleCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimpleCParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimpleCParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#printfFunc}.
	 * @param ctx the parse tree
	 */
	void enterPrintfFunc(SimpleCParser.PrintfFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#printfFunc}.
	 * @param ctx the parse tree
	 */
	void exitPrintfFunc(SimpleCParser.PrintfFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#scanfFunc}.
	 * @param ctx the parse tree
	 */
	void enterScanfFunc(SimpleCParser.ScanfFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#scanfFunc}.
	 * @param ctx the parse tree
	 */
	void exitScanfFunc(SimpleCParser.ScanfFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(SimpleCParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(SimpleCParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(SimpleCParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(SimpleCParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(SimpleCParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(SimpleCParser.PrimaryExpressionContext ctx);
}