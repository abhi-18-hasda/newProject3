package learning.practices.src.LLD.parkingspot;

import java.util.List;

public class ParkingBuilding {

	private List<ParkingLevel> levels;
	public ParkingBuilding(List<ParkingLevel> levels) {
		this.levels = levels;
	}
	
	Ticket allocate(Vehicle vehicle) {
		for(ParkingLevel level: levels) {
			if(level.hasAvailability(vehicle.getType())) {
				ParkingSpot parkingSpot = level.park(vehicle.getType());
				if(parkingSpot!=null) {
					Ticket ticket = new Ticket(vehicle, level, parkingSpot);
					System.out.println("Parking allocated at level: "
                            + level.getLevelNumber()
                            + " Parking Spot: " + parkingSpot.getSpotId());
                    return ticket;

				}
			}
		}
		throw new RuntimeException("Parking Full");
	}
	
	public void release(Ticket ticket) {
		ticket.getLevel().unpark(ticket.getVehicle().getType(), ticket.getSpot());
	}
}
