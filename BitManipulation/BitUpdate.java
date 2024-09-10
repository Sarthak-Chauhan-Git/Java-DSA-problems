package BitManipulation;

import java.util.Scanner;

public class BitUpdate {
    public static Scanner sc = new Scanner(System.in);

    public static int getBit(int bit){
        System.out.println("Enter index to get bit");
        int idx = sc.nextInt();
        int bitmask = 1<<idx;
        if((bit & bitmask)==0)
        System.out.println("Bit at "+idx+" is : "+ 0);
        else{
            System.out.println("Bit at "+idx+" is : "+ 1);
        }
        return bit&bitmask ;
    }
    public static int setBit(int bit){
        System.out.println("Enter index to set bit");
        int idx = sc.nextInt();
        int bitmask = 1<<idx;
        System.out.println("Bit at "+idx+"is "+ (bit & bitmask)+" now set to : "+(bit | bitmask));
        return bit|bitmask ;
    }
    public static int clearBit(int bit){
        System.out.println("Enter index to clear bit");
        int idx = sc.nextInt();
        int bitmask = ~(1<<idx);
        System.out.println("Bit at "+idx+"is : "+ (bit & bitmask));
        return bit&bitmask ;
    }
    public static int clearRange(int bit){
        System.out.println("Enter range from i to j \ni : ");
        int i = sc.nextInt();
        System.out.println("j :");
        int j = sc.nextInt();
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        System.out.println("New bit : "+(bit&bitmask));
        return bit&bitmask;
    }
    public static int checkPowOf2(int bit){
        int bitmask = bit-1;
        if((bit & bitmask)==0){
            System.out.println("It is power of two");
        }else{
            System.out.println("Not power of two");
        }
        return bit&bitmask;
    }
    public static int countSetBits(int bit){
        int count = 0, bitmask = 1;
        while(bit != 0){
            if((bit&bitmask)!=0){
                count++;
            }
            bit = bit>>1;
        }
        System.out.println("Number of set bits : "+count);
        return count;
    }
    public static int fastExponentiation(int bit){
        System.out.println("Enter power : ");
        int pow = sc.nextInt();
        int ans = 1;
        System.out.print(bit+"^"+pow+" = ");
        while(bit > 0){
            if((bit & 1) != 0){
                ans = ans*pow;
            }
            System.out.println(pow);
            pow*=pow;
            bit = bit>>1;
        }
        System.out.println(ans);
        return ans;
    }
    public static void main(String args[]){
        System.out.println("Enter a number in binary to manipulate : ");
        int bit = sc.nextInt(), i = 1;
        while(i!=0){
            System.out.println("Enter your choice \n1 - get bit\n2 - clear bit\n3 - set bit\n4 - clear range of bits\n5 - check if no. is power of 2\n6 - no. of set bits\n7 - fast exponentiation\n0 - EXIT");
            int ch = sc.nextInt();
            switch (ch) {
                case 0:
                    i=0;
                    break;
                case 1:
                    getBit(bit);
                    break;
                case 2:
                    clearBit(bit);
                    break;
                case 3:
                    setBit(bit);
                    break;
                case 4:
                    clearRange(bit);
                    break;
                case 5:
                    checkPowOf2(bit);
                    break;
                case 6:
                    countSetBits(bit);
                    break;
                case 7:
                    fastExponentiation(bit);
                    break;
                default:
                System.out.println("Invalid input! Enter from the choice given ONLY");
                    break;
            }
        }
    }
}
