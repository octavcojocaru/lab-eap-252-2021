package threads.ex4;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread started");
        Thread thread = new Thread(new MyRunnable());

        thread.start();
        thread.interrupt();

        System.out.println("Main thread requested interruption of my thread");
        System.out.println("Main thread finished");
    }
}
