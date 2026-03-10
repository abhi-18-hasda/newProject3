package learning.practices.src.logicpatterns.behaviourpattern.observerpattern;

public interface Subject {
    public void addObserver(Observer observer);

    public void notifyObserver(String message);
}
