package learning.practices.src.logicpatterns.behaviourpattern.strategypattern;

public class UPIStrategyService implements Strategy {

    @Override
    public void pay(double amount) {
        System.out.println("Payment done through UPI: " + amount);

    }

}
