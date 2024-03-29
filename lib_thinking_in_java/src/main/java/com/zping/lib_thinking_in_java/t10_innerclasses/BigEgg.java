package com.zping.lib_thinking_in_java.t10_innerclasses;//: innerclasses/BigEgg.java
// An inner class cannot be overriden like a method.

import static com.zping.lib_thinking_in_java.net.mindview.util.Print.print;

class Egg {
    private Yolk y;

    protected class Yolk {
        public Yolk() {
            print("Egg.Yolk()");
        }
    }

    public Egg() {
        print("New Egg()");
        y = new Yolk();
    }
}

public class BigEgg extends Egg {

    public BigEgg() {
        new Yolk();
    }

    public class Yolk {
        public Yolk() {
            print("BigEgg.Yolk()");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
} /* Output:
New Egg()
Egg.Yolk()
BigEgg.Yolk()
*///:~
