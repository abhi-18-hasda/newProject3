package learning.practices.src.multithreading;

public class TestWithThread  extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String args[]){
        TestWithThread t1 = new TestWithThread();
        t1.start();
        
    }
}
