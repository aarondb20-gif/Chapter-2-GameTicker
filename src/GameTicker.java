import java.util.ArrayList;

public class GameTicker implements Subject{
    protected ArrayList<String> updates = new ArrayList<>();
    protected ArrayList<Observer> observers = new ArrayList<>();
    private String newsData;


    public void addUpdate(String data){
        this.newsData = data;
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
            o.update(newsData);
        }

    }
}
