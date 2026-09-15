public class StadiumDisplay implements Observer{

    @Override
    public void update(Subject subject) {
        if(subject instanceof GameTicker news){
            String temp = news.getTechNews();
            System.out.println("Screen Update: " + temp);
        }

    }
}
