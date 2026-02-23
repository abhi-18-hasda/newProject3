package learning.practices.src.logicpatterns.behaviourpattern.abstractfactorypattern;

public class EmailNotificationFactory implements NotificationFactory{

	@Override
	public Notification createNotificationObject() {
		return new EmailNotification();
	}
}
