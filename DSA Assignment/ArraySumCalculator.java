import java.util.Scanner;

public class ArraySumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = calculateSum(array, size);
        System.out.println("The sum of the array elements is: " + sum);

        scanner.close();
    }

    public static int calculateSum(int[] array, int size) {
        // Base case: If the array is empty, sum is 0
        if (size == 0) {
            return 0;
        }

        // Recursive case: Calculate sum of elements and call recursively for smaller array
        return array[size - 1] + calculateSum(array, size - 1);
    }
}
