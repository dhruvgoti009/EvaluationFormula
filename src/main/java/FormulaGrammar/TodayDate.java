package FormulaGrammar;

public class TodayDate extends Expression {

  public TodayDate(int row, int column) {
    super(row, column);
  }

  public String toString() {
    return "TODAY.DATE()";
  }

}
