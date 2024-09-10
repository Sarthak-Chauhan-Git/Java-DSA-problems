package Queue;

import java.util.*;

public class QusingJCF{
    public static void main(String[] args){
        //Queue<Integer> Q = new LinkedList<>();     implementation 1
        Queue<Integer> Q = new ArrayDeque<>();          // implementation 2
        Q.add(5);
        Q.add(4);
        Q.add(3);
        Q.add(2);
        Q.add(1);
        while(!Q.isEmpty()){
            System.out.println(Q.peek());
            Q.remove();
        }
    }
}