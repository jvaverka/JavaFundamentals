public class CalculatorWithDynamicOperator {
  double operand1;
  double operand2;
  Operator operator;

  public CalculatorWithDynamicOperator(double op1, double op2, String op) {
    this.operand1 = op1;
    this.operand2 = op2;
    this.operator = Operators.findOperator(op);
  }

  public String operate() {
    String result = "";
    result += this.operand1;
    result += " ";
    result += this.operator.sign;
    result += " ";
    result += this.operand2;
    result += " ";
    result += "=";
    result += " ";
    result += this.operator.operate(operand1, operand2);
    return result;
  }

  public static void main(String[] args)  {
    CalculatorWithDynamicOperator calc1 = 
      new CalculatorWithDynamicOperator(1, 1, "+");
    System.out.println(calc1.operate());
    CalculatorWithDynamicOperator calc2 = 
      new CalculatorWithDynamicOperator(1, 1, "-");
    System.out.println(calc2.operate());
    CalculatorWithDynamicOperator calc3 = 
      new CalculatorWithDynamicOperator(1, 1, "*");
    System.out.println(calc3.operate());
    CalculatorWithDynamicOperator calc4 = 
      new CalculatorWithDynamicOperator(1, 1, "/");
    System.out.println(calc4.operate());
    CalculatorWithDynamicOperator calc5 = 
      new CalculatorWithDynamicOperator(1, 1, "#");
    System.out.println(calc5.operate());
  }
}
