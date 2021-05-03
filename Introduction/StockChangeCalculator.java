import java.util.Scanner;

public class StockChangeCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Enter the stock symbol: ");
    String company = sc.nextLine();
    System.out.printf("Enter %s's day 1 value: ", company);
    float day1 = sc.nextFloat();
    System.out.printf("Enter %s's day 2 value: ", company);
    float day2 = sc.nextFloat();
    System.out.printf("%s has changed %.2f%% in one day.%n", company, ((day2-day1)/day1)*100);
    sc.close();
  }
}
