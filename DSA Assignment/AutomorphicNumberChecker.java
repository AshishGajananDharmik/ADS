import java.util.Scanner;

public class AutomorphicNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isAutomorphicNumber(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }

        scanner.close();
    }

    public static boolean isAutomorphicNumber(int num) {
        int square = num * num;

        while (num > 0) {
            if (num % 10 != square % 10) {
                return false; // Last digit doesn't match
            }
            num /= 10;
            square /= 10;
        }

        return true;
    }
}
