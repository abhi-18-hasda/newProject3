package learning.practices.src.LLD.parkingspot;

import java.util.List;

public class FourWheelerSpotManager extends ParkingSpotManager{

	public FourWheelerSpotManager(List<ParkingSpot> parkingSpots, ParkingSpotLookupStrategy strategy) {
		super(parkingSpots, strategy);
	}

}
