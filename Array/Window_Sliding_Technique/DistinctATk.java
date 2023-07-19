import java.util.HashMap;
import java.util.Map;

public class DistinctATk {
    /*
     * Count distinct element in every window of size k
     * i/p : arr[] = {1,2,3,4,4,6,6,7,7}, k = 4
     * o/p : 4,3,3,2,3,2
     * Hint : Window Sliding with Hashing
     */
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 6, 6, 7, 7 };
        int slide = 4;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i + slide - 1 < arr.length; i++) {
            // Reinitializes hashmap after printing count
            map = new HashMap<>();
            int k = 0;
            int j = i;
            while (k < slide) {
                if (map.get(arr[j]) == null) {
                    map.put(arr[j], 1);
                } else {
                    int f = map.get(arr[j] + 1);
                    map.put(arr[j], f);
                }
                j++;
                k++;
            }
            System.out.println(map);
            int count = 0;
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                if (e.getValue() == 1) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
