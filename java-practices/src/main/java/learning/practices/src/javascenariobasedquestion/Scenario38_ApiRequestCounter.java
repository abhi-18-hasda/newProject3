package learning.practices.src.javascenariobasedquestion;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

class ApiRequestCounter {
	String name;
	AtomicInteger atomicInteger;
	ConcurrentHashMap<String, AtomicInteger> hashMap = new ConcurrentHashMap<String, AtomicInteger>();

	public void recordRequest(String name) {
		hashMap.computeIfAbsent(name, k -> new AtomicInteger()).getAndIncrement();
	}

	public int getCount(String user) {
		return hashMap.getOrDefault(user, new AtomicInteger()).get();
	}

}

public class Scenario38_ApiRequestCounter {

	public static void main(String args[]) {
		ApiRequestCounter counter = new ApiRequestCounter();

		String[] names = {
			    "Abhishek", "Abhishek", "Abhishek",
			    "Arav",
			    "Amit", "Amit"
			};

		Set<String> listOfName = new HashSet<String>();
		for(String name: names) {
			counter.recordRequest(name);
			listOfName.add(name);
		}
		listOfName.forEach(name -> System.out.println(name + ": " + counter.getCount(name)));
	}
}
