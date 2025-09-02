package Observer;

public abstract class Observer {
    public Observable observable;

    public void addObservable(Observable observable) {
        this.observable = observable;
    }

    public void removeObservable() {
        this.observable = null;
    }

    public abstract void update();
}
