package DAA_Sorting;

public class Insertion_sort {
    static void InsertionSort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 15, 1, 6, 31, 2, 5, 12 };
        int n = arr.length;
        InsertionSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }

    }
}
