package LinkedList;

import java.util.Scanner;

public class LL {
    public static Scanner sc = new Scanner(System.in);
    public static Node head = null;
    public static Node tail = null;

    // Node structure
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add function to linked list
    public void addFirst(int data) {
        // new Node
        Node newNode = new Node(data);
        // empty list
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        // Head adjustment
        newNode.next = head;
        head = newNode;
    }

    public Node addLast(int data) {
        // new Node
        Node newNode = new Node(data);
        // empty list
        if (head == null) {
            head = newNode;
            tail = newNode;
            return head;
        }
        // traversal to last Node
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        // tail update
        currNode.next = newNode;
        tail = newNode;
        return head;
    }

    public void addPos(int data, int key) {
        // new Node
        Node newNode = new Node(data);
        // empty list
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        // corner cases
        if (head.data == key) {
            addFirst(data);
        }
        // traversal
        Node nextNode = head;
        Node currNode = nextNode;
        while (nextNode != null) {
            if (nextNode.data == key) {
                Node temp = currNode.next;
                currNode.next = newNode;
                newNode.next = temp;
                System.out.println("Added");
                return;
            }
            currNode = nextNode;
            nextNode = nextNode.next;
        }
        System.out.println("Position not found so value added in last of the list");
        addLast(data);
    }

    // Search function in linked list
    public Node linearSearch(int key) {
        int i = 0;
        // empty list
        if (head == null) {
            System.out.println("List empty");
            return head;
        }
        // traversal
        Node currNode = head;
        while (currNode != null) {
            if (currNode.data == key) {
                System.out.println("Found at : " + i);
                return currNode;
            }
            currNode = currNode.next;
            i++;
        }
        System.out.println("Not found!");
        return null;
    }

    public Node recursiveSearch(Node currNode, int key, int idx) {
        if (currNode == null) {
            System.out.println("Not found!");
            return null;
        }
        if (currNode.data == key) {
            System.out.println("Found at : " + idx);
            return currNode;
        }
        return recursiveSearch(currNode.next, key, idx + 1);
    }

    // remove/delete function
    public void removeFirst() {
        // empty list
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        // traversal
        head = head.next;
        System.out.println("Removed");
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

    public void removePos(int key) {
        // empty list
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        // corner cases
        if (head.data == key) {
            removeFirst();
        }
        // traversal
        Node currNode = head;
        Node prevNode = currNode;
        while (currNode != null) {
            if (currNode.data == key) {
                prevNode.next = currNode.next;
                System.out.println("Removed");
                return;
            }
            prevNode = currNode;
            currNode = currNode.next;
        }
    }

    // printer
    public static void printList(Node head) {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // switches
    public static void add(LL ll) {
        int i = 1;
        while (i == 1) {
            System.out.println(
                    "Enter your choice\n 1 - add at begining\n 2 - add at last\n 3 - add at position\n 4 - exit");
            int ch = sc.nextInt();
            int data = 0;
            if (ch < 4 && ch > 0) {
                System.out.println("Enter data to add");
                data = sc.nextInt();
            }
            switch (ch) {
                case 1:
                    ll.addFirst(data);
                    break;
                case 2:
                    ll.addLast(data);
                    break;
                case 3:
                    System.out.println("Enter value of position you want to add before");
                    int key = sc.nextInt();
                    ll.addPos(data, key);
                    break;
                case 4:
                    i = 0;
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
    }

    public static void remove(LL ll) {
        int i = 1;
        while (i == 1) {
            System.out.println(
                    "Enter your choice\n 1 - remove begining\n 2 - remove last\n 3 - remove at position\n 4 - exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    ll.removeFirst();
                    break;
                case 2:
                    ll.removeLast();
                    ;
                    break;
                case 3:
                    System.out.println("Enter value of position you want to remove");
                    int key = sc.nextInt();
                    ll.removePos(key);
                    break;
                case 4:
                    i = 0;
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
    }

    // reverse a list
    public static void reverse(LL ll) {
        if (LL.head == null) {
            System.out.println("Empty list");
            return;
        }
        LL.Node prev = null;
        LL.Node curr = LL.head;
        LL.Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // check palindrome
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        // calculate mid
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        // reverse half
        LL.Node prev = null;
        LL.Node curr = slow;
        while (curr != null) {
            LL.Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        // compare
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // remove cycles
    public static void removeCycles() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        // find last Node
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove cycle
        prev.next = null;
    }

    // public static void main(String[] args) {
    // head = new Node(1);
    // head.next = new Node(2);
    // head.next.next = new Node(3);
    // head.next.next.next = head; // 1-2-3-1
    // removeCycles();
    // printList(head);
    // }

    // merge sort
    public static Node merge(Node leftHead, Node rightHead) {
        Node tempLL = new Node(-1);
        Node temp = tempLL;
        while (leftHead != null && rightHead != null) {
            if (leftHead.data < rightHead.data) {
                temp.next = leftHead;
                temp = temp.next;
                leftHead = leftHead.next;
            } else {
                temp.next = rightHead;
                temp = temp.next;
                rightHead = rightHead.next;
            }
        }
        while (leftHead != null) {
            temp.next = leftHead;
            temp = temp.next;
            leftHead = leftHead.next;
        }
        while (rightHead != null) {
            temp.next = rightHead;
            temp = temp.next;
            rightHead = rightHead.next;
        }
        return tempLL.next;
    }

    public static Node sortLL(Node head) {
        // base
        if (head.next == null || head == null) {
            return head;
        }
        // find mid node
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // divide
        Node rightHead = slow.next;
        Node leftHead = head;
        slow.next = null;
        Node newLeft = sortLL(leftHead);
        Node newRight = sortLL(rightHead);
        Node temp = merge(newLeft, newRight);
        return temp;
    }

    // ZigZag LL
    public static Node zigzagLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // calculate mid
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        // reverse half
        Node prev = null;
        Node curr = slow.next;
        slow.next = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // {
        //     System.out.println("reversed half : " + slow);
        //     printList(right);
        // }

        // new LL
        Node nextL,nextR;
        while (right != null && left != null) {
           nextL = left.next;
           left.next = right;
           nextR = right.next;
           right.next = nextL;

           left = nextL;
           right = nextR;
        }
        return head;
    }

    public static void main(String[] args) {
        LL ll = new LL();
        int i = 1;
        while (i == 1) {
            System.out.println(
                    "Enter your choice\n 1 - add\n 2 - remove\n 3 - print\n 4 - search\n 5 - reverse list\n 6 - check palindrome\n 7 - merge sort\n 8 - zigzag list\n 9 - exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    add(ll);
                    break;
                case 2:
                    remove(ll);
                    break;
                case 3:
                    printList(head);
                    break;
                case 4:
                    System.out.println("Enter value to search");
                    int key = sc.nextInt();
                    ll.recursiveSearch(head, key, 0);
                    break;
                case 5:
                    reverse(ll);
                    break;
                case 6:
                    System.out.println(isPalindrome(head));
                    break;
                case 7:
                    Node temp = sortLL(head);
                    printList(temp);
                    break;
                case 8:
                    Node temp2 = zigzagLL(head);
                    printList(temp2);
                    break;
                case 9:
                    i = 0;
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
    }
}
