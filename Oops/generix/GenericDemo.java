package Java.Oops.generix;

public class GenericDemo {
    public static void main(String[] args) {
        Integer[] arr = { 10, 2, 4, 5, 6 };
        display(arr);
        String[] arr1 = { "M", "A", "dfd" };
        display(arr1);
    }

    public static <T> void display(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static <T> T get(T[] arr) {
        return arr[0];
    }
}
