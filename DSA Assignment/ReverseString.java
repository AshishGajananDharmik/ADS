import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String reversedString = reverse(inputString);
        System.out.println("The reverse of the string is: " + reversedString);

        scanner.close();
    }

    public static String reverse(String str) {
        // Base case: If the string is empty or has only one character, its reverse is the string itself
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        // Recursive case: Return the last character + reverse of the substring excluding the last character
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
}
