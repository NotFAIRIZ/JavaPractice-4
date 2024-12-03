public class TelegramNotifier implements Observer {

    private String userID;
    private Boolean isInstant;

    public TelegramNotifier(String userID, boolean isInstant) {
        this.userID = userID;
        this.isInstant = isInstant;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Telegram notification to user: " + "'" + userID + "'" + " \nalert info: " + alert
                + "did alert recived instantly?: " + isInstant);
        System.out.println();
    }

}
