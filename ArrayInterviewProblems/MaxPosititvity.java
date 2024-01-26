package ArrayInterviewProblems;

public class MaxPosititvity {

    // Given an array of integers A, of size N.

    // Return the maximum size subarray of A having only non-negative elements.
    // If there are more than one such subarray, return the one having the smallest
    // starting index in A.

    // NOTE: It is guaranteed that an answer always exists.

    // Problem Constraints 1<=N<=10^5

    // -10^9<=A[i]<=10^9

    // Output Format:
    // Return maximum size subarray of A having only non-negative elements.
    // If there are more than one such subarrays,return the one having earliest starting index in A.

    // Example Input 
    // Input 1: A=[5,6,-1,7,8]
    // Input 2: A=[1,2,3,4,5,6]




    public static void main(String[] args) {

        int A[]={5,6,-1,7,8};        // Output 1:[5, 6]
        // int A[]={1,2,3,4,5,6};      // Output 2:[1, 2, 3, 4, 5, 6]


        int i=0;
        int j=0;

        int st_Index=-1;
        int end_Index=-1;


        int n=A.length;


        while(i<n && j<n){

            if(A[j]>0){

                j++;
 
               
            }
            else{



            }
          
        }








    }

}
