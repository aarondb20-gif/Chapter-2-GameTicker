public class Main {
    public static void main(String[] args) {
        GameTicker gameTicker = new GameTicker();

        MobilePushNotification mpn = new MobilePushNotification();
        StadiumDisplay sd = new StadiumDisplay();
        SocialMediaBot smb = new SocialMediaBot();

        gameTicker.registerObserver(mpn);
        gameTicker.registerObserver(sd);
        gameTicker.registerObserver(smb);

        gameTicker.addUpdate("Cowboys vs Saints: 24 - 27.");
    }
}
