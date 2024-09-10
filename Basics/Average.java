import java.util.*;

public class Average {
    public static Scanner sc = new Scanner(System.in);
    //function to calculate average 
    public static int Avg(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        System.out.println("Enter three no. :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.println("Average of these numbers is : "+avg);
        System.out.println("Average of these no. by function is :"+ Avg(a, b, c));
    }
}
