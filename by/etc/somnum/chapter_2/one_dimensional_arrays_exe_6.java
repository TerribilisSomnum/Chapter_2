package by.etc.somnum.chapter_2;

/* Дана последовательность N вещественных чисел.
 Вычислить сумму чисел, пордяковые номера которого являются простыми числами.
*/

import java.util.stream.IntStream;

public class one_dimensional_arrays_exe_6 {

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

    public static void sumOfPrimeIndex(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += isPrime(i) ? array[i] : 0;
        }
        System.out.print("Сумма чисел, индекс которых является простым числом: ");
        System.out.println(sum);
    }

    public static boolean isPrime(int number) {
        return number >= 2
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }

    public static void main(String[] args) {

        int[] intArray = new int[10];
        fillWithRandomNumbers(intArray);

        System.out.println("Массив заполненнный рандомными числами: ");
        printArray(intArray);

        sumOfPrimeIndex(intArray);

    }
}
