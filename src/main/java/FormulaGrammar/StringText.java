package FormulaGrammar;

public class StringText extends Expression {

  private String str;

  public StringText(String str, int row, int column) {
    super(row, column);
    this.str = str.substring(1, str.length() - 1);
  }

  public String getStr() {
    return str;
  }

  public void setStr(String str) {
    this.str = str;
  }

  public String toString() {
    return str;
  }

}
