package observer;

import inter.OrderObserver;
import java.util.List;

public class Kitchen implements OrderObserver {
    private String name;

    public Kitchen(String name) {
        this.name = name;
    }

    public Kitchen() { }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public void update(List<String> items) {
        System.out.println(name + ": Received new order -> " + items);
        System.out.println(this.name + ": Start making the pizza!");
        }
    }
