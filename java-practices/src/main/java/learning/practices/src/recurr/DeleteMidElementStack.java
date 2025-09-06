package learning.practices.src.recurr;

import java.util.Stack;

public class DeleteMidElementStack {
    public static void main(String arg[]) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(70);
        st.push(50);
        st.push(60);
        int k = (st.size()/2)+1;
        System.out.println("Original Stack: "+st);
        int deletedEle = deleteMidEle(st, k);
        System.out.println("Deleted element: "+deletedEle);
        System.out.println("After delete the min element from stak Stack: "+st);
    }

    private static int deleteMidEle(Stack<Integer> st, int k) {
        if(k == 1) {
            //st.pop();
            return st.pop();
        }
        int val = st.pop();
        int deleteEle = deleteMidEle(st, k-1);
        st.push(val);
        return deleteEle;
    }
}
