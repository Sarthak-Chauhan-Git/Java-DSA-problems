package BasicDSA.Recursion;
//sum of n natural numbers

public class sumNum {
    public static int sumTotal(int n){
        if(n == 0){
            return 0;
        }
        int sum = n+sumTotal(n-1);
        return sum;
    }
    public static void main(String args[]){
        System.out.println(sumTotal(5));
    }
}
