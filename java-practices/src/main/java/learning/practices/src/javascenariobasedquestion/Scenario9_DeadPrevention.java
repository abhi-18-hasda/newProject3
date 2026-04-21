package learning.practices.src.javascenariobasedquestion;

public class Scenario9_DeadPrevention {
	private static final Object resource1 = new Object();
	private static final Object resource2 = new Object();

	public static void main(String args[]) {
		Thread thread = new Thread(() -> {
			synchronized (resource1) {
				System.out.println("Thread 1: Locked resource1");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			System.out.println("Thread 1: Waiting for resource2");
			synchronized (resource2) {
				System.out.println("Thread 1: Locked resource2");
			}
		});

		Thread thread2 = new Thread(() -> {
			synchronized (resource2) {
				System.out.println("Thread 2: Locked resource2");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			System.out.println("Thread 2: Waiting for resource1");
			synchronized (resource1) {
				System.out.println("Thread 2: Locked resource1");
			}
		});
		thread.start();
		thread2.start();
	}
}
