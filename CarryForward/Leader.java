package CarryForward;

public class Leader {
    // Given an integer array A containing N distinct integers, you have to find all
    // the leaders in array A.
    // An element is a leader if it is strictly greater than all the elements to its
    // right side.
    // NOTE: The rightmost element is always a leader.

    // A = [16, 17, 4, 3, 5, 2]
    // Input 2:
    // A = [5, 4]

//     Output 1:
// [17, 2, 5]
// Output 2:
// [5, 4]
    public static void main(String args[]) {

        int A[] = { 16, 17, 4, 3, 5, 2 };

        int n = A.length;

        int max = A[n - 1];

        int resArray[] = new int[n];

        int indx = 1;

        resArray[0] = max;

        for (int i = n - 2; i >= 0; i--) {

            if (A[i] > A[i + 1]) {
                if (A[i] > max) {
                    max = A[i];
                    resArray[indx] = A[i];
                    indx++;
                }
            }
        }

        int newIndex = 0;
        int outPutArray[] = new int[indx];

        for (int i = 0; i < indx; i++) {

            if (resArray[i] != 0) {
                outPutArray[newIndex] = resArray[i];
                newIndex++;
            }
        }

        for (int i = 0; i < outPutArray.length; i++) {

            System.out.println(outPutArray[i]);
        }

    }
}
