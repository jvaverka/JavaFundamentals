import java.io.BufferedReader;
import java.io.IOException;

/**
 * CSVReader
 */
public class CSVReader {

  private final BufferedReader reader;
  private int lineCount = 0;

  public CSVReader(BufferedReader reader) throws IOException {
    this.reader = reader;

    // ignore header
    reader.readLine();
  }

  public void close() throws IOException {
    this.reader.close();
  }

  public String[] readRow() throws IOException {
    String line = reader.readLine();

    if (line == null) {
      return null;
    }
    lineCount++;

    return line.split(",");
  }

  public int getLineCount() {
    return lineCount;
  }
}
