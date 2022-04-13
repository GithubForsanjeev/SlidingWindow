package com.learnalgo;

import java.util.Arrays;

/**
 * Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
 * Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
 * Output: [2.2, 2.8, 2.4, 3.6, 2.8]
 */
public class AverageOfContiguousSubArrayLinear {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        double[] result = findAverage(arr, k);
        System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
    }

    private static double[] findAverage(int[] arr, int k) {
        int n = arr.length;
        double[] result = new double[n - k + 1];
        double sum = 0;
        int i = 0;
        for (; i < k; i++) {
            sum = sum + arr[i];
        }
        result[k - i] = sum / k;

        for (int j = k; j < n; j++) {
            sum = sum - arr[j - k] + arr[j];
            result[j - i + 1] = sum / k;
        }
        return result;
    }
}
