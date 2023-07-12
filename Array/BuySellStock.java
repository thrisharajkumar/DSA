public class BuySellStock {
    /*
     * Best Time to Buy and Sell Stock : LC - 121
     * Input: prices = [7,1,5,3,6,4]
     * Output: 5
     * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
     * 6-1 = 5.
     * Note that buying on day 2 and selling on day 1 is not allowed because you
     * must buy before you sell.
     */

    static int Approach_1(int nums[]) {
        int n = nums.length;
        int first = 0;
        int last = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (max < (nums[j]) - nums[i]) {
                    max = nums[j] - nums[i];
                    first = nums[i];
                    last = nums[j];
                }
            }
        }
        System.out.println(first + ", " + last);
        return max;
    }

    // PreComputational Approach
    static void Approach_2(int arr[]) {
        int n = arr.length;
        int profit = 0;
        int finalProfit = 0;
        int prefixMin[] = new int[n];
        prefixMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixMin[i] = Math.min(prefixMin[i - 1], arr[i]);
        }
        for (int i = 1; i < n; i++) {
            finalProfit = arr[i] - prefixMin[i];
            profit = Math.max(finalProfit, profit);
        }

    }

    // Approach_3
    // Best Approach as no extra array to store the prefix

    static int Approach_3(int arr[]) {
        int profit = 0;
        int finalProfit = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            profit = arr[i] - min;
            finalProfit = Math.max(finalProfit, profit);
            min = Math.min(min, arr[i]);
        }
        return finalProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(Approach_1(prices));
    }
}
