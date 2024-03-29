package com.zping.lib_thinking_in_java.t14_typeinfo;//: typeinfo/GenericClassReferences.java

public class GenericClassReferences {
    public static void main(String[] args) {
        Class<Integer> type = Integer.TYPE;
        Class<Integer> integerClass = Integer.class;

        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class; // Same thing
        intClass = double.class;
        // genericIntClass = double.class; // Illegal
    }
} ///:~
