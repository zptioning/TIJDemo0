//: annotations/HashSetTest.java
package com.zping.lib_thinking_in_java.annotations;
import java.util.*;
import com.zping.lib_thinking_in_java.net.mindview.atunit.Test;
import com.zping.lib_thinking_in_java.net.mindview.atunit.TestObjectCreate;
import com.zping.lib_thinking_in_java.net.mindview.util.OSExecute;

public class HashSetTest {
  HashSet<String> testObject = new HashSet<String>();
  @Test void initialization() {
    assert testObject.isEmpty();
  }
  @Test void _contains() {
    testObject.add("one");
    assert testObject.contains("one");
  }
  @Test void _remove() {
    testObject.add("one");
    testObject.remove("one");
    assert testObject.isEmpty();
  }
  public static void main(String[] args) throws Exception {
    OSExecute.command(
      "java net.mindview.atunit.AtUnit HashSetTest");
  }
} /* Output:
annotations.HashSetTest
  . initialization
  . _remove
  . _contains
OK (3 tests)
*///:~
