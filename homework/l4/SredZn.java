package homework.l4;
/**
 * Вычислить среднее значение трех вещественных чисел передаваемых на вход программы в качестве аргументов.
 * Для преобразования из String в double используйте метод Double.parseDouble(String s).
 **/

import java.util.Scanner;

public class SredZn {
    public static void main(String[] args) {
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        sc.hasNextInt();
        a = sc.nextInt();
        System.out.println("Введите число ");
        sc.hasNextInt();
        b = sc.nextInt();
        System.out.println("Введите число ");
        sc.hasNextInt();
        c = sc.nextInt();
        raschet(a, b, c);
    }

    private static void raschet(float a, float b, float c) {
        float f;
        f = (a + b + c) / 3;
        System.out.println(f);
    }

}
