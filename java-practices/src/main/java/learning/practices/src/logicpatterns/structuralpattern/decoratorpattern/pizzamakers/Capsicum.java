package learning.practices.src.logicpatterns.structuralpattern.decoratorpattern.pizzamakers;

public class Capsicum extends PizzaDecore {

	private BasePizza basePizza;

	public Capsicum(BasePizza basePizza) {
		this.basePizza = basePizza;
	}

	@Override
	public int cost() {
		return this.basePizza.cost() + 20;
	}

}
