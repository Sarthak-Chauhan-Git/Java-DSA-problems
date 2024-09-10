package Queue;

import java.util.*;

public class ReverseK {
    public static void revOrder(Queue<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();
        Queue<Integer> tempQ = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }
        while (!q.isEmpty()) {
            tempQ.add(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        while(!tempQ.isEmpty()){
            q.add(tempQ.remove());
        }
        System.out.println(q);
    }

    public static void main(String[] args) {
        int k = 5;
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        revOrder(q, k);
    }
}