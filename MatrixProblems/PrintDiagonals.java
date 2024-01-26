package MatrixProblems;

public class PrintDiagonals {


    public static void main(String[] args) {

        int A[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
         };

         int n = A.length;
         int m = A[0].length;


         int i=0;
         int j=0;

         while(i<n && j<n){


            System.out.println(A[i][j]);
            i++;
            j++;

         }


        


    }
    
}
