package Stack;
import java.util.*;
public class Stackusing2Q {
    public static Stack s = new Stack();
    static class Stack{
        Queue<Integer> Q1 = new LinkedList<>();
        Queue<Integer> Q2 = new LinkedList<>();
        boolean isEmpty(){
            return s.Q1.isEmpty() && s.Q2.isEmpty();
        }
    }
    public static void push(int data){
        if(s.Q1.isEmpty()){
            s.Q2.add(data);
        }
        else{
            s.Q1.add(data);
        }
    }
    public static void pop(){
        if(s.isEmpty()){
            System.out.println("Underflow!");
            return;
        }
        if(s.Q1.isEmpty()){
            while(!(s.Q2.isEmpty())){
                int num = s.Q2.remove();
                s.Q1.add(num);
            }
        }
        else{
            while (!(s.Q1.isEmpty())) {
                int num = s.Q1.remove();
                s.Q2.add(num);
            }
        }
    }
    public static void print(){
        System.out.print("[");
        if(s.Q1.isEmpty()){
            while(!(s.Q2.isEmpty())){
                int num = s.Q2.remove();
                System.out.print(num+" ");
                s.Q1.add(num);
            }
        }
        else{
            while(!(s.Q1.isEmpty())){
                int num = s.Q1.remove();
                System.out.print(num+" ");
                s.Q2.add(num);
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args){
        push(5);
        push(4);
        push(3);
        push(2);
        push(1);
        print();
        pop();
        pop();
        print();
        push(6);
        push(7);
        print();
    }
}
