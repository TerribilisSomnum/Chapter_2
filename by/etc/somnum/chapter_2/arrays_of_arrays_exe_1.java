package by.etc.somnum.chapter_2;

import java.util.ArrayList;

//Дана матрица. Вывести все нечетные столбцы, у котороых первый элемент больше последнего.

public class arrays_of_arrays_exe_1 {

    static final int SIZE = 5;

    public static void fillWithRandomNumbers(ArrayList<ArrayList<Integer>> matrix) {

        for (int column = 0; column < SIZE; column++) {
            matrix.add(new ArrayList<Integer>());
            for (int row = 0; row < SIZE; row++) {
                matrix.get(matrix.size() - 1).add(new Integer((1 + (int) (Math.random() * 10))));
            }
        }
    }

    public static void printArray(ArrayList<ArrayList<Integer>> matrix) {

        for (int column = 0; column < SIZE; column++) {
            for (int row = 0; row < SIZE; row++) {
                System.out.print(matrix.get(row).get(column) + "   ");
            }
            System.out.println();
        }
    }

    public static void printfOddColumn(ArrayList<ArrayList<Integer>> matrix) {

        for (int column = 0; column < SIZE; column += 2) {
            if (matrix.get(column).get(0).intValue() > matrix.get(column).get(SIZE - 1).intValue()) {
                System.out.println(matrix.get(column));
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        fillWithRandomNumbers(matrix);

        System.out.println("Матрица заполненнная рандомными числами: ");
        printArray(matrix);

        System.out.println();
        printfOddColumn(matrix);
    }
}

