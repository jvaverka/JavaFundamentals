import java.util.Scanner;

public class TemperatureSystem {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  String temp;
  String weatherWarning;

  System.out.println("*** TemperatureSystem ***");
  System.out.println("1. High");
  System.out.println("2. Low");
  System.out.println("3. Humid");
  System.out.printf("Please select your temp: ");
  int tempSelection = sc.nextInt();

  switch (tempSelection) {
    case 1:
      temp = "The temp is high.";
      weatherWarning = "Maybe put on sunblock.";
      break;
    case 2:
      temp = "The temp is low.";
      weatherWarning = "Maybe wear a coat.";
      break;
    case 3:
      temp = "The weather is humid.";
      weatherWarning = "Maybe open the windows.";
      break;
    default:
      temp = "The weather is good.";
      weatherWarning = "Take a walk outside.";
  }

  System.out.println(temp + " " + weatherWarning);
  sc.close();
  }
}
