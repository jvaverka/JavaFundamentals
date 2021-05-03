public class Operator {
  String sign;

  public Operator() {
    this.sign = "+";
  }

  public Operator(String op) {
    if (op == "+")
      this.sign = "+";
  }

  public Boolean matches(String s){
    return this.sign == s;
  }

  public double operate(double x, double y) {
    return x + y;
  }
}
