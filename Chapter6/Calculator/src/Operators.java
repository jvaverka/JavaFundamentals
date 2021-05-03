public class Operators {
  final static Operator default_operator = new Operator();
  final static Operator[] operators = { 
    new Operator(), 
    new Subtraction(), 
    new Multiplication(), 
    new Division() 
  };

  public static Operator findOperator(String sign) {
    for (Operator op : operators) {
      if (op.matches(sign)) {
        return op;
      }
    }
    return default_operator;
  }
}
