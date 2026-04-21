package learning.practices.src.logicpatterns.structuralpattern.decoratorpattern.deliverysystem;

public class DecoratorPattern {
	public static void main(String args[]) {
		Order order = new BasicOrder();
		order = new GSTDecorator(order);
		order = new FastDeliveryDecore(order);
		System.out.println("Orders total cost: " + order.cost());
	}
}
