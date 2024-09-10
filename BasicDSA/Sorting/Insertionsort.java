package BasicDSA.Sorting;

public class Insertionsort {
    public static int[] sort(int[] num) {
        int n = num.length;
        for (int i = 1; i < n; i++) {
            int curr = num[i];
            int prev = i-1;
            //find out correct position to insert
            while(prev >= 0 && num[prev] > curr){
                num[prev+1] = num[prev]; 
                prev--;
            }
            //insert
            num[prev+1] = curr;   
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
