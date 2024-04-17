import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int length = calculateLength(inputString);
        System.out.println("The length of the string is: " + length);

        scanner.close();
    }

    public static int calculateLength(String str) {
        // Base case: If the string is empty, its length is 0
        if (str.isEmpty()) {
            return 0;
        }

        // Recursive case: Return 1 + length of the substring excluding the first character
        return 1 + calculateLength(str.substring(1));
    }
}
