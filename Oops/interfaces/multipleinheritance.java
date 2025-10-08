package Java.Oops.interfaces;

public class multipleinheritance {
    public interface A extends B, C {
        public void add(int a);

    }

    public interface B {
        public int get();

        public int fun();
    }

    public interface C {
        public int remove();

        public int fun();
    }

    public static class Client implements A { // static is used because its concept of innerclass

        public void add(int a) {

        }

        public int get() {
            return 0;
        }

        public int fun() {
            return 0;

        }

        public int remove() {
            return 0;

        }
    }

    public static void main(String[] args) {
        Client c = new Client();
        int a = c.fun();
    }
}
