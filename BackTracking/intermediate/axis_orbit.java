package BackTracking.intermediate;

public class axis_orbit {

    // best way to solve palindromic string by monu bhaiya
    public static void main(String[] args) {
        String s = " naam";
        int ans = is_Palindromic(s);
        System.out.println(ans);
    }

    public static int is_Palindromic(String s) {
        // odd length only
        int odd = 0;
        for (int axis = 0; axis < s.length(); axis++) {
            for (int orbit = 0; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
                if (s.charAt(axis - orbit) != s.charAt(orbit + axis)) {
                    break;
                }
                odd++;
            }
        }

        // even length only
        int even = 0;
        for (double axis = 0.5; axis < s.length(); axis++) {
            for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
                if (s.charAt((int) (axis - orbit)) != s.charAt((int) (orbit + axis))) {
                    break;
                }
                even++;
            }
        }

        return odd + even;
    }
}
