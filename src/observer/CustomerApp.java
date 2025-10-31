package observer;

import inter.OrderObserver;
import java.util.List;

public class CustomerApp implements OrderObserver {
    private String customerName;

    public CustomerApp(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(List<String> items) {
        System.out.println(customerName + " (App): Your order status: " + items);
    }
}

