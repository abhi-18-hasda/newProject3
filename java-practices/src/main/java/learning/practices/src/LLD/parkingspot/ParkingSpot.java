package learning.practices.src.LLD.parkingspot;

public class ParkingSpot {

	private String spotId;
	private boolean isEmpty = true;

	public ParkingSpot(String spotId) {
		this.spotId = spotId;
	}

	public boolean isSpotFree() {
		return isEmpty;
	}

	public void occupySpot() {
		isEmpty = false;
	}

	public void releaseSpot() {
		isEmpty = true;
	}
	
	public String getSpotId() {
		return spotId;
	}
}
