package learning.practices.src.LLD.parkingspot;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public abstract class ParkingSpotManager {

	List<ParkingSpot> parkingSpots;
	ParkingSpotLookupStrategy strategy;
	private ReentrantLock lock = new ReentrantLock(true);

	public ParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingSpotLookupStrategy strategy) {
		this.parkingSpots = parkingSpots;
		this.strategy = strategy;
	}
	
	public ParkingSpot park() {
		lock.lock();
		try {
			ParkingSpot parkingSpot = strategy.selectSpot(parkingSpots);
			if(parkingSpot == null) {
				return null;
			}
			parkingSpot.occupySpot();
			return parkingSpot;
		}finally {
			lock.unlock();
		}
	}
	
	public void unpark(ParkingSpot parkingSpot) {
		lock.lock();
		try {
			parkingSpot.releaseSpot();
		}finally {
			lock.unlock();
		}
	}

	public boolean hasSpot() {
		lock.lock();
		try {
			return parkingSpots.stream().anyMatch(ParkingSpot::isSpotFree);
		}finally {
			lock.unlock();
		}
	}
}
