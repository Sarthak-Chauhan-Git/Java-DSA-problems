package GreedyAlgo;

import java.util.*;

public class IndianCoins {
    public static void main(String[] args){
        int money[] = {1,2,5,10,20,50,100,200,500,2000};
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int count = 0;
        ArrayList<Integer> note = new ArrayList<>();
        while(value > 0){
            for(int j = money.length-1; j>=0; j--){
                if(value >= money[j]){
                    value = value - money[j];
                    count++;
                    note.add(money[j]);
                    break;
                }
            }
        }
        System.out.println(count);
        System.out.println(note);
        sc.close();
    }
}
