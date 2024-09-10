package Queue;

import java.util.Stack;

public class QusingStacks {
    public static Stack<Integer> Q = new Stack<>();
    public static Stack<Integer> helper = new Stack<>();
    public static void enQ(int data){
        Q.push(data);
    }
    public static void deQ(){
        while(!Q.isEmpty()){
            helper.push(Q.pop());
        }
        helper.pop();
        while(!helper.isEmpty()){
            Q.push(helper.pop());
        }
    }
    public static void printQ(){
        int i = 0;
        System.out.println("__");
        while(i<Q.size()){
            System.out.println(Q.get(i));
            i++;
        }
        System.out.println("__");
    }
    public static void main(String[] args){
        enQ(5);
        enQ(6);
        enQ(7);
        enQ(8);
        enQ(9);
        printQ();
        deQ();
        deQ();
        printQ();
    }
}
