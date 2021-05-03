public class Calculator {
  double operand1;
  double operand2;
  String operator;

  public Calculator(double op1, double op2, String op) {
    this.operand1 = op1;
    this.operand2 = op2;
    this.operator = op;
  }

  public String operate() {
    switch (this.operator) {
      case "+":
        return String.valueOf(this.operand1) + " + " + String.valueOf(this.operand2) + " = " + String.valueOf(this.operand1 + this.operand2);
      case "-":
        return String.valueOf(this.operand1) + " - " + String.valueOf(this.operand2) + " = " + String.valueOf(this.operand1 - this.operand2);
      case "*":
        return String.valueOf(this.operand1) + " * " + String.valueOf(this.operand2) + " = " + String.valueOf(this.operand1 * this.operand2);
      case "/":
        return String.valueOf(this.operand1) + " / " + String.valueOf(this.operand2) + " = " + String.valueOf(this.operand1 / this.operand2);
      default:
        return "Not sure how to perform this calculation.";
    }
  }

  public static void main(String[] args) {
    Calculator c1 = new Calculator(1, 2, "+");
    Calculator c2 = new Calculator(1, 2, "-");
    Calculator c3 = new Calculator(1, 2, "*");
    Calculator c4 = new Calculator(1, 2, "/");

    System.out.println(c1.operate());
    System.out.println(c2.operate());
    System.out.println(c3.operate());
    System.out.println(c4.operate());
  }
}
