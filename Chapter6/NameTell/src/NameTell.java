import java.util.Scanner;

public class NameTell {
  public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Tell me your name:");
    String name = sc.nextLine();
    System.out.println("Your name has " + name.length() + " letters including spaces.");
    System.out.println("The first letter is: " + name.charAt(0));
  }
}
