import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * IncreaseOnEachRead
 */
public class IncreaseOnEachRead {

  public static void main (String[] args) throws IOException {
    User[] users = loadUsers(args[0]);
    System.out.println(users.length);
  }

  public static User[] loadUsers(String fileToReadFrom) throws IOException {
    User[] users = new User[0];

    BufferedReader lineReader = new BufferedReader(new FileReader(fileToReadFrom));
    CSVReader reader = new CSVReader(lineReader);
    try {
      String [] row = null;
      while ( (row = reader.readRow()) != null ) {
        // increase array size by one
        // create new array
        User[] newUsers = new User[users.length + 1];
        // copy data over
        System.arraycopy(users, 0, newUsers, 0, users.length);
        // swap
        users = newUsers;

        users[users.length - 1] = User.fromValues(row);
      }
    } finally {
      System.out.println("Done reading csv.");
    }

    return users;
  }
}
