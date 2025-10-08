package Java.Map;

import java.util.*;

public class SetFundamental {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(12);
        set.add(-2);
        set.add(9);
        set.add(7);
        set.add(39);
        set.add(-2);
        System.out.println(set);
        System.out.println(set.contains(7));
        System.out.println(set.remove(7));

        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(2);
        set1.add(12);
        set1.add(-2);
        set1.add(9);
        set1.add(7);
        set1.add(39);
        set1.add(-2);
        System.out.println(set1);
        System.out.println(set1.contains(7));
        System.out.println(set1.remove(7));

        // For traversing we need to use foreach loop
        for (int v : set) {
            System.out.println(v + " ");
        }
    }
}
