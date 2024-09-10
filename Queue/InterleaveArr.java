package Queue;

import java.util.*;

import BasicDSA.Array.printer;

public class InterleaveArr {
    public static int[] interleave(int[] arr){
        Queue<Integer> q = new LinkedList<>();

        int mid = arr.length/2;
        for(int i=0;i<(arr.length)/2;i++,mid++){
            q.add(arr[i]);
            q.add(arr[mid]);
        }
        int i = 0;
        while(!(q.isEmpty())){
            arr[i] = q.remove();
            i++;
        }

        return arr;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        printer.print(interleave(arr));
    }
    
}
