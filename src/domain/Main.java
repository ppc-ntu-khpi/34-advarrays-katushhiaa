package domain;

import java.util.Arrays;
import java.util.Random;

public class Main {

    /**
     * Generate a matrix of given size filled with random integers
     *
     * @param rows the number of rows in the matrix
     * @param cols the number of columns in the matrix
     * @return the generated matrix
     */
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        // Fill matrix with random integers
        Arrays.setAll(matrix, i -> {
            int[] row = new int[cols];
            Arrays.setAll(row, j -> rand.nextInt(100));
            return row;
        });

        // Print matrix
        System.out.println("Матриця:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        return matrix;
    }

    /* Calculate sum of matrix elements
     *
     * @param rows
     * @param cols
     */
    public static int calculateMatrixSum(int[][] matrix) {
        return Arrays.stream(matrix).flatMapToInt(row -> Arrays.stream(row)).sum();
    }

    /**
     * Output the sum of matrix elements
     *
     * @param rows
     * @param cols
     */
    public static void MatrixSumOutput(int rows, int cols) {
        int[][] matrix = generateMatrix(rows, cols);
        int sum = calculateMatrixSum(matrix);
        System.out.println("Сума елементів матриці: " + sum);
    }
}
