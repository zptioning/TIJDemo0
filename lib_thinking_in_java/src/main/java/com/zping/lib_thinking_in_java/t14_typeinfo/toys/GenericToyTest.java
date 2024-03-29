//: typeinfo/toys/GenericToyTest.java
// Testing class Class.
package com.zping.lib_thinking_in_java.t14_typeinfo.toys;

public class GenericToyTest {
    public static void main(String[] args) throws Exception {
        Class<FancyToy> ftClass = FancyToy.class;
        // Produces exact type:
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        // This won't compile: 编译报错
//        Class<Toy> up2 = ftClass.getSuperclass();
        // Only produces Object:
        Object obj = up.newInstance();
        // com.zping.lib_thinking_in_java.t14_typeinfo.toys.Toy
        System.out.println(obj.getClass().getName());
    }
} ///:~
