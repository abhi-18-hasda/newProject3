package learning.practices.src.logicpatterns.structuralpattern.decoratorpattern;

public class FastDeliveryDecore extends OrderDecore {

	public FastDeliveryDecore(Order order) {
		super(order);
	}

	@Override
	public double cost() {
		return order.cost() + 100;
	}

}
