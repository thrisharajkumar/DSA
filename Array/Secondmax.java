public class Secondmax {
    /*
     * Second max element in array
     * i/p : arr[] = {3,56,8,25,7}
     * o/p : 25
     */

    // TC: O(f(n))
    static void secondmax_1(int arr[]) {
        int n = arr.length;
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int secondmax = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] != max) {
                if (arr[i] > secondmax) {
                    secondmax = arr[i];
                }
            }
        }
        System.out.println("Second max :" + secondmax);
    }

    // Optimal solution

    static void secondmax_2(int arr[]) {
        int n = arr.length;
        int max = arr[0];
        int secondmax = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            }
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] != max) {
                if (arr[i] > secondmax) {
                    secondmax = arr[i];
                }
            }
        }
        System.out.println("Second max :" + secondmax);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 7, 8, 2, 6 };
        secondmax_2(arr);
    }
}
