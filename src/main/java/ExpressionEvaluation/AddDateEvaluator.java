package ExpressionEvaluation;

import FormulaGrammar.AddDate;
import FormulaGrammar.Expression;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import org.example.Node;
import org.example.ValidationError;

public class AddDateEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    AddDate expression = (AddDate) exp;

    Node ID = processor.getEvalResult(expression.getAddDate().get(0));
    Node num = processor.getEvalResult(expression.getAddDate().get(1));
    if (ID.dataType.equals(processor.inValidDataType) || num.dataType.equals(
        processor.inValidDataType)) {
      return new Node("", processor.inValidDataType);
    }

    if (!ID.dataType.equals("DATE")) {
      processor.err(expression.getAddDate().get(0), "DATE", "DATE.ADD()", ID.dataType);
      return new Node("", processor.inValidDataType);
    }

    if (!num.dataType.equals("NUMBER")) {
      processor.err(expression.getAddDate().get(1), "NUMBER", "DATE.ADD()", num.dataType);
      return new Node("", processor.inValidDataType);
    }

    if (!isValidDate(ID.value)) {
      processor.semanticErrors.add(new ValidationError(
          "Wrong date format expected date format is DD/MM/YY but here " + "found " + ID.value,
          expression.getAddDate().get(0).getColumn()));
      return new Node("", processor.inValidDataType);
    }

    if (!isInteger(num.value)) {
      processor.semanticErrors.add(
          new ValidationError("Added value must be an INTEGER format here found " + num.value,
              expression.getAddDate().get(1).getColumn()));
      return new Node("", processor.inValidDataType);
    }

    String result = addDaysToDate(ID.value, Integer.parseInt(num.value));

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

  private String addDaysToDate(String dateStr, int daysToAdd) {
    try {
      // Parse the date string to LocalDate object
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

      LocalDate date = LocalDate.parse(dateStr, formatter);
      // Add the specified number of days
      LocalDate newDate = date.plusDays(daysToAdd);
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

