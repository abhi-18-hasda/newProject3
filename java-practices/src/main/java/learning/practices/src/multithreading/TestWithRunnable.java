package learning.practices.src.multithreading;

public class TestWithRunnable implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Thread is start");
    }
    public static void main(String[] args) {
        TestWithRunnable t1 = new TestWithRunnable();
        Thread tt =new Thread(t1);
        tt.start();
    }
    
}
