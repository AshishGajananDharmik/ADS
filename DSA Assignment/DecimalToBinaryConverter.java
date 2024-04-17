import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        String binaryNumber = convertToBinary(decimalNumber);
        System.out.println("The binary representation of " + decimalNumber + " is: " + binaryNumber);

        scanner.close();
    }

    public static String convertToBinary(int decimalNumber) {
        // Base case: If the decimal number is 0, its binary representation is "0"
        if (decimalNumber == 0) {
            return "0";
        }

        // Recursive case: Convert the quotient to binary and append the remainder
        String binary = convertToBinary(decimalNumber / 2);
        int remainder = decimalNumber % 2;

        return binary + remainder;
    }
}
