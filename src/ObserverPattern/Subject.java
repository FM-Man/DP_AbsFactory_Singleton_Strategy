package ObserverPattern;

import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> observers;
    private int number;

    public Subject(){
        observers = new ArrayList<>();
    }

    public Subject(int number){
        observers = new ArrayList<>();
        setNumber(number);
    }

    public void attach(Observer o){
        observers.add(o);
    }

    public void detach(Observer o){
        observers.remove(o);
    }

    public void setNumber(int number){
        this.number = number;
        notifyObservers();
    }

    private void notifyObservers(){
        for (Observer o: observers){
            o.update(number);
        }
    }

}
