package learning.practices.src.recurr;

import java.util.Stack;

public class ReverseStack {
    public static void main(String arg[]) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(70);
        st.push(50);
        st.push(60);
        System.out.println("Original Stack: "+st);
        reverseStack(st);
        System.out.println("Reverse Stack: "+st);
    }

    private static void reverseStack(Stack<Integer> st) {
        if(st.size() == 1) {
            return;
        }
        int temp = st.pop();
        reverseStack(st);
        insert(st, temp);
    }

    private static void insert(Stack<Integer> st, int temp) {
        if(st.size() == 0) {
            st.push(temp);
            return;
        }
        int val = st.pop();
        insert(st, temp);
        st.push(val);
    }
}
