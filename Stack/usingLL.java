package Stack;

public class usingLL {
    public class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static usingLL stack = new usingLL();
    public static Node top;

    public void add(int data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }
    public static int pop(){
        if(top == null){
            System.out.println("underflow!");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }
    public static int peek(){
        if(top == null){
            System.out.println("Empty stack!");
            return -1;
        }
        return top.data;
    }
    public static void main(String[] args){
        stack.add(3);
        stack.add(4);
        stack.add(5);
        System.out.println(peek());
        pop();
        System.out.println(peek());
        pop();
        System.out.println(peek());
        pop();
        System.out.println(peek());
        pop();
    }
}
