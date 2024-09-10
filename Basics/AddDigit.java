import java.util.Scanner;

public class AddDigit {
    public static Scanner sc = new Scanner(System.in);
    public static int Add(int n){
        int sum = 0;
        while(n > 0){
            int rem = n%10;
            sum = sum+rem;
            n = n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        int n = sc.nextInt();
        System.out.println("Sum of digits = "+Add(n));
    }
}
