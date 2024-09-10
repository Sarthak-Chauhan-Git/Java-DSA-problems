package Queue;

public class QusingArr {
    public static int Q[] = new int[5];
    public static int front = -1;
    public static int rear = -1;
    public static void Qprint(int[] Q){
        int i = front;
        System.out.print("[ ");
        while(i<Q.length){
            System.out.print(Q[i]+" ");
            i++;
        }
        System.out.println("]");
    }
    public static void enQ(int val){
        if(rear == Q.length){
            System.out.println("Overflow!");
            return;
        }
        if(front == rear && front == -1){
            front++;
        }
        rear++;
        Q[rear] = val;
        System.out.println("Front "+"->"+front+" Rear "+"->"+rear);
    }
    public static void deQ(){
        if(front == rear){
            System.out.println("Underflow!");
            return;
        }
        Q[front] = 0;
        front++;
    }
    public static void main(String[] args){
        enQ(5);
        enQ(6);
        enQ(7);
        enQ(8);
        enQ(9);
        Qprint(Q);
        deQ();
        deQ();
        Qprint(Q);
    }
}
