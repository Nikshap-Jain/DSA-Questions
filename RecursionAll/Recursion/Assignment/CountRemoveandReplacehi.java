package RecursionAll.Recursion.Assignment;

public class CountRemoveandReplacehi {
    public static void main(String[] args) {
        String s = "abchibihi";
        System.out.println(print(s));
        System.out.println(printBye(s));
        System.out.println(count(s));
    }

    public static int count(String s) {
        if (s.length() < 2) {
            return 0;
        }
        if (s.charAt(0) == 'h') {
            if (s.charAt(1) == 'i') {
                return 1 + count(s.substring(2));
            }
        }

        return count(s.substring(1));
    }

    public static String print(String s) {

        if (s.length() >= 2) {
            if (s.charAt(0) == 'h') {
                if (s.charAt(1) == 'i') {

                    return print(s.substring(2));
                }
            }
        } else {
            return s.substring(0);
        }

        return s.charAt(0) + print(s.substring(1));
    }

    public static String printBye(String s) {

        if (s.length() >= 2) {
            if (s.charAt(0) == 'h') {
                if (s.charAt(1) == 'i') {
                    return printBye("bye" + s.substring(2));
                }
            }
        } else {
            return s.substring(0);
        }

        return s.charAt(0) + printBye(s.substring(1));

    }
}
