public class RotatteByKOptimized {
    static void reverse(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        // will always be inside the array
        k = k % arr.length;
        reverse(arr, 0, k);
        reverse(arr, k, 0);
        reverse(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.println(i + ",");
        }
    }

    // LeetCode

    /*
     * class Solution {
     * void reverse( int i, int j, int nums[]) {
     * while (i < j) {
     * int temp = nums[i];
     * nums[i] = nums[j];
     * nums[j] = temp;
     * i++;
     * j--;
     * }
     * }
     * 
     * public void rotate(int nums[], int k) {
     * int n = nums.length;
     * 
     * // will always be inside the array
     * k = k % n;
     * 
     * reverse(0, n-k-1, nums);
     * reverse(n-k, n-1, nums);
     * reverse(0, n-1, nums);
     * }
     * }
     */
}
