package learning.practices.src.javascenariobasedquestion;

class ArrayStack {
	int maxSize;
	int[] arrayStack;
	int top;

	public ArrayStack(int maxSize) {
		this.maxSize = maxSize;
		this.arrayStack = new int[this.maxSize];
		this.top = -1;
	}

	public void push(int data) {
		this.arrayStack[++top] = data;
	}

	public int pop() {
		if (isEmpty()) {
			return -1;
		}
		return this.arrayStack[top--];
	}

	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		return this.arrayStack[top];
	}
	
	boolean isFull() {
		return top == maxSize-1;
	}

	public boolean isEmpty() {
		return top == -1;
	}
}

public class Scenario26_StackWithArray {
	public static void main(String args[]) {
		ArrayStack stack = new ArrayStack(16);
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}
}
