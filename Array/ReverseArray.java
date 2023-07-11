public class ReverseArray {
    /*
     * Reverse an Array
     * i/p : arr[] = {1,4,6,9,10}
     * o/p : {10,9,6,4,1}
     */
    // Two pointers approach
    static void reverse(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        int temp;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 6, 9, 10 };
        reverse(arr);
        // Print the reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
