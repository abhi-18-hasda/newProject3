package learning.practices.src.logicpatterns.structuralpattern.decoratorpattern.pizzamakers;

public class DominozApp {
	public static void main(String args[]) {
		BasePizza basePizza = new ExtraCheese(new BBQChickenPizza());
		int cost = basePizza.cost();
		System.out.println("The total cost with extra cheese of pizza is: "+ cost);
		
		BasePizza basePizza2 = new Capsicum(new ExtraCheese(new MargheritaPizza()));
		int cost2 = basePizza2.cost();
		System.out.println("The total cost with extra cheese & capsicum of pizza is: "+ cost2);
	}
}
