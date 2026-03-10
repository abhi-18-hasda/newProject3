package learning.practices.src.logicpatterns.behaviourpattern.observerpattern;

public class InventoryServiceObserver implements Observer {

    @Override
    public void update(String status) {
        if (status.equalsIgnoreCase("FAILED")) {
            System.out.println("Payment has been Failed!!");
            System.out.println("Inventory updated failed with status: " + status);
            return;
        }
        System.out.println("Payment has been completed successfully!!");
        System.out.println("Inventory updated for status: " + status);
    }

}
