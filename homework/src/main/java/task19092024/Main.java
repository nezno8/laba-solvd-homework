package task19092024;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread1 = new Thread(new MyRunnable(), "Thread-1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread-2");

        thread1.start();
        thread2.start();

        Callable<String> callableTask = () -> {
            return "Hello from Callable!";
        };

        FutureTask<String> futureTask = new FutureTask<>(callableTask);
        Thread callableThread = new Thread(futureTask);

        callableThread.start();

        String result = futureTask.get();

        System.out.println(result);

    }
}
