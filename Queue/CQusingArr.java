package Queue;

public class CQusingArr {
    public static int Q[] = new int[5];
    public static int size = Q.length;
    public static int front = -1;
    public static int rear = -1;
    public static void Qprint(int[] Q){
        while(!(front == -1 && rear == -1)){
            System.out.println(Q[front]);
            deQ();
        }
    }
    public static boolean isFull(){
        return (rear+1)%size == front;
    }
    public static void enQ(int val){
        if(isFull()){
            System.out.println("Overflow!");
            return;
        }
        if(front == rear && front == -1){
            front++;
        }
        rear = (rear+1)%size;
        Q[rear] = val;
        //System.out.println("Front "+"->"+front+" Rear "+"->"+rear);
    }
    public static void deQ(){
        if(rear == -1 && front == -1){
            System.out.println("Underflow!");
            return;
        }
        if(front == rear){
            front = rear = -1;
            return;
        }
        Q[front] = 0;
        front = (front+1)%size;
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
        enQ(5);
        enQ(6);
        Qprint(Q);
    }
}
