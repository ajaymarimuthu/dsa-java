package SubArray;

public class GoodSubArray {

    // Given an array of integers A, a subarray of an array is said to be good if it
    // fulfills any one of the criteria:
    // 1. Length of the subarray is be even, and the sum of all the elements of the
    // subarray must be less than B.
    // 2. Length of the subarray is be odd, and the sum of all the elements of the
    // subarray must be greater than B.
    // Your task is to find the count of good subarrays in A.

    // Problem Constraints
    // 1 <= len(A) <= 5 x 103
    // 1 <= A[i] <= 103
    // 1 <= B <= 107

    // Input Format
    // The first argument given is the integer array A.
    // The second argument given is an integer B.

//     Input 1:
// A = [1, 2, 3, 4, 5]
// B = 4


// outptu:  6

// output explaiantiuon:
// Even length good subarrays = {1, 2}
// Odd length good subarrays = {1, 2, 3}, {1, 2, 3, 4, 5}, {2, 3, 4}, {3, 4, 5}, {5}



// Input 2:

// A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9]
// B = 65


// Example Output
// Output 1:
// 6
// Output 2:

// 36
// explajntion:
// There are 36 good subarrays

    public static void main(String[] args) {

        int A[] = {1, 2, 3, 4, 5};
        int B = 4;



        int n=A.length;

        int evenCount=0;
        int oddCount=0;

        for(int i=0;i<n;i++){

            int sum=0;

            for(int j=i;j<n;j++){

                sum+=A[j];

                int len=j-i+1;

                if(len%2==0){


                    if(sum<B){
                        evenCount++;
                    }


                }
                else if(len%2!=0){


                    if(sum>B){
                        oddCount++;
                    }


                }



            }
        }

        int sum=evenCount+oddCount;

       System.out.println("result count---"+sum);
//  System.out.println("result count---"+oddCount);







    }

}
