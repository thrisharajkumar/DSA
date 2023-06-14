package Recursion.Assignment_2;

public class SearchFromLast {
    /*
     * Search element in an array from last index
     * i/p : arr[] = {20,90,1,90,6}, num = 90
     * o/p : 3
     */
    public static int searchFromLast(int[] arr, int num) {
        return searchFromLast(arr, num, arr.length - 1);
    }

    private static int searchFromLast(int[] arr, int num, int index) {
        if (index < 0) {
            return -1; // Element not found
        }

        if (arr[index] == num) {
            return index; // Element found
        }

        return searchFromLast(arr, num, index - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 20, 90, 1, 6, 90, 6 };
        int num = 90;

        int result = searchFromLast(arr, num);

        System.out.println("Index of " + num + " from the last: " + result);
    }
}
