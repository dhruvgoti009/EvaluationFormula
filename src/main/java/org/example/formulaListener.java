// Generated from /Users/dhruv.goti/Desktop/Validation_Gradle/src/main/java/org/example/formula.g4 by ANTLR 4.13.1
package org.example;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by {@link formulaParser}.
 */
public interface formulaListener extends ParseTreeListener {

  /**
   * Enter a parse tree produced by the {@code Program} labeled alternative in
   * {@link formulaParser#prog}.
   *
   * @param ctx the parse tree
   */
  void enterProgram(formulaParser.ProgramContext ctx);

  /**
   * Exit a parse tree produced by the {@code Program} labeled alternative in
   * {@link formulaParser#prog}.
   *
   * @param ctx the parse tree
   */
  void exitProgram(formulaParser.ProgramContext ctx);

  /**
   * Enter a parse tree produced by the {@code Mean} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterMean(formulaParser.MeanContext ctx);

  /**
   * Exit a parse tree produced by the {@code Mean} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitMean(formulaParser.MeanContext ctx);

  /**
   * Enter a parse tree produced by the {@code Multiplication} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterMultiplication(formulaParser.MultiplicationContext ctx);

  /**
   * Exit a parse tree produced by the {@code Multiplication} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitMultiplication(formulaParser.MultiplicationContext ctx);

  /**
   * Enter a parse tree produced by the {@code Minimum} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterMinimum(formulaParser.MinimumContext ctx);

  /**
   * Exit a parse tree produced by the {@code Minimum} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitMinimum(formulaParser.MinimumContext ctx);

  /**
   * Enter a parse tree produced by the {@code Variable} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterVariable(formulaParser.VariableContext ctx);

  /**
   * Exit a parse tree produced by the {@code Variable} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitVariable(formulaParser.VariableContext ctx);

  /**
   * Enter a parse tree produced by the {@code Product} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterProduct(formulaParser.ProductContext ctx);

  /**
   * Exit a parse tree produced by the {@code Product} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitProduct(formulaParser.ProductContext ctx);

  /**
   * Enter a parse tree produced by the {@code SubstituteText} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterSubstituteText(formulaParser.SubstituteTextContext ctx);

  /**
   * Exit a parse tree produced by the {@code SubstituteText} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitSubstituteText(formulaParser.SubstituteTextContext ctx);

  /**
   * Enter a parse tree produced by the {@code ConcatenateText} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterConcatenateText(formulaParser.ConcatenateTextContext ctx);

  /**
   * Exit a parse tree produced by the {@code ConcatenateText} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitConcatenateText(formulaParser.ConcatenateTextContext ctx);

  /**
   * Enter a parse tree produced by the {@code SubtractAlter} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterSubtractAlter(formulaParser.SubtractAlterContext ctx);

  /**
   * Exit a parse tree produced by the {@code SubtractAlter} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitSubtractAlter(formulaParser.SubtractAlterContext ctx);

  /**
   * Enter a parse tree produced by the {@code Maximum} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterMaximum(formulaParser.MaximumContext ctx);

  /**
   * Exit a parse tree produced by the {@code Maximum} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitMaximum(formulaParser.MaximumContext ctx);

  /**
   * Enter a parse tree produced by the {@code Number} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterNumber(formulaParser.NumberContext ctx);

  /**
   * Exit a parse tree produced by the {@code Number} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitNumber(formulaParser.NumberContext ctx);

  /**
   * Enter a parse tree produced by the {@code DivisionAlter} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterDivisionAlter(formulaParser.DivisionAlterContext ctx);

  /**
   * Exit a parse tree produced by the {@code DivisionAlter} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitDivisionAlter(formulaParser.DivisionAlterContext ctx);

  /**
   * Enter a parse tree produced by the {@code ExactText} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterExactText(formulaParser.ExactTextContext ctx);

  /**
   * Exit a parse tree produced by the {@code ExactText} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitExactText(formulaParser.ExactTextContext ctx);

  /**
   * Enter a parse tree produced by the {@code ConcatenateAlter} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterConcatenateAlter(formulaParser.ConcatenateAlterContext ctx);

  /**
   * Exit a parse tree produced by the {@code ConcatenateAlter} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitConcatenateAlter(formulaParser.ConcatenateAlterContext ctx);

  /**
   * Enter a parse tree produced by the {@code MultiplyAlter} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterMultiplyAlter(formulaParser.MultiplyAlterContext ctx);

  /**
   * Exit a parse tree produced by the {@code MultiplyAlter} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitMultiplyAlter(formulaParser.MultiplyAlterContext ctx);

  /**
   * Enter a parse tree produced by the {@code DurationDate} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterDurationDate(formulaParser.DurationDateContext ctx);

  /**
   * Exit a parse tree produced by the {@code DurationDate} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitDurationDate(formulaParser.DurationDateContext ctx);

  /**
   * Enter a parse tree produced by the {@code Average} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterAverage(formulaParser.AverageContext ctx);

  /**
   * Exit a parse tree produced by the {@code Average} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitAverage(formulaParser.AverageContext ctx);

  /**
   * Enter a parse tree produced by the {@code SumAlter} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterSumAlter(formulaParser.SumAlterContext ctx);

  /**
   * Exit a parse tree produced by the {@code SumAlter} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitSumAlter(formulaParser.SumAlterContext ctx);

  /**
   * Enter a parse tree produced by the {@code StringText} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterStringText(formulaParser.StringTextContext ctx);

  /**
   * Exit a parse tree produced by the {@code StringText} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitStringText(formulaParser.StringTextContext ctx);

  /**
   * Enter a parse tree produced by the {@code SubtractDate} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterSubtractDate(formulaParser.SubtractDateContext ctx);

  /**
   * Exit a parse tree produced by the {@code SubtractDate} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitSubtractDate(formulaParser.SubtractDateContext ctx);

  /**
   * Enter a parse tree produced by the {@code AddDate} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterAddDate(formulaParser.AddDateContext ctx);

  /**
   * Exit a parse tree produced by the {@code AddDate} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitAddDate(formulaParser.AddDateContext ctx);

  /**
   * Enter a parse tree produced by the {@code IfLogic} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterIfLogic(formulaParser.IfLogicContext ctx);

  /**
   * Exit a parse tree produced by the {@code IfLogic} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitIfLogic(formulaParser.IfLogicContext ctx);

  /**
   * Enter a parse tree produced by the {@code IfsLogic} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterIfsLogic(formulaParser.IfsLogicContext ctx);

  /**
   * Exit a parse tree produced by the {@code IfsLogic} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitIfsLogic(formulaParser.IfsLogicContext ctx);

  /**
   * Enter a parse tree produced by the {@code TodayDate} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterTodayDate(formulaParser.TodayDateContext ctx);

  /**
   * Exit a parse tree produced by the {@code TodayDate} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitTodayDate(formulaParser.TodayDateContext ctx);

  /**
   * Enter a parse tree produced by the {@code Quotient} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterQuotient(formulaParser.QuotientContext ctx);

  /**
   * Exit a parse tree produced by the {@code Quotient} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitQuotient(formulaParser.QuotientContext ctx);

  /**
   * Enter a parse tree produced by the {@code Summation} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void enterSummation(formulaParser.SummationContext ctx);

  /**
   * Exit a parse tree produced by the {@code Summation} labeled alternative in
   * {@link formulaParser#math}.
   *
   * @param ctx the parse tree
   */
  void exitSummation(formulaParser.SummationContext ctx);

  /**
   * Enter a parse tree produced by the {@code Comparator} labeled alternative in
   * {@link formulaParser#cmp}.
   *
   * @param ctx the parse tree
   */
  void enterComparator(formulaParser.ComparatorContext ctx);

  /**
   * Exit a parse tree produced by the {@code Comparator} labeled alternative in
   * {@link formulaParser#cmp}.
   *
   * @param ctx the parse tree
   */
  void exitComparator(formulaParser.ComparatorContext ctx);

  /**
   * Enter a parse tree produced by the {@code Operator} labeled alternative in
   * {@link formulaParser#opr}.
   *
   * @param ctx the parse tree
   */
  void enterOperator(formulaParser.OperatorContext ctx);

  /**
   * Exit a parse tree produced by the {@code Operator} labeled alternative in
   * {@link formulaParser#opr}.
   *
   * @param ctx the parse tree
   */
  void exitOperator(formulaParser.OperatorContext ctx);
}