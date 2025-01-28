import java.util.Scanner;

public class Palindrome {

  public static boolean isPalindrome(String s) {

    String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    int left = 0, right = cleaned.length() - 1;
    while (left < right) {
      if (cleaned.charAt(left) != cleaned.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = sc.nextLine();
    if (isPalindrome(s)) {
      System.out.println("The string \"" + s + "\" is a palindrome.");
    } else {
      System.out.println("The string \"" + s + "\" is not a palindrome.");
    }
    sc.close();
}
}
