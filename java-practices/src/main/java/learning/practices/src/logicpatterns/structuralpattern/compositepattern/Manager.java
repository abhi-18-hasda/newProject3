package learning.practices.src.logicpatterns.structuralpattern.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

	private String managerName;
	private List<Employee> employees = new ArrayList<Employee>();

	public Manager(String manager) {
		this.managerName = manager;
	}

	public void add(Employee e) {
		employees.add(e);
	}

	@Override
	public void showDetails() {
		System.out.println("Manager: " + managerName);

		for (Employee e : employees) {
			e.showDetails();
		}
	}

}
