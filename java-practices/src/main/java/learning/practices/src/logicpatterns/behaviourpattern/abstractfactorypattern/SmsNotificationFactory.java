package learning.practices.src.logicpatterns.behaviourpattern.abstractfactorypattern;

public class SmsNotificationFactory implements NotificationFactory{

	@Override
	public Notification createNotificationObject() {
		return new SmslNotification();
	}
}
