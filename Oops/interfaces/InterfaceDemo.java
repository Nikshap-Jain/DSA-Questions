package Java.Oops.interfaces;

public class InterfaceDemo {
    public interface InnerInterfaceDemo {
        public void push();

        // int c ; need to initialize because it can't be initialized as object will not
        // create
        int c = 1;// by default its public static final, final makes variable constant

        int pop();// by default its public in interface
    }

    class StackClass implements InnerInterfaceDemo {
        @Override
        public void push() {
            System.out.println("push");
        }

        @Override
        public int pop() {
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}
