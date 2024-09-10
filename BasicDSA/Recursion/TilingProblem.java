package BasicDSA.Recursion;

public class TilingProblem {
    public static int placeTile(int n){
        if(n == 0 || n==1){
            return 1;
        }
        return placeTile(n-2)+placeTile(n-1);
    }
    public static void main(String[] args){
        int n=4;
        System.out.println(placeTile(n));
    }
}
