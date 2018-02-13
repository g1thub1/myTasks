package homework.l4;
/**
 * Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел.
 * Для вычисления модуля используйте тернарную условную операцию.
 */

import java.util.Scanner;

public class MensheePoModul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("Введите число: ");
        sc.hasNextInt();
        a = sc.nextInt();
        System.out.print("Введите второе число: ");
        sc.hasNextInt();
        b = sc.nextInt();
        System.out.print("Введите третье число: ");
        sc.hasNextInt();
        c = sc.nextInt();
        if ((Math.abs(a)) < (Math.abs(b)) && (Math.abs(a)) < (Math.abs(c))) {
            System.out.println(Math.abs(a));
        } else if ((Math.abs(b)) < (Math.abs(a)) && (Math.abs(b)) < (Math.abs(c))) {
            System.out.println(Math.abs(b));
        } else {
            System.out.println(Math.abs(c));
        }
    }
}