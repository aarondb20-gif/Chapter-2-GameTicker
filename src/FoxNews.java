import javax.xml.transform.Source;

public class FoxNews implements Observer{
    @Override
    public void update(String data) {
        System.out.println("Fox News Update: " + data);
    }
}
