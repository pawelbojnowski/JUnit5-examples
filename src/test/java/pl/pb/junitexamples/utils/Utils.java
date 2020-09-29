package pl.pb.junitexamples.utils;

public class Utils {

  public static int multiply(int value1, int value2) {
    return value1 * value2;
  }

  public static boolean isPalindrome(String text) {
    String cleaned = text.replaceAll("\\s+", "").toLowerCase();
    StringBuilder cloned = new StringBuilder(cleaned);
    String reversed = cloned.reverse().toString();
    return reversed.equals(cleaned);
  }

}
