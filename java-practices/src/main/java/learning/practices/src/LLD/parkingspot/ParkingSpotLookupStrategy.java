package learning.practices.src.LLD.parkingspot;

import java.util.List;

public interface ParkingSpotLookupStrategy {
	ParkingSpot selectSpot(List<ParkingSpot> spot);
}
