package homework.l3;
/**
 * Создать программу, которая будет сообщать, является ли целое число, введённое пользователем, чётным или нечётным.
 * Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */

import java.util.Scanner;

public class Chetnost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) {
            x = sc.nextInt();
            if (x % 2 == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Вы ввели не четное целое число");
            }
        }
    }
}
