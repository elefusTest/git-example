package com.epam.se02;

@SuppressWarnings("all")
public class Example1 {

    public static void main(String[] args) {

        Number val = 40;
        method((Integer)val);

    }

//    static int method() {
//        System.out.println("int");
//        return 1;
//    }

    static void method(Object ref) {
        System.out.println("void");
    }

    static void method(Integer val) {
        System.out.println("Val");
    }

    static void method(int val) {
        System.out.println("Val");
    }

    static void method1() {

    }
}
