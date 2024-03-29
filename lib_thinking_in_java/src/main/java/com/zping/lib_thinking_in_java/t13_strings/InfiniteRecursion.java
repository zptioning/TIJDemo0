package com.zping.lib_thinking_in_java.t13_strings;//: strings/InfiniteRecursion.java
// Accidental recursion.
// {RunByHand}

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
    public String toString() {
        return " InfiniteRecursion address: " + /*this*/super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
    }
} ///:~
