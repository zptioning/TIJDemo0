package com.zping.lib_thinking_in_java.t13_strings;//: strings/Immutable.java

import static com.zping.lib_thinking_in_java.net.mindview.util.Print.print;

public class Immutable {
    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        print(q); // howdy
        String qq = upcase(q);
        print(qq); // HOWDY
        print(q); // howdy
    }
} /* Output:
howdy
HOWDY
howdy
*///:~
