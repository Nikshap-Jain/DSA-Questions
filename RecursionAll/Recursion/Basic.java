package RecursionAll.Recursion;

// Like in PMI - there are 3 things , 1) we know answerof smaller value . that will be base case (smaller - unit).
// 2)  n = k (this we assume is correct) 
// 3) prove this is also correct n = k+ 1
public class Basic {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fac(n));
    }

    public static int fac(int n) {
        if (n == 0) {
            return 1;
        }
        int f1 = fac(n - 1);
        return f1 * n;
    }
}
