package learning.practices.src.LLD.behavioral.strategy;

public class Vehicle {

    DriveStartegy driveStartegy;
    public Vehicle(DriveStartegy driveStartegy){
        this.driveStartegy = driveStartegy;
    }

    public void drive(){
        System.out.println("\n"+ this.getClass().getSimpleName()+": ");
        driveStartegy.drive();
    }
}
