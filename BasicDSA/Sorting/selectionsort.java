package BasicDSA.Sorting;

public class selectionsort {
    public static int[] sort(int num[]){
        int n = num.length-1;
        for(int i=0; i<n; i++){
            int min = i;
            for(int j=i+1; j<n+1; j++){
                if(num[min]>num[j]){
                    min=j;
                }
            }
            //swap
            int temp = num[min];
            num[min] = num[i];
            num[i] = temp;
        }
        return num;
    }
    public static void main(String args[]){
        int unsorted[]={2,1,3,5,4,7,6,9,8,0};
        int sorted[] = sort(unsorted);
        System.out.println("Sorted array is : ");
        for(int i=0; i<sorted.length; i++){
            System.out.print(sorted[i]);
        }
    }
}
