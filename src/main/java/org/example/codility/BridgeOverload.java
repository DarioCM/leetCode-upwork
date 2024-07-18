package org.example.codility;

import java.util.Arrays;

public class BridgeOverload {

    public static int minDriversToTurnBack(int[] weights, int maxWeight) {
        int totalWeight = Arrays.stream(weights).sum();

        // If the total weight is less than or equal to maxWeight, no drivers need to turn back
        if (totalWeight <= maxWeight) {
            return 0;
        }

        int n = weights.length;
        boolean[] dp = new boolean[maxWeight + 1];
        dp[0] = true;

        for (int weight : weights) {
            for (int j = maxWeight; j >= weight; j--) {
                if (dp[j - weight]) {
                    dp[j] = true;
                }
            }
        }

        // Find the maximum achievable weight
        int maxAchievableWeight = 0;
        for (int i = maxWeight; i >= 0; i--) {
            if (dp[i]) {
                maxAchievableWeight = i;
                break;
            }
        }

        // Minimum weight that needs to be turned back
        int minTurnBackWeight = totalWeight - maxAchievableWeight;

        // Find the minimum number of vehicles that sum up to minTurnBackWeight
        int[] dpTurnBack = new int[minTurnBackWeight + 1];
        Arrays.fill(dpTurnBack, Integer.MAX_VALUE);
        dpTurnBack[0] = 0;

        for (int weight : weights) {
            for (int j = minTurnBackWeight; j >= weight; j--) {
                if (dpTurnBack[j - weight] != Integer.MAX_VALUE) {
                    dpTurnBack[j] = Math.min(dpTurnBack[j], dpTurnBack[j - weight] + 1);
                }
            }
        }

        // Return the minimum number of vehicles that need to be turned back to achieve minTurnBackWeight
        return dpTurnBack[minTurnBackWeight];
    }

    public static void main(String[] args) {
        int[] weights = {5, 3, 8, 1, 8, 7, 7, 6};
        int maxWeight = 9;
        System.out.println(minDriversToTurnBack(weights, maxWeight));  // Output: 4
    }
}