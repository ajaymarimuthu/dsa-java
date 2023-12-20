package SubArray;

public class ClosestMinMax {

    public static void main(String[] args) {
        int A[]={2, 6, 1, 6, 9};  //3
        // int A[]={1, 3, 2};   //2

        
        int n=A.length;

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;


        for(int i=0;i<n;i++){
            if(A[i]>max){
                max=A[i];
            }
        }

        
        for(int i=0;i<n;i++){
            if(A[i]<min){
                min=A[i];
            }
        }

         if(max == min){

            System.out.println(1);
           return ;
         }


        int maxIndex=-1;
        int minIndex=-1;

        int len;
        int ans=n;

        for(int i=n-1;i>=0;i--){
            if(A[i]==max){
                maxIndex=i;

                if(minIndex!=-1){
                    len=minIndex-i+1;

                    if(len<ans){
                        ans=len;
                    }
                }

            }

            else if(A[i]==min){
                minIndex=i;

                 if(maxIndex!=-1){
                    len=maxIndex-i+1;

                    if(len<ans){
                        ans=len;
                    }
                }


            }
        }

          System.out.println(ans);


    }
    
}
