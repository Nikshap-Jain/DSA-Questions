package RecursionAll.Recursion.Assignment;

public class CountRemoveReplacehiPart2 {
    public static void main(String[] args) {
        String s = "hit";
        System.out.println(count(s));
        System.out.println(remove(s));
        System.out.println(addbye(s));
    }

    public static int count(String s) {
        if (s.length() == 0) {
            return 0;
        }

        if (s.charAt(0) == 'h') {
            if (s.length() >= 2 && s.charAt(1) == 'i') {
                if (s.length() > 2 && s.charAt(2) == 't') {
                    return count(s.substring(3));
                } else {
                    return 1 + count(s.substring(2));
                }
            }
        }

        return count(s.substring(1));
    }

    public static String remove(String s) {
        if (s.length() == 0) {
            return "";
        }

        if (s.charAt(0) == 'h') {
            if (s.length() >= 2 && s.charAt(1) == 'i') {
                if (s.length() > 2 && s.charAt(2) == 't') {
                    return s.substring(0, 3) + remove(s.substring(3));
                } else {
                    return remove(s.substring(2));
                }
            }
        }

        return s.charAt(0) + remove(s.substring(1));
    }

    public static String addbye(String s) {
        if (s.length() == 0) {
            return "";
        }

        if (s.charAt(0) == 'h') {
            if (s.length() >= 2 && s.charAt(1) == 'i') {
                if (s.length() > 2 && s.charAt(2) == 't') {
                    return s.substring(0, 3) + addbye(s.substring(3));
                } else {
                    return "bye" + addbye(s.substring(2));
                }
            }
        }

        return s.charAt(0) + addbye(s.substring(1));
    }
}
