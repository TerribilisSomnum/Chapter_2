package by.etc.somnum.chapter_2;

import java.util.ArrayList;
import java.util.Scanner;

/*
Сформировать матрицу по заданному образцу.
1,    1,   1 ... 1   1,   1
0,    1,   1 ... 1   1,   0
0,    0,   1 ... 1   0,   0
...  ... ... ...  ...  ...
0,    1,   1 ... 1   1,   0
1,    1,   1     1,  1,   1
*/

public class arrays_of_arrays_exe_6 {

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

    public static void fillWithRandomNumbers(ArrayList<ArrayList<Integer>> matrix, int size) {

        for (int row = 0; row < size; row++) {
            matrix.add(new ArrayList<Integer>());
            for (int j = 0; j < size; j++) {
                matrix.get(matrix.size() - 1).add(new Integer(1));
            }
        }
    }

    public static void printArray(ArrayList<ArrayList<Integer>> matrix, int size) {

        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                System.out.print(matrix.get(row).get(column) + "   ");
            }
            System.out.println();
        }
    }

    public static void createMatrixByCondition(ArrayList<ArrayList<Integer>> matrix, int size) {

        for (int row = 0; row < size; row++) {
            if (row < size / 2) {
                for (int j = 0; j < row; j++) {
                    matrix.get(row).set(j, new Integer(0));
                    matrix.get(row).set(size - 1 - j, new Integer(0));
                }
            }
        }
        for (int row = 0; row <= size / 2; row++) {
            if (row < size / 2) {
                for (int j = 0; j < row; j++) {
                    matrix.get(size - 1 - row).set(j, new Integer(0));
                    matrix.get(size - 1 - row).set(size - 1 - j, new Integer(0));
                }
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        int size = userInput();
        fillWithRandomNumbers(matrix, size);

        System.out.println("Матрица по условию задачи: ");
        createMatrixByCondition(matrix, size);
        printArray(matrix, size);
    }
}
