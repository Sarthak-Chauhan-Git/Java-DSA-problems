//Most important logic
package Stack;

import java.util.Stack;
import BasicDSA.Array.printer;

public class nextGreatEle {
    public static Stack<Integer> s = new Stack<>();
    public static int[] nextGreat(int[] arr){
        int[] great = new int[arr.length];

        for(int i = arr.length-1; i>=0; i--){       //right left variation switch condition
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){ // smaller greater variation switch condition
                s.pop();
            }
            if(s.isEmpty()){
                great[i] = -1;
            }else{
                great[i] = arr[s.peek()];
            }
            s.push(i);
        }

        return great;
    }
    public static void main(String[] args){
        int arr[] = {6,8,0,1,3};
        int great[] = nextGreat(arr);
        printer.print(great);
    }
}
