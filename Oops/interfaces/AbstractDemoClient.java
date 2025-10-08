package Java.Oops.interfaces;

public class AbstractDemoClient {
    public static void main(String[] args) {
        // Anonymous way to create object of abstract classes
        AbstractDemo ab = new AbstractDemo() {
            @Override
            public boolean payment() {
                return false;
            };
        };

        AbstractDemo ab1 = new AbstractDemo2();
        ab1.payment();
    }
}
