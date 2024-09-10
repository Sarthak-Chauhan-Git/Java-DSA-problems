package BasicDSA.Sorting;
// count the inversion needed to get a sorted array
public class InversionCount {
    public static int count(int arr[], int si, int ei){
        int count = 0;
        if(si >= ei){
            return count;
        }
        for(int i=si; i<= ei; i++){
            for(int j=0; j<ei; j++){
                if(arr[i] > arr[j] && i<j){
                    count++;
                }
            }
        }
        return count;
    }

    // public static void quickCount(int arr[], int count, int si, int ei){
    //     if(si>=ei){
    //         System.out.println(count);
    //         return;
    //     }
    //     int pivot = arr[ei];
    //     for(int i = 0; i<ei; i++){
    //         if(arr[i] > pivot && i <= pivot){
    //             count++;
    //         }
    //     }
    //     quickCount(arr, count, si, ei-1);
    // }

    public static int quickCount(int arr[], int count, int si, int ei, int i){
        if(si>=ei){
            return count;
        }
        int mid = si+(ei-si)/2;
        if(arr[i] > mid && si <= mid){
            count++;
        }
        quickCount(arr, count, si, mid, i+1);//right
        quickCount(arr, count, mid, mid, i+1);//left
        return count;
    }
    
    public static void main(String[] args){
        int[] arr = {2,4,1,3,5};
        //int[] arr = {1,2,3,4,5};
        //int[] arr = {5,5,5};
        System.out.println(quickCount(arr,0,0,arr.length-1,0));
        //quickCount(arr, 0, 0, arr.length-1);
    }
}
