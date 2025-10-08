package Sorting;

// for all case time complexity is nlogn and space complexity is O(n).
public class mergeSort {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 2, 4, 1 };
        int ans[] = sort(arr, 0, arr.length - 1);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static int[] sort(int[] arr, int si, int ei) {
        if (si == ei) {
            int[] bs = new int[1];
            bs[0] = arr[si];
            return bs;
        }
        int mid = (si + ei) / 2;
        int[] f = sort(arr, si, mid);
        int[] s = sort(arr, mid + 1, ei);
        return merge(f, s);
    }

    public static int[] merge(int[] arr1, int[] arr2) {

        int merge[] = new int[arr1.length + arr2.length];
        int id1 = 0, id2 = 0, k = 0;

        while (id1 < arr1.length && id2 < arr2.length) {
            if (arr1[id1] < arr2[id2]) {
                merge[k] = arr1[id1];
                id1++;
            } else {
                merge[k] = arr2[id2];
                id2++;
            }
            k++;
        }

        while (id1 < arr1.length) {
            merge[k] = arr1[id1];
            k++;
            id1++;
        }
        while (id2 < arr2.length) {
            merge[k] = arr2[id2];
            k++;
            id2++;
        }

        return merge;
    }
}
