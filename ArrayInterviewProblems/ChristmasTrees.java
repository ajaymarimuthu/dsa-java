package ArrayInterviewProblems;

public class ChristmasTrees {

    // You are given an array A consisting of heights of Christmas trees and an
    // array B of the same size consisting of the cost of each of the trees
    // (Bi is the cost of tree Ai, where 1 ≤ i ≤ size(A)), and you are supposed to
    // choose 3 trees (let's say, indices p, q, and r), such that Ap < Aq < Ar,
    // where p < q < r.
    // The cost of these trees is Bp + Bq + Br.
    // You are to choose 3 trees such that their total cost is minimum. Return that
    // cost.
    // If it is not possible to choose 3 such trees return -1.

    // Problem Constraints
    // 1 <= A[i], B[i] <= 10^9
    // 3 <= size(A) = size(B) <= 3000

    // Output Format
    // Return an integer denoting the minimum cost of choosing 3 trees whose heights
    // are strictly in increasing order, if not possible, -1.

    public static void main(String[] args) {

        // int A[] = { 1, 3, 5 };
        // int B[] = { 1, 2, 3 };

        int A[] = { 1, 6, 4, 2, 6, 9 };
        int B[] = { 2, 5, 7, 3, 2, 7 };

        // Explanation 1:

        // We can choose the trees with indices 1, 2 and 3, and the cost is 1 + 2 + 3 =
        // 6.
        // Explanation 2:

        // We can choose the trees with indices 1, 4 and 5, and the cost is 2 + 3 + 2 =
        // 7.
        // This is the minimum cost that we can get.

        int n = A.length;
        int finalCost=Integer.MAX_VALUE;

        for (int q = 1; q < n; q++) {

            int tempSum = 0;

            int leftMinimum = Integer.MAX_VALUE;
            int rightMinimum = Integer.MAX_VALUE;

            int leftIndex = -1;
            int rightIndex = -1;

            for (int p = q - 1; p >= 0; p--) {

                if (A[p] < A[q] && B[p] < leftMinimum) {
                    leftIndex = p;
                    leftMinimum = B[p];
                }

            }

            for (int r = q + 1; r < n; r++) {

                if (A[r] > A[q] && B[r] < rightMinimum) {
                    rightIndex = r;
                    rightMinimum = B[r];
                }

            }


            if(leftIndex!=-1 && rightIndex !=-1){
                tempSum=B[q] + rightMinimum + leftMinimum ;
                finalCost = Math.min(tempSum,finalCost);
            }
 

        }

        if(finalCost != Integer.MAX_VALUE){
            System.out.println(finalCost);
        }

    }

}
