package learning.practices.src.recurr;

import java.util.Stack;

public class SortStack {

    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();
        st.add(2);
        st.add(32);
        st.add(9);
        st.add(6);
        st.add(1);
        st.add(22);
        st.add(20);
        System.out.println("Original Stack: " + st);
        sort(st);
        System.out.println("Sorted Stack: " + st);
    }

    private static void sort(Stack<Integer> st) {
        if(st.size() == 1) {
            return;
        }
        int temp = st.pop();
        sort(st);
        insert(st, temp);
    }

    private static void insert(Stack<Integer> st, int temp) {
        if(st.size() == 0 || st.peek()<=temp) {
            st.push(temp);
            return;
        }
        int val = st.pop();
        insert(st, temp);
        st.push(val);
    }
}
