package homework.l5.array;

import java.util.Arrays;

public class BubbleSorter {
    public static void main(String[] args) {
        int array[] = new int[]{4, 9, 1, 5, 8};
        bubble(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
