import java.io.IOException;
import java.util.Vector;

/**
 * ReadUsersIntoVector
 */
public class ReadUsersIntoVector {

  public static void main (String[] args) throws IOException {
    Vector users = UserLoader.loadUsersInVector(args[0]);
    System.out.println(users.size());
  }
}
