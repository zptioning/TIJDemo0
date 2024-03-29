package com.zping.lib_thinking_in_java.t17_containers;//: containers/DequeTest.java

import com.zping.lib_thinking_in_java.net.mindview.util.Deque;

import static com.zping.lib_thinking_in_java.net.mindview.util.Print.print;
import static com.zping.lib_thinking_in_java.net.mindview.util.Print.printnb;

public class DequeTest {
    static void fillTest(Deque<Integer> deque) {
        for (int i = 20; i < 27; i++)
            deque.addFirst(i);
        for (int i = 50; i < 55; i++)
            deque.addLast(i);
    }

    public static void main(String[] args) {
        Deque<Integer> di = new Deque<Integer>();
        fillTest(di);
        print(di);
        while (di.size() != 0)
            printnb(di.removeFirst() + " ");
        print();
        fillTest(di);
        while (di.size() != 0)
            printnb(di.removeLast() + " ");
    }
} /* Output:
[26, 25, 24, 23, 22, 21, 20, 50, 51, 52, 53, 54]
26 25 24 23 22 21 20 50 51 52 53 54
54 53 52 51 50 20 21 22 23 24 25 26
*///:~
