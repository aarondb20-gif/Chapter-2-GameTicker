import java.util.ArrayList;

public class GameTicker {
    ArrayList<String> updates = new ArrayList<>();

    public void addUpdate(String text){
        updates.add(text);

    }

    public void getLatestUpdate(){
        updates.getLast();

    }
}
