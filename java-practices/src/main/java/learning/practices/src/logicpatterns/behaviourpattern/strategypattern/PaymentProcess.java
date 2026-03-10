package learning.practices.src.logicpatterns.behaviourpattern.strategypattern;

public class PaymentProcess {
    private Strategy strategy;

    public PaymentProcess(Strategy strategy) {
        this.strategy = strategy;
    }

    public void process(double amount) {
        strategy.pay(amount);
    }
}
