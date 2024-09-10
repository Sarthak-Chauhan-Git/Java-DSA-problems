package BitManipulation;
import java.util.Scanner;

public class BiToDec{
    public static Scanner sc = new Scanner(System.in);
    public static int BiDec(int n){
        int BiNum = n;
        int pow = 0;
        int DecNum = 0;

        while(BiNum > 0){
            int lastDigit = BiNum%10;
            DecNum = DecNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            BiNum = BiNum/10;
        }
        return DecNum;
    }

    public static int DecBi(int n){
        int BiNum = 0;
        int pow = 0;
        while(n > 0){
            int rem = n%2;
            BiNum = BiNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        return BiNum;
    }
    public static void main(String args[]){
        int B = sc.nextInt();
        System.out.println(BiDec(B));
        int D = sc.nextInt();
        System.out.println(DecBi(D));
    }
}