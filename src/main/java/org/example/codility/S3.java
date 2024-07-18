package org.example.codility;

import java.util.Arrays;

public class S3 {

    public static void main(String[] args) {
        int[] weight = {5, 3, 8, 1, 8, 7, 7, 6};
        System.out.println(solution(9, weight));
    }

    public static int solution(int U, int[] weight) {
        Arrays.sort(weight);
        int totalWeight = 0;
        int count = 0;
        for (int i = weight.length - 1; i >= 0; i--) {
            if (totalWeight + weight[i] <= U) {
                totalWeight += weight[i];
            } else {
                count++; // Increment the count for each driver that needs to turn back
            }
        }
        return count;
    }
}
