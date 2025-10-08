package Java.String.StringBuilder;

public class Fundamental {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();// default storage 16
        System.out.println(sb.capacity());
        sb.append("abc");
        sb.append(1);// append add anything as string
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(2));
        System.out.println(sb.replace(1, 1, "e"));
        System.out.println(sb.reverse());

        String s = sb.toString();// way to store string in stringBuilder

        // StringBuilder is too fast in comparision of string because internal array is
        // used

        // capacity is 16 and increase by old X 2 + 2;
    }
}
