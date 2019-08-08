package by.etc.somnum.chapter_2;

import java.util.ArrayList;
import java.util.Scanner;

//Дана матрица. Вывести k-ю строку и  p-й столбец.

public class arrays_of_arrays_exe_3 {

    static final int SIZE = 3;

    public static void fillWithRandomNumbers(ArrayList<ArrayList<Integer>> matrix) {

        for (int row = 0; row < SIZE; row++) {
            matrix.add(new ArrayList<Integer>());
            for (int column = 0; column < SIZE; column++) {
                matrix.get(matrix.size() - 1).add(new Integer((1 + (int) (Math.random() * 10))));
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

    public static int userInput() {

        Scanner reader = new Scanner(System.in);
        System.out.format("\nВведите любое число от 1 до %d: ", SIZE);
        int number = reader.nextInt();
        while((number > SIZE) || (number < 1)) {
            System.out.println("Попробуй снова!");
            System.out.format("\nВведите любое число от 1 до %d: ", SIZE);
            number = reader.nextInt();
        }
        return number;
    }

    public static void printfUserRowColumn(ArrayList<ArrayList<Integer>> matrix, int userRow, int userColumn) {

        System.out.print(matrix.get(userRow - 1));

        System.out.println();
        System.out.print("[");
        for (int row = 0; row < SIZE; row++) {
            System.out.print(matrix.get(row).get(userColumn - 1) + "," + " ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        fillWithRandomNumbers(matrix);

        System.out.println("Матрица заполненнная рандомными числами: ");
        printArray(matrix);

        int row = userInput();
        int column = userInput();

        System.out.println();
        printfUserRowColumn(matrix, row, column);
    }
}

