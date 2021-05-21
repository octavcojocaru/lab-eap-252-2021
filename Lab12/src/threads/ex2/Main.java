package threads.ex2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Begin main");
        Thread helloThread = new Thread(new HelloRunnable());
        helloThread.start();
        System.out.println("End main");
    }
}
