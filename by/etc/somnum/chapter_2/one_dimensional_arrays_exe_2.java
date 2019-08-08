package by.etc.somnum.chapter_2;

import java.util.Scanner;

/*
Данна последовательность действительных чисел. Заменить все ее члены, больше данного Z, этим числом.
Посчитать кол-во замен.
*/

public class one_dimensional_arrays_exe_2 {

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

    public static int userInput(int number) {

        Scanner reader = new Scanner(System.in);
        System.out.print("\nВведите любое число: ");
        number = reader.nextInt();
        return number;
    }

    public static void replaceElementsGreaterThan(int number, int[] array) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                array[i] = number;
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {

        int[] intArray = new int[10];
        fillWithRandomNumbers(intArray);

        System.out.println("Массив заполненнный рандомными числами: ");
        printArray(intArray);

        int userInput = 0;
        int userNumber = userInput(userInput);

        System.out.print("Количество замен чисел больше вашего числа: ");
        replaceElementsGreaterThan(userNumber, intArray);

        printArray(intArray);
    }
}

