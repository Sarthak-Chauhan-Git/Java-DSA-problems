package GreedyAlgo;

public class BuySellStock {
    public static int brute(int[] prices) {     // O(n^2)
        // profit calculator
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                max = Math.max(max, prices[j] - prices[i]);
            }
        }
        return max;
    }              
    // O(n)
    public static int optimize(int[] prices){
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length; i++){
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(brute(prices));
        System.out.println(optimize(prices));
    }
}
