package BasicDSA.Sorting;

public class Countingsort {
    public static int[] sort(int[] num) {
        int range = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            range = Math.max(range, num[i]);
        }
        int[] count = new int[range + 1];
        for (int i = 0; i < num.length; i++) {
            count[num[i]]++;
        }
        int j = 0;
        for (int i = 0; i < num.length; i++) {
            while (count[i] > 0) {
                num[j] = i;
                count[i]--;
                j++;
            }
        }

        return num;
    }

    public static void main(String args[]) {
        int unsorted[] = { 2, 1, 3, 5, 4, 7, 6, 9, 8, 0 };
        int sorted[] = sort(unsorted);
        System.out.println("Sorted array is : ");
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i]);
        }
    }
}
