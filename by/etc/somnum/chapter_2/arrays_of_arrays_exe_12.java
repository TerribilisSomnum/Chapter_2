package by.etc.somnum.chapter_2;

import java.util.Random;

//Отсортировать строки матрицы по возрастанию и убыванию.

public class arrays_of_arrays_exe_12 {

    final static int SIZE = 6;

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

        for (int row = 0; row < SIZE; row++, System.out.println()) {
            for (int column = 0; column < SIZE; column++) {
                System.out.print(matrix[row][column] + "   ");
            }
        }
    }

    public static void sortSomeMatrixAscending(int[][] matrix) {

        for (int i = 0; i < SIZE; i++) {
            printSortAscending(matrix[i]);
        }
    }

    public static void printSortAscending(int[] matrix) {

        for (int i = 0; i < SIZE - 1; i++) {

            int min_idx = i;
            for (int j = i + 1; j < SIZE; j++) {

                if (matrix[j] < matrix[min_idx]) {
                    min_idx = j;

                    int temp = matrix[min_idx];
                    matrix[min_idx] = matrix[i];
                    matrix[i] = temp;
                }
            }
        }
    }

    public static void sortSomeMatrixDescending(int[][] matrix) {

        for (int i = 0; i < SIZE; i++) {
            printSortDescending(matrix[i]);
        }
    }

    public static void printSortDescending(int[] matrix) {

        for (int i = 0; i < SIZE - 1; i++) {

            int min_idx = i;
            for (int j = i + 1; j < SIZE; j++) {

                if (matrix[j] > matrix[min_idx]) {
                    min_idx = j;

                    int temp = matrix[min_idx];
                    matrix[min_idx] = matrix[i];
                    matrix[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] sourceArray = new int[SIZE][SIZE];
        fillWithRandomNumbers(sourceArray);

        System.out.println("Матрица по условию задачи: ");
        printArray(sourceArray);

        System.out.println("Сортировка по возрастанию: ");
        sortSomeMatrixAscending(sourceArray);
        printArray(sourceArray);

        System.out.println("Сортировка по убыванию: ");
        sortSomeMatrixDescending(sourceArray);
        printArray(sourceArray);
    }
}
