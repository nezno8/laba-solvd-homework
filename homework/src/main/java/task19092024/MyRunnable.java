package task19092024;

public class MyRunnable implements Runnable{


    @Override
    public void run() {
        System.out.println("MyRunnable is running: " + Thread.currentThread().getName());
    }

}
