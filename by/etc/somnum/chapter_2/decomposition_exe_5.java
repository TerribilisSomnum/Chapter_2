package by.etc.somnum.chapter_2;

// Составить программу, которая в массиве A[n] находит второе по величине число.

import java.util.Arrays;

public class decomposition_exe_5 {

    final static int SIZE = 10;

    public static void fillWithRandomNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (1 + (int) (Math.random() * 10));
        }
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void sortArray(int[] array) {

        Arrays.sort(array);
    }

    public static int findsSecondMaxNumber(int[] array) {

        int secondMaxNumber = array[0];

        for (int i = 0; i < SIZE; i++) {
            secondMaxNumber = array[SIZE - 2];
        }
        return secondMaxNumber;
    }

    public static void main(String[] args) {

        int[] sourceArray = new int[SIZE];
        fillWithRandomNumbers(sourceArray);

        System.out.println("Массив заполненнный рандомными числами: ");
        printArray(sourceArray);

        sortArray(sourceArray);
        System.out.println("\nВторое по величине число в массиве: " + findsSecondMaxNumber(sourceArray));
    }
}
