package by.etc.somnum.chapter_2;

/*
Два простых числа называются "близнецами", если они отлчиаются друг от друга на 2 (например 41 и 43).
Найти и распечатать все пары близнецов из отрезка [n, 2n], где n - натуральное число больше 2.
*/

import java.util.Scanner;

public class decomposition_exe_13 {

    public static int userInput() {

        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        if (number <= 2) {
            System.out.println("Число должно быть больше 2. \nПопробуй снова: ");
            number = reader.nextInt();
        }
        return number;
    }

    public static void printfsTwinsPairsNumbers(int number) {

        int maxCount = 2 * number;
        System.out.format("Все пары близнецов из отрезка [%d, %d]\n", number, 2 * number);

        for (int i = number; i < maxCount; i++) {
            if ((number + 2) <= maxCount) {
                System.out.println(number + ":" + (number + 2));
                number += 2;
                maxCount--;
            }
        }
    }

    public static void main(String[] args) {

        System.out.print("Введите натуральное число N больше 2: ");
        int userNumber = userInput();

        printfsTwinsPairsNumbers(userNumber);
    }
}
