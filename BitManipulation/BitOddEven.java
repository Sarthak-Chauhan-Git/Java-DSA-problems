package BitManipulation;

import java.util.*;

public class BitOddEven{
    public static Scanner sc = new Scanner(System.in);
    public static void checkBit(int num){
        int bitmask = 1;
        if((num&bitmask) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String args[]){
        System.out.println("Enter a number to check odd or even : ");
        int num = sc.nextInt();
        checkBit(num);
    }
}