package LinkedList;

public class NodeSwap {
    public static LL.Node head;
    public static void nodeSwap(LL ll,int x, int y){
        LL.Node curr = head;
        while(curr != null){
            LL.Node curr2 = curr;
            while (curr2 != null) {
                if(curr.next == null || curr2.next == null){
                    System.out.println("Value not found!");
                    return;
                }
                if(curr.next.data == x && curr2.next.data == y){
                    LL.Node nextTemp1 = curr.next.next;  //3
                    LL.Node temp1 = curr.next;  //2
                    LL.Node nextTemp2 = curr2.next.next; //null
                    LL.Node temp2 = curr2.next; //4
                    curr.next = temp2;
                    temp2.next = nextTemp1;
                    nextTemp1.next = temp1;
                    temp1.next = nextTemp2;
                    return;
                }
                curr2 = curr2.next;
            }
            curr = curr.next;
        }
        
    }
    public static void main(String[] args){
        
        LL ll = new LL();
        head = ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
       
        int key1 = 2, key2 = 4;
        LL.printList(head);
        nodeSwap(ll,key1,key2);
        LL.printList(head);
    }
}
