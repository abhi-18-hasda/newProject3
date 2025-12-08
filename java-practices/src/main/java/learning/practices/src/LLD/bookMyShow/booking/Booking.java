package learning.practices.src.LLD.bookMyShow.booking;

import java.util.List;

import learning.practices.src.LLD.bookMyShow.enums.BookingStatus;

public class Booking {

	private String bookingId;
	private Show show;
	private List<Seat> seats;
	private Payment payment;
	private BookingStatus bookingStatus;
	private double totalAmount;
	
	public Booking() {
	}
	public Booking(String bookingId, Show show, List<Seat> seats, Payment payment, BookingStatus bookingStatus,
			double totalAmount) {
		super();
		this.bookingId = bookingId;
		this.show = show;
		this.seats = seats;
		this.payment = payment;
		this.bookingStatus = bookingStatus;
		this.totalAmount = totalAmount;
	}
	
	public double calculateTotalAmount() {
        generateBookingId();
        return seats.size() * show.getScreen().getSeats().size() * 100;
    }

    private void generateBookingId() {
        bookingId = "BMS" + (int) (Math.random() * (52222 - 10001 + 1) + 10001);
    }

	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public Show getShow() {
		return show;
	}
	public void setShow(Show show) {
		this.show = show;
	}
	public List<Seat> getSeats() {
		return seats;
	}
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", show=" + show + ", seats=" + seats + ", payment=" + payment
				+ ", bookingStatus=" + bookingStatus + ", totalAmount=" + totalAmount + "]";
	}
}
