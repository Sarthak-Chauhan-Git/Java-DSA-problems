package Stack;

import java.util.Stack;

import BasicDSA.Array.printer;

public class stockSpanProblem {
    public static int[] stockSpan(int[] stock){
        Stack<Integer> high = new Stack<>();
        int len = stock.length -1;
        int spanArr[] = new int[len+1];

        spanArr[0] = 1;
        high.push(0);
        for(int i = 1; i<= len; i++){
            while(stock[i]>stock[high.peek()] && !high.isEmpty()){
                high.pop();
            }
            if(high.isEmpty()){
                spanArr[i] = i+1;
            }
            else{
                int span = i - high.peek();
                spanArr[i] = span;
            }
            high.push(i);
        }

        return spanArr;
    }
    public static void main(String[] args){
        int stock[] = {100,80,60,70,60,85,100};
        int span[] = stockSpan(stock);
        printer.print(span);
    }
}
