package by.etc.somnum.chapter_2;

// Написать  программу,  определяющую  сумму  n  -  значных  чисел,  содержащих  только  нечетные  цифры.
//Определить также, сколько четных цифр в найденной сумме.

import java.util.ArrayList;
import java.util.Scanner;

public class decomposition_exe_16 {

    public static int userInput() {

        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        return number;
    }

    public static void findIncreasingOddNum(int start, String out, int number, ArrayList<String> array) {

        if (number == 0) {
            array.add(out);
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (i % 2 != 0) {
                String str = out + Integer.toString(i);
                findIncreasingOddNum(i + 1, str, number - 1, array);
            }
        }
    }

    public static int sumOddNumeralInNumber(ArrayList<String> array) {

        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            int number = Integer.parseInt(array.get(i).replaceAll("[^0-9]", ""));
            sum += number;

        }
        return sum;
    }

    public static void findPositiveNumeral(int sum) {

        String sumString = Integer.toString(sum);
        char[] arraySum = new char[sumString.length()];
        arraySum = sumString.toCharArray();

        int count = 0;
        for (int i = 0; i < sumString.length(); i++) {
            Integer number = Integer.valueOf(arraySum[i]);
            if (number % 2 == 0) {
                count++;
            }
        }
        System.out.println("В сумме четных цифр = " + count);
    }

    public static void main(String[] args) {

        System.out.print("Введите количество цифр в числе: ");
        int userCountNumeral = userInput();

        ArrayList<String> array = new ArrayList();
        findIncreasingOddNum(0, " ", userCountNumeral, array);
        System.out.println("Нечетная последовательность: " + array);

        System.out.println("Сумма цифр нечетных чисел: " + sumOddNumeralInNumber(array));
        findPositiveNumeral(sumOddNumeralInNumber(array));
    }
}
