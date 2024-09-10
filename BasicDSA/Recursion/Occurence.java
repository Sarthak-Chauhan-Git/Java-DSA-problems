package BasicDSA.Recursion;

public class Occurence {
    public static void checkOccurence(int key, int arr[], int i, int last){
        if (i == arr.length) {
            System.out.println(last);
            return;
        }
        // if(arr[i] == key){
        //     System.out.println("First occurence : "+i);
        //     return;
        // }

        if(arr[i] == key){
            last = i;
        }
        checkOccurence(key, arr, i+1, last);

    }
    public static void main(String args[]){
        int arr[] = {1,2,4,5,6,6,7,8,9,5};
        checkOccurence(5, arr, 0, -1);
    }
}
