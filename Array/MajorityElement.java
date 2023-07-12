import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    /*
     * Majority Element - LC : 169
     * i/p : arr = {1,2,3,2,2,1,1,2,2,2,2};
     * o/p : 2
     */
    static int Approach_1(int arr[], int n) {
        int majoritycount = n / 2;
        for (int num : arr) {
            int count = 0;
            for (int elem : arr) {
                if (elem == num) {
                    count += 1;
                }

            }
            if (count > majoritycount) {
                return num;
            }

        }
        return -1;

    }

    // Using HashMap
    // Approach - 2

    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }

        int max = Collections.max(hm.values());
        // return hm.getKey(max);
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }

    // Approach - 3
    // Optimal solution
    // Boyer Moore's Voting Algorithm
    int Approach_3(int arr[], int n) {
        int count = 0;
        int majorityElement = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                majorityElement = arr[i];
            }
            if (majorityElement == arr[i]) {
                count++;
            } else {
                count--;
            }

        }
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == majorityElement) {
                count++;
            }
        }
        int ans = count > n / 2 ? majorityElement : -1;
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 2, 1, 1, 2, 2, 2, 2 };
        int n = arr.length;
        Approach_1(arr, n);
    }
}
