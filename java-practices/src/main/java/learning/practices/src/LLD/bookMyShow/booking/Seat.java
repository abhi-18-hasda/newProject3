package learning.practices.src.LLD.bookMyShow.booking;

import learning.practices.src.LLD.bookMyShow.enums.SeatCategory;

public class Seat {
	private int id;
	private int row;
	private SeatCategory seatCategory;
	public Seat() {
		
	}
	public Seat(int id, int row, SeatCategory seatCategory) {
		super();
		this.id = id;
		this.row = row;
		this.seatCategory = seatCategory;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public SeatCategory getSeatCategory() {
		return seatCategory;
	}
	public void setSeatCategory(SeatCategory seatCategory) {
		this.seatCategory = seatCategory;
	}
	@Override
	public String toString() {
		return "Seat [id=" + id + ", row=" + row + ", seatCategory=" + seatCategory + "]";
	}
}
