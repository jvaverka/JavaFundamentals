import java.util.Scanner;

public class PeachAutomation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Enter the number of peaches picked: ");
    int numberOfPeaches = sc.nextInt();
    int boxesShipped = 0;
    while (numberOfPeaches >= 20) {
      boxesShipped++;
      numberOfPeaches -= 20;
      System.out.printf("%d boxes shipped, %d peaches remaining%n", boxesShipped, numberOfPeaches);
    } 
    sc.close();
  }
}
