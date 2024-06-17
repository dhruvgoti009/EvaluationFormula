package ExpressionEvaluation;

import FormulaGrammar.Expression;
import FormulaGrammar.SubtractDate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import org.example.Node;
import org.example.ValidationError;

public class SubtractDateEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    SubtractDate expression = (SubtractDate) exp;
    Node ID = processor.getEvalResult(expression.getSubtractDate().get(0));
    Node num = processor.getEvalResult(expression.getSubtractDate().get(1));
    if (ID.dataType.equals(processor.inValidDataType) || num.dataType.equals(
        processor.inValidDataType)) {
      return new Node("", processor.inValidDataType);
    }
    if (!ID.dataType.equals("DATE")) {
      processor.err(expression.getSubtractDate().get(0), "DATE", "DATE.SUBTRACT", ID.dataType);
      return new Node("", processor.inValidDataType);
    }

    if (!num.dataType.equals("NUMBER")) {
      processor.err(expression.getSubtractDate().get(1), "NUMBER", "DATE.SUBTRACT", num.dataType);
      return new Node("", processor.inValidDataType);
    }

    if (!isValidDate(ID.value)) {
      processor.semanticErrors.add(
          new ValidationError("Wrong date format expected date format is DD/MM/YY but here "
              + "found " + ID.value, expression.getSubtractDate().get(0).getColumn()));
      return new Node("", processor.inValidDataType);
    }

    if (!isInteger(num.value)) {
      processor.semanticErrors.add(
          new ValidationError("Subtracted value must be an INTEGER format here found " + num.value,
              expression.getSubtractDate().get(1).getColumn()));
      return new Node("", processor.inValidDataType);
    }

    String result = subtractDaysToDate(ID.value, Integer.parseInt(num.value));
    return new Node(result, "DATE");
  }

  private boolean isValidDate(String dateStr) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    try {
      // Parse the date string to LocalDate object
      LocalDate date = LocalDate.parse(dateStr, formatter);
      // Successfully parsed date
      return true;
    } catch (DateTimeParseException e) {
      // Parsing failed, invalid date format
      return false;
    }
  }

  private String subtractDaysToDate(String dateStr, int daysToAdd) {
    try {
      // Parse the date string to LocalDate object
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

      LocalDate date = LocalDate.parse(dateStr, formatter);
      // Add the specified number of days
      LocalDate newDate = date.minusDays(daysToAdd);
      // Format the new date back to a string
      return newDate.format(formatter);
    } catch (DateTimeParseException e) {
      // If date string is invalid, return an error message or handle appropriately
      return "Invalid date format";
    }
  }

  private boolean isInteger(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException e) {
      try {
        double d = Double.parseDouble(s);
        return d == Math.floor(d);
      } catch (NumberFormatException ex) {
        return false;
      }
    }
  }


}


