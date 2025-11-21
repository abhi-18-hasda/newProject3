package learning.practices.src.stacks;

import java.util.Stack;

public class NextGreaterEleFind {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int nextGen[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            // check the greater element
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            // if is empty or not
            if (st.isEmpty()) {
                nextGen[i] = -1;
            } else {
                nextGen[i] = arr[st.peek()];
            }
            // add index into stack;
            st.push(i);
        }

        for (int i = 0; i < nextGen.length; i++) {
            System.out.print(nextGen[i] + ", ");
        }
    }
}
