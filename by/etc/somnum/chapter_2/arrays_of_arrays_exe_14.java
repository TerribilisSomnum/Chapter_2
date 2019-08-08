package by.etc.somnum.chapter_2;

import java.util.ArrayList;
import java.util.Scanner;

//Сформулировать случайную матрицу M x N, состоящую из нулей и единиц,
//причем в каждом столбце число единиц равно номеру столбцу.

public class arrays_of_arrays_exe_14 {

    public static int userInputRow() {

        Scanner reader = new Scanner(System.in);
        int size = reader.nextInt();
        return size;
    }

    public static int userInputColumn(int row) {

        Scanner reader = new Scanner(System.in);
        int size = reader.nextInt();
        while (size > row) {
            System.out.println("Попробуй снова: ");
            size = reader.nextInt();
        }
        return size;
    }

    public static void fillWithRandomNumbers(ArrayList<ArrayList<Integer>> matrix, int sizeRow, int sizeColumn) {

        for (int i = 0; i < sizeRow; i++) {
            matrix.add(new ArrayList<Integer>());
            for (int j = 0; j < sizeColumn; j++) {
                matrix.get(matrix.size() - 1).add(new Integer(0));
            }
        }
    }

    public static void printArray(ArrayList<ArrayList<Integer>> matrix, int sizeRow, int sizeColumn) {

        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeColumn; j++) {
                System.out.format("%d  ", matrix.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void insertUnits(ArrayList<ArrayList<Integer>> matrix, int sizeRow, int sizeColumn) {

        int count = 0;
        for (int i = 0; i < sizeRow; i++) {
            for (int j = count; j < sizeColumn; j++) {
                matrix.get(i).set(j, new Integer(1));
            }
            count++;
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        System.out.print("Введите количество строк: ");
        int userRow = userInputRow();

        System.out.print("Введите количество столбцов, которые меньше количеству строк: ");
        int userColumn = userInputColumn(userRow);

        fillWithRandomNumbers(matrix, userRow, userColumn);

        System.out.println("Матрица по условию задачи: ");
        insertUnits(matrix, userRow, userColumn);
        printArray(matrix, userRow, userColumn);
    }
}

