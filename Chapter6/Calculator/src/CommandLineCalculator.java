import java.util.Scanner;

public class CommandLineCalculator {
  double operand1;
  double operand2;
  Operator operator;

  public CommandLineCalculator(double op1, double op2, String op) {
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
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to the CommandLineCalculator!");
    System.out.println();
    String keepCalculating;

    do {
      System.out.print("Enter the first operand: ");
      double first = sc.nextDouble();
      System.out.print("Enter an operator: ");
      String op = sc.next();
      System.out.print("Enter the second operand: ");
      double second = sc.nextDouble();

      System.out.println(new CommandLineCalculator(first, second, op).operate());

      System.out.println("To quit the program type 'q' or 'Q'");
      System.out.println("To continue type 'c' or 'C'");
      System.out.println();
      keepCalculating = sc.next();

      
    } while (keepCalculating != "q" || keepCalculating != "Q");
  }
}
