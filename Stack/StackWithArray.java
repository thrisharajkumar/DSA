package Stack;

//IMPLEMENTATION OF STACK USING AN ARRAY
public class StackWithArray {
    // Define the Stack
    public static class MyStack {
        private int arr[];
        int capacity;
        int top;

        public MyStack(int c) {
            capacity = c;
            arr = new int[capacity];
            top = -1;
        }

        public void push(int a) {
            if (top == capacity - 1) {
                System.out.println("Stack is Full");
                return;
            }
            arr[++top] = a;

            System.out.println("Element Inserted" + arr[top]);
        }

        public int pop() {
            if (top == -1) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top--];
        }

        // Peek
        public int peek() {
            if (top == -1) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top];
        }

        public int size() {
            return top + 1;
        }

        public boolean isEmpty() {
            return (top == -1);
        }
    }

    public static void main(String args[]) {
        MyStack stack = new MyStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.size());

        stack.pop();

        System.out.println(stack.size());
        System.out.println(stack.peek());
    }

}
