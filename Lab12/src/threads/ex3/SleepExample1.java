package threads.ex3;

public class SleepExample1 {

    public static void main(String[] args) throws InterruptedException{
        for(int i = 0; i < 10; i++) {
            Thread.sleep(1000); // suspenda thread-ul curent pentru un anumit timp (precizat)
            System.out.print(i);
        }
    }
}
