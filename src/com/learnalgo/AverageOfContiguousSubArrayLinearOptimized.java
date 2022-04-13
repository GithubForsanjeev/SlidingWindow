package com.learnalgo;

import java.util.Arrays;

/**
 * Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
 * Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
 * Output: [2.2, 2.8, 2.4, 3.6, 2.8]
 */
public class AverageOfContiguousSubArrayLinearOptimized {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        double[] result = findAverage(arr, k);
        System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
    }

    private static double[] findAverage(int[] arr, int k) {
        int n = arr.length;
        double[] result = new double[n - k + 1];
        int start = 0;
        double sum = 0;
        for (int end = 0; end < n; end++) {
            sum +=arr[end];
            if(end>=k-1){
                result[start]=sum/k;
                sum-=arr[start];
                start++;
            }
        }
        return result;
    }
}
