package learning.practices.src.stacks;

import java.util.Stack;

public class AddElementAtBottom {
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        int val = 4;
        setValAtBottom(st, val);
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }

    private static void setValAtBottom(Stack<Integer> st, int val) {
        if (st.isEmpty()) {
            st.push(val);
            return;
        }
        int top = st.pop();
        setValAtBottom(st, val);
        st.push(top);
    }
}
