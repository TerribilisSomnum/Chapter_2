package by.etc.somnum.chapter_2;

import java.util.Scanner;

//Написать методы для нахождения НОД четырех натуральных чисел.

public class decomposition_exe_2 {

    public static int userInput() {

        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        return number;
    }

    public static int gcd(int a, int b) {

        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {

        System.out.print("Введите первое число: ");
        int userNumberOne = userInput();

        System.out.print("Введите второе число: ");
        int userNumberTwo = userInput();

        System.out.print("Введите третье число: ");
        int userNumberThree = userInput();

        System.out.print("Введите четвертое число: ");
        int userNumberFour = userInput();

        System.out.print("Наименьшее общее кратное число: " + gcd(gcd(gcd(userNumberOne, userNumberTwo), userNumberThree), userNumberFour));
    }
}
