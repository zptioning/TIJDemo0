package com.zping.lib_thinking_in_java.t16_arrays;//: arrays/ArraySearching.java
// Using Arrays.binarySearch().


import com.zping.lib_thinking_in_java.net.mindview.util.ConvertTo;
import com.zping.lib_thinking_in_java.net.mindview.util.Generated;
import com.zping.lib_thinking_in_java.net.mindview.util.Generator;
import com.zping.lib_thinking_in_java.net.mindview.util.RandomGenerator;

import java.util.Arrays;

import static com.zping.lib_thinking_in_java.net.mindview.util.Print.print;

public class ArraySearching {
    public static void main(String[] args) {
        Generator<Integer> gen = new RandomGenerator.Integer(1000);
        int[] a = ConvertTo.primitive(Generated.array(new Integer[25], gen));
        Arrays.sort(a);
        print("Sorted array: " + Arrays.toString(a));
        while (true) {
            int r = gen.next();
            int location = Arrays.binarySearch(a, r);
            if (location >= 0) {
                print("Location of " + r + " is " + location +
                        ", a[" + location + "] = " + a[location]);
                break; // Out of while loop
            }
        }
    }
} /* Output:
Sorted array: [128, 140, 200, 207, 258, 258, 278, 288, 322, 429, 511, 520, 522, 551, 555, 589, 693, 704, 809, 861, 861, 868, 916, 961, 998]
Location of 322 is 8, a[8] = 322
*///:~
