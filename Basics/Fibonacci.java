import java.util.*;

public class Fibonacci {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter range to print fibonnaci");
        int n = sc.nextInt();
        int i=0,j=1;
        System.out.println(i+"\n"+j);
        while(n>=0){
            n--;
            int sum = i+j;
            System.out.println(sum);
            i=j;
            j=sum;
        }


    }
}
