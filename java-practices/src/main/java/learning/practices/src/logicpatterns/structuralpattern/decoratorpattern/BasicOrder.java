package learning.practices.src.logicpatterns.structuralpattern.decoratorpattern;

public class BasicOrder implements Order{

	@Override
	public double cost() {
		return 600;
	}
}
