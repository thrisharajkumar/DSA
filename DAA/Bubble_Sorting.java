package DAA_Sorting;

public class Bubble_Sorting {
    static void BUbbleSort(int arr[], int n) {
        boolean flag;
        // if you find the array already sorted
        flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // n-1 beacuse index will be out of bound
                // n-i-1 because in every interation
                // the last element doesnt need to be implemented again
                // as it would be the largest element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 15, 1, 6, 31, 2, 5, 12 };
        int n = arr.length;
        BUbbleSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }

    }
}
