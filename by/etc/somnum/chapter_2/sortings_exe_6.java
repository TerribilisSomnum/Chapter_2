package by.etc.somnum.chapter_2;

import java.util.Arrays;

// Сортировка Шелла по возрастанию.

public class sortings_exe_6 {

    public static void swap(int[] array, int index, int nextIndex) {

        int temp = array[index];
        array[index] = array[nextIndex];
        array[nextIndex] = temp;
    }

    public static void sortByShell(int[] array) {

        int interval = array.length / 2;
        while (interval >= 1) {

            for (int right = 0; right < array.length; right++) {
                for (int c = right - interval; c >= 0; c -= interval) {

                    if (array[c] > array[c + interval]) {
                        swap(array, c, c + interval);
                    }
                }
            }
            interval = interval / 2;
        }
    }

    public static void main(String[] args) {

        int[] sourceArray = {16, 8, 4, 15, 42, 23};

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(sourceArray));

        sortByShell(sourceArray);

        System.out.println("Отсортированный массив по убыванию:");
        System.out.println(Arrays.toString(sourceArray));
    }
}

