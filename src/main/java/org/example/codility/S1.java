package org.example.codility;

import java.util.Arrays;

public class S1 {

    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(A));
    }

    // given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
    public static int solution(int[] A) {

        Arrays.sort(A);
        boolean[] seen = new boolean[A.length + 1 ] ;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 && A[i] <= A.length) {
                seen[A[i]] = true;
            }
        }

        for (int i = 1; i < seen.length; i++) {
            if (!seen[i]) {
                return i;
            }
        }

        return A.length+1;

    }

}
