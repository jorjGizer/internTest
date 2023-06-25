package task3;


public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1,  2,  3,  4,  5 },
                { 6,  7,  8,  2, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };

        int n = matrix.length;
        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1 && i != j) {
                    if (matrix[i][j] < minElement) {
                        minElement = matrix[i][j];
                    }
                }
            }
        }

        System.out.println(minElement);
    }
}
