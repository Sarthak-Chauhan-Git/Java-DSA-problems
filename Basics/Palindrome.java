import java.util.Scanner;

public class Palindrome {
    public static Scanner sc = new Scanner(System.in);
    public static void Pal(int n){
        int temp = n;
        int rev = temp%10;
        temp = temp/10;
        while(temp > 0){
            int rem = temp%10;
            rev = (rev*10)+rem;
            temp = temp/10;
        }
        if(n == rev){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    
    public static void main(String args[]){
        int num = sc.nextInt();
        Pal(num);
    }
}
