import java.util.Arrays;
import java.util.HashMap;

public class PairSumOptimized {

    /*
     * Two Sum / Pair Sum
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */

    // Optimized approach
    // no space complexity
    // no nested looping

    // Two Pointer Approach

    static void solution(int arr[], int target) {
        Arrays.sort(arr);
        // Sorts the array in ascending order
        // Dual - Pivot Quicksort O(n log(n))
        // in this solution indexes gets changed
        // therefore the result will not satisfy
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target) {
                System.out.println("Pair sum:" + i + "," + j);

            } else if (arr[i] + arr[j] < target) {
                i++;
            } else if (arr[i] + arr[j] > target) {
                j--;
            }
        }

    }

    // LeetCode

    static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int res[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == null) {
                map.put(target - arr[i], i);
            } else {
                res[0] = map.get(arr[i]);
                res[1] = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;
        solution(arr, target);
    }

}
