import java.util.Stack;

class PalindromeCheckerApp {

   public static void main(String[] args) {

      // Given string
      String word = "racecar";

      // Create Stack
      Stack<Character> stack = new Stack<>();

      // Push characters into stack
      for (int i = 0; i < word.length(); i++) {
         stack.push(word.charAt(i));
      }

      boolean isPalindrome = true;

      // Pop and compare
      for (int i = 0; i < word.length(); i++) {
         if (word.charAt(i) != stack.pop()) {
            isPalindrome = false;
            break;
         }
      }

      // Print result
      if (isPalindrome) {
         System.out.println(word + " is a Palindrome.");
      } else {
         System.out.println(word + " is NOT a Palindrome.");
      }
   }
}