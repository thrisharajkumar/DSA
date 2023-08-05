package DAA_Sorting;

public class Shell_Sorting {

    static void ShellSort(int arr[], int n) {
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // The first loop controls the gap sequence. It starts with a large gap and
            // reduces it in each iteration.

            // Insertion Sort using the current gap
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                // Move elements of arr[0..i-gap] that are greater than temp to their right
                // positions.
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                // Place the current element (temp) at its correct position in the sorted
                // sequence.
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 6, 2, 5, 12 };
        int n = arr.length;
        ShellSort(arr, n);
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
