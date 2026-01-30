package Java.Bitmasking;

public class checkIthBitSet {
    public static void main(String[] args) {
        int n = 75;
        int ans = n >> 3;
        if ((ans & 1) == 1) {
            System.out.println("SET");
        } else {
            System.out.println("NOT SET");
        }

        // Alternate method

    }
}
