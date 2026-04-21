package learning.practices.src.logicpatterns.behaviourpattern.strategypattern;

public class SportBike extends Vehicle {

	public SportBike(DriveStrategy driveStrategy) {
		super(driveStrategy);
	}

}
