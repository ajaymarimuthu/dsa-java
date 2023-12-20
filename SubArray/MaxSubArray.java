package SubArray;

public class MaxSubArray {

//  You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
// But the sum must not exceed B.


// Problem Constraints
// 1 <= A <= 103
// 1 <= B <= 109
// 1 <= C[i] <= 106


// Input Format
// The first argument is the integer A.
// The second argument is the integer B.
// The third argument is the integer array C.


// Output Format
// Return a single integer which denotes the maximum sum.


// Example Input
// Input 1:
// A = 5
// B = 12
// C = [2, 1, 3, 4, 5]
// Input 2:    o.p: 12

// A = 3
// B = 1
// C = [2, 2, 2]   op:0 


    public static void main(String[] args) {
        int A = 5;
        int B = 12;
        int C[]= {2, 1, 3, 4, 5};

        int n=C.length;

        int max=0;
    

        for(int i=0;i<n;i++){

              int currSum=0;
            for(int j=i;j<n;j++){

                currSum+=C[j];

                if(currSum>max){

                    if(currSum<=B){
                        max=currSum;
                    }
               
                }



            }
        }

        System.out.println("max--"+max);






    }
    
}
