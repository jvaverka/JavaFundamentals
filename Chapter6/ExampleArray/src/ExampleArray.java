public class ExampleArray {
  public static void main (String[] args) {
    float[] sample = { 14, 28, 15, 89, 46, 25, 94, 33, 82, 11, 37, 59, 68, 27, 16, 45, 24, 33, 72, 51 };
    float minimum = Float.MAX_VALUE;
    for (float i : sample) {
      if (i < minimum)
        minimum = i;
    }
    System.out.println("Minimum float: " + minimum);
  }
}
