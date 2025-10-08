package Java.Stack.monotonicStackQues;

import java.util.*;

public class largestrectangleinhistogram {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 6, 2, 3 };
        System.out.println(calArea(arr));
    }

    public static int calArea(int[] arr) {
        Stack<Integer> st = new Stack();
        int area = 0;
        int ans[] = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                int h = arr[st.pop()];
                int r = i;
                if (st.isEmpty()) {
                    area = Math.max(area, h * r);
                } else {
                    int l = st.peek();
                    area = Math.max(area, h * (r - l - 1));
                }
            }
            st.push(i);
        }

        int r = arr.length;
        while (!st.isEmpty()) {
            int h = arr[st.pop()];
            if (st.isEmpty()) {
                area = Math.max(area, h * r);
            } else {
                int l = st.peek();
                area = Math.max(area, h * (r - l - 1));
            }
        }

        return area;

    }
}
