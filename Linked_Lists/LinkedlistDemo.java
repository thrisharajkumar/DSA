package Linked_List;

class Node {
    // each node is an object
    // linked list have objects
    int data;
    // we have integer of data
    // if we need a linked list with string type of data

    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedlistDemo {
    public static void main(String[] args) {
        // building a lnked list
        // creating an object in java

        Node n1 = new Node(10);
        // if address of n1 = 101, n2 = 102, n3=103
        // data =10, next = null;
        // data = 20, next = null;
        // data = 30, next = null;
        // no node/object is connected to the next node
        Node n2 = new Node(20);
        Node n3 = new Node(10);

        // to connect the nodes
        n1.next = n2;
        n2.next = n3;
        // data = 10, next =102
        // data = 20, next =103
        // data= 30, next = null
        // so the next stores the address of the next node
        // you can add two more nodes to the linked list for example
        n3.next = new Node(40);
        n3.next.next = new Node(50);

        Node start = n1;
        while (start != null) {
            System.out.println(start.data + ",");
            start = start.next;
        }
    }
}
