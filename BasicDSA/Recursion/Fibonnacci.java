package BasicDSA.Recursion;

public class Fibonnacci {
    public static int printFibbonacci(int n){
        if(n == 0|| n==1){
            return n;
        }
        int prev = printFibbonacci(n-2);
        int curr = printFibbonacci(n-1);
        int sum = prev+curr;
        System.out.println(sum);
        return sum;
    }
    public static void main(String args[]){
        printFibbonacci(5);
    }
}
