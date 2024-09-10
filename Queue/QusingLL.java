package Queue;

public class QusingLL {
    public static node front = null;
    public static node rear = null;
    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static node enQ(int data){
        node newNode = new node(data);
        if(front == null){
            front = newNode;
            rear = newNode;
            return newNode;
        }
        rear.next = newNode;
        rear = newNode;
        return newNode;
    }
    public static void deQ(){
        if(front == rear){
            front = null;
            rear = null;
            return;
        }
        front = front.next;
        return;
    }
    public static void printQ(){
        node curr = front;
        while(curr != null){
            System.out.print(curr.data+" -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
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
