public class ProductArray {
    
//     Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.

//    Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.

// Input 1:
//     A = [1, 2, 3, 4, 5]
// Output 1:
//     [120, 60, 40, 30, 24]

// Input 2:
//     A = [5, 1, 10, 1]
// Output 2:
//     [10, 50, 5, 50]


    public static void main(String[] args) {
        int A[]={1,2,3,4,5};

        int n=A.length;     

        
        int pf[]=new int[n];

        pf[0]=A[0];

        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]*A[i];
        }

        int q[]=new int[n];
        q[n-1]=A[n-1];

        for(int i=n-2;i>=0;i--){
            q[i]=q[i+1]*A[i];
        }

        for(int i=0;i<n;i++){
            if(i == 0){
                A[i] = q[i + 1];
            }
            else if(i == n - 1){
                A[i] = pf[i - 1];
            }
            else{
                A[i] = pf[i - 1] * q[i + 1];
            }
        }

        for(int i=0;i<A.length;i++){
          System.out.println(A[i]);
        }
        





    }

}
