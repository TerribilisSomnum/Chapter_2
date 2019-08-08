package by.etc.somnum.chapter_2;

import java.util.ArrayList;
import java.util.Collections;

/*
Даны две последовательности a1 <= a2 <= ... n, и  b1 <= b2 <= ... n.
Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
Дополнителньый массив не использовать.
*/

public class sortings_exe_2 {

    public static void addArray(ArrayList<Integer> sourceFirsArray, ArrayList<Integer> sourceSecondArray) {

        sourceFirsArray.addAll(sourceSecondArray);
        Collections.sort(sourceFirsArray);
    }

    public static void main(String[] args) {

        ArrayList<Integer> firsArray = new ArrayList<Integer>();
        firsArray.add(1);
        firsArray.add(3);
        firsArray.add(6);
        firsArray.add(8);
        firsArray.add(9);

        ArrayList<Integer> secondArray = new ArrayList<Integer>();
        secondArray.add(0);
        secondArray.add(2);
        secondArray.add(7);
        secondArray.add(10);

        System.out.println(firsArray);
        System.out.println(secondArray);

        addArray(firsArray, secondArray);
        System.out.println(firsArray);
    }
}
