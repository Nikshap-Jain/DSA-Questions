package Java.Stack.monotonicStackQues;

import java.util.*;

public class nextGreaterElement {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 10 };
        nge(arr);
    }

    public static void nge(int[] arr) {
        Stack<Integer> st = new Stack();
        int ans[] = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            ans[st.pop()] = -1;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(arr[i] + " " + ans[i]);
        }
    }

}
