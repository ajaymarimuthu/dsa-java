package MatrixProblems;

public class TranposeOptimized {


    public static void main(String[] args) {
        


        int A[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
          };

    int n = A.length;
    int m = A[0].length;


    for (int i = 0; i < n; i++) {

        for (int j = i+1 ; j < m; j++) {

            int temp=A[i][j] ; 
            A[i][j]=A[j][i] ;
            A[j][i]=temp ;
 
        }

    }


        for (int i = 0; i < n; i++) {

        for (int j = 0; j < m; j++) {


            System.out.print(A[i][j]+" ");
 
 
        }

        System.out.println();

    }





    }
    
}
