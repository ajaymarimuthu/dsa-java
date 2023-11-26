 
import java.util.Arrays;

public class LittlePinyMaximu {

    // Little Ponny is given an array, A, of N integers. 
    // In a particular operation, he can set any element of the array equal to -1.

    // He wants your help in finding out the minimum number of operations required 
    // such that the maximum element of the resulting array is B. If it is not possible, then return -1.


    public static void main(String[] args) {

        int arr[] = { 2, 4, 3, 1, 5 };
        // int arr[]={1,2,4};
        int n = arr.length;

        Arrays.sort(arr);

        int B = 3;
        int available = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == B) {
                available = 1;
                // System.out.println(arr[i]);
                // break;
            } else if (available == 1 && arr[i]>B) {
                // System.out.println(arr[i]);
                count++;
            }

        }

        if (available == 0 && count>0) {

            System.out.println(-1);

        } else {
            System.out.println(count);
        }

    }

 
}
