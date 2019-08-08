package by.etc.somnum.chapter_2;

// Написать методы для вычисления суммы факториалов нечетных чисел от 1 до 9.

public class decomposition_exe_7 {

    public static int SIZE = 9;

    public static void fillArray(int[] array) {

        int count = 1;
        for (int i = 0; i < SIZE; i++) {
            array[i] = count;
            count++;
        }
    }

    public static int calculatesFactorial(int number) {

        int count = 1;
        for (int i = 1; i <= number; i++) {
            count *= i;
        }
        return count;
    }

    public static int calculatesSumOddNumbersFactorial(int[] array) {

        int sum = 0;
        for (int i = 0; i < SIZE; i+= 2) {
            sum += calculatesFactorial(array[i]);
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] sourseArray = new int[SIZE];
        fillArray(sourseArray);

        System.out.print("Сумма факториалов нечетных чисел от 1 до 9: " + calculatesSumOddNumbersFactorial(sourseArray));
    }
}
