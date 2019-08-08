package by.etc.somnum.chapter_2;

import java.util.ArrayList;
import java.util.Scanner;

/*Сформировать матрицу по заданному образцу.
1,   2,   3 ... n
n, n-1, n-2 ... 1
1,   2,   3 ... n
... ... ... ...
n, n-1, n-2 ... 1
*/

public class arrays_of_arrays_exe_4 {

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
            while (count <= size) {
                matrix.get(matrix.size() - 1).add(new Integer(count));
                count++;
            }
            count = 1;
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

        int count = size;
        for (int row = 1; row < size; row += 2) {
            for (int j = 0; j < size; j++) {
                while (count > 0) {
                    matrix.get(row).set(j, new Integer(count));
                    count--;
                    j++;
                }
                count = size;
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
