package com.zping.lib_thinking_in_java.t16_arrays;//: arrays/MultidimensionalPrimitiveArray.java
// Creating multidimensional arrays.

import java.util.Arrays;

public class MultidimensionalPrimitiveArray {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3,},
                {4, 5, 6,},
        };
        System.out.println(Arrays.deepToString(a));
    }
} /* Output:
[[1, 2, 3], [4, 5, 6]]
*///:~
