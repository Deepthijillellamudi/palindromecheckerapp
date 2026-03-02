import java.util.*;

public class PalindromePerformanceTest {

   public static void main(String[] args) {

      String input = "A man a plan a canal Panama";
      input = input.replaceAll("\\s+", "").toLowerCase();

      // Reverse String Method
      long start1 = System.nanoTime();
      boolean result1 = reverseMethod(input);
      long end1 = System.nanoTime();

      // Stack Method
      long start2 = System.nanoTime();
      boolean result2 = stackMethod(input);
      long end2 = System.nanoTime();

      // Deque Method
      long start3 = System.nanoTime();
      boolean result3 = dequeMethod(input);
      long end3 = System.nanoTime();

      System.out.println("Reverse Method: " + result1 +
              " | Time: " + (end1 - start1) + " ns");

      System.out.println("Stack Method: " + result2 +
              " | Time: " + (end2 - start2) + " ns");

      System.out.println("Deque Method: " + result3 +
              " | Time: " + (end3 - start3) + " ns");
   }

   // Method 1: Reverse String
   public static boolean reverseMethod(String input) {
      String reversed = "";
      for (int i = input.length() - 1; i >= 0; i--) {
         reversed += input.charAt(i);
      }
      return input.equals(reversed);
   }

   // Method 2: Stack
   public static boolean stackMethod(String input) {
      Stack<Character> stack = new Stack<>();
      for (char ch : input.toCharArray()) {
         stack.push(ch);
      }
      for (char ch : input.toCharArray()) {
         if (ch != stack.pop()) {
            return false;
         }
      }
      return true;
   }

   // Method 3: Deque
   public static boolean dequeMethod(String input) {
      Deque<Character> deque = new ArrayDeque<>();
      for (char ch : input.toCharArray()) {
         deque.addLast(ch);
      }
      while (deque.size() > 1) {
         if (deque.removeFirst() != deque.removeLast()) {
            return false;
         }
      }
      return true;
   }
}