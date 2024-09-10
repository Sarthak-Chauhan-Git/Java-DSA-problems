package Stack;

import java.util.ArrayList;

public class usingArrayList {
    public static ArrayList<Integer> stack = new ArrayList<>();
    public static int top = -1;
    public static void add(int data){
        top++;
        stack.add(data);
    }
    public static void pop(){
        if(top < 0){
            System.out.println("Underflow");
            return;
        }
        stack.remove(top);
        top--;
    }
    public static int peek(){
        if(top < 0){
            System.out.println("Empty stack!");
            return -1;
        }
        return stack.get(top);
    }

    public static void main(String[] args){
        add(3);
        add(4);
        add(5);
        System.out.println(peek());
        pop();
        System.out.println(peek());
        pop();
        System.out.println(peek());
        pop();
        System.out.println(peek());
        pop();
    }   
}
