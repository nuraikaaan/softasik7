
import model.PizzaOrder;
import observer.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PizzaOrder order = new PizzaOrder();

        Kitchen kitchen = new Kitchen("Main Kitchen");
        DeliveryService delivery = new DeliveryService("FastDelivery");
        CustomerApp customerApp = new CustomerApp("Nurai");

        order.addObserver(kitchen);
        order.addObserver(delivery);
        order.addObserver(customerApp);

        List<String> firstOrder = Arrays.asList("Pepperoni Pizza", "Margherita");
        order.setItems(firstOrder);

        List<String> updatedOrder = Arrays.asList("Pepperoni Pizza", "Margherita", "Hawaiian");
        order.setItems(updatedOrder);

        order.removeObserver(kitchen);
        System.out.println("\n[Kitchen removed from observers]\n");

        List<String> secondOrder = Arrays.asList("Hawaiian", "Veggie");
        order.setItems(secondOrder);


    }
}
