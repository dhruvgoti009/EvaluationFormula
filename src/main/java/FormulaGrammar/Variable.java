package FormulaGrammar;

public class Variable extends Expression {

  private String ID;

  public Variable(String ID, int row, int column) {
    super(row, column);
    this.ID = ID;
  }

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public String toString() {
    return ID;
  }

}
