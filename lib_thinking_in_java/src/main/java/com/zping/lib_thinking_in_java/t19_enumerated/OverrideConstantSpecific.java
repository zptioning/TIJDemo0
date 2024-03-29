package com.zping.lib_thinking_in_java.t19_enumerated;//: enumerated/OverrideConstantSpecific.java

import static com.zping.lib_thinking_in_java.net.mindview.util.Print.print;
import static com.zping.lib_thinking_in_java.net.mindview.util.Print.printnb;

public enum OverrideConstantSpecific {
    NUT,
    BOLT,
    WASHER {
        void f() {
            print("Overridden method");
        }
    };

    void f() {
        print("default behavior");
    }

    public static void main(String[] args) {
        for (OverrideConstantSpecific ocs : values()) {
            printnb(ocs + ": ");
            ocs.f();
        }
    }
} /* Output:
NUT: default behavior
BOLT: default behavior
WASHER: Overridden method
*///:~
