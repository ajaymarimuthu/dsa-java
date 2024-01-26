package MatrixProblems;

public class UpperTriangle {

    public static void main(String[] args) {

        int A[][] = {
                { 1, 2, 3, 8 },
                { 4, 5, 6, 2 },
                { 7, 8, 9, 3 },
                { 4, 5, 6, 2 },
        };


        // OBSERVATION :

        // {

        //     [0,0   0,1   0,2   0,3]
        //     [1,0   1,1   1,2   1,3]
        //     [2,0   2,1   2,2   2,3]
        //     [3,0   3,1   3,2   3,3]


        // UPPER TRIANGLE
        //      0,1   0,2   0,3
        //           1,2   1,3
        //                 2,3


        // iN THIS UPPER TRIANAGLE i is always lesser than j  (i<j) ; i.e  j is 1 greater than i
        // so starting the j loop from j+1;



        // }



        int n = A.length;
        int m = A[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                System.out.print(A[i][j]);

            }

            System.out.println();

        }

    }

}
