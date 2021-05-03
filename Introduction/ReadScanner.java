import java.util.Scanner;

public class ReadScanner {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int x = sc.nextInt();
    System.out.println("Enter a second integer: ");
    int y = sc.nextInt();
    System.out.println("The sum is " + (x + y));
    sc.close();
  }
}
