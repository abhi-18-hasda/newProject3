package learning.practices.src.logicpatterns.behaviourpattern.strategypattern;

public class WalletStrategyService implements Strategy {

    @Override
    public void pay(double amount) {
        System.out.println("Payment done through Wallet: " + amount);

    }

}
