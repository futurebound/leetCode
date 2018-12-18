// difficult: easy
// https://leetcode.com/problems/palindrome-number/
// Determine whether an integer is a palindrome. An integer is a palindrome
// when it reads the same backward as forward.

// TODO: make a faster solution, not using String concatenation
class PalindromeNumber {
   public boolean isPalindrome(int n) {
      if (n < 0)
         return false;
      else if (n < 10)
         return true;

      String s = n + "";
      while (s.length() > 1) {
         if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
         }
         s = s.substring(1, s.length() - 1);
      }
      return true;
   }
}