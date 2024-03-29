package com.zping.lib_thinking_in_java.t13_strings;//: strings/Rudolph.java

public class Rudolph {
    public static void main(String[] args) {
        for (String pattern : new String[]{
                "Rudolph",
                "[rR]udolph",
                "[rR][aeiou][a-z]ol.*",
                "R.*"})
            System.out.println("Rudolph".matches(pattern));
    }
} /* Output:
true
true
true
true
*///:~
