package Linked_List;

//Making the public class as generic data
public class Linked_List_CRUD<T> {

    private NodeA<T> start;

    int getCount() {
        NodeA<T> temp = start;
        int counter = 0;
        while (temp != null) {
            temp = temp.next;
            counter++;
        }
        return counter;
    }

    void insertAtBeg(NodeA<T> node) {
        // Two scenarios to add the elements/ data
        // 1. Linked list is empty
        if (start == null) {
            start = node;
            return;
        }
        // 2. Linked list is not empty
        node.next = start;
        start = node;

    }

    // InsertAtEnd
    void InsertAtEnd(NodeA<T> node) {
        // Is empty
        if (start == null) {
            start = node;
            return;
        }
        // If linked list has only one node
        if (start.next == null) {
            start.next = node;
            return;
        }

        // more than one node
        NodeA<T> temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    // At mid
    void InsertAtMid(NodeA<T> node, int pos) {

        // Is empty
        if (start == null) {
            start = node;
            return;
        }
        if (pos == 0) {
            insertAtBeg(node);
            return;
        }
        if (pos > getCount()) {
            throw new RuntimeException("Invalid position");
        }
        if (pos > 1) {
            int i = 1;
            NodeA<T> temp = start;
            while (i < pos) {
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
        }

    }

    void delAtBeg() {
        if (start == null) {
            System.out.println("Linked list is empty");
            return;
        }
        // ignoring the first node so it will be eliminated
        // and java will garbage collect that particulat node object
        start = start.next;
    }

    void delAtMid(int pos) {
        // temp.next = temp.next.next
        // garbage collected
        if (start == null) {
            System.out.println("Linked list is empty");
            return;
        }
        NodeA<T> temp = null;
        if (pos == 0) {
            // either call the delatbeg func or
            temp = start.next;
            start = temp;
            return;
        }
        int i = 0;
        temp = start;
        while (i < pos) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    // Find mid point
    void midPoint() {
        NodeA<T> slow;
        NodeA<T> fast;
        slow = fast = start;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("Mid point is: " + slow.data);
    }

    void findKthNode(int k) {
        int n = getCount();
        int x = n - k + 1;
        NodeA<T> temp = start;
        for (int i = 1; i < x; i++) {
            temp = temp.next;
        }
        System.out.println("Kth node: " + temp.data);
    }

    void findKthNode_Approach_2(int k) {
        NodeA<T> p;
        NodeA<T> q;
        p = q = start;

        // move p pointer to the kth position from left
        for (int i = 1; i <= k; i++) {
            p = p.next;
        }
        // now move both p & q
        // when p will reach to the end of the list,
        // q will at the kth node form the end

        while (p != null) {
            p = p.next;
            q = q.next;
        }

        System.out.println("Kth node:" + q.data);

    }

    void reverseLinkedList() {
        if (start == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if (start.next == null) {
            System.out.println("Linked list contains only one node");
            return;
        }
        NodeA<T> current = start;
        NodeA<T> prev = null;
        while (current != null) {
            NodeA<T> next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        start = prev;

    }

    void print() {
        NodeA<T> temp = start;
        while (temp != null) {
            System.out.println(temp.data + ",");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // no need of creatinga class of node
        // just taking the object of Linked_List_CRUD
        Linked_List_CRUD<Integer> obj = new Linked_List_CRUD<>();
        obj.insertAtBeg(new NodeA<>(2));
        obj.insertAtBeg(new NodeA<>(6));
        obj.insertAtBeg(new NodeA<>(8));
        obj.insertAtBeg(new NodeA<>(10));
        // Output : 10, 8,6,2

        obj.InsertAtEnd(new NodeA<>(0));
        obj.InsertAtMid(new NodeA<>(100), 2);

        obj.print();

        obj.reverseLinkedList();
        obj.print();

    }
}
