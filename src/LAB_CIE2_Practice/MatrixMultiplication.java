package LAB_CIE2_Practice;

import java.util.concurrent.*;

public class MatrixMultiplication {

    static int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    static int[][] B = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
    static int[][] C = new int[3][3];

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final int row = i;
                final int col = j;
                pool.execute(() -> {
                    C[row][col] = 0;
                    for (int k = 0; k < 3; k++) {
                        C[row][col] += A[row][k] * B[k][col];
                    }
                });
            }
        }
        pool.shutdown();

        // Print out the result of the matrix multiplication
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}