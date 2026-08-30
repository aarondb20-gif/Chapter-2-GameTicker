import java.util.ArrayList;

public class GameTicker implements Subject{
    protected ArrayList<String> updates = new ArrayList<>();
    protected ArrayList<Observer> observers = new ArrayList<>();

    public void addUpdate(String text){
        updates.add(text);
        notifyObservers();

    }

    public void getLatestUpdate(){
        updates.getLast();

    }

    @Override
    public void register(Observer o) {

    }

    @Override
    public void remove(Observer o) {

    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update();
        }

    }
}
