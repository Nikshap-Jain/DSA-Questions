package Arrays.Assignment;

public class prime {
    public static void main(String[] args) {
        int n = 781;
        // System.out.println(isPrime(n));

        // Best solution - Sieve of Eratosthenes

        // Suppose question is till 121 tell all prime number
        n = 121;
        System.out.println(prime_sieve(n));
    }

    // public static boolean isPrime(int n) {
    // int div = 2;
    // while (div * div <= n) {
    // if (n % div == 0) {
    // return false;
    // }
    // div++;
    // }
    // return true;
    // }

    public static int prime_sieve(int n) {
        if (n < 2) {
            return 0;
        }

        int[] prime = new int[n];
        prime[0] = 1;
        prime[1] = 1;

        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i] == 0) {
                for (int j = 2; i * j < prime.length; j++) {
                    prime[i * j] = 1;
                }
            }
        }

        int c = 0;
        for (int i = 2; i < prime.length; i++) {
            if (prime[i] == 0) {
                c++;
            }
        }
        return c;
    }
}