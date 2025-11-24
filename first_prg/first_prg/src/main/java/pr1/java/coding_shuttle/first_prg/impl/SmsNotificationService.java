package pr1.java.coding_shuttle.first_prg.impl;

import pr1.java.coding_shuttle.first_prg.NotificationService;

public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sms sending ..."+message);
    }
}
