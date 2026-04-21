package learning.practices.src.javascenariobasedquestion;

import java.util.concurrent.atomic.AtomicInteger;

public class Scenario10_SharedCounter_Atomic {
	private static AtomicInteger count = new AtomicInteger(0);

	public static void main(String args[]) {
		Runnable runnable = () -> {
			for (int i = 0; i < 1000; i++) {
				count.incrementAndGet();
			}
		};

		Thread[] thread = new Thread[10];
		for (int i = 0; i < 10; i++) {
			thread[i] = new Thread(runnable);
			thread[i].start();
		}

		for (Thread thread2 : thread) {
			try {
				thread2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Total count: " + count);
	}
}

