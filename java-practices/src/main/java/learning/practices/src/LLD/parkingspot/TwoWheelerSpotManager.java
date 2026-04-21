package learning.practices.src.LLD.parkingspot;

import java.util.List;

public class TwoWheelerSpotManager extends ParkingSpotManager{

	public TwoWheelerSpotManager(List<ParkingSpot> parkingSpots, ParkingSpotLookupStrategy strategy) {
		super(parkingSpots, strategy);
	}

}
