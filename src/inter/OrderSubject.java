package inter;
import java.util.List;

public interface OrderSubject {
    void addObserver(OrderObserver observer);
    void removeObserver(OrderObserver observer);
    void setItems(List<String> items);
    void notifyObservers();
}
