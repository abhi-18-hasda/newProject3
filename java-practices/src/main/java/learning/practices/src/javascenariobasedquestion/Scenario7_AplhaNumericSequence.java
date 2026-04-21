package learning.practices.src.javascenariobasedquestion;

public class Scenario7_AplhaNumericSequence {
	private static final int LIMIT = 26;
	private static final Object monitor = new Object();
	private static volatile boolean isLetter = false;

	public static void main(String args[]) {
		Thread letterThread = new Thread(() -> {
			for (char ch = 'A'; ch < 'A' + LIMIT; ch++) {
				synchronized (monitor) {
					while (isLetter) {
						try {
							monitor.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.err.print(ch + " ");
					isLetter = true;
					monitor.notify();
				}
			}
		});

		Thread numberThread = new Thread(() -> {
			for (int i = 1; i <= 26; i++) {
				synchronized (monitor) {
					while (!isLetter) {
						try {
							monitor.wait();
						} catch (InterruptedException e2) {
							e2.printStackTrace();
						}
					}
					System.err.println(i);
					isLetter = false;
					monitor.notify();
				}
			}
		});
		numberThread.start();
		letterThread.start();

	}
}
