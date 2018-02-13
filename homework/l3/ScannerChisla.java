package homework.l3;

import java.util.Scanner;

/**Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел, введённых пользователем.
 *Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */
public class ScannerChisla {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        result(sc);
    }

    private static void result(Scanner sc) {
        System.out.println("Введите целое число");
        sc.hasNextInt();
        int i = sc.nextInt();
        System.out.println("Введите целое число");
        sc.hasNextInt();
        int r = sc.nextInt();
        System.out.println(i + r);
    }
}
