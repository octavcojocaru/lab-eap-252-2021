package threads.ex6;

public class Join {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Begin main");
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        System.out.println("Invoking join");
        thread.join(); // thread-ul principal astepta ca thread-ul nostru sa isi termine treaba
        System.out.println("End main");
    }
}
