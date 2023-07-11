import java.util.Scanner;

// Arrays CRUD

public class ArrayCRUD {
    int arr[];
    int currentSize;

    ArrayCRUD(int n) {
        this.arr = new int[n];
        this.currentSize = 0;
    }

    void insert(int index, int item) {
        // Check if the index is greater than the current size of the array
        if (index > currentSize) {
            System.out.println("Index cannot be greater than current size...");
            return;
        }

        // Shift elements to make room for the new item
        for (int i = currentSize - 1; i >= index; i++) {
            arr[i + 1] = arr[i];
        }
        // Insert the new item at the specified index
        arr[index] = item;

        // Increase the current size of the array by 1
        currentSize++;
    }

    void delete(int index) {
        // Check if the array is empty
        if (currentSize == 0) {
            System.out.println("ARRAY is empty cannot delete the element");
            return;
        }
        // Shift elements to the left starting from the given index
        for (int i = index; i < currentSize - 1; i++) {
            arr[i] = arr[i + 1];
        }
        // Set the last element to 0 (assuming 0 is not a valid element in the array)
        arr[currentSize - 1] = 0;
        // Decrease the currentSize by 1
        currentSize--;
    }

    int search(int value) {
        // Linear search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
            System.out.println("Element not found..");
            return -1;
        }
        return value;
    }

    void update(int valueTosearch, int valueToUpdate) {
        int index = search(valueTosearch);

        if (index == -1) {
            return;
        }

        else {
            arr[index] = valueToUpdate;
            System.out.println("Value Updated");
            print();
        }
    }

    void print() {
        for (int i = 0; i < currentSize - 1; i++) {
            System.out.println(arr[i] + ",");
        }
    }

    public static void main(String[] args) {
        ArrayCRUD obj = new ArrayCRUD(5);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Insert a new element");
            System.out.println("2. Print");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Exit");
            System.out.println("Enter your choice : ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // int element = scaanner.nextInt()
                    obj.insert(0, 10);
                    obj.insert(1, 20);
                    obj.insert(2, 30);
                    obj.insert(3, 40);
                    obj.insert(4, 50);
                    break;
                case 2:
                    obj.print();
                    break;
                case 3:
                    obj.search(15);
                    break;
                case 4:
                    obj.update(10, 100);
                    break;
                case 5:
                    obj.delete(2);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid Choice...");
            }
        }
    }
}
