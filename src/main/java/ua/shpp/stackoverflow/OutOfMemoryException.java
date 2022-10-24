package ua.shpp.stackoverflow;

public class OutOfMemoryException {
    public static void main(String[] args) {
        int n=2;
        f(n);
    }
    private static void f(int n) {
        f(n/2/2);
    }
}