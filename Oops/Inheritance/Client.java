package Oops.Inheritance;

public class Client {
    public static void main(String[] args) {
        p obj = new c();
        System.out.println(obj.d2);
        System.out.println(((c) obj).d2);
        obj.fun2();
        ((c) obj).fun3();
    }
}
