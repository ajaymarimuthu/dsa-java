package MatrixProblems;

public class LowerTriangle {

    public static void main(String[] args) {
        int A[][] = {
            { 1, 2, 3, 8 },
            { 4, 5, 6, 2 },
            { 7, 8, 9, 3 },
            { 4, 5, 6, 2 },
    };


    // OBSERVATIONS 

    
        // lOWER TRIANGLE
        //      1,0
        //      2,0   2,1
        //      3,0   3,1    3,2


        // iN THIS lOWER TRIANAGLE J is always lesser than  I  (j<i) ; i.e  j is lesser than i
        // so starting the j loop from   0   and going till lessaer than i


    int n = A.length;
    int m = A[0].length;


    for(int i=1;i<n;i++){
            
        for(int j=0;j<i;j++){
            
            System.out.print(A[i][j]+" ");
            
        }
        System.out.println();
    }

    }
    
}
