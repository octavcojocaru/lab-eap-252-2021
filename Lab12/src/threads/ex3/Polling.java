package threads.ex3;

public class Polling {

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                try {
                    Thread.sleep(100); // Thread.sleep() suspenda thread-ul curent
                    counter++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        while (counter < 400) {
            System.out.println(counter);
            System.out.println("Not reached yet");
            Thread.sleep(1000); // aici ne referim la thread-ul principal al aplicatiei
        }

        System.out.println("Reached 400");
    }
}
