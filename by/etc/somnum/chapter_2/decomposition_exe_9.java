package by.etc.somnum.chapter_2;

//Даны числа X,Y,Z,T - длины сторон четырехугольника.
//Написать методы вычисления его площади, если угол между сторона X,Y - прямой.

import java.util.Scanner;

import static java.lang.Math.*;

public class decomposition_exe_9 {

    public static int userInput() {

        Scanner reader = new Scanner(System.in);
        int side = reader.nextInt();
        while (side <= 0) {
            System.out.println("Сторона должна быть больше '0'");
            System.out.print("Попробуй снова: ");
            side = reader.nextInt();
        }
        return side;
    }

    public static double polygonArea(int a, int b, int c, int d) {

//Была использована формула Брахмагупты для нахождения площади вписанного четырехугольника в окружность:
// "http://2mb.ru/matematika/geometriya/ploshhad-chetyrexugolnika/"

        double perimeter = (a + b + c + d) / 2;
        double area = sqrt((perimeter - a) * (perimeter - b) * (perimeter - c) * (perimeter - d));
        return area;
    }

    static public void main(String[] args) {

        System.out.print("Введите сторону X: ");
        int sideX = userInput();

        System.out.print("Введите сторону Y: ");
        int sideY = userInput();

        System.out.print("Введите сторону Z: ");
        int sideZ = userInput();

        System.out.print("Введите сторону T: ");
        int sideT = userInput();

        System.out.print("Площадь многоугольника равна: " + polygonArea(sideX, sideY, sideZ, sideT));
    }
}
