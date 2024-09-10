package Stack;

import java.util.Stack;

public class histogramRec {
    public static int biggestRectangle(int[] height){
            
        //NSR

        Stack<Integer> s = new Stack<>();
        int[] nsr = new int[height.length];
        for(int i = height.length-1; i>=0; i--){       //right left variation switch condition
            while(!s.isEmpty() && height[s.peek()] >= height[i]){ // smaller greater variation switch condition
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = height.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //NSL

        s = new Stack<>();
        int[] nsl = new int[height.length];
        for(int i = 0; i<=height.length-1; i++){       //right left variation switch condition
            while(!s.isEmpty() && height[s.peek()] >= height[i]){ // smaller greater variation switch condition
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        int i=0;
        int greatHeight = Integer.MIN_VALUE;
        while (i < height.length) {
            int w = nsr[i] - nsl[i] - 1;
            int h = height[i];
            int area = w*h;
            i++;
            greatHeight = Math.max(greatHeight, area);
        }
        return greatHeight;
    }
    public static void main(String[] args){
        int[] height = {2,1,5,6,2,3};
        System.out.println(biggestRectangle(height));
    }
}
