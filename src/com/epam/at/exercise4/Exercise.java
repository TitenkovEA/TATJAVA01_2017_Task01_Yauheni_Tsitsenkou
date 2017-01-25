package com.epam.at.exercise4;

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
     * Reads 'x' and 'y' from command line, and display 'true' or 'false' according to the task.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws IOException {
        double x = readNumber();
        double y = readNumber();

        boolean result =
                (y <= 4 && y >= 0 && x <= 2 && x >= 0) ||
                (y >= -3 && y <= 0 && x >= -4 && x <= 0);

        System.out.println(result);
    }

    private static double readNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        return Double.parseDouble(number);
    }
}
