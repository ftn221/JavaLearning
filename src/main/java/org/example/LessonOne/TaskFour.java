package org.example.LessonOne;

import java.util.Arrays;

public class TaskFour {
    public static void main(String[] args) {
        int[] arrOne = {5, 6, 10, 67, 37, 98, 156, 367, 5};
        int[] arrTwo = {6, 567, 87, 67, 45, 91, 367, 10, 5, 156, 846, 5};
        //третий массив, который по умолчанию не может быть больше первого. Сюда складываются совпавшие цифры
        int[] arrThree = new int[arrOne.length];

        //счетчик, чтобы в третий массив цифры складывались друг за другом
        int actualElement = 0;

        Arrays.sort(arrOne);
        Arrays.sort(arrTwo);

        for (int i = 0; i < arrOne.length; i++) {
            int res = Arrays.binarySearch(arrTwo, arrOne[i]);
            if (res > -1) {
                arrThree[actualElement] = arrOne[i];
                actualElement++;
            }
        }

        System.out.println("Совпавшие цифры: " + Arrays.toString(arrThree));
    }
}
