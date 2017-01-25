package com.epam.at.exercise1;

import java.io.*;

/**
 * Contains application entry point.
 *
 * @author Eugeny Titenkov
 */
public class Exercise {
    /**
     * Reads four-digit number from command line,
     * then display 'true' if 'the sum of the first two digits of the four-digit number is
     * equal to the sum of his last two digits', else display 'false'.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int fullNumber = readNumber();

        if (fullNumber / 10000 >= 1) {
            throw new Exception("Invalid number");
        } else {
            int firstSum = (fullNumber / 1000) + ((fullNumber / 100) % 10);
            int secondSum = (fullNumber % 10) + ((fullNumber / 10) % 10);
            boolean result = firstSum == secondSum;
            System.out.println(result);
        }
    }

    private static int readNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        return Integer.parseInt(number);
    }
}
