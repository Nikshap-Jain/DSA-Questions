package Java.Patterns;

import java.util.*;

public class randomNum {
    public static void main(String[] args) {
        int lo = 10;
        int hi = 100;
        Random rn = new Random();
        for (int i = 0; i < 10; i++) {
            int x = rn.nextInt(hi - lo + 1) + lo;// it take bound which is range i.e (100 - 10) - 1. it generate 0 to 90
                                                 // random
            // number so we add lo
            System.out.println(x);
        }
    }
}
