package com.epam.at.exercise5;

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
     * Reads 3 arguments from command line, then raises argument to power 2, if it is positive,
     * and to power 2, if it is negative.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        double result;
        double[] numbers = new double[3];

        for (int i = 0; i < 3; i++) {
            numbers[i] = readNumber();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                result = Math.pow(numbers[i], 2);
            } else if (numbers[i] < 0) {
                result = Math.pow(numbers[i], 4);
            } else {
                result = numbers[i];
            }

            System.out.println(result);
        }
    }

    private static double readNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        return Double.parseDouble(number);
    }
}
