package SpaceAndTimeComplexity;
/*
O(n^2) - Quadratic Space:
   - Example: Creating a 2D matrix for dynamic programming solutions.
   - Explanation: The space used grows quadratically with the input size.
   - Java Example: `int[][] matrix = new int[n][n];`
 */
public class QuadraticSpaceExample {
    public static void main(String[] args) {
        // Creating a 2D matrix with size n x n
        int n = 5;
        int[][] matrix = new int[n][n];
        // Filling the matrix with values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = i + j;
            }
        }
        // Printing the matrix
        System.out.println("2D matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();// Uses O(n^2) space
        }
    }
}
