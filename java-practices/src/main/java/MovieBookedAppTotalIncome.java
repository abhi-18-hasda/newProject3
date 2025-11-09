class MyThread extends Thread {
    int income = 0;

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                income += 100;
            }
            notify();
        }
    }
}

public class MovieBookedAppTotalIncome {
    public static void main(String args[]) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        synchronized (t1) {
            t1.wait();
            System.out.println(t1.income);
        }
    }
}