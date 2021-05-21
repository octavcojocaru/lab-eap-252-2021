package threads.ex2;

/*
    Este recomandat sa folosim Runnable, pentru ca putem si extinde alte clase. Metoda cu Thread deja extinde Thread
    Metoda cu Runnable de asemenea separa rolul claselor - in cazul asta separam partea de worker (instructiunile) de partea de creare de Thread
 */

public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from HelloRunnable");
    }
}
