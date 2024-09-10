package LinkedList;

public class DoublyLL {
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
            tail = head; 
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }
    public void removeLast(){
        if(tail == null){
            System.out.println("Empty list");
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    public static void reverseLL(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data);
            curr = curr.next;
        }
    }
    public static void reversePrint(){
        Node curr = tail;
        while(curr != null){
            System.out.print(curr.data);
            curr = curr.prev;
        }
    }

    public static void main(String[] args){
        DoublyLL dll = new DoublyLL();
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        
        printList(head);
        reverseLL();
        printList(head);
        // System.out.println();
        // reversePrint();
        // System.out.println();
        // System.out.println("Size is : "+size);
    }
}
