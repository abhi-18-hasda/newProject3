package learning.practices.src.LLD.behavioral.strategy;

public class PassengerDrive implements DriveStartegy{

    @Override
    public void drive() {
        System.out.println("Drive with the passenger car");
    }
    
}
