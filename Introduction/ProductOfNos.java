import java.io.IOException;

public class ProductOfNos {
  public static void main(String[] args) {
    System.out.println("Enter the first number");
    int var1 = Integer.parseInt(System.console().readLine());
    System.out.println("Enter the second number");
    int var2 = Integer.parseInt(System.console().readLine());
    System.out.printf("The product of the two numbers is %d%n", (var1 * var2));
  }
}
