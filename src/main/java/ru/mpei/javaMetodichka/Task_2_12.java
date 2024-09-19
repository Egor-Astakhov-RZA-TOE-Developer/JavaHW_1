package ru.mpei.javaMetodichka;

public class Task_2_12 {
    public static void main(String[] args) {
        int[][] myMatrix = new int[5][10];
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                myMatrix[i][j] = (int) (Math.random() * 100);
            }
        }

        matrixPrinter(myMatrix);
    }
    public static  void  matrixPrinter(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            StringBuilder res = new StringBuilder();
            if(i == 0) res.append("[");

            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 0) res.append("[");
                if (j != matrix[i].length - 1) res.append(matrix[i][j]).append(", ");
                else res.append(matrix[i][j]).append("]");
            }

            if (i == matrix.length - 1) res.append("]");
            System.out.println(res);
        }
    }

}
