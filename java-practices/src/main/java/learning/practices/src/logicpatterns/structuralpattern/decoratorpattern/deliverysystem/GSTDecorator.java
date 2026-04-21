package learning.practices.src.logicpatterns.structuralpattern.decoratorpattern.deliverysystem;

public class GSTDecorator extends OrderDecore {

	public GSTDecorator(Order order) {
		super(order);
	}

	@Override
	public double cost() {
		return order.cost() + 50;
	}

}
