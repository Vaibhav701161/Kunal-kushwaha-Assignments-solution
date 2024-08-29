// Palindrome Explanation:
// A palindrome is a string that reads the same forward and backward.
// For example, "madam", "racecar", and "level" are palindromes.
// Logic:
// Initialize two pointers:

// One pointer (start) at the beginning of the string.
// Another pointer (end) at the end of the string.
// Compare characters:

// Compare the character at the start pointer with the character at the end pointer.
// If they are the same, move start forward and end backward.
// If they are different, the string is not a palindrome.
// Continue the process until the start pointer is greater than or equal to the end pointer.

// If all characters match, the string is a palindrome.


package Assignment1;
import java.util.Scanner;

public class PalindromeCheck {
          public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string:");
            String str = scanner.nextLine();

            str = str.toLowerCase();

            // initialize two pointers
            int start = 0;
            int end = str.length() - 1;

            boolean inPalindrome = true;
        
            while (start>end){
                if (str.charAt(start) != str.charAt(end)){
                    inPalindrome = false;
                    break;
                }
                start++;
                end--;
            }
            
            if (inPalindrome){
                System.out.println(str + " is a palindrome.");
            }
            else{
                System.out.println(str + " is not a palindrome.");
            }
            scanner.close();
        }
}
