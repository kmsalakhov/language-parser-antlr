// Generated from /Users/kamilsalakhov/Desktop/5sem/MT/KLangParser/src/main/antlr4/org.example/KLang.g4 by ANTLR 4.13.1

package org.example;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KLangParser}.
 */
public interface KLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(KLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link KLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(KLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link KLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(KLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(KLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KLangParser#sout}.
	 * @param ctx the parse tree
	 */
	void enterSout(KLangParser.SoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link KLangParser#sout}.
	 * @param ctx the parse tree
	 */
	void exitSout(KLangParser.SoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link KLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(KLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(KLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(KLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(KLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(KLangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(KLangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KLangParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(KLangParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link KLangParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(KLangParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link KLangParser#forn}.
	 * @param ctx the parse tree
	 */
	void enterForn(KLangParser.FornContext ctx);
	/**
	 * Exit a parse tree produced by {@link KLangParser#forn}.
	 * @param ctx the parse tree
	 */
	void exitForn(KLangParser.FornContext ctx);
	/**
	 * Enter a parse tree produced by {@link KLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(KLangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(KLangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(KLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(KLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(KLangParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link KLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(KLangParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link KLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(KLangParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(KLangParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(KLangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(KLangParser.FunctionCallContext ctx);
}