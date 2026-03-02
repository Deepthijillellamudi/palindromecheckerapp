class PalindromeCheckerApp {

   // Node class for Singly Linked List
   static class Node {
      char data;
      Node next;

      Node(char data) {
         this.data = data;
         this.next = null;
      }
   }

   public static void main(String[] args) {

      String word = "madam";

      // Convert string to linked list
      Node head = null, tail = null;

      for (int i = 0; i < word.length(); i++) {
         Node newNode = new Node(word.charAt(i));
         if (head == null) {
            head = tail = newNode;
         } else {
            tail.next = newNode;
            tail = newNode;
         }
      }

      // Check palindrome
      if (isPalindrome(head)) {
         System.out.println(word + " is a Palindrome.");
      } else {
         System.out.println(word + " is NOT a Palindrome.");
      }
   }

   // Method to check palindrome using fast & slow pointer
   public static boolean isPalindrome(Node head) {

      if (head == null || head.next == null)
         return true;

      Node slow = head;
      Node fast = head;

      // Find middle using fast & slow pointers
      while (fast != null && fast.next != null) {
         slow = slow.next;
         fast = fast.next.next;
      }

      // Reverse second half
      Node secondHalf = reverse(slow);

      // Compare both halves
      Node firstHalf = head;
      Node temp = secondHalf;

      while (temp != null) {
         if (firstHalf.data != temp.data)
            return false;

         firstHalf = firstHalf.next;
         temp = temp.next;
      }

      return true;
   }

   // In-place reversal of linked list
   public static Node reverse(Node head) {
      Node prev = null;
      Node current = head;
      Node nextNode;

      while (current != null) {
         nextNode = current.next;
         current.next = prev;
         prev = current;
         current = nextNode;
      }

      return prev;
   }
}