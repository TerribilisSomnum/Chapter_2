package by.etc.somnum.chapter_2;

// Сортировка обменом (пузырьком) по возрастанию.

import java.util.Arrays;

public class sortings_exe_4 {

    public static void swap(int[] array, int index, int nextIndex) {

        int temp = array[index];
        array[index] = array[nextIndex];
        array[nextIndex] = temp;
    }

    public static void sortBubble(int[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {

                if (array[j] > array[j - 1]) {
                    count++;
                    swap(array, j, j - 1);
                }
            }
        }
        System.out.println("Количество перестановок: " + count);
    }

    public static void main(String[] args) {

        int[] sourceArray = {13, 12, 11, 10, 9, 8, 7};

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(sourceArray));

        sortBubble(sourceArray);

        System.out.println("Отсортированный массив по возрастанию:");
        System.out.println(Arrays.toString(sourceArray));
    }
}
