import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {


        EmailNotifier not1 = new EmailNotifier("testmail123@gmail.com");
        PhoneNotifier not2 = new PhoneNotifier("+0951112345");
        SysLogNotifier not3 = new SysLogNotifier("Cool Journal log name");
        TelegramNotifier not4 = new TelegramNotifier("@userCool1337", true);

        SystemAlert alert1 = new SystemAlert(AlertSeverity.DEBUG, "debug testing"
                , 0, LocalDate.now(), "Test.exe");
        SystemAlert alert2 = new SystemAlert(AlertSeverity.INFO, "Processor load is 36%"
                , 1, LocalDate.now(), "ProcessorTest.exe");
        SystemAlert alert3 = new SystemAlert(AlertSeverity.WARNING, "Warning, you have slow internet connection!"
                , 2, LocalDate.now(), "wifi_notifier.exe");
        SystemAlert alert4 = new SystemAlert(AlertSeverity.ERROR, "Error!"
                , 404, LocalDate.now(), "chrome.exe");
        SystemAlert alert5 = new SystemAlert(AlertSeverity.CRITICAL, "Critical !!!"
                , 3, LocalDate.now(), "doom2.exe");

        SystemController systemController = new SystemController();

        systemController.addAlert(alert1);

        systemController.subscribe(not1);
        systemController.subscribe(not2);
        systemController.subscribe(not3);
        systemController.subscribe(not4);

        systemController.informAlerts();

        systemController.addAlert(alert2);

        System.out.println("Unsubscribe from not2 and not3, and add new alert:\n");

        systemController.unsubscribe(not2);
        systemController.unsubscribe(not3);
        systemController.informAlerts();

    }
}