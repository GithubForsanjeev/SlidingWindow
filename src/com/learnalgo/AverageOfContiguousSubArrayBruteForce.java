package com.learnalgo;

import java.util.Arrays;

/**
 * Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
 * Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
 * Output: [2.2, 2.8, 2.4, 3.6, 2.8]
 */
public class AverageOfContiguousSubArrayBruteForce {
    public static void main(String[] args) {
        int[] arr={1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k =5;
        double[] result = findAverage(arr,k);
        System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
    }

    private static double[] findAverage(int[] arr, int k) {
        int n = arr.length;
        double[] result = new double[n-k+1];
        for(int i=0; i<n-k+1;i++){
            double sum =0;
            for (int j=i; j<k+i;j++){
                sum = sum + arr[j];
            }
            result[i]= sum/k;
        }
        return result;
    }
}
