package Arrays.BinarySearch;
import java.util.*;

public class AggressiveCows {
    public static void main(String[] args) {
        int stalls[] = {1, 2, 8, 4, 9};
        int cow = 3;

        Arrays.sort(stalls);
        int min = stalls[0];
        int max = stalls[stalls.length];
        int ans = -1;
        while (min <= max){
            int mid = (max - min)/2 + min;
            ans = mid;
            if (isItPossible(stalls, cow, mid)){
                min = min + 1;
            }
            else{
                max = mid - 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean isItPossible(int stalls[], int cow, int dis){
        int j = 0;
        for (int i = 1; i <=cow; i++){
            if (j <= stalls.length){
                j+=stalls[i];
            }
            else{
                return false;
            }
        }
        return true;
    }
}
