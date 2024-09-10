package BasicDSA.Array;

public class BestStock {
    public static int maxProfit(int price[]){
        int profit=0,buy=0,sell=0;
        int bestbuy=0;
        buy = price[0];
        for(int i=1; i<price.length; i++){
            sell = price[i];
            if((sell-buy)>profit)profit = sell-buy;
            if(buy>price[i]){
                buy=price[i];
                bestbuy=i;
            }
        }
        System.out.println("Best buy day : "+bestbuy+"th");
        return profit;
    }
    public static void main(String args[]){
        int price[] = {7,6,4,3,1};
        System.out.println("Maximum profit obtainable is : "+maxProfit(price));
    }
}
