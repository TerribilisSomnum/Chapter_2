package by.etc.somnum.chapter_2;

//Написать метод, который определяет в каком из двух чисел больше цифр.

import java.util.Scanner;

public class decomposition_exe_11 {

    public static String userInput() {

        Scanner reader = new Scanner(System.in);
        String number = reader.nextLine();
        return number;
    }

    public static void determinesMaxLength(String oneNumber, String twoNumber) {

        if (oneNumber.length() > twoNumber.length()) {
            System.out.println("В первом числе цифр больше");
        } else {
            System.out.println("Во втором числе цифр больше");
        }
    }

    public static void main(String[] args) {

        System.out.print("Введите первое натуральное число N: ");
        String userNumberOne = userInput();

        System.out.print("Введите второе натуральное число N: ");
        String userNumberTwo = userInput();

        determinesMaxLength(userNumberOne, userNumberTwo);
    }
}
