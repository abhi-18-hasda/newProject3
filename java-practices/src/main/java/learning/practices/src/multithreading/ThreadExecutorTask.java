package learning.practices.src.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutorTask {
	public static class CpuIntensiveTask implements Runnable{

		@Override
		public void run() {
			System.out.println("Running.. :"+ Thread.currentThread().getName());
			
		}
		
	}
	public static void main(String args[]) {
		int count = Runtime.getRuntime().availableProcessors();
		System.out.println(count);
		ExecutorService exePool = Executors.newFixedThreadPool(count);
		
		for(int i = 0;i<1000;i++) {
			exePool.execute(new CpuIntensiveTask());
		}
	}
}
