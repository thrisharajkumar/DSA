import java.util.HashMap;

public class TwoSum {
    /*
     * Two Sum / Pair Sum
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */

    // Naive approach
    // TC: O(n2)
    static void approach_1(int arr[], int target) {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    System.out.println("Pair is:" + i + "," + j);
                    return;
                }
            }
        }
    }

    // Two Pointer Approach
    // Hashmap
    // TC : O(n)
    // SC: O(n)
    static void approach_2(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int e : arr) {
            if (map.get(e) == null) {
                map.put(target - e, e);

            } else {
                System.out.println(map.get(e) + "," + e);
                break;
            }
        }
    }

}
