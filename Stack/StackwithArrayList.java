package Stack;

import java.util.ArrayList;

import Stack.StackWithArray.MyStack;

//IMPLEMENTATION OF STACT USING ARRAYLIST
public class StackwithArrayList {
    private ArrayList<Integer> stack;

    public void Stack() {
        stack = new ArrayList<>();
    }

    public void push(int a) {
        stack.add(a);
    }

    public void pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is Empty");
        }
        int lastIndex = stack.size() - 1;
        stack.remove(lastIndex);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is Empty");
        }
        int lastIndex = stack.size() - 1;
        return stack.get(lastIndex);
    }

    public int size() {
        return stack.size();
    }

    public static void main(String args[]) {
        StackwithArrayList stack = new StackwithArrayList();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.size());

        stack.pop();

        System.out.println(stack.size());
        System.out.println(stack.peek());
    }
}
