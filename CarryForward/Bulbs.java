package CarryForward;

public class Bulbs{
    // A wire connects N light bulbs.
    // Each bulb has a switch associated with it; however, due to faulty wiring,
    // a switch also changes the state of all the bulbs to the right of the current bulb.
    // Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.
    // You can press the same switch multiple times.
    // Note: 0 represents the bulb is off and 1 represents the bulb is on.


    public static void main(String args[]){

      

        int A[]={0, 1, 0, 1};          //o/p  :4
        // int A[]={1, 1, 1, 1};       //o/p:  0

        int n=A.length;


        int switchPressCount=0;

        for(int i=0;i<n;i++){
            int state=A[i];

            if(switchPressCount%2==0){

                state=A[i];

            }
            else{
                state=1-A[i];;      // if A[i]==0 then  1-0==1   (OR)  if A[i]=1 then 1-1==0
                 
            }

            if(state == 0){
                switchPressCount++;
            }

        }
        

        System.out.println("switchPressCount==="+switchPressCount);
  
    }
}