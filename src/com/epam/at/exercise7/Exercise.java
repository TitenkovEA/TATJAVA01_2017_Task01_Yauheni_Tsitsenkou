package com.epam.at.exercise7;

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
     * Reads start point, end point and step values from command line, then calculates function and
     * displays result in table, creates list of results, where first column is the argument value,
     * and the second column is the function value.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        double a = readNumber();
        double b = readNumber();
        double h = readNumber();

        System.out.println(" x | F(x)");
        do {
            System.out.printf(" %s | %s \n" , a, calculateFunction(a));
            a += h;
        } while (a <= b);
    }

    private static double calculateFunction(double x) {
        return Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
    }

    private static double readNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        return Double.parseDouble(number);
    }
}
