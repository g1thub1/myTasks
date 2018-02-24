package homework.l7;

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix mtrx = new Matrix(3, 3);
        int[][] array = new int[3][3];
        int[][] mtrx1 = new int[3][3];
        int[][] mtrx2 = new int[3][3];
        mtrx.plus(array, mtrx1, mtrx2);
        mtrx.multiple(array, mtrx1, 5);
    }
}
