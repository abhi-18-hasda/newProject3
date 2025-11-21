package learning.practices.src.LLD.behavioral.strategy;

public class VechielManagement {
    public static void main(String[] args) {
        Vehicle vehicle = new SportVehicle(new SportDrive());
        vehicle.drive();

        vehicle = new PassengerVechicle(new PassengerDrive());
        vehicle.drive();
    }
}
