package learning.practices.src.javascenariobasedquestion;

interface PaymentMethod {
	void pay(long amount);

	String getName();
}

class UPIPayment implements PaymentMethod {

	@Override
	public void pay(long amount) {
		System.out.println("Payment is done via UPI with the amount of: " + amount);

	}

	@Override
	public String getName() {
		return "UPI";
	}

}

class WalletPayment implements PaymentMethod {

	@Override
	public void pay(long amount) {
		System.out.println("Payment is done via wallet with the amount of: " + amount);

	}

	@Override
	public String getName() {
		return "Wallet";
	}

}

class PaymentProcess {
	public void processPayment(PaymentMethod method, long amount) {
		method.pay(amount);
	}
}

public class Scenario13_PaymentIntegration {
	public static void main(String args[]) {
		PaymentProcess paymentProcess = new PaymentProcess();
		paymentProcess.processPayment(new UPIPayment(), 400l);
		paymentProcess.processPayment(new WalletPayment(), 600l);
	}
}
