package learning.practices.src.multithreading;

public class BookedTicked {
    static int tot_seats = 20;
    synchronized static void seats(int seats){
        if(tot_seats>= seats){
            tot_seats-=seats;
            System.out.println("Booked successfully! "+(tot_seats));
        }else{
            System.out.println("not booked, Seats not available: "+ (tot_seats));
        }
    }

}
