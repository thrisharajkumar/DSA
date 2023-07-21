package Linked_List;

class NodeA<T> {
    // generic data type
    T data;
    NodeA<T> next;

    public NodeA(T data) {
        this.data = data;
        this.next = null;
    }

}

public class LinkedlistGenericType {
    public static void main(String[] args) {
        NodeA<Integer> start = new NodeA<>(10);
        start.next = new NodeA<>(20);
        start.next.next = new NodeA<>(30);
        start.next.next.next = new NodeA<>(40);

        NodeA<String> list_2 = new NodeA<>("hello");
        list_2.next = new NodeA<>("world");
    }
}
