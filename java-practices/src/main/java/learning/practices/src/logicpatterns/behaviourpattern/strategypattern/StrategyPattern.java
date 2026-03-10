package learning.practices.src.logicpatterns.behaviourpattern.strategypattern;

public class StrategyPattern {
    public static void main(String args[]) {
        PaymentProcess upiPaymentProcess = new PaymentProcess(new UPIStrategyService());
        upiPaymentProcess.process(2000);

        PaymentProcess walletPaymentProcess = new PaymentProcess(new WalletStrategyService());
        walletPaymentProcess.process(3000);
    }
}
