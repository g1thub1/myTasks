package homework.l3;

import java.util.Scanner;

/**
 * Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел, введённых пользователем.
 * Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */
public class ScannerChisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два целых числа ");
        int a = result(sc);
        int b = result(sc);
        System.out.println("Ответ " + (a + b));
    }

    private static int result(Scanner sc) {
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
            System.exit(0);
            return 0;
        }
    }
}
