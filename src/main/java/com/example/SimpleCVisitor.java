// Generated from C:/Users/pacet/Desktop/SimpleC-project/src/main/java/com/example/SimpleC.g4 by ANTLR 4.13.2
package com.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleCParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimpleCParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#printfFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintfFunc(SimpleCParser.PrintfFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#scanfFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanfFunc(SimpleCParser.ScanfFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(SimpleCParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(SimpleCParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(SimpleCParser.PrimaryExpressionContext ctx);
}