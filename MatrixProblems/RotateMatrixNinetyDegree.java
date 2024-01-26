package MatrixProblems;

public class RotateMatrixNinetyDegree {

    public static void main(String[] args) {

        int A[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int n = A.length;
        int m = A[0].length;

        // FInd Transpose of MATRIX

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {

                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }


        // Rotating each row of an matrix  i.e reversing each row


        for(int i=0;i<n;i++){
            for(int j=0;j<m/2;j++){

                int temp=A[i][j];
                A[i][j]=A[i][m-1-j];
                A[i][m-1-j]=temp;

            }
        }

           // Printing result 2D array

           for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A[0].length; j++) {

                System.out.print(A[i][j]+" ");

            }
            System.out.println();

        }

    }

}
