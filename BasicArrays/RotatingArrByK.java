public class RotatingArrByK {


    // Rotate array by B times 


    // Methods 2 
    // 1.) Using with extra space
    // 2.) reverse full array , reverse first B elements, reverse n-B elemtn 


    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};


        // METHOD-1 with extra space but considerable


        int n=arr.length;
        int B=2;

         B=B%n;  
        //it is important bcz , if i rotate arrary by n times it will be same 
        // so B may excee the length of array , so am taking modulus on B;


        int out[]=new int[n];


        for(int i=0;i<n;i++){
            int index=(i+B)%n;

            out[index]=arr[i];
        }


        for(int i=0;i<out.length;i++){ 

            System.out.print(out[i]+" ");
            System.out.println("TIme Complexity: o(n)");
            System.out.println("Space Complexity: o(n) bcz of extra array");
        }








        
    }
    
}
