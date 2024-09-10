package Stack;

import java.util.Stack;

public class pushAtBottom {
    public static Stack<Integer> s = new Stack<>();

    public static void pushBottom(int data){
        //base
        if(s.isEmpty()){
            s.add(data);
            return;
        }
        int val = s.pop();
        pushBottom(data);
        s.add(val);
    }
    public static void main(String[] args){
        s.add(1);
        s.add(2);
        s.add(3);
        pushBottom(4);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
