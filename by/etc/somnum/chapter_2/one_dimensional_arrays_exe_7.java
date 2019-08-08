package by.etc.somnum.chapter_2;

//Заданны действительные числа. Найти max(a1 + a2n, a2 + a2n - 1...an + an + 1)

import static sun.swing.MenuItemLayoutHelper.max;

public class one_dimensional_arrays_exe_7 {

    public static void fillWithRandomNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (1 + (int) (Math.random() * 10));
        }
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void fillWithSumOfFirstAndLast(int[] arrayOne, int[] arrayTwo) {

        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = arrayOne[i] + arrayOne[arrayOne.length - 1 - i];
        }
    }

    public static int printMaxValue(int[] arrayOne) {

        System.out.println("Максимальный элемент в массиве: ");
        return max(arrayOne);
    }

    public static void main(String[] args) {

        int[] intArray = new int[10];
        int[] intArrayTwo = new int[intArray.length / 2];

        fillWithRandomNumbers(intArray);

        System.out.println("Массив заполненнный рандомными числами: ");
        printArray(intArray);

        fillWithSumOfFirstAndLast(intArray, intArrayTwo);
        System.out.println("Массив заполненный суммой первого последнего, второго и предпоследнего элементов и т.д.: ");
        printArray(intArrayTwo);

        System.out.print(printMaxValue(intArrayTwo));

    }
}
