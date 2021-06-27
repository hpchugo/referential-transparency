package com.github.hpchugo.referentialtransparency;

public class Demo {
    public static void main(String[] args) {
        int result = add(2, multiply(2,4));
        System.out.println(result);
    }

    public static int add(int a, int b){
        return a + b ;
    }

    public static int multiply(int a, int b){
        log(String.format("Return %s as the result of %s * %s", a* b, a, b));
        return a * b ;
    }

    public static void log(String m) {
        System.out.println(m);
    }
}
