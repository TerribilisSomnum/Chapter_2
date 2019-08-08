package by.etc.somnum.chapter_2;

// Сортировка выбором по убыванию.

import java.util.Arrays;

public class sortings_exe_3 {

    public static void swap(int[] array, int index, int maxIndex) {

        int temp = array[index];
        array[index] = array[maxIndex];
        array[maxIndex] = temp;
    }

    public static void sortByChoice(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int maxIndex = i;
            for (int j = i; j < array.length; j++) {

                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(array, i, maxIndex);
        }
    }

    public static void main(String[] args) {

        int[] sourceArray = {2, 4, 6, 8, 10, 12, 14};

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(sourceArray));

        sortByChoice(sourceArray);

        System.out.println("Отсортированный массив по убыванию:");
        System.out.println(Arrays.toString(sourceArray));
    }
}
