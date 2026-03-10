package learning.practices.src.logicpatterns.behaviourpattern.observerpattern;

public class EmailServiceObserver implements Observer {

    @Override
    public void update(String status) {
        if (status.equalsIgnoreCase("FAILED")) {
            System.out.println("Payment has been Failed!!");
            System.out.println("Email sent with status: " + status);
            return;
        }
        System.out.println("Payment has been completed successfully!!");
        System.out.println("Email sent with status: " + status);
    }
}
