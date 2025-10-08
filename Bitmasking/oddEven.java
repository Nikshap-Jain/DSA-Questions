package Java.Bitmasking;

public class oddEven {
    public static void main(String[] args) {
        int n = 789;
        if ((n & 1) == 0) {//
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }
}
