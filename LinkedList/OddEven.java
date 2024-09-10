package LinkedList;

public class OddEven {
    public static Node evenHead;
    public static Node oddHead;
    public static Node evenTail;
    public static Node oddTail;
    public static Node head;
    public static Node tail;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node addLast(int data) {
        System.out.println("Add");
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return newNode;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        tail = newNode;
        return newNode;
    }

    public static void printList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }   
        System.out.println();
    }

    public static void oddEvenRacism(){
        Node curr = head;
        while(curr != null){
            Node next = curr.next;
            if(curr.data%2 == 0){
                if(evenHead == null){
                    evenHead = curr;
                    evenTail = curr;
                }
                else{
                    evenTail.next = curr;
                    evenTail = curr;
                }
            }
            if(curr.data%2 != 0){
                if(oddHead == null){
                    oddHead = curr;
                    oddTail = curr;
                }
                else{
                    oddTail.next = curr;
                    oddTail = curr;
                }
            }
            curr = next;
        }

        if (evenHead == null) {
            head = oddHead;
        } else {
            head = evenHead;
            evenTail.next = oddHead;
        }

        if (oddHead != null) {
            oddTail.next = null;
        } else {
            evenTail.next = null;
        }

        tail = oddTail != null ? oddTail : evenTail;
    }
    public static void main(String[] args) {
        // 8->12->10->5->4->1->6->NULL

        OddEven oddEven = new OddEven();
        oddEven.addLast(8);
        oddEven.addLast(12);
        oddEven.addLast(10);
        oddEven.addLast(5);
        oddEven.addLast(4);
        oddEven.addLast(1);
        oddEven.addLast(6);

        printList();

        oddEvenRacism();

        printList();
    }
}