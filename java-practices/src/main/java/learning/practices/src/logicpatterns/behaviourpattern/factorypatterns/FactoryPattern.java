package learning.practices.src.logicpatterns.behaviourpattern.factorypatterns;

public class FactoryPattern {
	public static void main(String args[]) {
		Notification n;
		try {
			n = NotificationFactory.getInstance("email");
			n.send("Hello World: This is Email");

//			n = NotificationFactory.getInstance("sms");
//			n.send("Hello World: This is sms");

			n = NotificationFactory.getInstance("whatspp");
			n.send("Hello World: This is whatsapp");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
