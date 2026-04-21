package learning.practices.src.producerconsumerproblem;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private BlockingQueue<Message> queue;

	public Consumer(BlockingQueue<Message> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			Message message;
			while ((message = queue.take()).getMsg() != "Exit") {
				Thread.sleep(10);
				System.out.println("Consumer " + message.getMsg());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
