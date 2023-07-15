package Stack;

public class LargestAreaHistogram {
    static int maxArea(int arr[]) {
        int n = arr.length;
        int ans = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            // Previous
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= arr[i]) {
                    ans += arr[i];
                } else {
                    break;
                }
            }

            // Next
            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= arr[i]) {
                    ans += arr[i];
                } else {
                    break;
                }
            }

            max = Math.max(max, ans);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 5, 4, 6 };
        System.out.println("Max Area is: " + maxArea(arr));
    }
}
