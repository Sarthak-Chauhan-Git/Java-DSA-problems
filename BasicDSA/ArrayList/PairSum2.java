package BasicDSA.ArrayList;

import java.util.ArrayList;

// Calculate sum of pairs if found equal to target then return BUT array is sorted and ROTATED

public class PairSum2 {

    public static void twoPointer(ArrayList<Integer> num, int target) {
        int low = 0, high = 0;
        for(int i=0; i<num.size();i++){ // Find pivot where array is rotated
            if(num.get(i)>num.get(i+1)){
                low = i+1;
                high = i;
                break;
            }
        }
        while (low != high) {
            if (low > num.size() - 1) {
                low = 0;
            }
            if (high < 0) {
                high = num.size() - 1;
            }
            int sum = num.get(low) + num.get(high);
            if (sum == target) {
                System.out.println("Found at index : [" + low + "," + high + "]");
            }

            // Block to show conditions applicable only on sorted array
            {
            // Modular arithmetic can be used to get rotated indexes in range of 0 - n
                // if (sum < target) {
                // low = (low+1)%n;
                // } else {
                // high = (n+high-1)%n;
                //
                if (sum < target) {
                    low++;
                } else {
                    high--;
                }
            }

        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        int arr[] = { 11, 15, 6, 7, 8, 9, 10 };
        for (int i = 0; i < arr.length; i++) {
            num.add(arr[i]);
        }
        int target = 16;
        twoPointer(num, target);
    }

}
