package learning.practices.src.LLD.parkingspot;

import java.time.LocalDateTime;

public class Ticket {
	private Vehicle vehicle;
    private ParkingLevel level;
    private ParkingSpot spot;
    private LocalDateTime entryTime;

    
	public Ticket(Vehicle vehicle, ParkingLevel level, ParkingSpot spot) {
		super();
		this.vehicle = vehicle;
		this.level = level;
		this.spot = spot;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public ParkingLevel getLevel() {
		return level;
	}
	public void setLevel(ParkingLevel level) {
		this.level = level;
	}
	public ParkingSpot getSpot() {
		return spot;
	}
	public void setSpot(ParkingSpot spot) {
		this.spot = spot;
	}
	public LocalDateTime getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(LocalDateTime entryTime) {
		this.entryTime = entryTime;
	}
    
}
