package learning.practices.src.logicpatterns.structuralpattern.compositepattern;

public class CompositePattern {
	public static void main(String args[]) {
		Employee employee1 = new Developer("Abhishek");
		Employee employee3 = new Developer("Amit");
		Employee employee2 = new Developer("Sumit");

		Manager lead = new Manager("Ashim");
		lead.add(employee1);
		lead.add(employee2);
		lead.add(employee3);

		Manager manager = new Manager("Ankit");
		manager.add(lead);

		manager.showDetails();
	}
}
