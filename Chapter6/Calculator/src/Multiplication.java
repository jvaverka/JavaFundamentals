public class Multiplication extends Operator {
  public Multiplication() {
    this.sign = "*";
  }

  @Override
  public double operate(double x, double y) {
    return x * y;
  }

  public static void main(String[] args) {
    Multiplication mul = new Multiplication();
  }
}
