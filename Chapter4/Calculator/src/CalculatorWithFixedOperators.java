public class CalculatorWithFixedOperators {
  final String add = "+";
  final String sub = "-";
  final String div = "/";
  final String mul = "*";
  double operand1;
  double operand2;
  Operator operator;

  public CalculatorWithFixedOperators(double op1, double op2, Operator op) {
    this.operand1 = op1;
    this.operand2 = op2;
    this.operator = op;
  }

  public static void main(String[] args) {
    System.out.println("******** add ********");
    CalculatorWithFixedOperators add1 = 
      new CalculatorWithFixedOperators(1.0, 2.0, new Operator());
    System.out.println(add1.operator.operate(add1.operand1, add1.operand2));
    CalculatorWithFixedOperators add2 = 
      new CalculatorWithFixedOperators(1.0, 2.0, new Operator("+"));
    System.out.println(add2.operator.operate(add2.operand1, add2.operand2));
    System.out.println("******** sub ********");
    CalculatorWithFixedOperators sub1 = 
      new CalculatorWithFixedOperators(1.0, 2.0, new Subtraction());
    System.out.println(sub1.operator.operate(sub1.operand1, sub1.operand2));
    System.out.println("******** div ********");
    CalculatorWithFixedOperators div1 = 
      new CalculatorWithFixedOperators(1.0, 2.0, new Division());
    System.out.println(div1.operator.operate(div1.operand1, div1.operand2));
    System.out.println("******** mul ********");
    CalculatorWithFixedOperators mul1 = 
      new CalculatorWithFixedOperators(1.0, 2.0, new Multiplication());
    System.out.println(mul1.operator.operate(mul1.operand1, mul1.operand2));
  }
}
