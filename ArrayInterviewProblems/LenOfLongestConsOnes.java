package ArrayInterviewProblems;

public class LenOfLongestConsOnes {

    // Given a binary string A. It is allowed to do at most one swap between any 0
    // and 1.
    // Find and return the length of the longest consecutive 1’s that can be
    // achieved.

    // Output Format

    // Return the length of the longest consecutive 1’s that can be achieved.

    public static void main(String[] args) {

        String A= "111000"; //ouptu: 3
        // String A = "111011101"; // ouptu: 7

        int ones_Count = 0;
        int zeroes_Count=0;


        int n = A.length();

        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '1') {
                ones_Count++;
            }
            else{
                zeroes_Count++;
            }
        }

        int pf[]=new int[n];
        int sf[]=new int[n];



        if(A.charAt(0)=='1'){
            pf[0]=1;
        }
        else{
            pf[0]=0;
        }

        if(A.charAt(n-1)=='1'){
            pf[n-1]=1;
        }
        else{
            pf[n-1]=0;
        }


        for(int i=1;i<n;i++){

            if(A.charAt(i)=='1'){                
                pf[i]=pf[i-1]+1;
            }
            else{
                pf[i]=0;
            }
        }

        for(int i=n-2;i>=0;i--){

            if(A.charAt(i)=='1'){
                sf[i]=sf[i+1]+1;
            }
            else{
                sf[i]=0;
            }
        }

        int count=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

         

            if(A.charAt(i)=='0'){
                if(i==0){

                    count=sf[i+1];
                
                }
                else if(i==n-1){
                    count=pf[i-1];
                }
                else{
                    count=pf[i-1]+sf[i+1];
                }

                if(count<ones_Count){
                    count=count+1;
                }

                if(count>max){
                    max=count;
                }

              
            }
        }


        System.out.println("maximum count value ---"+ max);















    }

}
