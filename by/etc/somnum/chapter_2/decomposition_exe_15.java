package by.etc.somnum.chapter_2;

//Найти  все  натуральные  n-значные  числа,  цифры  в  которых  образуют  строго  возрастающую
//последовательность (например, 1234, 5789).

import java.util.Scanner;

public class decomposition_exe_15 {

    public static int userInput() {

        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        return number;
    }

    public static void findIncreasingNum(int start, String out, int number) {

        if (number == 0) {
            System.out.print(out + " ");
            return;
        }

        for (int i = start; i <= 9; i++) {
            String str = out + Integer.toString(i);
            findIncreasingNum(i + 1, str, number - 1);
        }
    }

    public static void main(String args[]) {

        System.out.print("Введите количество цифр в числе: ");
        int userCountNumeral = userInput();

        findIncreasingNum(0, " ", userCountNumeral);
    }
}
