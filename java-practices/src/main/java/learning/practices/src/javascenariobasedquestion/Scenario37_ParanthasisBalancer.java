package learning.practices.src.javascenariobasedquestion;

import java.util.Stack;

public class Scenario37_ParanthasisBalancer {
	public static void main(String args[]) {
		System.err.println(isBalanced("{[()]}"));
		System.err.println(isBalanced("{[(])}"));
	}

	private static boolean isBalanced(String paranthesis) {
		if (paranthesis.length() == 0) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		for (char ch : paranthesis.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if (ch == ')' && top != '(' || ch == '}' && top != '{' || ch == ']' && top != '[') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
