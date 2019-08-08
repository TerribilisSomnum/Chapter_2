package by.etc.somnum.chapter_2;

import java.util.Scanner;

//Написать методы для нахождения НОД и НОК кратных двух натуральных чисел.

public class decomposition_exe_1 {

    public static int userInput() {

        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        return number;
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static void main(String[] args) {

        System.out.print("Введите первое число: ");
        int userNumberOne = userInput();
        System.out.print("Введите второе число: ");
        int userNumberTwo = userInput();

        System.out.print("Наименьшее общее кратное число: " + lcm(userNumberOne, userNumberTwo));
    }
}
