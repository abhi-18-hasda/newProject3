package learning.practices.src.LLD.bookMyShow.booking;

import java.util.ArrayList;
import java.util.List;

public class Show {
	private int showId;
	private Movie movie;
	private Screen screen;
	private int showTime;
	private List<Integer> bookedSeatId = new ArrayList<Integer>();
	
	public Show() {
		
	}
	public Show(int showId, Movie movie, Screen screen, int showTime, List<Integer> bookedSeatId) {
		super();
		this.showId = showId;
		this.movie = movie;
		this.screen = screen;
		this.showTime = showTime;
		this.bookedSeatId = bookedSeatId;
	}

	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public int getShowTime() {
		return showTime;
	}
	public void setShowTime(int showTime) {
		this.showTime = showTime;
	}
	public List<Integer> getBookedSeatId() {
		return bookedSeatId;
	}
	public void setBookedSeatId(List<Integer> bookedSeatId) {
		this.bookedSeatId = bookedSeatId;
	}
	@Override
	public String toString() {
		return "Show [showId=" + showId + ", showTime=" + showTime + ", bookedSeatId=" + bookedSeatId + "]";
	}
}
