package learning.practices.src.javascenariobasedquestion;

import java.util.LinkedList;
import java.util.Queue;

class QueueStack {
	Queue<String> q1;
	Queue<String> q2;

	public QueueStack() {
		this.q1 = new LinkedList<String>();
		this.q2 = new LinkedList<String>();
	}

	public void push(String data) {
		q2.offer(data);

		while (!q1.isEmpty()) {
			q2.offer(q1.poll());
		}
		Queue<String> temp = q1;
		q1 = q2;
		q2 = temp;
	}

	public String pop() {
		if (q1.isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return q1.poll();
	}

	public String peek() {
		if (q1.isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return q1.peek();
	}

	public boolean isEmpty() {
		return q1.isEmpty();
	}

	public int size() {
		return q1.size();
	}
}

public class Scenario26_Stack_Using_Queues {
	public static void main(String args[]) {
		QueueStack stack = new QueueStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");

		System.out.println("Top element: " + stack.peek()); // Expected: C
		System.out.println("Popped element: " + stack.pop()); // Expected: C
		System.out.println("Top element after pop: " + stack.peek()); // Expected: B
		System.out.println("Is stack empty? " + stack.isEmpty()); // Expected: false
		System.out.println("Stack size: " + stack.size()); // Expected: 2
		stack.pop();
		stack.pop();
		System.out.println("Is stack empty? " + stack.isEmpty()); // Expected: true
	}
}
