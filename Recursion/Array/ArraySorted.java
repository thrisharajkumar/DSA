package Recursion.Array;

public class ArraySorted {

    static boolean isSorted(int arr[], int index) {
        /*
         * Check if array is sorted or not
         * i/p : arr[] = {1,2,3,4,5}
         * o/p : true
         */
        // Terminating case
        // Completely traversed or not
        if (arr.length - 1 == index) {
            return true;
        }

        // Processing lgoic
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        // small problem
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        boolean result = isSorted(arr, 0);
        System.out.println(result);

    }
}
