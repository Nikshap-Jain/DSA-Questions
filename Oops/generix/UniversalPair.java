package Java.Oops.generix;

public class UniversalPair {
    static class Pair<K, V> {
        K x;
        V y;

        public Pair() {

        }

        public Pair(K x, V y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>();
        Pair<String, String> p2 = new Pair<>();
    }
}
