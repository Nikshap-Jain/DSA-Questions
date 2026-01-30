package Bitmasking.Questions;

public class magicNum {
    /*
     * A magic number is defined as a number which can be expressed as a power of 5
     * or sum of unique powers of 5. First few magic numbers are 5, 25, 30(5 + 25),
     * 125, 130(125 +5), .. Write a function to find the nth Magic number. Example:
     * Input: n= 2 Output: 25 Input: n=5 Output: 130
     */
    public static void main(String[] args) {
        int n = 10;
        System.out.println(mg(n));
    }

    public static int mg(int n) {
        int po = 1;
        int ans = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans += (int) Math.pow(5, po);
            }

            po++;
            n >>= 1;

        }
        return ans;
    }

}
