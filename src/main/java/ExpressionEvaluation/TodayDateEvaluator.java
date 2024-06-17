package ExpressionEvaluation;

import FormulaGrammar.Expression;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.example.Node;

public class TodayDateEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    return new Node(getTodayDate(), "DATE");
  }

  private String getTodayDate() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate today = LocalDate.now();
    return today.format(formatter);
  }
}

