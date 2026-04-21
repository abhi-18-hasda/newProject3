package learning.practices.src.logicpatterns.behaviourpattern.strategypattern;

public class NormalPassenger extends Vehicle{

	public NormalPassenger(DriveStrategy driveStrategy) {
		super(driveStrategy);
	}

}
