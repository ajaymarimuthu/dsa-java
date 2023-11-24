public class ReverseArray {

//    arr=[1,2,3,4,5,6];
    // observations 

    // i j
    // 0  


    public static void main(String[] args) {
        int arr[]={5,6,7,8,9};

        int n=arr.length;

        reverseArr(arr,n);
    }

    public static void reverseArr(int arr[],int n){


        int i=0;
        int j=n-1;

        int temp;

        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;


            i++;
            j--;

        }


        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }


 
    }
    
}
