public class PickBothSides {

    // Approach PrefixArray

    // i Left Right
    // i 0 elements B         B-i elemtns
    // i 1 elements B-1       B-i elemtns
    // i 2 elements B-2       B-i elemtns
    // i . . 
    // i . .
    // i . .
    // i B-2 elements 2       B-i elemtns
    // i B-1 elements 1       B-i elemtns
    // i B elements 0         B-i elemtns

    public static void main(String[] args) {

        int arr[] = { 5, -2, 3, 1, 2 };   //8 it the output

        // System.out.println("asdaasdf");

        int B=3; // (picking B elemtns )

        int n=arr.length;

        int pf[]=new int[n];
        int sf[]=new int[n];

        pf[0]=arr[0];
        sf[n-1]=arr[n-1];

        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+arr[i];
        }

         for(int i=n-2;i>=0;i--){
            sf[i]=sf[i+1]+arr[i];
        }

        int ans=Math.max(pf[B-1],sf[n-B]);


        for(int i=1;i<B;i++){

            int sum=pf[i-1]+sf[n-(B-1)];

            ans=Math.max(sum,ans);
        }


        System.out.println(ans);
        System.out.println("T.c :   0(n) :  S.C:  0(n)");



    }


 
//   C0de for space compeltiy of  0(1);
    
//     int n=A.length;

//     for(int i=1;i<n;i++){
//         A[i]=A[i-1]+A[i];
//     }

//     if(B==n){
//         return A[n-1];
//     }
//     int ans=A[n-1]-A[n-1-B];

//     for(int i=1;i<=B;i++){

//         int ls=A[i-1];
//         int rs=A[n-1]-A[n-1-(B-i)];

//         ans=Math.max(ans,ls+rs);

//     }

//    return ans;



}