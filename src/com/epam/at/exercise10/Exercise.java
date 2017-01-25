package com.epam.at.exercise10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Contains application entry point.
 *
 * @author Eugeny Titenkov
 */
public class Exercise {
    /**
     * Reads 'n' from command line, then creates square matrix of order 'n' according to the task
     * and display it.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int n = readNumber();
        if (n % 2 != 0) {
            throw new Exception("Invalid order of the matrix.");
        }

        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = n - j;
                }
            }
        }

        for (int[] aMatrix : matrix) {
            for (int anAMatrix : aMatrix) {
                System.out.print(" " + anAMatrix + " ");
            }
            System.out.println();
        }
    }

    private static int readNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        return Integer.parseInt(number);
    }
}
