package Java.Bitmasking;

public class CountSetBit {

    public static void main(String[] args) {
        int n = 84;// count number of 1 in 84
        System.out.println(setBit(n));
        System.out.println(fastCountSetBit(n));
    }

    // 75 = 01010100 ab last 1 ko 0 bnaya toh uske aage wale 1 ho jayenge jo ki 74
    // hoga = 01010011 ab aise 1 ktm hote chle jayenge .
    public static int fastCountSetBit(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n = (n & (n - 1));
        }
        return c;
    }

    public static int setBit(int n) {
        int c = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                c++;
            }
            n >>= 1;
        }
        return c;
    }
}
