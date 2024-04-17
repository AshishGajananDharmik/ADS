import java.util.Scanner;

public class ArrayMeanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        double mean = calculateMean(array, size);
        System.out.println("The mean of the array is: " + mean);

        scanner.close();
    }

    public static double calculateMean(int[] array, int size) {
        // Base case: If the array is empty, mean is undefined (return 0)
        if (size == 0) {
            return 0;
        }

        // Recursive case: Calculate sum of array elements and call recursively for smaller array
        double sum = array[size - 1] + calculateMean(array, size - 1);

        // Mean = Sum of array elements / Number of elements
        return sum / size;
    }
}
