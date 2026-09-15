import javax.xml.transform.Source;

public class FoxNews implements Observer{
    @Override
    public void update(Subject subject) {
        if(subject instanceof GameTicker news){
            String temp = news.getPoliticsNews();
            System.out.println("Fox News Update: " + temp);
        }

    }
}
