package BasicDSA.Sorting;

public class Bubblesort {

    public static int[] sort(int num[]){
        int n = num.length-1;
        for(int i=0;i<n;i++){
            for(int j=0; j<n-i; j++){
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        return num;
    }

    public static void main(String args[]){
        int unsorted[] = {2,3,6,1,5,4,8,7,9,0};
        int sorted[] = sort(unsorted);
        System.out.println("Sorted array is : ");
        for(int i=0; i<sorted.length; i++){
            System.out.print(sorted[i]);
        }
    }
    
}
