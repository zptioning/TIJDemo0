package com.zping.lib_thinking_in_java.t05_initialization;//: initialization/OverloadingVarargs3.java

public class OverloadingVarargs3 {
    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void f(char c, Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1, 'a');
        f('a', 'b');
    }
} /* Output:
first
second
*///:~
