public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Already sorted or empty array
        }

        int n = arr.length;
        int[] temp = new int[n]; // Temporary array for merging

        mergeSort(arr, temp, 0, n - 1);
    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; // Calculate middle index

            // Recursively divide the array into two halves
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid + 1, right);

            // Merge the sorted halves
            merge(arr, temp, left, mid, right);
        }
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        // Copy elements from arr to temp
        System.arraycopy(arr, left, temp, left, right - left + 1);

        int i = left; // Index for the left subarray
        int j = mid + 1; // Index for the right subarray
        int k = left; // Index for the merged array

        // Merge the two sorted subarrays
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from the left subarray (if any)
        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }

        // Copy remaining elements from the right subarray (if any)
        while (j <= right) {
            arr[k] = temp[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

        System.out.println("Original Array:");
        printArray(arr);

        mergeSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
