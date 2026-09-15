public class Main {
    public static void main(String[] args) {
        GameTicker gameTicker = new GameTicker();

        MobilePushNotification mpn = new MobilePushNotification();
        StadiumDisplay sd = new StadiumDisplay();
        SocialMediaBot smb = new SocialMediaBot();
        FoxNews fn = new FoxNews();

        gameTicker.registerObserver(mpn);
        gameTicker.registerObserver(sd);
        gameTicker.registerObserver(smb);
        gameTicker.registerObserver(fn);

        gameTicker.setNewsUpdate(
                "Saints vs Lions: 30-31",
                "Laptop on Sale!",
                "Flash Flood Warning!",
                "White House Press Conference.");


    }
}
