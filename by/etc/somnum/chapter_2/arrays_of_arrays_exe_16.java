package by.etc.somnum.chapter_2;

//Создать магический квадрат размером 3 х 3

public class arrays_of_arrays_exe_16 {

    static final int SIZE = 3;

    public static void fillWithRandomNumbers(int[][] matrix) {

        int i = SIZE / 2;
        int j = SIZE - 1;

        for (int num = 1; num <= SIZE * SIZE; ) {

            if (i == -1 && j == SIZE) {
                j = SIZE - 2;
                i = 0;

            } else {
                if (j == SIZE) {
                    j = 0;
                }
                if (i < 0) {
                    i = SIZE - 1;
                }
            }
            if (matrix[i][j] != 0) {
                j -= 2;
                i++;
                continue;

            } else {
                matrix[i][j] = num++;
                j++;
                i--;
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

    public static void main(String[] args) {

        int[][] sourceArray = new int[SIZE][SIZE];
        fillWithRandomNumbers(sourceArray);

        System.out.println("Магический квадрат 3 х 3: ");
        printArray(sourceArray);
    }
}

