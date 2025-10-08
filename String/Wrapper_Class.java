package String;

public class Wrapper_Class {
    public static void main(String[] args) {
        int a = 10;// store in stack
        Integer a1 = 12;// store in heap and its adress save in stack.

        System.out.println(a);
        System.out.println(a1);// toString() : automatically override address and print value.

        a1 = a; // autoBoxing
        Integer a2 = 9;
        int b = a2;// unboxing
        Long a3 = 99l; // without l it give error because it is int only corresponding conversion
                       // possible.
        long b1 = a2;// internal type casting

        // Integer cache array : store wrapper class content of Integer of range -128
        // and 128 (same concept in byte , long , sort means they also have cache of
        // same range).

        // This only not in float and double.

        Integer c1 = 71;
        Integer c2 = 71;
        Integer c3 = 171;
        Integer c4 = 171;
        System.out.println(c1 == c2);// Store in integer cache that's why address is same
        System.out.println(c3 == c4);// false : because out of range of Integer cache so address different.

        // For boolean there is also cache available

        boolean b11 = true;
        boolean b22 = true;

        System.out.println(b11 == b22);
    }
}
