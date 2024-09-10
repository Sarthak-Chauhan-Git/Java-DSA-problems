import java.util.Scanner;

public class thermo {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        double temp = 103.5;
        String ans = temp>=100? "Have Fever":"No Fever";
        System.out.println(ans);
    }
}
