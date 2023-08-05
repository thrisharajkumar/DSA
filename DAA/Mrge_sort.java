package DAA_Sorting;

import java.util.ArrayList;

public class Mrge_sort {

    // Merge two sorted subarrays into a single sorted subarray
    static void Merge(int arr[], int start, int end) {
        int i = start; // Left subarray index
        int mid = (start + end) / 2; // Middle index
        int j = mid + 1; // Right subarray index
        ArrayList<Integer> temp = new ArrayList<>(); // Temporary ArrayList to store the merged subarray

        // Merge the two sorted subarrays into the temporary ArrayList
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i++]);
            } else {
                temp.add(arr[j++]);
            }
        }

        // If there are any remaining elements in the left subarray, add them to the
        // temporary ArrayList
        while (i <= mid) {
            temp.add(arr[i++]);
        }

        // If there are any remaining elements in the right subarray, add them to the
        // temporary ArrayList
        while (j <= end) {
            temp.add(arr[j++]);
        }

        // Copy the elements from the temporary ArrayList back to the original array
        int k = 0;
        for (int index = start; index <= end; index++) {
            arr[index] = temp.get(k++);
        }
    }

    // Merge sort function to recursively divide the array and merge back in sorted
    // order
    static void MergeSort(int arr[], int start, int end) {
        // Base Case: If the subarray has one or no elements, it is already sorted.
        if (start >= end) {
            return;
        }

        // Calculate the middle index to divide the array into two halves
        int mid = (start + end) / 2;

        // Recursively sort the left and right halves
        MergeSort(arr, start, mid);
        MergeSort(arr, mid + 1, end);

        // Merge the sorted left and right halves
        Merge(arr, start, end);
    }

    public static void main(String[] args) {
        int arr[] = { 15, 1, 6, 31, 2, 5, 12 };
        int n = arr.length;

        // Call the MergeSort function to sort the array
        MergeSort(arr, 0, n - 1);

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
