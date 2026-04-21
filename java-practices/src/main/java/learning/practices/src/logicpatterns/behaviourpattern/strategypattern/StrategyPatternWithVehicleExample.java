package learning.practices.src.logicpatterns.behaviourpattern.strategypattern;

public class StrategyPatternWithVehicleExample {
	public static void main(String args[]) {
		Vehicle vehicle = new SportBike(new SportDrive());
		vehicle.drive();

		vehicle = new NormalPassenger(new NormalPassengerDrive());
		vehicle.drive();
	}
}
