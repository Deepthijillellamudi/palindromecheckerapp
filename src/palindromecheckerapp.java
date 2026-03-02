import java.util.Deque;
import java.util.ArrayDeque;

class PalindromeCheckerApp {

   public static void main(String[] args) {

      // Given string
      String word = "radar";

      // Create Deque
      Deque<Character> deque = new ArrayDeque<>();

      // Insert characters into deque
      for (int i = 0; i < word.length(); i++) {
         deque.addLast(word.charAt(i));   // insert at rear
      }

      boolean isPalindrome = true;

      // Compare front and rear
      while (deque.size() > 1) {
         char front = deque.removeFirst();  // remove from front
         char rear = deque.removeLast();    // remove from rear

         if (front != rear) {
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