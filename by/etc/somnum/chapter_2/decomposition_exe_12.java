package by.etc.somnum.chapter_2;

//Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N.

import java.util.ArrayList;
import java.util.Scanner;

public class decomposition_exe_12 {

    public static int userInput() {

        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        return number;
    }

    public static int getSum(int n) {

        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static ArrayList<Number> buildArray(int k, int n) {

        ArrayList<Number> result = new ArrayList<Number>();

        for (int i = 0; i <= n; i++) {
            if (getSum(i) == k) {
                result.add(new Integer(i));
            }
        }
        return result;
    }

    public static void printfArray(ArrayList<Number> array) {

        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i).toString() + " ");
        }
    }

    public static void main(String[] args) {

        System.out.print("Введите число К: ");
        int userNumberK = userInput();

        System.out.print("Введите число N: ");
        int userNumberN = userInput();

        printfArray(buildArray(userNumberK, userNumberN));
    }
}
