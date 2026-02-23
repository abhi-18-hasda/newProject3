package learning.practices.src.logicpatterns.behaviourpattern.factorypatterns;

public class EmailNotificationService implements Notification{

	@Override
	public void send(String message) {
		System.out.println("Email sent: " + message);
	}

}
