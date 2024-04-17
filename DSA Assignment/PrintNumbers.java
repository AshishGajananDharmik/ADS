import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        printNumbersRecursively(1, n);

        scanner.close();
    }

    public static void printNumbersRecursively(int start, int end) {
        if (start > end) {
            return;
        }

        System.out.println(start);
        printNumbersRecursively(start + 1, end);
    }
}
