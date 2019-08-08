package by.etc.somnum.chapter_2;

import java.util.ArrayList;
import java.util.Scanner;

/*
Заданы два одномерных массива с различным кол-м элементов и натуральное число k.
Объединить их в один массив, включив второй массивв между k-m и (k + 1) - м элементами первого,
при этом не используя дополительный массив.
*/

public class sortings_exe_1 {

    public static int userInput() {

        Scanner reader = new Scanner(System.in);
        int indexElement = reader.nextInt();
        return indexElement--;
    }

    public static void addArray(ArrayList<Integer> sourceFirsArray, ArrayList<Integer> sourceSecondArray, int index) {

        sourceFirsArray.addAll(index, sourceSecondArray);
    }

    public static void main(String[] args) {

        ArrayList<Integer> firsArray = new ArrayList<Integer>();
        firsArray.add(1);
        firsArray.add(4);
        firsArray.add(6);
        firsArray.add(2);
        firsArray.add(9);

        ArrayList<Integer> secondArray = new ArrayList<Integer>();
        secondArray.add(0);
        secondArray.add(2);
        secondArray.add(3);
        secondArray.add(0);

        System.out.println(firsArray);
        System.out.println(secondArray);

        System.out.print("Введите номер элемента после которого надо вставить второй массив: ");
        addArray(firsArray, secondArray, userInput());
        System.out.println(firsArray);
    }
}
