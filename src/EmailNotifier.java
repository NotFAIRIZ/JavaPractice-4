public class EmailNotifier implements Observer {
    private String uniqueName;

    public EmailNotifier(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Mail notification to mail adress:  " + "'" + uniqueName + "'" + " \nalert info: " + alert);
        System.out.println();
    }
}
