package homework.l5.cycle;

/**
 * Распечатать все числа от 1 до 100. Используем цикл do-while.
 */
public class DoWhile {
    public static void main(String[] args) {
        int n = 1;
        do {
            System.out.println(n++);
        } while (n <= 100);
    }
}

