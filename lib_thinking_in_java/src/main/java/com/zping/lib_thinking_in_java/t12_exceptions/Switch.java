package com.zping.lib_thinking_in_java.t12_exceptions;//: exceptions/Switch.java

import static com.zping.lib_thinking_in_java.net.mindview.util.Print.print;

public class Switch {
    private boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        print(this);
    }

    public void off() {
        state = false;
        print(this);
    }

    public String toString() {
        return state ? "on" : "off";
    }
} ///:~
