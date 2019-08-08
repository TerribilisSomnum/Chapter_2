package by.etc.somnum.chapter_2;

import java.util.ArrayList;

//Найти наибольштй элемент матрицы и заменить на него все нечетные элементы.

public class arrays_of_arrays_exe_15 {

    final static int SIZE = 4;

    public static void fillWithRandomNumbers(ArrayList<ArrayList<Integer>> matrix) {

        for (int row = 0; row < SIZE; row++) {
            matrix.add(new ArrayList<Integer>());
            for (int j = 0; j < SIZE; j++) {
                matrix.get(matrix.size() - 1).add(new Integer((0 + (int) (Math.random() * 20))));
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
        System.out.println();
    }

    public static int searchMaxElement(ArrayList<ArrayList<Integer>> matrix) {

        int maxElement = matrix.get(0).get(0);
        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE - 1; column++) {

                if (maxElement < matrix.get(row).get(column + 1).intValue()) {
                    maxElement = matrix.get(row).get(column + 1).intValue();
                }
            }
        }
        return maxElement;
    }

    public static void replacingOddElementsMaxValue(ArrayList<ArrayList<Integer>> matrix, int maxValue) {

        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column += 2) {
                matrix.get(row).set(column, new Integer(maxValue));
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> sourseMatrix = new ArrayList<>();
        fillWithRandomNumbers(sourseMatrix);

        System.out.println("Исходная матрица: ");
        printArray(sourseMatrix);

        System.out.println("Матрица по условию задачи: ");
        replacingOddElementsMaxValue(sourseMatrix, searchMaxElement(sourseMatrix));
        printArray(sourseMatrix);
    }
}

