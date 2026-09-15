public class MobilePushNotification implements Observer{


    @Override
    public void update(Subject subject) {
        if(subject instanceof GameTicker news){
            String temp = news.getWeatherNews();
            System.out.println("Push Alert: " + temp);
        }

    }


}
