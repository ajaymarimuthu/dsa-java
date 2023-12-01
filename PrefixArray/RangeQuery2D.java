public class RangeQuery2D {

    public static void main(String[] args) {
        
        int arr[]={1, 2, 3, 4, 5};

        int B[][]={  

                   {0,3}, 
                   {1,2} 
                   
                  };

       

                  int m=B.length;
                  int n=arr.length;
          
                  long[] output=new long[m];
          
                  long[] prefix=new long[n];
          
          
                  prefix[0]=arr[0];
          
                  for(int i=1;i<n;i++){
                      prefix[i]=prefix[i-1]+arr[i];
                  }
          
                  for(int i=0;i<m;i++){
                      int left=B[i][0];
                      int right=B[i][1];
          
                      if(left<=0){
                          output[i]=prefix[right];
                      }
                      else{
                            output[i]=prefix[right]-prefix[left-1];
                      }
                       
                  }

                  for(int i=0;i<output.length;i++){
                    System.out.println(output[i]+" ");
                  }
                  System.out.println( " T.c : o(n) +o(m)=>> o(n+m)"+"-----"+" S.C=>> o(N)");
          
                   
          
      
    }
    
}
