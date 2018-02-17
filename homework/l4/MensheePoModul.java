package homework.l4;

import java.util.Scanner;

/**
 * Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел.
 * Для вычисления модуля используйте тернарную условную операцию.
 */
public class MensheePoModul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа ");
        int a = result(sc);
        int b = result(sc);
        int c = result(sc);
        if ((Math.abs(a)) < (Math.abs(b)) && (Math.abs(a)) < (Math.abs(c))) {
            System.out.println(Math.abs(a));
        } else if ((Math.abs(b)) < (Math.abs(a)) && (Math.abs(b)) < (Math.abs(c))) {
            System.out.println(Math.abs(b));
        } else {
            System.out.println(Math.abs(c));
        }
    }

    private static int result(Scanner sc) {
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Попробуйте еще раз ");
            System.exit(0);
            return 0;
        }
    }
}