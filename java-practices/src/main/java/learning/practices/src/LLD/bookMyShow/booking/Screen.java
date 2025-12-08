package learning.practices.src.LLD.bookMyShow.booking;

import java.util.List;

public class Screen {
	private int id;
	private List<Seat> seats;
	public Screen() {
		
	}
	public Screen(int id, List<Seat> seats) {
		super();
		this.id = id;
		this.seats = seats;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Seat> getSeats() {
		return seats;
	}
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "Screen [id=" + id + "]";
	}
}
