package com.zping.lib_thinking_in_java.t15_generics;//: generics/TupleList.java
// Combining generic getTypes to make complex generic getTypes.

import com.zping.lib_thinking_in_java.net.mindview.util.FourTuple;

import java.util.ArrayList;

public class TupleList<A, B, C, D> extends ArrayList<FourTuple<A, B, C, D>> {
    public static void main(String[] args) {
        TupleList<Vehicle, Amphibian, String, Integer> tl = new TupleList<Vehicle, Amphibian, String, Integer>();
        tl.add(TupleTest.h());
        tl.add(TupleTest.h());
        for (FourTuple<Vehicle, Amphibian, String, Integer> i : tl) {
            System.out.println(i);
        }
    }
} /* Output: (75% match)
(Vehicle@11b86e7, Amphibian@35ce36, hi, 47)
(Vehicle@757aef, Amphibian@d9f9c3, hi, 47)
*///:~
