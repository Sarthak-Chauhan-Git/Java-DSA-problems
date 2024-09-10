package BitManipulation;

import java.util.Scanner;

public class BitManipulation {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter a decimal no. : ");
        int bit = sc.nextInt();
        System.out.println("Bit is : "+bit);
        System.out.println("AND " + (bit&6));
        System.out.println("OR "+ (bit|6));
        System.out.println("XOR "+ (bit^6));
        System.out.println("1's compliment "+ (~bit));
        System.out.println("Left shift "+ (5<<2));
        System.out.println("Right shift "+ (5>>2));
    }    
}
