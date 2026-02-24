package learning.practices.src.logicpatterns.structuralpattern.decoratorpattern;

public abstract class OrderDecore implements Order {
	protected Order order;

	public OrderDecore(Order order) {
		this.order = order;
	}
}
