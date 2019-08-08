package by.etc.somnum.chapter_2;

import java.util.ArrayList;

//Вывести положительные элементы главной диагонали матрицы.

public class arrays_of_arrays_exe_10 {

    final static int SIZE = 5;

    public static void fillWithRandomNumbers(ArrayList<ArrayList<Integer>> matrix) {

        for (int row = 0; row < SIZE; row++) {
            matrix.add(new ArrayList<Integer>());
            for (int j = 0; j < SIZE; j++) {
                matrix.get(matrix.size() - 1).add(new Integer((-3 + (int) (Math.random() * 9))));
            }
        }
    }

    public static void printArray(ArrayList<ArrayList<Integer>> matrix) {

        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                System.out.print(matrix.get(row).get(column) + "   ");
            }
            System.out.println();
        }
    }

    public static void printPositivElementsMainDiagonal(ArrayList<ArrayList<Integer>> matrix) {

        System.out.print("Положительные элементы главной диагонали: ");
        for (int row = 0; row < SIZE; row++) {

            if (matrix.get(row).get(row).intValue() > 0) {
                System.out.print(matrix.get(row).get(row).intValue() + " ");
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> sourseMatrix = new ArrayList<>();
        fillWithRandomNumbers(sourseMatrix);

        System.out.println("Матрица по условию задачи: ");
        printArray(sourseMatrix);

        printPositivElementsMainDiagonal(sourseMatrix);
    }
}

