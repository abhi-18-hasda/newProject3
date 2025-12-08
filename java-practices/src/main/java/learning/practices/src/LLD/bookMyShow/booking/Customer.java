package learning.practices.src.LLD.bookMyShow.booking;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String custId;
	private String name;
	private String email;
	private String phoneNo;
	private String address;
	private String password;
	private List<Booking> bookings;
	public Customer(String custId, String name, String email, String phoneNo, String address, String password) {
		super();
		this.custId = custId;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
		this.password = password;
		this.bookings = new ArrayList<Booking>();
	}
	public void addBooking(Booking booking) {
        bookings.add(booking);
    }

	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Booking> getBookings() {
		return bookings;
	}
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo
				+ ", address=" + address + ", password=" + password + ", bookings=" + bookings + "]";
	}
}
