package Recursion.Array;

public class SearchElement {

    static int search(int arr[], int index, int num) {
        /*
         * Search Element in an array
         * i/p : arr[] = {5,6,9,12,82}, num = 9
         * o/p : 2
         */
        // Terminatig case
        if (arr.length - 1 == index) {
            return -1;
        }
        // processing case
        if (arr[index] == num) {
            return index;
        }
        // small problem
        return search(arr, index + 1, num);

    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 4, 2, 1 };
        int num = 4;
        int index = search(arr, 0, num);
        System.out.println(index);
    }
}
