import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

/**
 * Wages
 */
public class Wages {

  public static Vector<Adult> loadData(String path) throws IOException {
    Vector<Adult> adults = new Vector<Adult>();

    BufferedReader lineReader = new BufferedReader(new FileReader(path));
    CSVReader reader = new CSVReader(lineReader);
    try {
      String[] row = null;
      while ( (row = reader.readRow()) != null ) {
        adults.add(Adult.fromValues(row));
      }
    } finally {
      System.out.println(adults.size() + " users loaded.");
    }

    return adults;
  }

  public static void main (String[] args) throws IOException {
    Vector<Adult> adults = Wages.loadData("adult_data.csv");

    int minimum = Integer.MAX_VALUE;
    int maximum = Integer.MIN_VALUE;
    int sum = 0;
    for (Adult adult : adults) {
      // check min
      if (adult.income < minimum) {
        minimum = adult.income;
      }
      // check max
      if (adult.income > maximum) {
        maximum = adult.income;
      }
      // add to total
      sum += adult.income;
    }
    double average = sum / adults.size();

    System.out.printf("- stats from %d adults -\n", adults.size());
    System.out.printf("minimum: %d\n", minimum);
    System.out.printf("maximum: %d\n", maximum);
    System.out.printf("sum total: %d\n", sum);
    System.out.printf("sum total: %f\n", average);
  }
}
