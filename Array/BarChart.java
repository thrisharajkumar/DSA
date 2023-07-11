public abstract class BarChart {
    /*
     * Bar Chart
     * i/p : arr[] = {3,2,1,0,5,6}
     */

    static int max(int arr[], int n) {
        int maxelement = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxelement) {
                maxelement = arr[i];
            }
        }
        return maxelement;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 0, 5, 6 };
        int n = arr.length;
        int maxelement = max(arr, n);
        for (int i = maxelement; i >= 1; i++) {
            for (int j = 0; j < n; j++) {
                if (i < arr[j]) {
                    System.out.println("*\t");
                } else {
                    System.out.println("\t");
                }
            }
        }
    }

}
