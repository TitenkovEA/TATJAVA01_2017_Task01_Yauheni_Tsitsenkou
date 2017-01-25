package com.epam.at.exercise9;


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
     * Reads 2 arrays and number K from command line,
     * and puts second array between the(k and k+1) elements of the first array.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        int firstArrayLength = readNumber();
        int[] firstArray = new int[firstArrayLength];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = readNumber();
        }

        int secondArrayLength = readNumber();
        int[] secondArray = new int[secondArrayLength];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = readNumber();
        }

        int K = readNumber();
        int[] newArray = combineArrays(firstArray, K, secondArray);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    private static int[] combineArrays(int[] firstArray, int index, int[] secondArray) {
        int[] newArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = firstArray[i];
            } else if (i - index < secondArray.length){
                newArray[i] = secondArray[i - index];
            } else {
                newArray[i] = firstArray[i - secondArray.length];
            }
        }
        return newArray;
    }

    private static int readNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        return Integer.parseInt(number);
    }
}
