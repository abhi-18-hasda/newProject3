package learning.practices.src.logicpatterns.behaviourpattern.factorypatterns;

public class SmsNotification implements Notification {

	@Override
	public void send(String message) {
		System.out.println("Sms sent: " + message);
	}

}
