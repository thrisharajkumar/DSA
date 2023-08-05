package Recursion.Assignment;

public class SearchAllIndexes {
    static int[] search(int arr[], int index, int search, int count) {
        /*
         * Return an array containing all indexes where element occur
         * i/p : arr[] = {20,5,6,0,5,9,5}, num=5
         * o/p : [1,4,6]
         */

        // Base case
        if (index == (arr.length - 1)) {
            int a[] = new int[count];
            return a;
        }
        int arr_2[] = null;
        if (arr[index] == search) {
            arr_2 = search(arr, index + 1, search, count + 1);
        } else {
            arr_2 = search(arr, index + 1, search, count);
        }
        if (arr[index] == search) {
            arr_2[count] = index;
        }
        return arr_2;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 6, 8, 9, 3, 3, 7 };
        int element = 3;
        int output[] = search(arr, 0, element, 0);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + ",");
        }
    }
}
