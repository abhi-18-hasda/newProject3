package learning.practices.src.LLD.bookMyShow.booking;

import java.util.List;

import learning.practices.src.LLD.bookMyShow.enums.City;

public class Theatre {
	private int id;
	private String address;
	private List<Show> show;
	private List<Screen> screens;
	private City city;
	public Theatre() {}
	public Theatre(int id, String address, List<Show> show, List<Screen> screens, City city) {
		super();
		this.id = id;
		this.address = address;
		this.show = show;
		this.screens = screens;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Show> getShow() {
		return show;
	}
	public void setShow(List<Show> show) {
		this.show = show;
	}
	public List<Screen> getScreens() {
		return screens;
	}
	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Theatre [id=" + id + ", address=" + address + ", show=" + show + ", screens=" + screens + ", city="
				+ city + "]";
	}
}
