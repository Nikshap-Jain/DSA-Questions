package String.Assignment;

import java.util.*;

public class cbNumber {
    public static void main(String[] args) {
        String str = "81615";
        int n = 5;
        List<String> al = new ArrayList<>();

        // substring
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                al.add(str.substring(i, j));
            }
        }

        boolean flag = true;
        int cbNum[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

        for (int i = 0; i < al.size(); i++) {
            int num = Integer.parseInt(al.get(i));

            if (!ifList(cbNum, num)) {
                for (int j = 0; j < cbNum.length; j++) {
                    if (num == 0 || num == 1 || num % cbNum[j] == 0) {
                        flag = false;
                        break;
                    }
                }
            }

            if (!flag) {
                al.set(i, "");
                flag = true;
            }

        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) != "") {
                ans.add(Integer.parseInt(al.get(i)));
            }
        }
        Collections.sort(ans);

        int arr[] = new int[9];

        for (int i = 0; i < ans.size(); i++){
            if ()
            int num = ans.get(i);
            while(num > 0){
                
                num = num/10;
            }
        }
    }

    public static boolean ifList(int cbNum[], int num) {
        for (int i : cbNum) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
}
