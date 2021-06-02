package threads;

public class SimpleDeadlock {

    final static Object lock1 = "resursa1";
    final static Object lock2 = "resursa2";

    public static void main(String[] args) {


        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 blocheaza resursa 1");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock2) { // resursa 2 va fi blocata imediat de Thread 2
                    System.out.println("Thread 1 blocheaza resursa 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2 blocheaza resursa 2");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) { // resursa 1 va fi blocata imediat de Thread 1
                    System.out.println("Thread 2 blocheaza resursa 1");
                }
            }
        });

        t1.start();
        t2.start();

        // Thread 1 cere resursa 2, dar ea este blocata de Thread 2
        // Thread 2 nu poate elibera resursa 1, caci Thread 1 nu o poate elibera
    }

}
