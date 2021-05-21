package threads.ex1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Begin main");
        HelloThread helloThread = new HelloThread();
        helloThread.start(); // folosim metoda start(), nu run()!!!
        System.out.println("End main");
    }

    /*
    Outcomes:

    1. Begin main
       End main
       Hello from HelloThread

    2. Begin main
       Hello from HelloThread
       End main

       nu stim exact ordinea executiei
     */
}
