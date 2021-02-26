package exercises;

public class Ex4 {
    public static void main(String[] args) {

        // simple for loop
        //Statement 1 is executed one time before the execution of the code block.
        //
        //Statement 2 defines the condition for executing the code block.
        //
        //Statement 3 is executed every time after the code block has been executed.

        /*
        for (statement 1; statement 2; statement 3) {
            // code block to be executed
}
         */

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // for each loop

        int[] array = {1, 2, 3, 4};
        for (int i : array) {
            System.out.println(i);
        }

        int nr = 5;

        switch (nr) {
            case 1 :
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 5:
                System.out.println("Number is 5");
                break;
            default:
                System.out.println("Other : " + nr);
        }

        // continue

        for(int i = 0; i< 10; i++) {
            if(i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // break

        for(int i = 0; i< 10; i++) {
            if(i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
