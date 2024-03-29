package com.zping.lib_thinking_in_java.t11_holding;//: holding/ListFeatures.java

import com.zping.lib_thinking_in_java.t14_typeinfo.pets.Cymric;
import com.zping.lib_thinking_in_java.t14_typeinfo.pets.Hamster;
import com.zping.lib_thinking_in_java.t14_typeinfo.pets.Mouse;
import com.zping.lib_thinking_in_java.t14_typeinfo.pets.Pet;
import com.zping.lib_thinking_in_java.t14_typeinfo.pets.Pets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static com.zping.lib_thinking_in_java.net.mindview.util.Print.print;

public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        print("1: " + pets);
        Hamster h = new Hamster();
        pets.add(h); // Automatically resizes
        print("2: " + pets);
        print("3: " + pets.contains(h));// true
        pets.remove(h); // Remove by object
        Pet p = pets.get(2);
        print("4: " + p + " " + pets.indexOf(p));
        Pet cymric = new Cymric();
        print("5: " + pets.indexOf(cymric));// -1
        print("6: " + pets.remove(cymric));// false
        // Must be the exact object:
        print("7: " + pets.remove(p));// true
        print("8: " + pets);
        /* 插入元素 */
        pets.add(3, new Mouse()); // 插入元素 Insert at an index
        print("9: " + pets);
        List<Pet> sub = pets.subList(1, 4);
        print("subList: " + sub);
        print("10: " + pets.containsAll(sub));// true
        Collections.sort(sub); // In-place sort
        print("sorted subList: " + sub);
        // Order is not important in containsAll():
        print("11: " + pets.containsAll(sub));// true
        Collections.shuffle(sub, rand); // Mix it up
        print("shuffled subList: " + sub);
        /* 顺序不重要 */
        print("12: " + pets.containsAll(sub));// true
        List<Pet> copy = new ArrayList<Pet>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        print("sub: " + sub);
        /** 取交集 **/
        copy.retainAll(sub);
        print("13: " + copy);
        copy = new ArrayList<Pet>(pets); // Get a fresh copy
        copy.remove(2); // Remove by index
        print("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        print("15: " + copy);
        /* 替换元素 */
        copy.set(1, new Mouse()); // Replace an element
        print("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        print("17: " + copy);
        print("18: " + pets.isEmpty());// false
        pets.clear(); // Remove all elements
        print("19: " + pets);
        print("20: " + pets.isEmpty());// true
        pets.addAll(Pets.arrayList(4));
        print("21: " + pets);
        Object[] o = pets.toArray();
        print("22: " + o[3]);//
        /* 将任意的Collection转换为一个数组。这事一个重载方法，其无参数版本返回的是Object数组，但是
         * 如果你向这个重载版本传递目标类型的数据，那么它将产生指定类型的数据（假设它能够通过类型检查）
         * 如果参数数组太小，存放不下List的所有元素（就像本例一样），toArray()方法将创建一个
         * 具有合适尺寸的数组。*/
        Pet[] pa = pets.toArray(new Pet[0]);
        print("23: " + pa[3].id());// 14
    }
} /* Output:
1: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]
2: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Hamster]
3: true
4: Cymric 2
5: -1
6: false
7: true
8: [Rat, Manx, Mutt, Pug, Cymric, Pug]
9: [Rat, Manx, Mutt, Mouse, Pug, Cymric, Pug]
subList: [Manx, Mutt, Mouse]
10: true
sorted subList: [Manx, Mouse, Mutt]
11: true
shuffled subList: [Mouse, Manx, Mutt]
12: true
sub: [Mouse, Pug]
13: [Mouse, Pug]
14: [Rat, Mouse, Mutt, Pug, Cymric, Pug]
15: [Rat, Mutt, Cymric, Pug]
16: [Rat, Mouse, Cymric, Pug]
17: [Rat, Mouse, Mouse, Pug, Cymric, Pug]
18: false
19: []
20: true
21: [Manx, Cymric, Rat, EgyptianMau]
22: EgyptianMau
23: 14
*///:~
