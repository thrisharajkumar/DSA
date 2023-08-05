package DAA_Sorting;

public class Quick_Sort {

    // This function takes the last element as the pivot, places the pivot element
    // at its correct position in the sorted array, and places all elements smaller
    // than the pivot to its left and all elements greater than the pivot to its
    // right.
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // Choose the pivot element (last element in the array)
        int i = low - 1; // Index of the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot,
            // swap arr[i+1] and arr[j].
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // After the loop, the pivot element (arr[high]) should be placed at the correct
        // position, which is (i + 1).
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partition index
    }

    // This function implements the Quick Sort algorithm recursively.
    static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            // Find the partition index (index of correctly placed pivot)
            int partitionIndex = partition(arr, low, high);

            // Recursively sort the left and right subarrays
            quicksort(arr, low, partitionIndex - 1);
            quicksort(arr, partitionIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 15, 1, 6, 31, 2, 5, 12 };
        int n = arr.length;

        // Call the quicksort function to sort the array
        quicksort(arr, 0, n - 1);

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
