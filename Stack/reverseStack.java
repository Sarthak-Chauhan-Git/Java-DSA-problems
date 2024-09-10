package Stack;

import java.util.Stack;

public class reverseStack {
    public static Stack<Integer> s = new Stack<>(); //4->3->2->1
    public static void reverse(){
        Stack<Integer> temp = new Stack<>();    //1->2->3->4
        while(!s.isEmpty()){
            int curr = s.pop();
            temp.add(curr);
        }
        System.out.println("Reverse : ");
        s = temp;
        while(!s.isEmpty()){
            System.out.println(temp.pop());
        }
    }
    public static void main(String[] args){
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        reverse();
    }
}
