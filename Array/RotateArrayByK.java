public class RotateArrayByK {
    /*
     * Input: nums = [1,2,3,4,5,6,7], k = 3
     * Output: [5,6,7,1,2,3,4]
     * Explanation:
     * rotate 1 steps to the right: [7,1,2,3,4,5,6]
     * rotate 2 steps to the right: [6,7,1,2,3,4,5]
     * rotate 3 steps to the right: [5,6,7,1,2,3,4]
     */

    /*
     * Try to come up with as many solutions as you can.
     * There are at least three different ways to solve this problem.
     * 
     * Could you do it in-place with O(1) extra space?
     */

    static void Approach_1(int arr[], int k) {
        int n = arr.length;
        for (int i = 1; i < k; i++) {
            int x = arr[n - 1];
            for (int j = n - 1; j > 0; i--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = x;
        }
        System.out.println("After rotation :");
        for (int i : arr) {
            System.out.println(i + ",");
        }
    }

    // Approach 2
    static void Approach_2(int arr[], int k) {
        int n = arr.length;
        // Use extra space
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        Approach_1(arr, k);
    }
}
