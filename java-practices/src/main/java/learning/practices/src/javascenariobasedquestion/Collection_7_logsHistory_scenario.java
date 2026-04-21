package learning.practices.src.javascenariobasedquestion;

import java.util.ArrayDeque;
import java.util.Queue;

public class Collection_7_logsHistory_scenario {
	private static final int MAX_SIZE = 10;
	public static void main(String args[]) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		for(int i=0;i<=50;i++) {
			if(queue.size() == MAX_SIZE) {
				queue.poll();
			}
			queue.add(i);
		}
		
		queue.forEach(System.out::println);
	}
}
