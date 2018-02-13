package homework.l5.array;

/**
 * Создать двухмерный массив 5х8 и инициализировать его с помощью блока для инициализации.
 * Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
 * Распечатать оба массива.
 */
public class MaxMin {
    public static void main(String[] args) {
        int[][] array = new int[5][8];
        int[][] array1 = new int[5][2];
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                array[i][j] = k++;
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        min(array, array1);
        max(array, array1);
    }

    private static void min(int[][] array, int[][] array1) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Минимальное значение  ");
            int min = array[i][0];
            for (int n : array[i]) {
                if (n < min) {
                    min = n;
                }
            }
            System.out.println(min);
           // array1 [i][0] = min;
        }
    }

    private static void max(int[][] array, int[][] array1) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Максимальное значение ");
            int max = array[i][0];
            for (int n : array[i]) {
                if (n > max) {
                    max = n;
                }
            }
            System.out.println(max);
            //array1 [0][i] = max;
        }
    }
}

