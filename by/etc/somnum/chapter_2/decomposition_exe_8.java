package by.etc.somnum.chapter_2;

// Задан массив D. Определить следующие  суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
// Составить методы для вычисления суммы трех последовательно расположенных элементов массива от k до m.

import java.util.Scanner;

public class decomposition_exe_8 {

    public static int userInput() {

        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        return number;
    }

    public static void fillArray(int[] array, int size) {

        for (int i = 0; i < size; i++) {
            array[i] = (1 + (int) (Math.random() * 20));
        }
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int accomulate(int[] array, int size, int from, int to) {

        if ((from > size - 1) || (to > size - 1)) {
            System.exit(1);
        }
        if (from > to) {
            System.exit(1);
        }
        int result = 0;
        for (int i = from; i <= to; i++) {
            result += array[i];
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.print("Введите размер массива: ");
        int userSize = userInput();

        int[] sourseArray = new int[userSize];
        fillArray(sourseArray, userSize);
        printArray(sourseArray);

        System.out.println("Сумма массива D[1] + D[2]+ D[3] = " + accomulate(sourseArray, userSize, 1, 3));
        System.out.println("Сумма массива D[3] + D[4]+ D[5] = " + accomulate(sourseArray, userSize, 3, 5));
        System.out.println("Сумма массива D[4] + D[5]+ D[6] = " + accomulate(sourseArray, userSize, 4, 6));
    }
}
