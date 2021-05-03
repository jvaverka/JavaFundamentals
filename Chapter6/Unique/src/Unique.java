import java.lang.StringBuilder;

public class Unique {
  public static String removeDups(String s) {
    if (s.isEmpty() || s.isBlank() || s.length() == 1 || s == null) {
      return s;
    }
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      boolean isDuplicate = false;
      for (int j = 0; j < result.length(); j++) {
        char d = result.charAt(j);
        if (c == d) {
          isDuplicate = true;
          break;
        }
      }
      if (!isDuplicate) {
        result.append(c);
      }
    }
    return result.toString();
  }

  public static void main(String[] args)  {
    String test1 = "aaaaaaa";
    String test2 = "aaabbbbb";
    String test3 = "abcdefgh";
    String test4 = "Ju780iu6G768";

    System.out.println(removeDups(test1));
    System.out.println(removeDups(test2));
    System.out.println(removeDups(test3));
    System.out.println(removeDups(test4));
  }
}
