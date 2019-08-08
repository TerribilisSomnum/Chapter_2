package by.etc.somnum.chapter_2;

//Данны действительные числа. Поменять местами наибольший и наименьший элементы.

public class one_dimensional_arrays_exe_4 {

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

    public static int findsMaxValueIndex(int[] array) {

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[max] < array[i]) {
                max = i;
            }
        }
        return max;
    }

    public static int findsMinValueIndex(int[] array) {

        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[min] > array[i]) {
                min = i;
            }
        }
        return min;
    }

    public static void swapGreatesWithLesser(int[] array) {

        int min = findsMinValueIndex(array);
        int max = findsMaxValueIndex(array);

        int temp = array[min];
        array[min] = array[max];
        array[max] = temp;
    }

    public static void main(String[] args) {

        int[] intArray = new int[10];
        fillWithRandomNumbers(intArray);

        System.out.println("Массив заполненнный рандомными числами: ");
        printArray(intArray);

        swapGreatesWithLesser(intArray);
        printArray(intArray);
    }
}



