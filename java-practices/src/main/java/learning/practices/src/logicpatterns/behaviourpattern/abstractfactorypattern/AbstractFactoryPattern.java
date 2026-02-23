package learning.practices.src.logicpatterns.behaviourpattern.abstractfactorypattern;

public class AbstractFactoryPattern {
	public static void main(String args[]) {
		NotificationFactory factory = new EmailNotificationFactory();
		Notification notificationObject = factory.createNotificationObject();
		notificationObject.send("Hello this is for email");
		
		NotificationFactory notification = new SmsNotificationFactory();
		Notification notificationObject2 = notification.createNotificationObject();
		notificationObject2.send("Hello this is for sms");
	}
}
