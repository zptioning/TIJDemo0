package com.zping.lib_thinking_in_java.t17_containers;//: containers/IndividualTest.java
//import holding.MapOfList;

import com.zping.lib_thinking_in_java.t11_holding.MapOfList;
import com.zping.lib_thinking_in_java.t14_typeinfo.pets.Individual;
import com.zping.lib_thinking_in_java.t14_typeinfo.pets.Pet;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class IndividualTest {
    public static void main(String[] args) {
        Set<Individual> pets = new TreeSet<Individual>();
        for (List<? extends Pet> lp :
                MapOfList.petPeople.values())
            for (Pet p : lp)
                pets.add(p);
        System.out.println(pets);
    }
} /* Output:
[Cat Elsie May, Cat Pinkola, Cat Shackleton, Cat Stanford aka Stinky el Negro, Cymric Molly, Dog Margrett, Mutt Spot, Pug Louie aka Louis Snorkelstein Dupree, Rat Fizzy, Rat Freckly, Rat Fuzzy]
*///:~
