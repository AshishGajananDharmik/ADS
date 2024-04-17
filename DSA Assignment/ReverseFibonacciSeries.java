import java.util.Scanner;

public class ReverseFibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci numbers to print: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci series in reverse order:");
        printReverseFibonacci(n);

        scanner.close();
    }

    public static void printReverseFibonacci(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
