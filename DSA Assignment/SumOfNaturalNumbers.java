import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int sum = calculateSum(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);

        scanner.close();
    }

    public static int calculateSum(int n) {
        if (n <= 0) {
            return 0; // Base case: sum of 0 natural numbers is 0
        }

        // Recursive case: sum of first n natural numbers = n + sum of first (n-1) natural numbers
        return n + calculateSum(n - 1);
    }
}
