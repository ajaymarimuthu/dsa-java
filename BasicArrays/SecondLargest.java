public class SecondLargest {

    public static void main(String[] args) {
        
        int arr[]={1,9,5,2,3,4};


        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        int ans=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max){
                ans=Math.max(ans,arr[i]);
            }
        }

    System.out.println(ans);
        
    }
    
}
