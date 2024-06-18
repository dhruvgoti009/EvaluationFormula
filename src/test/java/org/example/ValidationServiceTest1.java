package org.example;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class ValidationServiceTest1 {

  @Test
  void Sum() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("5", "NUMBER"));
    String input = "SUM(A1,10)";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();

    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void SumAlter() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("10", "NUMBER"));
    String input = "A1+10+20.333+SUM(10,A1,9899)";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }


  @Test
  void SubtractAlter() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("4", "NUMBER"));
    String input = "10-2+3-78+SUM(A1,20)-33";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void Multiply() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("12", "NUMBER"));
    variable.put("A2", new Node("10", "NUMBER"));
    String input = "MULTIPLY(A1*A2) + 3 * 4 + SUM(2,3*4)";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void MultiplyAlter() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("3", "NUMBER"));
    variable.put("A2", new Node("1", "NUMBER"));
    String input = "A1*A2 + 3 * 4 + SUM(2,3*4)";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }


  @Test
  void Product() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("2", "NUMBER"));
    variable.put("A2", new Node("4", "NUMBER"));
    String input = "A1*A2 + PRODUCT(2,3,4,5) + SUM(2,3*4)";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void Quotient() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("24", "NUMBER"));
    variable.put("A2", new Node("70", "NUMBER"));
    String input = "QUOTIENT(2,SUM(3,4+PRODUCT(1,2)))";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void Divide() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("10", "NUMBER"));
    variable.put("A2", new Node("15", "NUMBER"));
    String input = "A1/A2";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void Max() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("1089", "NUMBER"));
    variable.put("A2", new Node("256267", "NUMBER"));
    String input = "MAX(SUM(1,2)+QUOTIENT(2,3),MAX(3,4))";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void Min() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("78675", "NUMBER"));
    variable.put("A2", new Node("87676.765656", "NUMBER"));
    String input = "MIN(2,3,4,5,6)";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void Mean() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("0", "NUMBER"));
    variable.put("A2", new Node("1", "NUMBER"));
    String input = "MEAN(A1,A2,3,4) + 10 + 15 + MEAN(MAX(2,3),MIN(1,2))";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void AVERAGE() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("12", "NUMBER"));
    variable.put("A2", new Node("1", "NUMBER"));
    String input = "AVERAGE(2,3,4,5,6,7,8,9,10.1e10)";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void If() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("12", "NUMBER"));
    variable.put("A2", new Node("10", "NUMBER"));
    String input = "IF(2<3,\"djgh\",\"jdhg\")";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void Ifs() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("15", "NUMBER"));
    variable.put("A2", new Node("10", "NUMBER"));
    variable.put("A3", new Node("Hello", "TEXT"));
    String input = "IFS(A3<\"wjgh\",4675,3<4,565)";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void Substitute() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("Sprinklr", "TEXT"));
    variable.put("A2", new Node("Fear", "TEXT"));
    String input = "SUBSTITUTE(A1,\"whdbh\",IF(2<3,A2,A1))";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void Exact() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("Sprinklr", "TEXT"));
    variable.put("A2", new Node("Fear", "TEXT"));
    String input = "EXACT(\"jwgj\",A1)";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void Concatenate() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("Hello", "TEXT"));
    variable.put("A2", new Node("10", "NUMBER"));
    String input = "CONCATENATE(2,3,\"hdgh\",IF(2<3,\"jefgbh\",232))";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void ConcatenateAlter() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("Hello", "TEXT"));
    variable.put("A2", new Node("Guys", "DATE"));
    String input = "A1&A2 & PRODUCT(2,3,4,5) + SUM(2,3*4)";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void Today() {
    Map<String, Node> variable = new HashMap<>();
    String input = "TODAY.DATE()";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void DateAdd() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("17/06/2024", "DATE"));
    variable.put("A2", new Node("4", "NUMBER"));
    String input = "DATE.ADD(TODAY.DATE(),A2)";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void SubtractDate() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("2", "NUMBER"));
    variable.put("A2", new Node("17/06/2024", "DATE"));
    String input = "DATE.SUBTRACT(A2,A1)";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void Duration() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("12/03/2024", "DATE"));
    variable.put("A2", new Node("15/02/2024", "DATE"));
    String input = "DURATION(A1,A2)";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void test1() {
    Map<String, Node> variable = new HashMap<>();
    String input = "SUM(2,3+4,5-7+8/3,IF(EXACT(\"jkueh\",\"jkueh\"),MAX(2,3),MIN(4,5)),QUOTIENT(10,2),MEAN(2,3,4,5))";
//    Expression in fileName : SUM(2,3+4,5-7+8/3,IF(EXACT(\"jkueh\",\"jkueh\"),MAX(2,3),MIN(4,5)),QUOTIENT(10,2),MEAN(2,3,4,5))
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void test2() {
    Map<String, Node> variable = new HashMap<>();
    String input = "CONCATENATE(\"The result is: \", SUM(1, 2, MULTIPLY(2, 3)), \" and the max is \", MAX(1, 5, 3))";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void test3() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("17/06/2024", "DATE"));
    String input = "IF(EXACT(TODAY.DATE(),DATE.ADD(A1, 30)), SUM(1, 2, 3), MULTIPLY(2, 3, 4))";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void test4() {
    Map<String, Node> variable = new HashMap<>();
    String input = "IF(EXACT(\"test\", \"test\"), CONCATENATE(\"Today's date is \", TODAY.DATE()), \"Hello\")";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void test5() {
    Map<String, Node> variable = new HashMap<>();
    String input = "MAX(3,4,MIN(4,5),IFS(4<3,232,CONCATENATE(3,4,IF(2<3,\"jeb\",9387849))<\"kdnj\",23))";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void test6() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A4", new Node("17/06/2024", "DATE"));
    String input = "IFS(\"jcj\">\"sjbcbj\",MAX(2,3),EXACT(TODAY.DATE(),A4),MULTIPLY(4,3,2+4))";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void test7() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A3", new Node("False", "BOOLEAN"));
    String input = "IF(MAX(3,1+2)<MIN(MAX(0,1),4/2),\"Wrong\",IFS(3<4,\"Wrong\",A3,SUBSTITUTE(\"Hello World\",\"World\",\"Sprinklr\")))";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void test8() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("12/02/2021", "DATE"));
    String input = "DATE.SUBTRACT(DATE.ADD(A1, 30), 15)";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void test9() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("22/02/2022", "DATE"));
    variable.put("A2", new Node("25/03/2022", "DATE"));
    String input = "DURATION(A1, DATE.ADD(A2, 5))";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void test10() {
    Map<String, Node> variable = new HashMap<>();
    String input = "MAX(QUOTIENT(10, 2), SUM(3, 5, MULTIPLY(2, 3)), MIN(8, 4, 6))";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }


  @Test
  void test11() {
    Map<String, Node> variable = new HashMap<>();
    String input = "IF(SUM(3, 4) > 6, AVERAGE(3, 6, 9), PRODUCT(2, 3, 4))";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void test12() {
    Map<String, Node> variable = new HashMap<>();
    String input = "SUBSTITUTE(CONCATENATE(\"The quick \", \"brown fox\"), \"brown\", \"red\")";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void test13() {
    Map<String, Node> variable = new HashMap<>();
    String input = "CONCATENATE(\"Sum: \", SUM(1, 2, 3), \" Max: \", MAX(3, 4, 5))";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void test14() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A4", new Node("17/06/2024", "DATE"));
    String input = "DATE.ADD(A4, 5)";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void test15() {
    Map<String, Node> variable = new HashMap<>();
    String input = "SUM(5, 3, PRODUCT(2, 4), 1 + 2 * 3)";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }


  @Test
  void test16() {
    Map<String, Node> variable = new HashMap<>();
    String input = "CONCATENATE(\"Hello\", \" \", SUBSTITUTE(\"World\", \"o\", \"a\"))";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();
    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  @Test
  void test17() {
    Map<String, Node> variable = new HashMap<>();
    variable.put("A1", new Node("5", "NUMBER"));
    variable.put("A2", new Node("Hi", "TEXT"));
    variable.put("A3", new Node("18/06/2024", "DATE"));
    variable.put("A4", new Node("True", "BOOLEAN"));
    String input = "SUBSTITUTE(\"Sello\",\"S\",\"H\")";
    ValidationService obj = new ValidationService();
    try {
      List<ValidationError> ans = obj.validation(variable, input);
      assert !ans.get(0).result.isEmpty();

    } catch (IOException e) {
      System.out.println("Input/Output Exception");
    }
  }

  void print(List<ValidationError> ans) {
    for (ValidationError i : ans) {
      if(i.result!=null)
      {
        System.out.println(i.result);
        System.out.println(i.dataType);
      }

    }

    for (ValidationError i : ans) {
      if (i.error!=null) {
        System.out.println(i.error);
        System.out.println(i.line);
      }
    }
  }

}