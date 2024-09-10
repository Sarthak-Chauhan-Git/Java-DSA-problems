package BasicDSA.ArrayList;

import java.util.ArrayList;

//find the container which can store maximum amount of water possible

public class ContainerWater {
    public static int bruteForce(ArrayList<Integer> container) {    // O(n^2)
        int n = container.size();
        if (n <= 0) {
            System.out.println("Nothing can be stored");
            return 0;
        }
        int water = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int left = container.get(i);
            for (int j = i + 1; j < n; j++) {
                int right = container.get(j);
                int height = Math.min(left, right);
                int width = j - i;
                int temp = height * width;
                if (temp > water) {
                    water = temp;
                }
            }

        }
        return water;
    }

    public static int twoPointer(ArrayList<Integer> container) {    // O(n)
        int n = container.size();
        if (n <= 0) {
            System.out.println("Nothing can be stored");
            return 0;
        }
        int left = 0, right = n - 1, water = Integer.MIN_VALUE;
        while (left < right) {
            int height = Math.min(container.get(left), container.get(right));
            int width = right - left;
            int temp = height * width;
            water = Math.max(water, temp);

            {
                // Code checker block
                // System.out.println("Left ->"+left+" Right ->"+right+" width->"+width+" height
                // ->"+height+" water ->"+temp);
                // System.out.println(container.get(left)+","+container.get(right));
            }

            if (container.get(left) <= container.get(right)) {
                left++;
            } else if (container.get(right) < container.get(left)) {
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        ArrayList<Integer> container = new ArrayList<>();
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        for (int i = 0; i < arr.length; i++) {
            container.add(i, arr[i]);
        }
        System.out.println("Maximum water that can be stored between two lines is : " + twoPointer(container));
    }
}
