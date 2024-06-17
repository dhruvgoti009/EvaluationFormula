package FormulaGrammar;

public class SumAlter extends Expression {

  private Expression left;
  private Expression right;

  public SumAlter(Expression left, Expression right, int row, int column) {
    super(row, column);
    this.left = left;
    this.right = right;
  }

  public Expression getLeft() {
    return left;
  }

  public void setLeft(Expression left) {
    this.left = left;
  }

  public Expression getRight() {
    return right;
  }

  public void setRight(Expression right) {
    this.right = right;
  }

  public String toString() {
    return left.toString() + " + " + right.toString();
  }
}
