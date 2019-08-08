package by.etc.somnum.chapter_2;

import java.util.Random;

import static sun.swing.MenuItemLayoutHelper.max;

/*
Задана матрица неотрицательных чисел. посчитать сумму элементов в каждом столбце.
Определить какой столюец содержит максимальную сумму.
*/

public class arrays_of_arrays_exe_9 {

    static final int SIZE = 4;

    public static void fillWithRandomNumbers(int[][] matrix) {

        for (int row = 0; row < SIZE; row++) {
            Random random = new Random();

            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    matrix[i][j] = random.nextInt((1 + (int) (Math.random() * 10)));
                }
            }
        }
    }

    public static void printArray(int[][] matrix) {

        for (int i = 0; i < SIZE; i++, System.out.println()) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(matrix[j][i] + "   ");
            }
        }
    }

    public static void printfMaxSumColumn(int[][] matrix) {

        int[] sumEachColumn = new int[SIZE];

        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                sumEachColumn[row] += matrix[row][column];
            }
        }

        int numberColumn = 1;
        int maxSum = max(sumEachColumn);
        for (int i = 0; i < SIZE; i++) {
            if (sumEachColumn[i] == maxSum) {
                numberColumn += i;
                System.out.format("Максимальная сумма элементов %d - в столбце %d", maxSum, numberColumn);
            }
        }
    }

    public static void main(String[] args) {

        int[][] sourceArray = new int[SIZE][SIZE];
        fillWithRandomNumbers(sourceArray);

        System.out.println("Матрица по условию задачи: ");
        printArray(sourceArray);

        printfMaxSumColumn(sourceArray);
    }
}

