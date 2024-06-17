package FormulaGrammar;

public class Comparator extends Expression {

  private Expression left;
  private Expression operator;
  private Expression right;

  public Comparator(Expression left, Expression operator, Expression right, int row, int column) {
    super(row, column);
    this.left = left;
    this.operator = operator;
    this.right = right;
  }

  public Comparator(Expression left, int row, int column) {
    super(row, column);
    this.left = left;
  }

  public Expression getLeft() {
    return left;
  }

  public void setLeft(Expression left) {
    this.left = left;
  }

  public Expression getOperator() {
    return operator;
  }

  public void setOperator(Expression operator) {
    this.operator = operator;
  }

  public Expression getRight() {
    return right;
  }

  public void setRight(Expression right) {
    this.right = right;
  }

  public String toString() {
    if (right == null) {
      return left.toString();
    }
    return left.toString() + " " + operator.toString() + " " + right.toString();
  }
}
