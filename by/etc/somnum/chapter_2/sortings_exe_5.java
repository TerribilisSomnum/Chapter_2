package by.etc.somnum.chapter_2;

// Сортировка вставками по возрастанию с двоичным поиском.

import java.util.Arrays;

public class sortings_exe_5 {

    final static int SIZE = 6;

    public static int binarySearch(int array[], int item, int low, int high) {

        if (high <= low)
            return (item > array[low]) ? (low + 1) : low;

        int mid = (low + high) / 2;

        if (item == array[mid])
            return mid + 1;

        if (item > array[mid])
            return binarySearch(array, item, mid + 1, high);
        return binarySearch(array, item, low, mid - 1);
    }


    public static void insertionSort(int array[]) {

        int locationToInsert;
        int selected;

        for (int i = 1; i < SIZE; ++i) {

            int j = i - 1;
            selected = array[i];

            locationToInsert = binarySearch(array, selected, 0, j);

            while (j >= locationToInsert) {

                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = selected;
        }
    }

    public static void main(String[] args) {

        int[] sourceArray = {42, 23, 16, 15, 8, 4};

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(sourceArray));

        insertionSort(sourceArray);

        System.out.println("Отсортированный массив по возрастанию.:");
        System.out.println(Arrays.toString(sourceArray));
    }
}
