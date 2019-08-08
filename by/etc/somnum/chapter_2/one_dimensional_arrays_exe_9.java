package by.etc.somnum.chapter_2;

//В массиве целых чисел с кол-м элементов n, найти наиболее встречающееся число.
// Если таких чисел несколько, найти наименьшее из них.

public class one_dimensional_arrays_exe_9 {

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

    public static int getMostPopularNumber(int[] array) {

        int[] popular = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    popular[i]++;
                }
            }
        }

        int valResult = array[0];
        int popResult = popular[0];

        for (int i = 0; i < popular.length; i++) {
            if (popular[i] > popResult) {
                popResult = popular[i];
                valResult = array[i];
            }
            if ((popResult == popular[i]) && (array[i] < valResult)) {
                valResult = array[i];
            }
        }
        return valResult;
    }

    public static void main(String[] args) {

        int[] sourceArray = new int[10];
        fillWithRandomNumbers(sourceArray);

        System.out.println("Массив заполненнный рандомными числами: ");
        printArray(sourceArray);

        System.out.print("Самое повторяющее наименьшее число: " + getMostPopularNumber(sourceArray));
    }
}
