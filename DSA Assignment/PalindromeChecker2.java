import java.util.Scanner;

public class PalindromeChecker2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Base case: If the string is empty or has only one character, it's a palindrome
        if (str.isEmpty() || str.length() == 1) {
            return true;
        }

        // Compare first and last characters, and check the remaining substring recursively
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        if (firstChar != lastChar) {
            return false; // Not a palindrome if first and last characters don't match
        }

        // Recursive case: Check if the substring excluding first and last characters is a palindrome
        String remainingSubstring = str.substring(1, str.length() - 1);
        return isPalindrome(remainingSubstring);
    }
}
