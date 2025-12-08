package learning.practices.src.LLD.bookMyShow.booking;

import java.util.Date;

import learning.practices.src.LLD.bookMyShow.enums.PaymentMode;
import learning.practices.src.LLD.bookMyShow.enums.PaymentStatus;

public class Payment {
	private int id;
	private double amount;
	private boolean isPaid;
	private PaymentMode paymentMode;
	private PaymentStatus paymentStatus;
	private Date date;
	public Payment() {}
	public Payment(int id, double amount, boolean isPaid, PaymentMode paymentMode, PaymentStatus paymentStatus,
			Date date) {
		super();
		this.id = id;
		this.amount = amount;
		this.isPaid = isPaid;
		this.paymentMode = paymentMode;
		this.paymentStatus = paymentStatus;
		this.date = date;
	}
	
	public void processPayment(PaymentMode paymentMode, double amount) {
        this.id = generatePaymentId();
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.isPaid = true;
        this.date = new Date();
        this.paymentStatus = PaymentStatus.SUCCESS;
    }

	private int generatePaymentId() {
        return (int) (Math.random() * (44444 - 10001 + 1) + 10001);
    }

    public int getPaymentId() {
        return id;
    }

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public boolean isPaid() {
		return isPaid;
	}
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
	public PaymentMode getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}
	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Payment [id=" + id + ", amount=" + amount + ", isPaid=" + isPaid + ", paymentMode=" + paymentMode
				+ ", paymentStatus=" + paymentStatus + ", date=" + date + "]";
	}
}
