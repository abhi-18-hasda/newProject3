package learning.practices.src.javascenariobasedquestion;

class TaskEvenOdd implements Runnable {
	private int max;
	private boolean isEvenOdd;
	private Printer print;

	public TaskEvenOdd(Printer printer, int max, boolean isEvenOdd) {
		this.print = printer;
		this.max = max;
		this.isEvenOdd = isEvenOdd;
	}

	@Override
	public void run() {
		int number = isEvenOdd ? 2 : 1;
		while (number <= max) {
			if (isEvenOdd) {
				print.evenNumer(number);
			} else {
				print.oddNumber(number);
			}
			number += 2;
		}

	}
}

class Printer {

	volatile boolean isEven;

	synchronized public void evenNumer(int number) {
		while (!isEven) {
			try {
				wait();
			} catch (Exception e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println(Thread.currentThread().getName() + ":" + number);

		isEven = false;
		notify();

	}

	synchronized public void oddNumber(int number) {
		while (isEven) {
			try {
				wait();
			} catch (Exception e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println(Thread.currentThread().getName() + ":" + number);

		isEven = true;
		notify();

	}

}

public class EvenOdd_6 {
	public static void main(String args[]) {
		Printer print = new Printer();
		Thread t1 = new Thread(new TaskEvenOdd(print, 20, false), "Odd");
		Thread t2 = new Thread(new TaskEvenOdd(print, 20, true), "Even");
		t1.start();
		t2.start();
	}
}
