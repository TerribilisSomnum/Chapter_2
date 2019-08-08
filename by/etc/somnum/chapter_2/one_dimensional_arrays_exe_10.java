package by.etc.somnum.chapter_2;

/*Дан целочисленный массив с элементами n. Сжать массив, выбросив из него каждый второй элмент
(Освободившиейся элементы заполнить нулями.) Нельзя использовать дополнительный массив.
*/

public class one_dimensional_arrays_exe_10 {

    public static void fillWithRandomNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (1 + (int) (Math.random() * 10));
        }
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void deleteEverySecondElement(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        for (int z = 0; z < array.length; z++) {
            for (int j = z + 1; j < array.length; j++) {
                if (array[z] == 0 && array[j] != 0) {
                    array[z] = array[j];
                    array[j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] sourceArray = new int[10];
        fillWithRandomNumbers(sourceArray);

        System.out.println("Массив заполненнный рандомными числами: ");
        printArray(sourceArray);

        deleteEverySecondElement(sourceArray);
        printArray(sourceArray);
    }
}
