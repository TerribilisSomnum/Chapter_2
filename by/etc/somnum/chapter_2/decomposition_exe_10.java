package by.etc.somnum.chapter_2;

//Дано натуральное число N. Написать методы для формирования массива, элементами которого являются цифры данного числа.

import java.util.Scanner;

public class decomposition_exe_10 {

    public static String userInput() {

        Scanner reader = new Scanner(System.in);
        String number = reader.nextLine();
        return number;
    }

    public static void printArray(char[] array) {

        System.out.print("Массив числа N: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void arrayFormation(char[] array, String number) {

        array = number.toCharArray();
        printArray(array);
    }

    public static void main(String[] args) {

        System.out.print("Введите натуральное число N: ");
        String userNumber = userInput();

        char[] array = new char[userNumber.length()];
        arrayFormation(array, userNumber);
    }
}
