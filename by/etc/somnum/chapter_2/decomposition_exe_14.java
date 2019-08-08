package by.etc.somnum.chapter_2;

/*
Натуральное  число,  в  записи  которого  n  цифр,  называется  числом  Армстронга,  если  сумма  его  цифр,
возведенная  в  степень  n,  равна  самому  числу.  Найти  все  числа  Армстронга  от  1  до  k.  Для  решения  задачи
использовать декомпозицию.
*/

import java.util.Scanner;

public class decomposition_exe_14 {

    public static int userInput() {

        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        return number;
    }

    public static void findArmstrongNumbers(int number) {

        System.out.format("Числа Армстронга в интервале от 1 до %d\n", number);

        for (int i = 1; i <= number; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrong(int i) {

        int n = order(i);
        int temp = i;
        int sum = 0;

        while (temp != 0) {

            int r = temp % 10;
            sum = sum + power(r, n);
            temp = temp / 10;
        }
        return (sum == i);
    }

    public static int power(int x, long y) {

        if (y == 0)
            return 1;
        if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        return x * power(x, y / 2) * power(x, y / 2);
    }

    public static int order(int i) {

        int n = 0;
        while (i != 0) {
            n++;
            i /= 10;
        }
        return n;
    }

    public static void main(String[] args) {

        System.out.print("Введите число: ");
        int userNumber = userInput();
        findArmstrongNumbers(userNumber);

    }
}

