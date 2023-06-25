package task5;


public class FillMatrix {

    public static void main(String[] args) {
        int size = 12;
        int[][] matrix = new int[size][size];
        int[][] newMatrix = fillMatrix(matrix);

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix.length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] fillMatrix(int[][] matrix){
        int value = (matrix.length / 2) - 1;
        int n = matrix.length - 1;
        int count=0;
        for (int i=count;i < matrix.length-count; i++) {
            for (int j=count; j < matrix.length-count; j++) {
                if (value >= 0) {
                    if (i == count || j == count || i == n || j == n) {
                        matrix[i][j] = value;
                    }
                    if (i == matrix.length-1-count && j == matrix.length-1-count){
                        count++;
                        i=count;
                        j=count-1;
                        n--;
                        value--;
                    }
                }
            }
        }
        return matrix;
    }
}
