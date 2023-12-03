public class EquilibriumIndex {

//     You are given an array A of integers of size N.

// Your task is to find the equilibrium index of the given array

// The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

// If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.
    public static void main(String[] args) {

        

        int A[]={-7, 1, 5, 2, -4, 3, 0};
        
        int n=A.length;
        int ans=-1;

        long pf[]=new long[n];
        pf[0]=A[0];

        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+A[i];
        }


        for(int i=0;i<pf.length;i++){
            long lsum;
            if(i==0){
                lsum= 0;  
            }
            else{
                lsum= pf[i-1];   // to check this case if i==0 this part pf[i-1] wil be -1 to avoid index error
            }
            long rightSum=pf[n-1]-pf[i+1-1];
            if(lsum==rightSum){
                ans=i;
                break;
            }
        }

        System.out.println(ans);
    
    }
}
