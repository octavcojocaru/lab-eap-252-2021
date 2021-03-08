package arrays;

public class ArraysExercises {



    public static void main(String[] args) {

        // dat fiind un array de float de dimensiune 8, adunati valoarea fiecarui element cu valoarea vecinilor sai imediati
        float[] numbers = {3.0f, 5.0f, 7.0f, 3.0f, 1.0f, 1.0f, 4.0f, 5.0f};

        addingNeighbors(numbers);


        // date find 2 array-uri de int, printati numerele comune.
        int[] arr1 = {100, 4, 6, 11, 20};
        int[] arr2 = {50, 5, 6, 90, 20};

        commonNumbers(arr1, arr2);

    }

    private static void addingNeighbors(float[] numbers) {
        for (int i = 1; i < numbers.length - 1; i++) {
            numbers[i] += numbers[i - 1] + numbers[i + 1];
        }

        for (float val : numbers) {
            System.out.println(val);
        }
    }

    private static void commonNumbers(int[] arr1, int[] arr2) {
        for (int a : arr1) {
            for (int b : arr2) {
                if (a == b) {
                    System.out.println("Found common element: " + a);
                }
            }
        }
    }

}
