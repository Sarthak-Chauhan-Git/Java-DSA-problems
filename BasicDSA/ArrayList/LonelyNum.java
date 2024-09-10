package BasicDSA.ArrayList;

import java.util.ArrayList;

public class LonelyNum {

    public static ArrayList<Integer> BruteForce(ArrayList<Integer> num){
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<num.size(); i++){
            boolean flag = false;
            for(int j=0; j<num.size(); j++){
                if(i==j){
                    continue;
                }
                if(num.get(j) == (num.get(i)-1) || num.get(j) == (num.get(i)+1) || num.get(j) == num.get(i)){
                    flag = true;
                }
            }
            if(!flag){
                ans.add(num.get(i));
            }
        }

        return ans;
    }
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>();
        int arr[] = {1,3,5,3};
        for(int i=0; i<arr.length; i++){
            num.add(arr[i]);
        }
        System.out.println("Lonely numbers are : "+BruteForce(num));
    }
}
