package task4;
import java.util.Collections;
import java.util.TreeSet;

public class CubeDiagonals {
    public static void main(String[] args) {
        int[][][] array = new int[3][3][3];
        int value=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    array[i][j][k] = value++;
                }
            }
        }
        System.out.println(findSecondLargestValue(array));
    }

    public static int findSecondLargestValue(int[][][] arr) {
        TreeSet<Integer> values = new TreeSet<>(Collections.reverseOrder());

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            values.add(arr[i][i][i]);
            values.add(arr[i][i][n - i - 1]);
            values.add(arr[i][n - i - 1][i]);
            values.add(arr[n - i - 1][i][i]);
        }
        values.pollFirst();
        return values.first();
    }
}
