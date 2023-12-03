public class SpecialIndex {

    // Given an array, arr[] of size N, the task is to find the count of array indices such that 
    // removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.


    // idea:
        //    0 1 2 3 4 5 6 7 8 9   =>>> indexes 
//    arr[10]=3 2 6 8 2 9 7 6 4 12

// Delete index=4 

// After deletig index 4 =>>> after that index odd changed to even and even changed to odd 

 
 
// cp[9] 3 2 6 8 9 7 6 4 12   =>> in this array after deleting the 4th index => after that index all the elements index changed vice versa 
 

// this is not full explanation 
  
    public static void main(String[] args) {
        
       int A[]={2, 1, 6, 4};

       int n=A.length;

        int pfeven[]=new int[n];

        pfeven[0]=A[0];

        for(int i=1;i<n;i++){

            if(i%2==0){
                pfeven[i]=pfeven[i-1]+A[i];

            }
            else{
                pfeven[i]=pfeven[i-1];
            }

           
        }

        int pfodd[]=new int[n];

        pfodd[0]=0;

        for(int i=1;i<n;i++){

            if(i%2!=0){
                pfodd[i]=pfodd[i-1]+A[i];
            }
            else{
                pfodd[i]=pfodd[i-1];
            }
          
        }

        int count=0;
        int se=0;
        int so=0;

        for(int i=0;i<n;i++){

           

            if(i==0){
                      se= pfodd[n-1]-pfodd[i];
                      so= pfeven[n-1]-pfeven[i];
            }
            else{
                     se=pfeven[i-1]+pfodd[n-1]-pfodd[i];
                      so=pfodd[i-1]+pfeven[n-1]-pfeven[i];
            }            
            

            if(so==se){
                count++;
            }

        }

         System.out.println(count);


    }
    
}
