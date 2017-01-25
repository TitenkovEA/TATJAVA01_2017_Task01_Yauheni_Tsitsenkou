package com.epam.at.exercise8;

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
     * Reads array and number K from command line, and
     * summarizes the numbers that are multiples of the number K.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        int N = readNumber();

        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = readNumber();
        }

        System.out.println(calculateMultiplesSum(readNumber(), array));
    }

    private static int calculateMultiplesSum(int K, int[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % K == 0) {
                result += array[i];
            }
        }

        return result;
    }

    private static int readNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        return Integer.parseInt(number);
    }
}
