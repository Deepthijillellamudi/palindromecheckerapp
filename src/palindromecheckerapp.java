class PalindromeChecker {

   // Method to check palindrome using internal array logic
   public boolean checkPalindrome(String input) {

      if (input == null) {
         return false;
      }

      // Normalize input (optional improvement)
      String normalized = input.replaceAll("\\s+", "").toLowerCase();

      char[] chars = normalized.toCharArray();
      int start = 0;
      int end = chars.length - 1;

      while (start < end) {
         if (chars[start] != chars[end]) {
            return false;
         }
         start++;
         end--;
      }

      return true;
   }
}