package learning.practices.src.javascenariobasedquestion;

interface Notifier {
	void notification(String message, String to);
}

class EmailNotification implements Notifier {

	@Override
	public void notification(String message, String to) {
		System.out.println("Send the email message: " + message + " to " + to);

	}
}

class SmsNotification implements Notifier {

	@Override
	public void notification(String message, String to) {
		System.out.println("Send the sms message: " + message + " to " + to);

	}
}

class PushNotification implements Notifier {

	@Override
	public void notification(String message, String to) {
		System.out.println("Send the push message:" + message + " to " + to);

	}
}

class NotifyService {
	private Notifier notifier;

	public NotifyService(Notifier notifier) {
		this.notifier = notifier;
	}

	public void sendNotify(String message, String to) {
		notifier.notification(message, to);
	}
}

public class Scenario14_NotificationService {
	public static void main(String args[]) {
		NotifyService notifyService1 = new  NotifyService(new EmailNotification());
		notifyService1.sendNotify("Greate news", "Abhishek");
		
		NotifyService notifyService2 = new  NotifyService(new SmsNotification());
		notifyService2.sendNotify("Otp", "112234");
		
		NotifyService notifyService3 = new  NotifyService(new PushNotification());
		notifyService3.sendNotify("Push notification", "Amit");
	}
}
