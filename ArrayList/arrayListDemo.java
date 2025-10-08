package ArrayList;

import java.util.*;

import Arrays.Assignment.sortjustZeroesandOnes;

public class arrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>();
        // need to give <> otherwiseit will give error on online platform in
        // first generix mention class its mandatory and in second you can
        // leave it empty.
        ll.add(10);
        ll.add(12);// O(1)
        ll.add(1, 11);// O(N) because of shifting

        System.out.println(ll);
        System.out.println(ll.get(2));// O(1)
        System.out.println(ll.size());
        System.out.println(ll.remove(0));// O(N)
        ll.set(1, -9);
        System.out.println(ll);

        // Sorting of arraylist
        Collections.sort(ll);// nlogN
        System.out.println(ll);

        // foreach loop - good incase of structure which don't have index.
        for (int integer : ll) {
            System.out.println(integer);
        }

        // In arraylist there is 10 by default capacity and as element increases its
        // capacity increases by 1.5
        //
    }
}