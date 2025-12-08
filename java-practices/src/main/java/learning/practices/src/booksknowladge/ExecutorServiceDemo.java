package learning.practices.src.booksknowladge;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
	public void run() {
		System.out.println("runing: "+ Thread.currentThread().getName());
	}
}
public class ExecutorServiceDemo {
	public static void main(String args[]) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for(int i = 0;i<5;i++) {
			executorService.execute(new MyTask());
		}
		executorService.shutdown();
	}
}
