package com.zping.lib_thinking_in_java.t11_holding;//: holding/NonCollectionSequence.java

import com.zping.lib_thinking_in_java.t14_typeinfo.pets.Pet;
import com.zping.lib_thinking_in_java.t14_typeinfo.pets.Pets;

import java.util.Iterator;

class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence {
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            public boolean hasNext() {
                return index < pets.length;
            }

            public Pet next() {
                return pets[index++];
            }

            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
    }
} /* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
*///:~
