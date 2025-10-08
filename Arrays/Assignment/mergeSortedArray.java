package Arrays.Assignment;

public class mergeSortedArray {
    public static void main(String[] args) {
        int arr1[] = { 2, 3, 6, 9 };
        int arr2[] = { 1, 5, 7, 10 };

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

        for (int i : merge) {
            System.out.print(i + " ");
        }
    }
}
