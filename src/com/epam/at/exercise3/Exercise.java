package com.epam.at.exercise3;

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
     * Reads triangle's sides from command line,
     * then calculate the perimeter and area of ​​a right triangle.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        double sideA = readNumber();
        double sideB = readNumber();
        double sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

        double perimeter = sideA + sideB + sideC;
        double square = (sideA * sideB) / 2;

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Square = " + square);
    }

    private static double readNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        return Double.parseDouble(number);
    }
}
