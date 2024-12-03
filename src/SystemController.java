import java.util.ArrayList;
import java.util.List;
public class SystemController extends Observable {
    private List<SystemAlert> alertHistory = new ArrayList<>();

    public SystemController(){

    }
    public void addAlert(SystemAlert alert) {
        alertHistory.add(alert);
    }

    public void informAlerts() {
        for (SystemAlert alert : alertHistory) {
            notifyObservers(alert);
        }
    }
}
