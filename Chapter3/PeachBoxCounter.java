import java.util.Scanner;

public class PeachBoxCounter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numberOfPeaches;

    System.out.printf("Enter the number of peaches picked: "); 
    numberOfPeaches = sc.nextInt();

    for (int peachesShipped = 0; numberOfPeaches >= 20; numberOfPeaches-=20) {
      peachesShipped += 20;
      System.out.println("shipped " + peachesShipped + " peaches so far");
    }

    sc.close();
  }
}
