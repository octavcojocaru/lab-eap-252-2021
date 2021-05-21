package threads.ex3;

public class SleepExample2 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Somebody tried to interrupt");
                return;
            }
        }
    }
}
