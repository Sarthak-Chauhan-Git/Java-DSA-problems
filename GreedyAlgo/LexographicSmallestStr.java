package GreedyAlgo;

import java.util.*;

public class LexographicSmallestStr {
    // Class that have its own comparator
    // public static class alpha implements Comparable<alpha> {
    //     char ch;
    //     int val;

    //     alpha(char ch, int val) {
    //         this.ch = ch;
    //         this.val = val;
    //     }

    //     @Override
    //     public int compareTo(alpha other) {
    //         return Character.compare(this.ch, other.ch); // Sort based on character
    //     }
    // }

    public static char[] lexo_small(int n, int k) {
        char arr[] = new char[n];
        Arrays.fill(arr, 'a');          // a is stored in every index
        for (int i = n - 1; i >= 0; i--) {  // reverse loop
            k -= i;                         //to get exact distinct needed characters
            if (k >= 0) {                   //if k >= 0 then that means we need exact 1 or more distinct characters
                if (k >= 26) {  
                    arr[i] = 'z';
                    k -= 26;                //updating k
                } else {
                    arr[i] = (char) (k + 97 - 1);
                    k -= arr[i] - 'a' + 1;  //updating k with exact needed value
                }
            } else
                break;
            k += i;                         //add value back for next iteration 
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = 4, k = 48;
        // ArrayList<alpha> arr = new ArrayList<>();
        // char ch = 'a';
        // for (int i = 1; i <= 26; i++) {
        //     arr.add(new alpha(ch, i));
        //     ch++;
        // }
        // Collections.sort(arr, Collections.reverseOrder());
        // for(int i = 0; i < arr.size(); i++){
        // System.out.println(arr.get(i).val+" -> "+arr.get(i).ch);
        // }
        System.out.println(lexo_small(n, k));
}
}
