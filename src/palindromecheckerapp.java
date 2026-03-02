cclass PalindromeCheckerApp {

public static void main(String[] args) {

   String input = "A man a plan a canal Panama";

   // Normalize string (remove spaces & convert to lowercase)
   String normalized = input.replaceAll("\\s+", "").toLowerCase();

   // Check palindrome using two-pointer approach
   boolean isPalindrome = true;
   int start = 0;
   int end = normalized.length() - 1;

   while (start < end) {
      if (normalized.charAt(start) != normalized.charAt(end)) {
         isPalindrome = false;
         break;
      }
      start++;
      end--;
   }

   // Print result
   if (isPalindrome) {
      System.out.println("\"" + input + "\" is a Palindrome (Ignoring case & spaces).");
   } else {
      System.out.println("\"" + input + "\" is NOT a Palindrome.");
   }
}
}