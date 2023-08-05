package DAA_Sorting;

public class Counting_Sort {

    static void countSort(int arr[], int n) {
        // Step 1: Find the maximum element in the array
        int max = arr[0];
        int i;
        int output[] = new int[n];
        for (i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Create an auxiliary array 'count' to store the count of each element
        // Initialize all elements of the 'count' array to 0
        int count[] = new int[max + 1];
        for (i = 0; i <= max; i++) {
            count[i] = 0;
        }

        // Step 3: Count the occurrences of each element in the original array
        for (i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Step 4: Compute the cumulative sum of the 'count' array (Prefix sum)
        for (i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Step 5: Build the output array by placing elements at their correct positions
        // based on the cumulative count array
        // (Note: We start iterating the original array from the end to maintain
        // stability)
        for (i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Step 6: Copy the sorted elements back to the original array 'arr'
        for (i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 15, 1, 6, 31, 2, 5, 12 };
        int n = arr.length;

        // Step 7: Call the Counting Sort function to sort the array
        countSort(arr, n);

        // Step 8: Print the sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
