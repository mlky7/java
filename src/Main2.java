import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] array = new int[3][4];

        System.out.println("Matrix: " + Arrays.deepToString(matrix));
        System.out.println("Array: " + Arrays.deepToString(array));
        System.out.println(matrix.length);

    }
}
