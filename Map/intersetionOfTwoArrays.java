package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class intersetionOfTwoArrays {
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 3 };
        int nums2[] = { 1, 2 };
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            hm.put(nums1[i], hm.getOrDefault(nums1[i], 0) + 1);
        }
        List<Integer> ll = new ArrayList<>(Math.max(nums1.length, nums2.length));
        for (int i = 0; i < nums2.length; i++) {
            if (hm.containsKey(nums2[i])) {
                ll.add(nums2[i]);
                hm.put(nums2[i], hm.get(nums2[i]) - 1);
                if (hm.get(nums2[i]) == 0) {
                    hm.remove(nums2[i]);
                }
            }
        }
        int arr[] = new int[ll.size()];
        for (int i = 0; i < ll.size(); i++) {
            arr[i] = ll.get(i);
        }

    }
}
