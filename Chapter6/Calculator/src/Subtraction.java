public class Subtraction extends Operator {
  public Subtraction() {
    this.sign = "-";
  }

  @Override
  public double operate(double x, double y) {
    return x - y;
  }

  public static void main(String[] args) {
    Subtraction sub = new Subtraction();
  }
}
