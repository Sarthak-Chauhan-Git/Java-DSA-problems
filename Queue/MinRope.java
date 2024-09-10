package Queue;

import java.util.*;

public class MinRope {
    public static int minCost(int[] arr){
        Queue<Integer> cost = new LinkedList<>();

        Arrays.sort(arr);
        int sum = arr[0];
        for(int i = 1; i< arr.length;i++){
            sum = arr[i]+sum;
            cost.add(sum);
        }
        sum = 0;
        while(!cost.isEmpty()){
            sum = cost.remove()+sum;
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(minCost(arr));
    }
}
