package LinkedList;

public class CircularLL {
    public static Node head;
    public static Node tail;
    public static int size = 0;
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        newNode.next = head;
        size++;
        //System.out.println("Added "+data);
    }
    public void removeLast(){
        if(head == tail){
            System.out.println("Empty list!");
            return;
        }
        //System.out.println("removed "+tail.data);
        tail = tail.prev;
        tail.next = head;
        size--;
    }
    public void printLL(Node head){
        //System.out.println("Printing ...");
        Node slow = head;
        Node fast = head.next;
        while(fast != slow){
            System.out.print(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.print(slow.data);
        System.out.println();
    }
    public static void main(String[] args){
        CircularLL cll = new CircularLL();
        cll.addLast(1);
        cll.addLast(2);
        cll.addLast(3);
        cll.addLast(4);
        cll.addLast(5);
        cll.addLast(6);

        cll.printLL(head);

        cll.removeLast();
        cll.removeLast();

        cll.printLL(head);
    }
}
