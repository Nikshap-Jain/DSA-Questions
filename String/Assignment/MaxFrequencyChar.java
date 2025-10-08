package String.Assignment;

public class MaxFrequencyChar {
    public static void main(String[] args) {
        // String str = "aaabacB";
        // int upper[] = new int[26];
        // int lower[] = new int[26];

        // for (int i = 0; i < str.length(); i++) {
        // char c = str.charAt(i);
        // if (Character.isUpperCase(c)) {
        // upper[c - 'A']++;
        // } else {
        // lower[c - 'a']++;
        // }
        // }

        // int indexLow = 0;
        // int ans = lower[0];
        // for (int i = 1; i < lower.length; i++) {
        // if (ans < lower[i]) {
        // ans = lower[i];
        // indexLow = i;
        // }
        // }

        // int indexUpp = 0;
        // ans = upper[0];
        // for (int i = 1; i < lower.length; i++) {
        // if (ans < upper[i]) {
        // ans = upper[i];
        // indexUpp = i;
        // }
        // }

        // if (lower[indexLow] > upper[indexUpp]) {
        // System.out.println((char) (indexLow + 'a'));
        // } else {
        // System.out.println((char) (indexUpp + 'A'));
        // }

        String str = "aaabacB";

        // Array to store frequency of all ASCII characters
        int[] freq = new int[128]; // ASCII range

        // Count frequencies
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        // Find character with maximum frequency
        int maxFreq = 0;
        char maxChar = str.charAt(0);

        for (char c : str.toCharArray()) {
            if (freq[c] > maxFreq) {
                maxFreq = freq[c];
                maxChar = c;
            }
        }

        System.out.println(maxChar);
    }
}
