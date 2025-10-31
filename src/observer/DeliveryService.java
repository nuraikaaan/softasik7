package observer;

import inter.OrderObserver;
import java.util.List;

public class DeliveryService implements OrderObserver {
    private String name;

    public DeliveryService(String name) {
        this.name = name;
    }

    @Override
    public void update(List<String> items) {
        System.out.println(name + ": Ready to deliver these pizzas -> " + items);
        }
    }

