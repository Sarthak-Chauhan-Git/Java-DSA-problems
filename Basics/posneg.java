import java.util.Scanner;

public class posneg {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter no. you want to check : ");
        int n = sc.nextInt();
        String ans = (n>=0)? "'positive'":"'negetive'";
        System.out.println(ans);
    }
    
}
