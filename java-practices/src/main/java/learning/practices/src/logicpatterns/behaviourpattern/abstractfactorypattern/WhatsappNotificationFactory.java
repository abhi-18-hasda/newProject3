package learning.practices.src.logicpatterns.behaviourpattern.abstractfactorypattern;

public class WhatsappNotificationFactory implements NotificationFactory{

	@Override
	public Notification createNotificationObject() {
		return new WhatsappNotification();
	}
}
