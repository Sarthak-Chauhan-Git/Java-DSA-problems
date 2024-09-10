package LinkedList;

//we have to keep m nodes then delete n nodes until null
public class MnN {
    public static Node head;
    public static Node tail;
    public static int size;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node addLast(int data) {
        // new Node
        Node newNode = new Node(data);
        // empty list
        if (head == null) {
            head = newNode;
            tail = newNode;
            return newNode;
        }
        // traversal to last Node
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        // tail update
        currNode.next = newNode;
        tail = newNode;
        return newNode;
    }
    public void removeLast() {
        // empty list
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        // traversal
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
        System.out.println("Removed");
    }
    public void printList(Node head) {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void MnNoptimization(Node head){
        int m,n;
        Node curr = head;
        while(curr != null){
            m=3;
            Node prev = curr;
            while(m>0){
                prev = curr;
                curr = curr.next;
                m--;
            }
            n = 2;
            while (n>0) {
                if(curr == null){
                    return;
                }
                curr = curr.next;
                n--;
            }
            prev.next = curr;
            curr = prev.next;
        }
    }
    public static void main(String[] args){
        MnN ll = new MnN();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(10);

        ll.printList(head);

        ll.MnNoptimization(head);

        ll.printList(head);
    }
}
