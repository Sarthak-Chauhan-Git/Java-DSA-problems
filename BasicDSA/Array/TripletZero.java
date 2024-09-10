package BasicDSA.Array;

import java.util.*;

public class TripletZero {
    public static List<List<Integer>> triplet(int num[]) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                for (int k = j+1; k < num.length; k++) {
                    if (num[i] + num[j] + num[k] == 0) {
                            List<Integer> triplet = new ArrayList<Integer>();
                            triplet.add(num[i]);
                            triplet.add(num[j]);
                            triplet.add(num[k]);
                            Collections.sort(triplet);
                            result.add(triplet);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(triplet(nums));
    }
}
