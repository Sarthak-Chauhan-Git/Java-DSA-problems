// Create a keypad mobile key map for letters and digits like 2-abc and print permutations of two digits entered by user like- 2,3 => ("ad", "ae", "af", "bd", "be", "bf","cd", "ce", "cf")

package BasicDSA.Backtracking;

import java.util.Scanner;

public class KeypadMapping {
    public static Scanner sc = new Scanner(System.in);

    public static void bsf(int idx, int len, StringBuilder str, String num, char map[][]){
        if(idx == len){
            System.out.println(str.toString());
            return;
        }
        char ch = num.charAt(0);
        int row = ch-'2';
        char chArray[] = map[row];
        for(int i=0; i<map[row].length; i++){
            bsf(idx+1,len,new StringBuilder(str).append(chArray[i]),num,map);
        }
        return;
    }

    public static void pnc(char map[][], String num){
        int len = num.length();
        if(len == 0){
            System.out.println("");
            return;
        }
        bsf(0, len, new StringBuilder("") , num, map);
    }
    public static void main(String[] args){
        char map[][] = {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
        System.out.println("press two numbers to get all permutation and combination : ");
        String num = sc.nextLine();
        pnc(map,num);
    }
}
