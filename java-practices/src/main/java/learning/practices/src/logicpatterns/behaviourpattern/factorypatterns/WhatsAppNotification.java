package learning.practices.src.logicpatterns.behaviourpattern.factorypatterns;

public class WhatsAppNotification implements Notification {

	@Override
	public void send(String message) {
		System.out.println("Whatsapp sent: " + message);

	}

}
