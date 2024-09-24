package org.example.homework2;

public class Matrix {

    public Matrix() {
        testMatrix();
    }

    public void testMatrix() {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
        };
        int[][] matrix2 = {
                {9, 8},
                {6, 5},
                {3, 2}
        };
        double[][] matrix3 = {
                {1.2, 2.2, 3.2},
                {4.2, 5.2, 6.2},
                {7.2, 8.2, 9.2}
        };
        double[][] matrix4 = {
                {1.2, 2.2, 3.2},
                {4.2, 5.2, 6.2},
                {7.2, 8.2, 9.2}
        };

        // print(matrix1);
        // print(add(matrix1, matrix2));
        // print(add(matrix3, matrix4));
        // print(subtract(matrix3, matrix4));
        // print(subtract(matrix1, matrix2));
        // print(multiply(matrix3, matrix4));
        print(multiply(matrix1, matrix2));
    }


    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print("| " + matrix[row][col] + " |");
            }
            System.out.println();
            System.out.println("------".repeat(matrix[row].length));
        }
    }

    public static void print(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print("| " + matrix[row][col] + " |");
            }
            System.out.println();
            System.out.println("------".repeat(matrix[row].length));
        }
    }


    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        return false;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        return false;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix1[0].length; col++) {
                    result[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
            return result;
        } else {
            return result;
        }
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix1.length][matrix1[0].length];
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix1[0].length; col++) {
                    result[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
            return result;
        } else {
            return result;
        }
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix1[0].length; col++) {
                    result[row][col] = matrix1[row][col] - matrix2[row][col];
                }
            }
            return result;
        } else {
            return result;
        }
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix1.length][matrix1[0].length];
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix1[0].length; col++) {
                    result[row][col] = matrix1[row][col] - matrix2[row][col];
                }
            }
            return result;
        } else {
            return result;
        }
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        if (matrix1[0].length == matrix2.length) {

            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix2[0].length; col++) {
                    for (int count = 0; count < matrix1[0].length; count++) {
                        result[row][col] += matrix1[row][count] * matrix2[count][col];
                    }
                }
            }
            return result;
        } else {
            return result;
        }
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix1.length][matrix2[0].length];
        if (matrix1[0].length == matrix2.length) {

            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix2[0].length; col++) {
                    for (int count = 0; count < matrix1[0].length; count++) {
                        result[row][col] += matrix1[row][count] * matrix2[count][col];
                    }
                }
            }
            return result;
        } else {
            return result;
        }
    }

}
