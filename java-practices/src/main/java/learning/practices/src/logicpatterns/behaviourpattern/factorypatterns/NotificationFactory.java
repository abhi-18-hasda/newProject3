package learning.practices.src.logicpatterns.behaviourpattern.factorypatterns;

public class NotificationFactory {
	public static Notification getInstance(String type) {
		switch (type.toLowerCase()) {
		case "email":
			return new EmailNotificationService();
		case "sms":
			return new SmsNotification();
		case "whatspp":
			return new WhatsAppNotification();
		default:
			throw new RuntimeException("Unable to create object for an invalid notification type");
		}
	}
}