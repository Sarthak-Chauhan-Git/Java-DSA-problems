package Queue;

import java.util.*;

import BasicDSA.Array.printer;

public class JobSequencing {
    public static void jobSeq(int[][] arr) {
        // Sort the jobs based on their profits in descending order
        Arrays.sort(arr, (a, b) -> b[2] - a[2]);

        // Create a queue to store the sequence of jobs
        Queue<Integer> q = new LinkedList<>();

        // Create an array to store the sequence of jobs
        int[] seq = new int[arr.length];

        // Initialize a boolean array to keep track of the deadlines
        boolean[] deadlineMet = new boolean[arr.length + 1];

        // Iterate over the sorted jobs
        for (int i = 0; i < arr.length; i++) {
            // Find a deadline that can be met for the current job
            for (int j = arr[i][1]; j > 0; j--) {
                if (!deadlineMet[j]) {
                    deadlineMet[j] = true;
                    q.add(arr[i][0]);
                    seq[i] = arr[i][0];
                    break;
                }
            }
        }

        // Print the sequence of jobs
        printer.print(seq);
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 4, 20}, {2, 1, 10}, {3, 1, 40}, {4, 1, 30}};
        jobSeq(arr);
    }
}