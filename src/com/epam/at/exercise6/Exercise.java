package com.epam.at.exercise6;

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
     * Reads 3 arguments from command line, then searches max and min values
     * and sums them.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        double[] numbers = new double[3];
        double resultSum;

        for (int i = 0; i < 3; i++) {
            numbers[i] = readNumber();
        }

        resultSum = getMax(numbers) + getMin(numbers);
        System.out.println(resultSum);
    }

    private static double getMax(double[] array) {
        double max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    private static double getMin(double[] array) {
        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    private static double readNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        return Double.parseDouble(number);
    }
}
