package by.etc.somnum.chapter_2;

import java.util.Scanner;

//В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратные числу К

public class one_dimensional_arrays_exe_1 {

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

    public static void printSumOfMultiples(int number, int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % number == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        int[] intArray = new int[10];
        fillWithRandomNumbers(intArray);

        System.out.println("Массив заполненнный рандомными числами: ");
        printArray(intArray);

        int userInput = 0;
        int userNumber = userInput(userInput);

        System.out.print("Сумма чисел кратных вашему числу равна: ");
        printSumOfMultiples(userNumber, intArray);
    }
}

