package by.etc.somnum.chapter_2;

//Вычислить формулу правильного шестиугольного со стороной а, используя метод вычисления площади треугольника.

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class decomposition_exe_3 {

    public static int userInput() {

        Scanner reader = new Scanner(System.in);
        int side = reader.nextInt();
        return side;
    }

    public static double squareRightTriangle(int a) {

        return a == 0 ? a : 3 * pow(a, 2) * sqrt(3) / 2;
    }

    public static void main(String[] args) {

        System.out.print("Введите сторону вашего правильного шестиугольника: ");
        int sideTriangle = userInput();

        System.out.format("Площадь вашего правильного шестиугольника: %4.4f", squareRightTriangle(sideTriangle));
    }
}
