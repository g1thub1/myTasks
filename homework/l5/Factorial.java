package homework.l5;

import java.util.Scanner;

/**
 * Реализовать подсчет факториала используя цикл for.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число ");
        scan.hasNextInt();
        int n = scan.nextInt();
        int x = 1;
        getResult(n, x);
    }

    private static int getResult(int n, int x) {
        for (int i = 1; i <= n; i++)
            x *= i;
        System.out.println("Ответ " + x);
        return x;
    }
}

