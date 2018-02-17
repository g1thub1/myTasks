package homework.l7;

/**
 * Создать класс "Матрица". Класс должен иметь следующие поля:
 * 1) двумерный массив вещественных чисел;
 * 2) количество строк и столбцов в матрице.
 * Класс должен иметь следующие методы:
 * 1) сложение с другой матрицей;
 * 2) умножение на число;
 * 3) вывод на печать;
 * 4) умножение матриц - по желанию.
 */
public class Matrix {
    //public class Matrix {
        double[][] array;
        int lines;
        int colums;

        public Matrix(double[][] array, int lines, int colums) {
            this.array = array;
            this.lines = lines;
            this.colums = colums;
        }

    }

