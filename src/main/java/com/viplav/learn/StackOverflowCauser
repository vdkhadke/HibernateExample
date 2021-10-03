package com.viplav.learn;

public class StackOverflowCauser {
    /*
    * method to cause stackoverflow. Stack sizes can be set using -Xss JVM arg.
    * e.g. -Xss8m
    * https://docs.oracle.com/javase/8/docs/technotes/tools/windows/java.html
    * */
    public static long factorial(int n) {
        return n < 2 ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(1 << 16));
    }
}
