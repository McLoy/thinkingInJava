package holding;

/**
 * Created by Ostin on 16.11.2015.
 */

import typeinfo.pets.*;
import java.util.*;

public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> it = pets.listIterator();
        while(it.hasNext())
            System.out.println(it.next() + ", " + it.nextIndex() +
            ", " + it.previousIndex() + "; ");
        System.out.println();
        while (it.hasPrevious())
            System.out.println(it.previous().id() + " ");
        System.out.println();
        System.out.println(pets);
        it = pets.listIterator(3);
        while (it.hasNext()){
            it.next();
            it.set(Pets.randomPet());
            System.out.println();
        }
    }
}
