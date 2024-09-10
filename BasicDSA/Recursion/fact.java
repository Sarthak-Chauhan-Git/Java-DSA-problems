package BasicDSA.Recursion;

public class fact {
    public static int factorial(int a){
        if(a == 1){
            return 1;
        }
        int fact = a*factorial(a-1);
        return fact;
    }
    public static void main(String args[]){
        System.out.println(factorial(5));
    }
}
