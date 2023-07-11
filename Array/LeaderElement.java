public class LeaderElement {
    /*
     * Leader Element in an Array
     * i/p : arr[] = {30,80,50,2,7,78,33,27};
     * o/p : 80, 78, 33, 27
     */
    public static void main(String[] args) {

        int arr[] = { 30, 80, 50, 2, 7, 78, 33, 27 };
        int max = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                System.out.println("Leader :" + arr[i]);
                max = arr[i];
            }
        }
    }
}
