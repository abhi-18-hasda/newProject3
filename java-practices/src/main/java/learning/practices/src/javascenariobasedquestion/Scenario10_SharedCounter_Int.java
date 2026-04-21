package learning.practices.src.javascenariobasedquestion;

public class Scenario10_SharedCounter_Int {
	private static int count = 0;

	public static void main(String args[]) {
		Runnable runnable = () -> {
			for (int i = 0; i < 1000; i++) {
				count++;
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
