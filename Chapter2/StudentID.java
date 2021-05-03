import java.util.Scanner;

public class StudentID {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Please enter your name: ");
    String name = sc.nextLine();
    System.out.printf("Please enter your school: ");
    String school = sc.nextLine();
    System.out.printf("Please enter your age: ");
    int age = sc.nextInt();
    System.out.println("Here is your ID");
    System.out.println("******************************");
    System.out.println("Name: " + name);
    System.out.println("University: " + school);
    System.out.println("Age: " + age);
    System.out.println("******************************");
  }
}
