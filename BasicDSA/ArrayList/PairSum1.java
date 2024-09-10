package BasicDSA.ArrayList;

import java.util.ArrayList;

//Calculate sum of pairs and print if found equal to target When array is sorted

public class PairSum1 {

    //Brute force work for all sorted/unsorted arrays
    public static ArrayList<Integer> BruteForce(ArrayList<Integer> num, int target) { // O(n^2)
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < num.size(); i++) {
            for (int j = i + 1; j < num.size(); j++) {
                int sum = num.get(i) + num.get(j);
                if (sum == target) {
                    ans.add(i);
                    ans.add(j);
                    return ans;
                }
            }
        }
        System.out.println("Not found");
        return ans;
    }

    // ONLY applies on sorted array
    public static boolean twoPointer(ArrayList<Integer> num, int target) {
        int n = num.size();
        int low = 0, high = n - 1;
        while (low < high) {
            int sum = num.get(low) + num.get(high);
            if (sum == target) {
                System.out.println("Found at index : [" + low + "," + high + "]");
                // return true;
            }

            // Block to show conditions applicable only on sorted array
            {
                if (sum < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            num.add(i);
        }
        int target = 5;
        // System.out.println("Target found by doing sum of elements at
        // indexs"+BruteForce(num,target));
        twoPointer(num, target);
    }
}
