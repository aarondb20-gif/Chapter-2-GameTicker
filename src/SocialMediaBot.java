public class SocialMediaBot implements Observer{


    @Override
    public void update(Subject subject) {
        if(subject instanceof GameTicker news){
            String temp = news.getSportsNews();
            System.out.println("TWEET: " + temp + " #GameDay");
        }

    }
    

}
