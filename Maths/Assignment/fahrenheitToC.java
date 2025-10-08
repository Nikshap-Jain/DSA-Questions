package Maths.Assignment;

public class fahrenheitToC {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int step = 20;
        int c = 0;

        for (int i = min; i <= max; i += step) {
            min = i;
            c = (int) ((5.0 / 9) * (min - 32));
            System.out.println(min + "\t" + c);
        }

    }
}
