import java.util.ArrayList;
import java.util.List;

public class GameTicker implements Subject{
    protected ArrayList<String> updates = new ArrayList<>();
    protected final List<Observer> observers = new ArrayList<>();

    private String sportsNews;
    private String techNews;
    private String weatherNews;
    private String politicsNews;

    public String getSportsNews(){
        return sportsNews;
    }
    public String getTechNews(){
        return techNews;

    }
    public String getWeatherNews(){
        return weatherNews;
    }

    public String getPoliticsNews(){
        return politicsNews;
    }
    public void setNewsUpdate(String sportsNews, String techNews, String weatherNews, String politicsNews){
        this.sportsNews = sportsNews;
        this.techNews = techNews;
        this.weatherNews = weatherNews;
        this.politicsNews = politicsNews;
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
            o.update(this);

        }

    }
}
