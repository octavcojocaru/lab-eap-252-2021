package arrays;

public class BiDimensionalArrays {

    public static void main(String[] args) {

        int[][] matrix = {{1, 3, 5}, {2, 4, 6}};

        for(int i = 0; i < matrix.length; i++) { // i: 0 la 1
            for(int j = 0; j < matrix[i].length; j++) { // j 0 la 2
                System.out.println(matrix[i][j]);
            }
        }
    }

}
