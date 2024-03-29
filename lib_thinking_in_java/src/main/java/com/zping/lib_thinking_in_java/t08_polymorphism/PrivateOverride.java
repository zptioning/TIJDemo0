//: polymorphism/PrivateOverride.java
// Trying to override a private method.
package com.zping.lib_thinking_in_java.t08_polymorphism;

import static com.zping.lib_thinking_in_java.net.mindview.util.Print.print;

public class PrivateOverride {
    private void f() {
        print("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride {
    public void f() {
        print("public f()");
    }
} /* Output:
private f()
*///:~
