package by.etc.somnum.chapter_2;

import java.util.Scanner;

// Даны целые числа. Вывести на печать только те числа для которых a > i.

public class one_dimensional_arrays_exe_5 {

    public static void fillWithRandomNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (1 + (int) (Math.random() * 10));
        }
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int userInput(int number) {

        Scanner reader = new Scanner(System.in);
        System.out.print("\nВведите любое число: ");
        number = reader.nextInt();
        return number;
    }

    public static void printNumbersGreaterThan(int number, int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] intArray = new int[10];
        fillWithRandomNumbers(intArray);

        System.out.println("Массив заполненнный рандомными числами: ");
        printArray(intArray);

        int userNumber = 0;
        printNumbersGreaterThan(userInput(userNumber), intArray);
    }
}

