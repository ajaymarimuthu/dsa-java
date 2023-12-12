package CarryForward;

public class AGPairs {

//     You have given a string A having Uppercase English letters.
// You have to find how many times subsequence "AG" is there in the given string.
// NOTE: Return the answer modulo 109 + 7 as the answer can be very large.

    public static void main(String[] args) {


        String A="ABCGAG";
        // A = "GAB"

        int n=A.length();
        int c=0;
        int ans=0;
        int m = 1000000007;

        for(int i=n-1;i>=0;i--){
            if(A.charAt(i)=='G'){
                c++;
            }
            else if(A.charAt(i)=='A'){
                ans=(ans+c)%m;
            }
        }

     System.out.println(ans);


        
    }
    
}
