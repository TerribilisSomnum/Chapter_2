package by.etc.somnum.chapter_2;

//Дана последовательность целых чисел (a1,a2,a3...an).
//Образовать новую последовательность выбросив из исходной те члены, которые равны min(a1,a2,a3...an)

public class one_dimensional_arrays_exe_8 {

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

    public static void fillWithoutMinElement(int[] arrayOne, int[] arrayTwo) {

        int min = findsMinValue(arrayOne);
        for (int i = 0; i < arrayTwo.length; i++) {
            if (arrayOne[i] != min) {
                arrayTwo[i] = arrayOne[i];
            }
        }
        for (int y = 0; y < arrayTwo.length; y++) {
            if (arrayTwo[y] != 0) {
                System.out.print(arrayTwo[y] + " ");
            }
        }
    }

    public static int findsMinValue(int[] arrayOne) {

        int min = arrayOne[0];
        for (int i = 0; i < arrayOne.length; i++) {
            if (min > arrayOne[i]) {
                min = arrayOne[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] sourceArray = new int[10];
        int[] intArrayTwo = new int[10];

        fillWithRandomNumbers(sourceArray);

        System.out.println("Массив заполненнный рандомными числами: ");
        printArray(sourceArray);

        fillWithoutMinElement(sourceArray, intArrayTwo);
    }
}
