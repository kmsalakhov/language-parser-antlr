// Generated from /Users/kamilsalakhov/Desktop/5sem/MT/KLangParser/src/main/antlr4/org.example/KLang.g4 by ANTLR 4.13.1

package org.example;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(KLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link KLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(KLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KLangParser#sout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSout(KLangParser.SoutContext ctx);
	/**
	 * Visit a parse tree produced by {@link KLangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(KLangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(KLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KLangParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(KLangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KLangParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(KLangParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link KLangParser#forn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForn(KLangParser.FornContext ctx);
	/**
	 * Visit a parse tree produced by {@link KLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(KLangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(KLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(KLangParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link KLangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(KLangParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KLangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(KLangParser.FunctionCallContext ctx);
}