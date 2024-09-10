package GreedyAlgo;

public class BalanceString {
    public static boolean isBalanced(String str){
        int lCount = 0, rCount = 0;
        for(int i =0; i< str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'L'){
                lCount++;
            }
            else{
                rCount++;
            }
        }
        if(rCount == lCount){
            return true;
        }
        return false;
    }
    // approach 1: O(n)
    public static int balancSub(String str){
        int subCount = 0;
        for(int i = 0 ;i < str.length(); i++){
            for(int j = i+1; j <= str.length(); j++){
                String sub = str.substring(i, j);
                if(isBalanced(sub)){
                    i = j;
                    subCount++;
                    System.out.println(sub);
                }
            }
        }
        return subCount;
    }
    // approach 2 : O(n) but better bcz of less operation inside loop
    public static int optimizeSub(String str){
        int r = 0, l = 0,ans = 0;
        for(int i =0 ; i < str. length(); i++){
            char ch = str.charAt(i);
            if(ch == 'L'){
                l++;
            }
            else if(ch == 'R'){
                r++;
            }
            if(r == l){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        String str = "LRRRRLLRLLRL";
        System.out.println("Max balanced sub string : "+balancSub(str));
        System.out.println("Max balanced sub string : "+optimizeSub(str));
    }
}
