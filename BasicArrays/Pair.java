public class Pair {

    // Given an array A and an integer B.
    // A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). 
    // Check if any good pair exist or not.

    public static void main(String[] args) {
        int arr[]={1,2,3,4}; //"YES
        // int arr[]={1,2,4};  //"NO


        int n=arr.length;

        int B=7;
        int ans=0;
        for(int i=0;i<n;i++){
         
             for(int j=i+1;j<n;j++){

                if(arr[i]+arr[j]==B){
                    ans=1;
                    break;
                }
            
              }
        }

        if(ans==0){
            System.out.println("NO");
        }
        else{
             System.out.println("YES");
        }
    }
    
}
