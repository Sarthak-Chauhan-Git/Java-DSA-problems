package Stack;

import java.util.Stack;

public class usingJCF {
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.add(3);
        s.add(4);
        s.add(5);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
