package FormulaGrammar;

public class Operator extends Expression {

  private String opr;

  public Operator(String opr, int row, int column) {
    super(row, column);
    this.opr = opr;
  }

  public String getOpr() {
    return opr;
  }

  public void setOpr(String opr) {
    this.opr = opr;
  }

  public String toString() {
    return opr;
  }
}
