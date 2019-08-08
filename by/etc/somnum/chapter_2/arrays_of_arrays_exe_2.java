package by.etc.somnum.chapter_2;

import java.util.ArrayList;

//Дана квадратная матрица. Вывести все элементы стоящие на диагонали.

public class arrays_of_arrays_exe_2 {

    static final int SIZE = 3;

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

    public static void printfElementsDiagonally(ArrayList<ArrayList<Integer>> matrix) {

        for (int diagonal = 0; diagonal < SIZE; diagonal++) {
            System.out.println(matrix.get(diagonal).get(diagonal));
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        fillWithRandomNumbers(matrix);

        System.out.println("Матрица заполненнная рандомными числами: ");
        printArray(matrix);

        System.out.println();
        printfElementsDiagonally(matrix);
    }
}
