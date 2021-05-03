import java.util.Scanner;

public class SalaryCalculator {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  double workingHours;
  double salary;

  System.out.printf("Please enter your working hours: ");
  workingHours = sc.nextDouble();

  if (workingHours < 8) {
    salary = workingHours * 10;
  } else if (workingHours >= 8 && workingHours < 12) {
    salary = (8 * 10) + ((workingHours - 8) * 12);
  } else {
    salary = 16 * 10;
  }

  System.out.println("Salary calculated: " + salary);
  sc.close();
  }
}
