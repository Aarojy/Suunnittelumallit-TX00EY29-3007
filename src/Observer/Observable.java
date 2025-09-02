package Observer;

import java.util.ArrayList;

public abstract class Observable {
    private final ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observer.addObservable(this);
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observer.removeObservable();
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
