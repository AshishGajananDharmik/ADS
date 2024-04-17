import java.util.Scanner;

public class AmicableNumbersChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (areAmicableNumbers(num1, num2)) {
            System.out.println(num1 + " and " + num2 + " are amicable numbers.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not amicable numbers.");
        }

        scanner.close();
    }

    public static boolean areAmicableNumbers(int num1, int num2) {
        if (num1 <= 0 || num2 <= 0) {
            return false;
        }

        int sumOfDivisorsNum1 = sumOfProperDivisors(num1);
        int sumOfDivisorsNum2 = sumOfProperDivisors(num2);

        return sumOfDivisorsNum1 == num2 && sumOfDivisorsNum2 == num1;
    }

    public static int sumOfProperDivisors(int num) {
        int sum = 1; // Include 1 as a proper divisor

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;

                // If the divisor is not equal to the square root, add its pair
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum;
    }
}
