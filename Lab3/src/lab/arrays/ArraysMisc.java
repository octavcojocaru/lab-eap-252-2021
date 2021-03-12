package lab.arrays;

import java.util.Arrays;

public class ArraysMisc {

    public static void main(String[] args) {
        int[] array = {5, 7, 10, 200, 300, 2};

        System.out.println("---Sorting---");

        Arrays.sort(array); // schimbarile se fac direct pe obiect

        for (int i: array) {
            System.out.println(i);
        }

        System.out.println("----Search0----");

        int index = Arrays.binarySearch(array, 10);

        System.out.println("Index of element: " + index);

        int indexNonExistent = Arrays.binarySearch(array, 1);
        System.out.println("Index of 1: " + indexNonExistent);



        System.out.println("----Copy arrays----");

        int[] copiedArray = Arrays.copyOf(array, array.length);

        for (int i: copiedArray) {
            System.out.println(i);
        }

        int[] copiedArray2 = Arrays.copyOf(array, 3);

        for(int i: copiedArray2) {
            System.out.println(i);
        }

        System.out.println("----SubArrays----");

        int[] array2 = {1, 5, 7, 9, 2, 5, 100};
        int[] copiedSubArray = Arrays.copyOfRange(array2, 2, 5);

        for(int i: copiedSubArray) {
            System.out.print(i + " ");
        }

        System.out.println("----Fill----");

        int[] newArray = new int[10];
        Arrays.fill(newArray, 66);
        Arrays.fill(newArray, 3, 5, 77);

        System.out.println("Filled array: ");
        for(int i: newArray) {
            System.out.print(i + " ");
        }

    }
}
