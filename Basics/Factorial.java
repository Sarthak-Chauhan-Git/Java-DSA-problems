import java.util.Scanner;

public class Factorial {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter a no. to check factorial :");
        int n = sc.nextInt();
        int fact=1;
        for(int i=n; i>0; i--){
            fact*=i; 
        }
        System.out.println("Factorial of "+n+" is :"+ fact);
    }
    
}
