package DAA_Sorting;

public class Binary_Search {

    static int search(int arr[], int e, int n) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == e) {
                return mid;
            }
            if (arr[mid] < e) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 8, 9, 12, 34 };
        int e = 12;
        int n = arr.length;
        int index = search(arr, e, n);
        System.out.println(index);
    }
}
