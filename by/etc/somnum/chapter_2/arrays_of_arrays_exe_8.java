package by.etc.somnum.chapter_2;

import java.util.Random;
import java.util.Scanner;

/*
В числовой матрице поменять метсами два столбца любых столбцов.
Номера столбцов вводит пользователь с клавиатуры
*/

public class arrays_of_arrays_exe_8 {

    static final int SIZE = 4;

    public static int userInput() {

        Scanner reader = new Scanner(System.in);
        int userColumn = reader.nextInt();

        return userColumn;
    }

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

    public static void swapsColumns(int[][] matrix, int changeColumn, int onWhichChangeColumn) {

        changeColumn -= 1;
        onWhichChangeColumn -= 1;

        for (int row = 0; row < SIZE; row++) {

            int tmp = matrix[changeColumn][row];
            matrix[changeColumn][row] = matrix[onWhichChangeColumn][row];
            matrix[onWhichChangeColumn][row] = tmp;
        }
    }

    public static void main(String[] args) {

        int[][] sourceArray = new int[SIZE][SIZE];

        fillWithRandomNumbers(sourceArray);

        System.out.println("Матрица по условию задачи: ");
        printArray(sourceArray);

        System.out.print("Введите номер столбца, который хотите поменять местами: ");
        int changeColumn = userInput();
        System.out.print("\n" + "Введите номер столбца, на который хотите поменять местами столбцы: ");
        int onWhichChangeColumn = userInput();

        swapsColumns(sourceArray, changeColumn, onWhichChangeColumn);
        printArray(sourceArray);
    }
}
