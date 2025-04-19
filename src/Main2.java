import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
        // Define and initialize a 2D matrix
        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        // Create a 2D array with default values (0s)
        int[][] array = new int[3][4];

        // Print the initial matrix and array
        System.out.println("Matrix: " + Arrays.deepToString(matrix));
        System.out.println("Array: " + Arrays.deepToString(array));

        // Print number of rows in the matrix
        System.out.println("Matrix length (rows): " + matrix.length);

        // Print matrix elements in tabular format
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        // Replace the second row of the matrix with a new array
        matrix[1] = new int[] {50, 60, 70};
        System.out.println("Modified Matrix: " + Arrays.deepToString(matrix));

        // Create an array that can store various types of arrays
        Object[] anyArray = new Object[5];

        anyArray[0] = new String[] {"a", "b", "c"};

        anyArray[1] = new String[][] {
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };

       // anyArray[2] = new String[3][3][3]; // 3D array of Strings
        anyArray[2] = "hello";
        // Print contents of the object array
        System.out.println("AnyArray Contents:");
        System.out.println(Arrays.deepToString(anyArray));
        System.out.println();

        // Iterate and inspect the elements of anyArray
        for (Object element : anyArray) {
                System.out.println("Element type: " + element.getClass().getSimpleName());
                System.out.println("Element toString(): " + element);
                System.out.println("Deep toString(): " + Arrays.deepToString((Object[]) element));

        }
    }
}

