import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // static memory allocation
        int arr[] = { 1, 2, 4, 6, 9, 6, 12 };
        // Dynamic Array
        // ArrayList one is the class of java where you want
        // to create the object of
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(40);
        list.add(10);

        list.get(0);
        list.get(2);
        // how to iterate over an array
        // First Method
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // second method
        for (int e : arr) {
            System.out.println(e);
        }

        // To iterate over an ArrayList
        // Method - 1
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Method - 2
        for (int e : list) {
            System.out.println(e);
        }

        // Method - 3
        // it will iterate through the ArrayList
        // a element will contain the each index value
        list.forEach((a) -> System.out.println(a));

    }
}
