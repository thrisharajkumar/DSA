public class SubArray_Product_Less_Than_k {
    /*
     * Input: nums = [10,5,2,6], k = 100
     * Output: 8
     * Explanation: The 8 subarrays that have product less than 100 are:
     * [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
     * Note that [10, 5, 2] is not included as the product of 100 is not strictly
     * less than k.
     */
    // Window sliding technique

    static public int numSubarrayProductLessThanK(int[] arr, int k) {
        if (k <= 1) {
            return 0;
        }
        int ans = 0;
        int product = 1;
        int start = 0;

        for (int i = 0; i < arr.length; i++) {
            // Including the next element in product
            product = product * arr[i];
            while (product >= k) {
                // removing the first element of subarray from the product
                product = product / arr[start++];
            }
            // System.out.println(product);
            // ans
            ans += i - start + 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 6 };
        int k = 100;
        int ans = numSubarrayProductLessThanK(arr, k);
        System.out.println(ans);

    }
}
