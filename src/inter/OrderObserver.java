package inter;
import java.util.List;

public interface OrderObserver {
    void update(List<String> items );
}
