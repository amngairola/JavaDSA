package Recursion.Basic;

public class Hello {
    public static void main(String[] args) {
        message1(1);
    }

    static void message1(int n) {
        System.out.println(n);
        message2(2);
    }

    static void message2(int n) {
        System.out.println(n);
        message3(3);
    }

    static void message3(int n) {
        System.out.println(4);
    }
}
