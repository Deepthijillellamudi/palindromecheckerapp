import java.util.Stack;

public class StackStrategy implements PalindromeStrategy {

   @Override
   public boolean check(String input) {

      String normalized = input.replaceAll("\\s+", "").toLowerCase();
      Stack<Character> stack = new Stack<>();

      for (char ch : normalized.toCharArray()) {
         stack.push(ch);
      }

      for (char ch : normalized.toCharArray()) {
         if (ch != stack.pop()) {
            return false;
         }
      }

      return true;
   }
}