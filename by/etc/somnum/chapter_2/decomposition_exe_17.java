package by.etc.somnum.chapter_2;

// Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
//действий надо произвести, чтобы получился нуль?

import java.util.Scanner;

public class decomposition_exe_17 {

    public static String userInput() {

        Scanner reader = new Scanner(System.in);
        String number = reader.nextLine();
        return number;
    }

    public static int countsNumberDigits(String userNumber) {

        int lenght = userNumber.length();
        return lenght;
    }

    public static int subtractsNumeralDigits(String userNumber) {

        int count = 0;
        int number = Integer.parseInt(userNumber);
        while (number != 0) {
            number -= countsNumberDigits(Integer.toString(number));
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.print("Введите число: ");
        String userNumber = userInput();

        System.out.println("Чтобы получился нуль надо произвести " + subtractsNumeralDigits(userNumber) + " действий.");
    }
}
