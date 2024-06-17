package FormulaGrammar;

public abstract class Expression {

  private final int row;
  private final int column;

  public Expression(int row, int column) {
    this.row = row;
    this.column = column;
  }

  public int getRow() {
    return row;
  }

  public int getColumn() {
    return column;
  }
}
