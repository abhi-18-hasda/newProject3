package learning.practices.src.booksknowladge;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		System.out.println("callable method got called");
		return "Task completed!!!";
	}
	
}
public class Main {

	public static void main(String args[]) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<String> future = executorService.submit(new MyCallable());
		String string = future.get();
		System.out.println(string);
		executorService.shutdown();
	}
}
