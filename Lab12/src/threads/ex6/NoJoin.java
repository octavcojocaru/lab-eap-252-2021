package threads.ex6;

public class NoJoin {

    public static void main(String[] args) {
        System.out.println("Begin main");
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        System.out.println("End main");
    }
}
