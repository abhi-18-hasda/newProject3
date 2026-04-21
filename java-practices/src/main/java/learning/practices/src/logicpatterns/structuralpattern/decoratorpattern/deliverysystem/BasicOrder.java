package learning.practices.src.logicpatterns.structuralpattern.decoratorpattern.deliverysystem;

public class BasicOrder implements Order{

	@Override
	public double cost() {
		return 600;
	}
}
