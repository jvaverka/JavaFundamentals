import java.util.Scanner;

public class PeachCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Enter the number of peaches picked: ");
    int numberOfPeaches = sc.nextInt();
    int numberOfFullBoxes = numberOfPeaches / 20;
    int numberOfPeachesLeft = numberOfPeaches % 20;
    System.out.println("We have "+numberOfFullBoxes+" full boxes and "+numberOfPeachesLeft+" peaches left.");
  }
}
