package SubArray;

public class SubArrayLeastAverageSliding {

//     Given an array A of size N, find the subarray of size B with the least average.

// Problem Constraints
// 1 <= B <= N <= 105
// -105 <= A[i] <= 105

// Output Format
// Return the index of the first element of the subarray of size B that has least average.
// Array indexing starts from 0.

// Example Input
// Input 1:
// A = [3, 7, 90, 20, 10, 50, 40]  //3
// B = 3

// output Explaintion:
// Subarray between indexes 3 and 5
// The subarray {20, 10, 50} has the least average 
// among all subarrays of size 3.
// Input 2:

// A = [3, 7, 5, 20, -10, 0, 12]     //4
// B = 2





    public static void main(String[] args) {

        int A[] = {3, 7, 90, 20, 10, 50, 40} ;
        int B = 3;
        
        int n = A.length;


        int currentSum=0;


        for(int i=0;i<B;i++){
            currentSum+=A[i];
        }

        int min_Avg=currentSum;


        int start=1;
        int end=B;

        int resultingPosition=0;


        while(end<n){            

            currentSum=currentSum-A[start-1]+A[end];   // removing 1st element in previous window and adding last element in curr window
            
            if(currentSum<min_Avg){
                min_Avg=currentSum;
                resultingPosition=start;
            }
            end++;
            start++;        
        }

         System.out.println("resultingPosition---"+resultingPosition);


    }
    
}
