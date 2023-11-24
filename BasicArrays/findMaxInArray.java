// import java.util.Scanner;


// Question: 
// Program to find the count of number of elements which have atlease
// one element greater than themselves

// ex:  [-3,-2,6,8,4,8,5]  ans: 5
// ex:  [2,5,1,4,8,0,8,1,3,8]  ans: 7

// Brute force :
// Iterate the arr with outer loop 
//   in inner loop =>  check all the elments with inner loop whetrher any one is greater 
//   if greater then increase count and break it ... then it will keep on iterate for next elements


// Optimized approach 
//   observation: 
//   1.) for every number other than the max element there will be a greater element
//   2.) Answer = no of element which is not equal to maximum number 

class findMaxInArray {
    public static void main(String[] args) {

        int arr[]={2,5,1,4,8,0,8,1,3,8};

        int n=arr.length;

        int max=findMax(arr,n);



        int count=0;

        for(int i=0;i<n;i++){
            if(arr[i]!=max){
                count++;
            }
        }

        System.out.println("answer-------"+count);

        System.out.println("Time complexity: ");

        System.out.println("o(n) for finding max + o(n) for dfinding the element not equal to max");
        System.out.println("o(n)+o(n) =>> o2(n) ==> o(n)");
        System.out.println("Space compleexity: o(1)");



        
      
    }

    public static int findMax(int[] arr,int n){

        int max=arr[0];

        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }


        return max;

    }
}