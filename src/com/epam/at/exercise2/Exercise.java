package com.epam.at.exercise2;

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
     * Reads 3 numbers from command line,
     * then calculates the value of the expression according to the formula of the task.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        double a = readNumber();
        double b = readNumber();
        double c = readNumber();

        double numerator = b + Math.sqrt(Math.pow(b, 2) + (4 * a * c));
        double denominator = 2 * a;

        double result = numerator / denominator - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(result);
    }

    private static double readNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        return Double.parseDouble(number);
    }
}
