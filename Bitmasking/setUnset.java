package Java.Bitmasking;

public class setUnset {

    // unset means 0 and set means 1
    public static void main(String[] args) {
        int n = 84;
        int i = 3;
        System.out.println(isSet(n, i));
    }

    public static boolean isSet(int n, int i) {
        int mask = (1 << i);// create 2 power i
        if ((n & mask) != 0) {
            return true;
        } else {
            return false;
        }
    }
}
