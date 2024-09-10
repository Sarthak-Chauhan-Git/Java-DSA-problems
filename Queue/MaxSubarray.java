package Queue;

import java.util.*;

public class MaxSubarray {
    public static Queue<Integer> maxSubarr(int[] arr) {
        Queue<Integer> q = new LinkedList<>();
        int k = 3;

        for (int i = 0; i <= arr.length-k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k && j < arr.length; j++) {
                max = Math.max(max, arr[j]);
            }
            q.add(max);
        }

        return q;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        System.out.println(maxSubarr(arr));
    }
}
