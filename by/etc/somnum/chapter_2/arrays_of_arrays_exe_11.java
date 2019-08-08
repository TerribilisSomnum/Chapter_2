package by.etc.somnum.chapter_2;

import java.util.ArrayList;

//Дана матрица 10х20. Заполните ее случайными числами от 0 до 15.
// Вывести на экран саму матрицу и номера строк, где число 5 встречается три и более раз.

public class arrays_of_arrays_exe_11 {

    final static int ROW = 10;
    final static int COLUMN = 20;

    public static void fillWithRandomNumbers(ArrayList<ArrayList<Integer>> matrix) {

        for (int row = 0; row < ROW; row++) {
            matrix.add(new ArrayList<Integer>());
            for (int j = 0; j < COLUMN; j++) {
                matrix.get(matrix.size() - 1).add(new Integer((0 + (int) (Math.random() * 15))));
            }
        }
    }

    public static void printArray(ArrayList<ArrayList<Integer>> matrix) {

        for (int row = 0; row < ROW; row++) {
            for (int column = 0; column < COLUMN; column++) {
                System.out.print(matrix.get(row).get(column) + "   ");
            }
            System.out.println();
        }
    }

    public static void printRowNumberOccursMoreTwoTimes(ArrayList<ArrayList<Integer>> matrix) {

        System.out.print("Число 5 встречается три и более раз в строках: ");

        int count = 0;
        for (int row = 0; row < ROW; row++) {
            for (int column = 0; column < COLUMN; column++) {

                if (matrix.get(row).get(column).intValue() == 5) {
                    count++;

                    if (count > 2) {
                        int indexRow = row;
                        indexRow++;
                        System.out.print(indexRow + " ");
                    }
                }
            }
            count = 0;
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> sourseMatrix = new ArrayList<>();
        fillWithRandomNumbers(sourseMatrix);

        System.out.println("Матрица по условию задачи: ");
        printArray(sourseMatrix);

        printRowNumberOccursMoreTwoTimes(sourseMatrix);
    }
}

