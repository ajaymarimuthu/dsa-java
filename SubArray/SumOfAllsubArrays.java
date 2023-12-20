package SubArray;

public class SumOfAllsubArrays {
     
    // You are given an integer array A of length N. You have to find the sum of all subarray sums of A.
    // More formally, a subarray is defined as a contiguous part of an array which we can obtain by 
    // deleting zero or more elements from either end of the array.
    // A subarray sum denotes the sum of all the elements of that subarray.
    // Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes

    // solution 
    //   1.) count no of times an element occur in sub array 
    //   2.) then multiply that current elemnet with stat and end index


    // 01,2,3,4...i......n-1    suppose we want to find statr and end index of the ith elemtn
        // [0,i] = i-0+1 =>>> i+1        options for statr index 
        // [i,n-1] = n-1-i+1  =>> n-i ;        options for end index 

        // A[i] * (i+1) * (n-i) ===>>> this will give the no of tmes AN ELEMTN is there is an sub array 




    public static void main(String[] args) {

        int A[]={1,2,3} ;// 20
        
        int n=A.length;
        long ans = 0;

        for(int i=0;i<n;i++){
            ans+=(long)A[i]*(i+1)*(n-i);
        }

        System.out.println(ans);
    
    }
    
}
