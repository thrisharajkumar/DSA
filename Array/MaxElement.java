public class MaxElement {
    /*
     * Max Element in an array
     * i/p : arr[] = {3,56,8,25,7}
     * o/p : 56
     */

    // TC = O(n2)
    // O(n2) because we are executing a nexted loop

    static void max(int arr[]) {
        int n = arr.length;
        boolean isMax;
        for (int i = 0; i < n; i++) {
            // Consider the curret ith element as max element
            isMax = true;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    // Found a greater element than current element
                    isMax = false;
                }
            }
            if (isMax) {
                System.out.println("Max Element:" + arr[i]);
                return;
            }
        }
    }

    // TC: O(n)
    // because executed in one single for loop
    // Optimal solution
    static void max_2(int arr[]) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("Max element:" + max);
    }

    public static void main(String[] args) {

    }
}
