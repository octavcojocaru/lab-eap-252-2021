package threads.ex6;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " has started");

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("i is " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " exiting");
    }
}
