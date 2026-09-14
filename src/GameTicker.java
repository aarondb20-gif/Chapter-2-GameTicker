import java.util.ArrayList;
import java.util.List;

public class GameTicker implements Subject{
    protected ArrayList<String> updates = new ArrayList<>();
    protected final List<Observer> observers = new ArrayList<>();

    protected String data;

    public void addUpdate(String data){
        this.data = data;
        notifyObservers();

    }

    public void getLatestUpdate(){
        updates.getLast();

    }

    @Override
    public void registerObserver(Observer o) {
        //add observers
        observers.add(o);

    }

    @Override
    public void remove(Observer o) {
        // remove observers
        observers.remove(o);

    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(data);
        }

    }
}
