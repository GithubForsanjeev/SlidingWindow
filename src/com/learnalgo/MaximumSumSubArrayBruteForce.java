package com.learnalgo;

import java.util.Arrays;

/**
 * Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any
 * contiguous subarray of size ‘k’.
 * Input: [2, 1, 5, 1, 3, 2], k=3
 * Output: 9
 * Explanation: Subarray with maximum sum is [5, 1, 3].
 *
 */
public class MaximumSumSubArrayBruteForce {
    public static void main(String[] args) {
        int[] arr={ 2, 1, 5, 1, 3, 2 };
        int k =3;
        System.out.println("Maximum sum of a subarray of size K: "
                + findMaxSumSubArray(arr, k ));
    }

    private static double findMaxSumSubArray(int[] arr, int k) {
        int n = arr.length;
        double sumMax = Integer.MIN_VALUE;
        for(int i=0; i<n-k+1;i++){
            double sum =0;
            for (int j=i; j<k+i;j++){
                sum = sum + arr[j];
            }
            sumMax = Math.max(sumMax,sum);
        }
        return sumMax;
    }
}
