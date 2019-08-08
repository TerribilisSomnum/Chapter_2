package by.etc.somnum.chapter_2;

/*
Данн массив дейтсвиетльных чисел, размерность которого N.
Подсчитать сколько в нем отрицательных, положительных и нулевых элементов.
*/

public class one_dimensional_arrays_exe_3 {

    public static void fillWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((-5) + (int) (Math.random() * 11));
        }
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void printZeroNumbersCount(int[] array) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        System.out.format("\nКол-во нулевых чисел: %d\n", count);
    }

    public static void printPositiveNumbersCount(int[] array) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        System.out.format("Кол-во положительных чисел: %d\n", count);
    }

    public static void printNegativeNumbersCount(int[] array) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        System.out.format("Кол-во отрицательных чисел: %d\n", count);
    }

    public static void main(String[] args) {

        int[] intArray = new int[10];
        fillWithRandomNumbers(intArray);

        System.out.println("Массив заполненнный рандомными числами: ");
        printArray(intArray);

        printZeroNumbersCount(intArray);
        printPositiveNumbersCount(intArray);
        printNegativeNumbersCount(intArray);
    }
}

