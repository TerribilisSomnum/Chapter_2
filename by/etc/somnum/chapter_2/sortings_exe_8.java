package by.etc.somnum.chapter_2;

//Даны дроби p1/q1, p2/q2 ... pn/qm ( pi, qi  - натуральные).
//Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.

import java.util.*;

final class Fraction implements Comparable<Fraction> {

    int x;
    int y;

    @Override
    public int compareTo(Fraction o) {

        double currFraction = (double) this.x / this.y;
        double otherFraction = (double) o.x / o.y;
        int cmp = currFraction > otherFraction ? +1 : currFraction < otherFraction ? -1 : 0;
        return cmp;
    }

    @Override
    public String toString() {

        return String.valueOf(x) + "/" + String.valueOf(y);
    }

    public Fraction(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class sortings_exe_8 {

    public static int userInput() {

        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        return number;
    }

    public static ArrayList<Fraction> generateRandomArray(int count) {

        ArrayList<Fraction> list = new ArrayList<Fraction>(count);
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            list.add(new Fraction(1 + random.nextInt(20), 1 + random.nextInt(20)));
        }
        return list;
    }

    public static void calculatorCommonDenominator(ArrayList<Fraction> array) {

        int commonDenominator = 1;
        for (int i = 0; i < array.size(); i++) {
            commonDenominator *= array.get(i).y;
        }

        for (int i = 0; i < array.size(); i++) {
            array.get(i).x *= (commonDenominator / array.get(i).y);
            array.get(i).y = commonDenominator;
        }
    }

    public static void sortAscending(ArrayList<Fraction> array) {

        Collections.sort(array);
    }

    public static void main(String[] args) {

        System.out.print("Введите количество дробей: ");
        int countFraction = userInput();

        ArrayList<Fraction> arrayFraction = generateRandomArray(countFraction);
        System.out.println("Дроби: " + arrayFraction);

        calculatorCommonDenominator(arrayFraction);
        System.out.println("Дроби с общим знаменателем " + arrayFraction);

        sortAscending(arrayFraction);
        System.out.println("Отсортированные дроби " + arrayFraction);
    }
}
