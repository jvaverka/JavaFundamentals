import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

/**
 * UserLoader
 */
public class UserLoader {

  public static Vector loadUsersInVector(String pathToFile)
      throws IOException {

    Vector users = new Vector();

    BufferedReader lineReader = new BufferedReader(new FileReader(pathToFile));
    CSVReader reader = new CSVReader(lineReader);
    try {
      String[] row = null;
      while ( (row = reader.readRow()) != null ) {
        users.add(User.fromValues(row));
      }
    } finally {
      System.out.println(users.size() + " users loaded.");
    }

    return users;
  }
}
