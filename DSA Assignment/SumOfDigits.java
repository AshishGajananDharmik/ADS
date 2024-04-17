import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        int sum = calculateSumOfDigits(number);
        System.out.println("The sum of digits of " + number + " is: " + sum);

        scanner.close();
    }

    public static int calculateSumOfDigits(int num) {
        // Base case: If the number is a single digit, its sum is the number itself
        if (num < 10) {
            return num;
        }

        // Recursive case: Calculate the sum of digits and add the last digit
        return num % 10 + calculateSumOfDigits(num / 10);
    }
}
