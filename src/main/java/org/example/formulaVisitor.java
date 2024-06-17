// Generated from /Users/dhruv.goti/Desktop/Validation_Gradle/src/main/java/org/example/formula.g4 by ANTLR 4.13.1
package org.example;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced by
 * {@link formulaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for operations with no return
 *            type.
 */
public interface formulaVisitor<T> extends ParseTreeVisitor<T> {

  /**
   * Visit a parse tree produced by the {@code Program} labeled alternative in
   * {@link formulaParser#prog}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitProgram(formulaParser.ProgramContext ctx);

  /**
   * Visit a parse tree produced by the {@code Mean} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitMean(formulaParser.MeanContext ctx);

  /**
   * Visit a parse tree produced by the {@code Multiplication} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitMultiplication(formulaParser.MultiplicationContext ctx);

  /**
   * Visit a parse tree produced by the {@code Minimum} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitMinimum(formulaParser.MinimumContext ctx);

  /**
   * Visit a parse tree produced by the {@code Variable} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitVariable(formulaParser.VariableContext ctx);

  /**
   * Visit a parse tree produced by the {@code Product} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitProduct(formulaParser.ProductContext ctx);

  /**
   * Visit a parse tree produced by the {@code SubstituteText} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSubstituteText(formulaParser.SubstituteTextContext ctx);

  /**
   * Visit a parse tree produced by the {@code ConcatenateText} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitConcatenateText(formulaParser.ConcatenateTextContext ctx);

  /**
   * Visit a parse tree produced by the {@code SubtractAlter} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSubtractAlter(formulaParser.SubtractAlterContext ctx);

  /**
   * Visit a parse tree produced by the {@code Maximum} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitMaximum(formulaParser.MaximumContext ctx);

  /**
   * Visit a parse tree produced by the {@code Number} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitNumber(formulaParser.NumberContext ctx);

  /**
   * Visit a parse tree produced by the {@code DivisionAlter} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDivisionAlter(formulaParser.DivisionAlterContext ctx);

  /**
   * Visit a parse tree produced by the {@code ExactText} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitExactText(formulaParser.ExactTextContext ctx);

  /**
   * Visit a parse tree produced by the {@code ConcatenateAlter} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitConcatenateAlter(formulaParser.ConcatenateAlterContext ctx);

  /**
   * Visit a parse tree produced by the {@code MultiplyAlter} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitMultiplyAlter(formulaParser.MultiplyAlterContext ctx);

  /**
   * Visit a parse tree produced by the {@code DurationDate} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDurationDate(formulaParser.DurationDateContext ctx);

  /**
   * Visit a parse tree produced by the {@code Average} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAverage(formulaParser.AverageContext ctx);

  /**
   * Visit a parse tree produced by the {@code SumAlter} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSumAlter(formulaParser.SumAlterContext ctx);

  /**
   * Visit a parse tree produced by the {@code StringText} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitStringText(formulaParser.StringTextContext ctx);

  /**
   * Visit a parse tree produced by the {@code SubtractDate} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSubtractDate(formulaParser.SubtractDateContext ctx);

  /**
   * Visit a parse tree produced by the {@code AddDate} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAddDate(formulaParser.AddDateContext ctx);

  /**
   * Visit a parse tree produced by the {@code IfLogic} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitIfLogic(formulaParser.IfLogicContext ctx);

  /**
   * Visit a parse tree produced by the {@code IfsLogic} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitIfsLogic(formulaParser.IfsLogicContext ctx);

  /**
   * Visit a parse tree produced by the {@code TodayDate} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTodayDate(formulaParser.TodayDateContext ctx);

  /**
   * Visit a parse tree produced by the {@code Quotient} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitQuotient(formulaParser.QuotientContext ctx);

  /**
   * Visit a parse tree produced by the {@code Summation} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSummation(formulaParser.SummationContext ctx);

  /**
   * Visit a parse tree produced by the {@code Comparator} labeled alternative in
   * {@link formulaParser#cmp}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitComparator(formulaParser.ComparatorContext ctx);

  /**
   * Visit a parse tree produced by the {@code Operator} labeled alternative in
   * {@link formulaParser#opr}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitOperator(formulaParser.OperatorContext ctx);
}