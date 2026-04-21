package learning.practices.src.logicpatterns.behaviourpattern.strategypattern;

public class NormalPassengerDrive implements DriveStrategy{

	@Override
	public void drive() {
		System.out.println("It is for normal drive.");
		
	}

}
