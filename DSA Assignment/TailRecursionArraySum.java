import java.util.Scanner;

public class TailRecursionArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = calculateSum(array, 0, size);
        System.out.println("The sum of the array elements is: " + sum);

        scanner.close();
    }

    public static int calculateSum(int[] array, int index, int size) {
        if (index >= size) {
            return 0; // Base case: Return 0 if index exceeds or equals size
        }

        // Tail recursive case: Add current element and call recursively for next index
        return array[index] + calculateSum(array, index + 1, size);
    }
}
