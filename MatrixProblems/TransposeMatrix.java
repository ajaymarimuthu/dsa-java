package MatrixProblems;

public class TransposeMatrix {

    // Given a 2D integer array A, return the transpose of A.
    // The transpose of a matrix is the matrix flipped over its main diagonal,
    // switching the matrix's row and column indices.

    // Output Format
    // You have to return the Transpose of this 2D matrix.

    // Input 1:
    // A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]

    // Input 2:
    // A = [[1, 2],[1, 2],[1, 2]]

    // Example Output
    // Output 1:

    // [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
    // Output 2:

    // [[1, 1, 1], [2, 2, 2]

    public static void main(String[] args) {
        int A[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int n = A.length;
        int m = A[0].length;

        int res[][] = new int[m][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                res[j][i] = A[i][j];
            }

        }

        // Printing result 2D array

        for (int i = 0; i < res.length; i++) {

            for (int j = 0; j < res[0].length; j++) {

                System.out.print(res[i][j]);

            }
            System.out.println();

        }

    }

}
