package by.etc.somnum.chapter_2;

import java.util.ArrayList;
import java.util.Scanner;

/*Сформировать матрицу по заданному образцу.
1,    1,   1 ... 1   1,   1
2,    2,   2 ... 2   2,   0
3,    3,   3 ... 3   0,   0
...  ... ... ...  ...  ...
n-1, n-1,  0 ... 0   0,   0
n,    0,   0     0,  0,   0
*/

public class arrays_of_arrays_exe_5 {

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

        int count = 1;
        for (int row = 0; row < size; row++) {
            matrix.add(new ArrayList<Integer>());
            for (int j = 0; j < size; j++) {
                matrix.get(matrix.size() - 1).add(new Integer(count));
            }
            count++;
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

        int count = size - 2;
        for (int i = 1; i < size; i++) {
            for (int j = size - 1; j > count; j--) {
                matrix.get(i).set(j, new Integer(0));
            }
            count--;
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
