package DAA_Sorting;

public class HeapSorting {

    static void buildHeap(int arr[], int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    static void heapify(int arr[], int n, int i) {
        int largest = i;
        int leftChild = 2 * 1 + 1;
        int RightChild = 2 * 1 + 2;
        if (leftChild < n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }
        if (leftChild < n && arr[RightChild] > arr[largest]) {
            largest = RightChild;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }

    static void Heap_Sort(int arr[]) {
        int n = arr.length;
        buildHeap(arr, n);
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, n, 0);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 6, 2, 5, 12 };
        int n = arr.length;
        Heap_Sort(arr);
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
