package learning.practices.src.multithreading;

class bookedApp{
    int tot_seat = 10;
    synchronized void bookSeat(int seats){
        if(tot_seat>= seats){
            System.out.println("seats booked successfully");
            tot_seat-=seats;
        }else{
            System.out.println("Seats is not available: " + (tot_seat-seats));
        }
    }

}
public class TicketBookedWitoutSync extends Thread{
    
    static bookedApp app;
    int seats;
    public void run(){
        app.bookSeat(seats);
    }
    public static void main(String args[]){
        app = new bookedApp();
        TicketBookedWitoutSync t1=new TicketBookedWitoutSync();
        t1.seats = 7;
        t1.start();

        TicketBookedWitoutSync t2=new TicketBookedWitoutSync();
        t2.seats = 4;
        t2.start();
    }
}
