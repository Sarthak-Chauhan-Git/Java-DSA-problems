package LinkedList;

public class LLintersection {
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
    public static void detectIntersection(Node head1, Node head2){
        Node curr1 = head1, curr2 = head2;
        while(curr1 != null){
            curr2 = head2;
            while(curr2 != null){ 
                if(curr1 == curr2){
                    System.out.println("Found intersaction at node "+curr1+" with value "+curr1.data);
                    return;
                }
                curr2 = curr2.next;
            }
            curr1 = curr1.next;
        }
        System.out.println("No intersection found");
    }
    public static void main(String[] args){
        LLintersection ll1 = new LLintersection();
        LLintersection ll2 = new LLintersection();

        Node head1 = ll1.addLast(1);
        ll1.addLast(2);
        Node temp2 = ll1.addLast(3);
        Node head2 = ll2.addLast(4);
        ll2.addLast(5);
        Node temp = ll1.addLast(6);
        ll1.addLast(7);
        temp2.next = temp; 
        Node curr = head2;
        while(curr != null){
            curr = curr.next;
        }
        curr = temp;
        ll2.printList(head2);
        ll1.printList(head1);

        detectIntersection(head1, head2);
    }
}
