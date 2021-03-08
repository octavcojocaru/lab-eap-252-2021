package arrays;

public class ArraysExamples {

    public static void main(String[] args) {

        int[] numbers = {1, 5, 9, 0, 4};

        System.out.println("classic for");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int sum = 0;

        System.out.println("for each");
        for (int value : numbers) {
            sum += value; // sum = sum + value
        }

        System.out.println("Sum is: " + sum);


        int[] numbers2 = new int[10];


        numbers2[0] = 200; // assigning values to individual array elements
        numbers2[4] = 10;


        for (int value : numbers2) {
            System.out.println(value);
        }
    }

}
