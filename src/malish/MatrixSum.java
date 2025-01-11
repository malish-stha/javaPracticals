package malish;

public class MatrixSum {
    public static void main(String[] args) {
        System.out.println("Name: Malish Shrestha\nRollno: 1015\n");

        int[][] a = {{13, 14, 15}, {16, 23, 31}};
        int[][] b = {{31, 23, 34}, {19, 32, 21}};

        int rows = a.length;
        int cols = a[0].length;

        int[][] sum = new int[rows][cols];

        // Calculate the sum of the two matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // Display the sum matrix
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
