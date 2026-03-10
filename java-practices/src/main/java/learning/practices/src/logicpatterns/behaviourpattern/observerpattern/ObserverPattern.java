package learning.practices.src.logicpatterns.behaviourpattern.observerpattern;

public class ObserverPattern {
    public static void main(String args[]) {
        PaymentService paymentService = new PaymentService();
        paymentService.addObserver(new EmailServiceObserver());
        paymentService.addObserver(new InventoryServiceObserver());
        paymentService.makePayment();
    }
}
