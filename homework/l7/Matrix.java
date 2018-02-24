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
    int strings, columns;
    int[][] array = new int[strings][columns];

    Matrix(int strings, int columns) {
        this.strings = strings;
        this.columns = columns;
    }

    public Matrix(int strings, int columns, int[][] array) {
        this.strings = strings;
        this.columns = columns;
        this.array = array;
    }

    Matrix print() {
        Matrix mx = new Matrix(strings, columns);
        int i, j, k = 0;
        for (i = 0; i < strings; i++) {
            for (j = 0; j < columns; j++) {
                array[i][j] = k++;
            }
        }
        return mx;
    }

    Matrix plus(int[][] matrix, int[][] matrx, int[][] matrix2) {
        Matrix mx = new Matrix(strings, columns);
        for (int i = 0; i < matrx.length; i++) {
            for (int j = 0; j < matrx.length; j++) {
                matrix[i][j] = matrx[i][j] + matrix2[i][j];
            }
        }
        return mx;
    }

    Matrix multiple(int[][] matrix, int[][] matrx, int num) {
        Matrix mx = new Matrix(strings, columns);
        for (int i = 0; i < matrx.length; i++) {
            for (int j = 0; j < matrx.length; j++) {
                matrix[i][j] = matrx[i][j] * num;
            }
        }
        return mx;
    }
}

