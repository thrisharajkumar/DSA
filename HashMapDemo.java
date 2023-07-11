import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // To create a object of hashmap
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(2, 4);
        map.put(2, 9);
        map.put(4, 16);
        map.put(5, 25);

        int sq = map.get(4);
        System.out.println(sq);

        // checks if 2 is a key inside the hashmap
        map.containsKey(2);

        // checks if 14 is a value inside the hashmap
        map.containsValue(14);

        System.out.println((map.containsKey(2)));
        // gives output true or false
        System.out.println(map.containsValue(14));

        // map.putIfAbsent();

    }
}
