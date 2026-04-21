package learning.practices.src.javascenariobasedquestion;

import java.util.PriorityQueue;

class Job {
	String task;
	int priority;

	public Job(String task, int priority) {
		this.task = task;
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Job [task=" + task + ", priority=" + priority + "]";
	}
}

public class Scenario34_TaskScheduler {
	public static void main(String args[]) {
		PriorityQueue<Job> queue = new PriorityQueue<>((j1, j2) -> Integer.compare(j2.priority, j1.priority));

		queue.add(new Job("Read Book", 3));
		queue.add(new Job("Gym workout", 2));
		queue.add(new Job("Reels watch", 1));
		queue.add(new Job("Switch company", 4));

		while (!queue.isEmpty()) {
			Job job = queue.poll();
			System.out.println(job.toString());
		}
	}
}
