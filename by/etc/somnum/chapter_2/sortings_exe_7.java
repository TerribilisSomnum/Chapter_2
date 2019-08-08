package by.etc.somnum.chapter_2;

/*
Пусть  даны  две  неубывающие  последовательности  действительных  чисел a1 <= a2 <= ... an и b1 <= b2 <= ... bn.
Требуется указать те места, на которые нужно вставлять элементы последовательности  b1 <= b2 <= ... <= bm в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.
*/

import java.util.*;

public class sortings_exe_7 {

    public static int userInput() {

        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        return number;
    }

    public static ArrayList<Integer> generateRandomArray(int n) {

        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(1000));
        }
        Collections.sort(list);
        return list;
    }

    public static int[] convertIntegers(List<Integer> integers) {

        int[] ret = new int[integers.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }

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

    public static void mergePredictor(ArrayList<Integer> one, ArrayList<Integer> two) {

        for (int i = 0; i < two.size(); i++) {
            int insertPosition = binarySearch(convertIntegers(one), two.get(i), 0, one.size() - 1);
            System.out.println("Число " + two.get(i) + " должно встать на индекс = " + insertPosition);
        }
    }

    public static void main(String[] args) {

        System.out.print("Введите длину первого массива: ");
        int lenghtArrayOne = userInput();

        System.out.print("Введите длину второго массива: ");
        int lenghtArrayTwo = userInput();

        ArrayList<Integer> arrayOne = generateRandomArray(lenghtArrayOne);
        ArrayList<Integer> arrayTwo = generateRandomArray(lenghtArrayTwo);

        System.out.println("Массив первый: " + arrayOne);
        System.out.println("Массив второй: " + arrayTwo);

        System.out.println();
        mergePredictor(arrayOne, arrayTwo);
    }
}
