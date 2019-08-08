package by.etc.somnum.chapter_2;

//Написать метод, проверяющий, являются ли три числа взаимно простыми.

import java.util.Scanner;

public class decomposition_exe_6 {

    public static int gcd(int a, int b) {

        return b == 0 ? a : gcd(b, a % b);
    }

    public static int userInput() {

        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        return number;
    }

    public static void defineMutuallyPrimeNumbers(int a, int b, int c) {

        if ((gcd(a, b) == 1) && (gcd(b, c) == 1) && (gcd(a, c) == 1)) {
            System.out.println("Числа являются взаимно простыми");
        } else {
            System.out.println("Числа не являются взаимно простыми");
        }
    }

    public static void main(String[] args) {

        System.out.print("Введите первое число: ");
        int userNumberOne = userInput();

        System.out.print("Введите второе число: ");
        int userNumberTwo = userInput();

        System.out.print("Введите третье число: ");
        int userNumberThree = userInput();

        defineMutuallyPrimeNumbers(userNumberOne, userNumberTwo, userNumberThree);
    }
}
