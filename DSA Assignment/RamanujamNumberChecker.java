import java.util.Scanner;

public class RamanujamNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isRamanujamNumber(number)) {
            System.out.println(number + " is a Ramanujam number.");
        } else {
            System.out.println(number + " is not a Ramanujam number.");
        }

        scanner.close();
    }

    public static boolean isRamanujamNumber(int num) {
        // Find all pairs of numbers whose cubes sum up to 'num'
        for (int i = 1; i * i * i < num; i++) {
            int cube1 = i * i * i;
            for (int j = i + 1; j * j * j < num; j++) {
                int cube2 = j * j * j;
                if (cube1 + cube2 == num) {
                    return true; // Ramanujam number found
                }
            }
        }

        return false; // No Ramanujam number found
    }
}
