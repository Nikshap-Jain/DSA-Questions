package Stack.Fundamental;

import java.util.*;

import Arrays.Assignment.sortjustZeroesandOnes;

public class AddLastElement {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        add_Last(st, 7);
        System.out.println(st);
    }

    public static void add_Last(Stack<Integer> st, int item) {
        if (st.isEmpty()) {
            st.push(item);
            return;
        }

        int x = st.pop();
        add_Last(st, item);
        st.push(x);
    }

}
