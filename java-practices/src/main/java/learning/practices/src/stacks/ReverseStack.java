package learning.practices.src.stacks;

import java.util.Stack;

public class ReverseStack {
    public static void main(String args[]) {
        Stack<Integer> sts = new Stack<>();
        sts.push(1);
        sts.push(2);
        sts.push(3);
        reverseStack(sts);
        while (!sts.isEmpty()) {
            System.out.println(sts.pop());
        }
    }

    private static void reverseStack(Stack<Integer> sts) {
        if (sts.isEmpty()) {
            return;
        }
        int top = sts.pop();
        reverseStack(sts);
        pushAtBotom(sts, top);
    }

    private static void pushAtBotom(Stack<Integer> sts, int top) {
        if (sts.isEmpty()) {
            sts.push(top);
            return;
        }
        int val = sts.pop();
        pushAtBotom(sts, top);
        sts.push(val);
    }

}
