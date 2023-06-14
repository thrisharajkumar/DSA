package Recursion.Recursion_Basics;

public class CallStack {
    void func_1() {
        System.out.println("this is function 1");
    }

    void func_2() {
        func_1();
        System.out.println("this is function 2");
    }

    void func_3() {
        func_2();
        System.out.println("this is function 3");
    }

    public static void main(String args[]) {
        CallStack obj = new CallStack();
        obj.func_3();
    }
}
