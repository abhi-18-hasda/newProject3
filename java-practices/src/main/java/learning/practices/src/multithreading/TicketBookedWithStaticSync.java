package learning.practices.src.multithreading;

class MyThread1 extends Thread {
    BookedTicked b1;
    int seats;

    public MyThread1(BookedTicked b1, int seats) {
        this.b1 = b1;
        this.seats = seats;
    }

    public void run() {
        b1.seats(seats);
    }
}

class MyThread2 extends Thread {
    BookedTicked b1;
    int seats;

    public MyThread2(BookedTicked b1, int seats) {
        this.b1 = b1;
        this.seats = seats;
    }

    public void run() {
        b1.seats(seats);
    }
}

public class TicketBookedWithStaticSync {
    public static void main(String args[]) {
        BookedTicked b1 = new BookedTicked();
        MyThread1 t1 = new MyThread1(b1, 7);
        t1.start();

        MyThread2 t2 = new MyThread2(b1, 6);
        t2.start();

        BookedTicked b2 = new BookedTicked();
        MyThread1 t3 = new MyThread1(b2, 7);
        t3.start();

        MyThread2 t4 = new MyThread2(b2, 6);
        t4.start();
    }
}
