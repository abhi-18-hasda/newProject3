package learning.practices.src.logicpatterns.behaviourpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class PaymentService implements Subject {

    List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void makePayment() {
        notifyObserver("success");
    }

}
