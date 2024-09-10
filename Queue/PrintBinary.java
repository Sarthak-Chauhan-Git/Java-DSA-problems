//Print binary no. till n
package Queue;

import java.util.*;

public class PrintBinary {
    public static Scanner sc = new Scanner(System.in);

    public static void binaryPrinter(int n) {
        Deque<Integer> dq = new LinkedList<>();
        //Stack<Integer> s = new Stack<>();
        dq.add(0);
        for (int i = 0; i <= n; i++) {
            int temp = i;
            while(temp > 0){
                int rem = temp%2;
                //q.add(rem);
                dq.addFirst(rem);      
                temp = (int)temp/2;          
            }
            System.out.print(i+" : ");
            while (!dq.isEmpty()) {
                System.out.print(dq.removeFirst()+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        binaryPrinter(n);
    }
}
