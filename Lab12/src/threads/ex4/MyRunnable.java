package threads.ex4;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Inside thread " + Thread.currentThread().getName());
            System.out.println(i);

            if(Thread.interrupted()) {
                System.out.println("Cancelling " + Thread.currentThread().getName());
                System.out.println("After Thread.interrupted(), value is now " + Thread.interrupted());
                return;
            }
            System.out.println("Finished");
        }
    }
}
