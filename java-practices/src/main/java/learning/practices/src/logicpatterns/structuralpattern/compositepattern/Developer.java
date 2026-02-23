package learning.practices.src.logicpatterns.structuralpattern.compositepattern;

public class Developer implements Employee {

	private String empName;

	public Developer(String empName) {
		this.empName = empName;
	}

	@Override
	public void showDetails() {
		System.out.println("Developer: "+ empName);

	}

}
