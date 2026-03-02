import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class PalindromeCheckerApp {

   public static void main(String[] args) {

      // Given string
      String word = "level";

      // Create Stack (LIFO)
      Stack<Character> stack = new Stack<>();

      // Create Queue (FIFO)
      Queue<Character> queue = new LinkedList<>();

      // Enqueue and Push characters
      for (int i = 0; i < word.length(); i++) {
         char ch = word.charAt(i);
         stack.push(ch);     // LIFO
         queue.add(ch);      // FIFO (Enqueue)
      }

      boolean isPalindrome = true;

      // Compare dequeue vs pop
      while (!stack.isEmpty()) {
         if (stack.pop() != queue.remove()) { // remove() = Dequeue
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