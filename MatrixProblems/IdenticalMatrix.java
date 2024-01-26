package MatrixProblems;

import java.security.Identity;

public class IdenticalMatrix {


// You are given a N X N square integer matrix A. You have to tell whether A is an identity matrix or not.
// Identity matrix is a special square matrix whose main diagonal elements are equal to 1 and all other elements are 0.

// Problem Constraints
// 2 <= N <= 103

// A[i][j] equals 0 or 1.


// Output Format
// Return 1 if A is an identity matrix, else return 0.

// Input 1:
// [[1, 0], [0, 1]]

// Input 2:
// [[0, 0, 1], [0, 1, 0], [1, 0, 0]]

    public static void main(String[] args) {

        int A[][]= {
                    {1, 0, 0}, 
                    {0, 1, 0}, 
                    {0, 0, 1}
                };
                int r = A.length;
                int c = A[0].length;
        
        
        
                int flag=1;
        
        
                for(int i=0;i<r;i++){
        
                    for(int j=0;j<c;j++){
        
        
                        if(i==j && A[i][j]!=1){
        
                            flag=0;
                            break;
                           
                        }
                        else if(i!=j && A[i][j]!=0){
                            flag=0;
                            break;
                        }
                       
         
                    }
                }
        
               System.out.println("Result:--"+flag);
        
        
        
        
    }
    
}
