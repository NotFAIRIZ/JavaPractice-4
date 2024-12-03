public class PhoneNotifier implements Observer {
        private String phoneNumber;

        public PhoneNotifier(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        @Override
        public void notify(SystemAlert alert) {
            System.out.println("Notification to phone number: " + "'" + phoneNumber + "'" + " \nalert info: " + alert);
            System.out.println();
    }
}
