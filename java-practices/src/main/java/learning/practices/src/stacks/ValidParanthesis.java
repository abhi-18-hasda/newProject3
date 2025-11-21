package learning.practices.src.stacks;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String paranthersis = "{[{]})";
        System.out.println(isValidParanthesis(paranthersis));
    }

    private static boolean isValidParanthesis(String paranthersis) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < paranthersis.length(); i++) {
            char ch = paranthersis.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                if ((st.peek() == '[' && ch == ']') ||
                        (st.peek() == '{' && ch == '}') ||
                        (st.peek() == '(' && ch == ')')) {

                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
