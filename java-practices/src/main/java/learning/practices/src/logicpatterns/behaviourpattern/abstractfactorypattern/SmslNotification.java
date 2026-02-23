package learning.practices.src.logicpatterns.behaviourpattern.abstractfactorypattern;

public class SmslNotification implements Notification{

	@Override
	public void send(String message) {
		System.out.println("Sms sent: " + message);
	}

}
