package FormulaGrammar;

public class Number extends Expression {

  private String value;

  public Number(String value, int row, int column) {
    super(row, column);
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String toString() {
    return value;
  }
}
