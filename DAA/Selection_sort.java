package DAA_Sorting;

public class Selection_sort {

    static void selectionsort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                // i+1 because first element is being compared
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // swap the min to the ith element
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 15, 1, 6, 31, 2, 5, 12 };
        int n = arr.length;
        selectionsort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }

    }
}
