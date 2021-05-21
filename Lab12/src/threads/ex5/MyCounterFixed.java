package threads.ex5;

public class MyCounterFixed {

    private int counter = 0;

    private final Object lock = new Object();

    private synchronized void increment() { // metoda sincronizata - doar un thread poate accesa metoda la un timp dat; celelalte thread-uri trebuie sa astepte.
        System.out.print(++counter + " ");
    }

    private void increment2() {
        synchronized (this) {
            System.out.print(++counter + " ");
        }
    }

    public void increment3() {
        synchronized (lock) {
            System.out.print(++counter + " ");
        }
    }

    public static void main(String[] args) {

        MyCounterFixed myCounter = new MyCounterFixed();
        for (int i = 0; i < 10; i++) {
            new Thread(myCounter::increment3).start();
        }

    }
}
