package learning.practices.src.javascenariobasedquestion;

import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Scenario36_findAutoSearch {
	public static void main(String args[]) {
		TreeSet<String> products = new TreeSet<String>();
		products.add("apple");
		products.add("apricot");
		products.add("banana");
		products.add("blueberry");
		products.add("blackberry");
		products.add("cherry");

		String prefix = "ap";
		String end = prefix + Character.MAX_VALUE;
		NavigableSet<String> navigableSet = products.subSet(prefix, true, end, true);
		System.out.println("Suggestions for '" + prefix + "': " + navigableSet);
	}
}
