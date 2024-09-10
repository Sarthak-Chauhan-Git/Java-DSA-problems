package BasicDSA.ArrayList;

import java.util.ArrayList;

public class MonotonicAL {
    public static boolean isMonotonic(ArrayList<Integer> num){
        int n=num.size(),low=0,high=n-1;
        boolean asc;
        if(num.get(0) < num.get(1)){
            asc = true;
        }else{
            asc = false;
        }
        while(low <= high ){
            System.out.println(num.get(low)+" -> "+num.get(high));
            if(num.get(low) > num.get(high) && asc == true){
                System.out.println("Not monotonic");
                return false;
            }
            if(num.get(low) < num.get(high) && asc == false){
                System.out.println("Not monotonic");
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static boolean BruteForce(ArrayList<Integer> num){
        boolean asc = true;
        if(num.get(0) < num.get(1)){
            asc = true;
        }else{
            asc = false;
        }
        for(int i=0; i<num.size(); i++){
            for(int j=i+1; j<num.size(); j++){
                if(num.get(i) > num.get(j) && asc == true){
                    return false;
                }
                if(num.get(i) < num.get(j) && asc == false){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>();
        //int arr[] = {1,2,3,4,5};
        //int arr[] = {5,4,3,2,1};
        //int arr[] = {1,2,4,3,5};
        int arr[] = {1,3,2};
        for(int i = 0; i<arr.length; i++){
            num.add(arr[i]);
        }
        //System.out.println(isMonotonic(num));
        System.out.println(BruteForce(num));
    }
}
