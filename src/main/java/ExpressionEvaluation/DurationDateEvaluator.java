package ExpressionEvaluation;

import FormulaGrammar.DurationDate;
import FormulaGrammar.Expression;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import org.example.Node;
import org.example.ValidationError;

public class DurationDateEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    DurationDate expression = (DurationDate) exp;
    Node one = processor.getEvalResult(expression.getDurationDate().get(0));
    Node two = processor.getEvalResult(expression.getDurationDate().get(1));
    if (one.dataType.equals(processor.inValidDataType) || two.dataType.equals(
        processor.inValidDataType)) {
      return new Node("", processor.inValidDataType);
    }
    if (!one.dataType.equals("DATE")) {
      processor.err(expression.getDurationDate().get(0), "DATE", one.dataType);
      return new Node("", processor.inValidDataType);
    }
    if (!two.dataType.equals("DATE")) {
      processor.err(expression.getDurationDate().get(1), "DATE", two.dataType);
      return new Node("", processor.inValidDataType);
    }

    if (!isValidDate(one.value)) {
      processor.semanticErrors.add(
          new ValidationError("Wrong date format expected date format is DD/MM/YY but here "
              + "found " + one.value, expression.getDurationDate().get(0).getColumn()));
      return new Node("", processor.inValidDataType);
    }
    if (!isValidDate(two.value)) {
      processor.semanticErrors.add(
          new ValidationError("Wrong date format expected date format is DD/MM/YY but here "
              + "found " + two.value, expression.getDurationDate().get(1).getColumn()));
      return new Node("", processor.inValidDataType);
    }

    long result = daysBetweenDates(one.value, two.value);

    return new Node(((Long) result).toString(), "NUMBER");
  }

  private boolean isValidDate(String dateStr) {

    try {
      // Parse the date string to LocalDate object
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LocalDate date = LocalDate.parse(dateStr, formatter);
      // Successfully parsed date
      return true;
    } catch (DateTimeParseException e) {
      // Parsing failed, invalid date format
      return false;
    }
  }

  private long daysBetweenDates(String startDateStr, String endDateStr) {
    try {
      // Parse the date strings to LocalDate objects
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LocalDate startDate = LocalDate.parse(startDateStr, formatter);
      LocalDate endDate = LocalDate.parse(endDateStr, formatter);
      // Calculate the number of days between the two dates
      return ChronoUnit.DAYS.between(startDate, endDate);
    } catch (DateTimeParseException e) {
      // If either date string is invalid, return an error value or handle appropriately
      return -1;
    }
  }
}

