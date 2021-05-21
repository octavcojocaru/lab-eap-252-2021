package threads.ex5;

public class MyCounter {

    private int counter = 0;

    private void increment() {
        System.out.print(++counter + " ");
    }


    public static void main(String[] args) {

        MyCounter myCounter = new MyCounter();
        for(int i  = 0; i < 10; i++) {
            new Thread(myCounter::increment).start();
//            new Thread(() -> myCounter.increment()).start(); // echivalent cu mai sus
        }


//        int nr = 0;
//        int nr2 = 0;
//
//        int a = ++nr;
//        int b = nr2++;
//
//        System.out.println("nr = " + nr + " nr2 = " + nr2);
//
//        System.out.println("a = " + a + ", b = " + b);
    }

}
