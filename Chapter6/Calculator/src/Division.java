public class Division extends Operator {
  public Division() {
    this.sign = "/";
  }

  @Override
  public double operate(double x, double y) {
    return x / y;
  }

  public static void main(String[] args) {
    Division div = new Division();
  }
}
