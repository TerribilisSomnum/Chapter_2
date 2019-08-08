package by.etc.somnum.chapter_2;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sin;

/*
Сформировать квадратную матрицу порядка N по правилу:
A[I,J]= sin(((pow(i,2))*(pow(j,2))) / N)
*/

public class arrays_of_arrays_exe_7 {

    public static int userInput() {

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите четный размер матрицы: ");
        int size = reader.nextInt();
        while (size % 2 != 0) {
            System.out.println("Попробуй снова!");
            System.out.print("Введите четный размер матрицы: ");
            size = reader.nextInt();
        }
        return size;
    }

    public static void fillWithRandomNumbers(ArrayList<ArrayList<Double>> matrix, int size) {

        for (int row = 0; row < size; row++) {
            matrix.add(new ArrayList<Double>());
            for (int j = 0; j < size; j++) {
                matrix.get(matrix.size() - 1).add(new Double(sin((pow(row, 2) * (pow(j, 2)) / size))));
            }
        }
    }

    public static void printArray(ArrayList<ArrayList<Double>> matrix, int size) {

        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                System.out.format("%4.0f", matrix.get(row).get(column));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Double>> matrix = new ArrayList<>();

        int size = userInput();
        fillWithRandomNumbers(matrix, size);

        System.out.println("Матрица по условию задачи: ");
        printArray(matrix, size);
    }
}
