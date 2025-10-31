package model;

import inter.OrderObserver;
import inter.OrderSubject;
import java.util.ArrayList;
import java.util.List;

public class PizzaOrder implements OrderSubject {
    private final List<OrderObserver> observers = new ArrayList<>();
    private List<String> items = new ArrayList<>();

    @Override
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(items);
        }
    }
    @Override
    public void setItems(List<String> items) {
        this.items = items;
        System.out.println("\nOrder updated: " + items);
        notifyObservers();
    }
}

