import java.util.Scanner;

public class PrimeNo{
    public static Scanner sc = new Scanner(System.in);
    public static boolean isPrime(int n){
        for(int i=2; i<Math.sqrt(n); i++){ //all no. have unique multiple till half way then they have repretations so we use sqrt(n)
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println("Enter no. to check prime : ");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("It is a prime no.");
        }else{
            System.out.println("Not a prime no.");
        }
    }
}