package by.etc.somnum.chapter_2;

//На плоскости заданы координаты n точек. Написать методы, определяющие, между какими из пар точек самое большое расстояние.
//Координаты точек занести в массив.

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

final class Point {

    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

public class decomposition_exe_4 {

    public static int getPointsCount() {

        Scanner reader = new Scanner(System.in);
        int pointCount = reader.nextInt();
        return pointCount;
    }

    public static void fillWithRandomData(Point[] points, int arraySize) {

        for (int i = 0; i < arraySize; i++) {
            points[i] = new Point(1 + (Math.random() * 100), 1 + (Math.random() * 100));
        }
    }

    public static void printPointArray(Point[] points, int arraySize) {

        for (int i = 0; i < arraySize; i++) {
            System.out.format("Точка № %d = [X: %d, Y: %d]", i + 1, (int) points[i].x, (int) points[i].y);
            System.out.println();
        }
    }

    public static void findBiggestLenght(Point[] points, int arraySize) {

        Point first = points[0];
        Point second = points[0];
        double distance = 0;

        for (int i = 0; i < arraySize; i++) {
            for (int j = i + 1; j < arraySize; j++) {
                double tempDistance = distanceBetween(points[i], points[j]);
                if (tempDistance > distance) {
                    distance = tempDistance;
                    first = points[i];
                    second = points[j];
                }
            }
        }
        System.out.format("Наибольшее расстояние есть %3.2f между точками [X: %d, Y: %d] и [X: %d, Y: %d]", distance, (int) first.x, (int) first.y,
                (int) second.x, (int) second.y);
    }

    public static double distanceBetween(Point pointOne, Point pointTwo) {

        double distance = sqrt((pow(pointTwo.x - pointOne.x, 2) + pow(pointTwo.y - pointOne.y, 2)));
        return distance;
    }

    public static void main(String[] args) {

        System.out.print("Введите количество точек: ");
        int count = getPointsCount();
        Point points[] = new Point[count];

        fillWithRandomData(points, count);
        printPointArray(points, count);
        findBiggestLenght(points, count);
    }
}
