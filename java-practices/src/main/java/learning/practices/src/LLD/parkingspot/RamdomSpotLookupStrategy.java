package learning.practices.src.LLD.parkingspot;

import java.util.List;

public class RamdomSpotLookupStrategy implements ParkingSpotLookupStrategy{

	@Override
	public ParkingSpot selectSpot(List<ParkingSpot> spot) {
		for(ParkingSpot parkingSpot: spot) {
			if(parkingSpot.isSpotFree()) {
				return parkingSpot;
			}
		}
		return null;
	}

}
