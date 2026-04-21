package learning.practices.src.LLD.parkingspot;

import java.util.Map;

public class ParkingLevel {
	private int levelNumber;
	private Map<VehicleType, ParkingSpotManager> managers;

	public ParkingLevel(int levelNumber, Map<VehicleType, ParkingSpotManager> managers) {
		this.levelNumber = levelNumber;
		this.managers = managers;
	}

	public boolean hasAvailability(VehicleType type) {
		ParkingSpotManager manager = managers.get(type);
		return manager != null && manager.hasSpot();
	}

	public ParkingSpot park(VehicleType type) {
		ParkingSpotManager manager = managers.get(type);
		if (manager == null) {
			throw new IllegalArgumentException("No parking manager for vehicle type: " + type);
		}
		return manager.park();
	}
	
	public void unpark(VehicleType type, ParkingSpot parkingSpot) {
		ParkingSpotManager manager = managers.get(type);
		if (manager != null) {
			manager.unpark(parkingSpot);
		}
	}
	public int getLevelNumber() {
		return levelNumber;
	}
}
