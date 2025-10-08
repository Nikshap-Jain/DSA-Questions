package Java.Stack.monotonicStackQues;

import java.util.Stack;

//https://codeskiller.codingblocks.com/problems/1053
public class stock_span {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10 };
        cal_span(arr);
    }

    public static void cal_span(int[] arr) {
        Stack<Integer> st = new Stack();
        int ans[] = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - st.peek();
            }
            st.push(i);
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
