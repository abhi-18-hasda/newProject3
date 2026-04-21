package learning.practices.src.logicpatterns.structuralpattern.decoratorpattern.pizzamakers;

public class ExtraCheese extends PizzaDecore {

	private BasePizza basePizza;

	public ExtraCheese(BasePizza basePizza) {
		this.basePizza = basePizza;
	}

	@Override
	public int cost() {
		return this.basePizza.cost()  +10;
	}

}
