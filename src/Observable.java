import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private ArrayList<Observer> observers = new ArrayList<>();


    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(SystemAlert alert) {
        for (Observer observer : observers) {
            observer.notify(alert);
        }
    }
}
