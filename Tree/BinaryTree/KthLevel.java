package Tree.BinaryTree;

import java.util.*;

public class KthLevel {
    //recursive approach    O(n)
    public static void kthEle(BTI.node root,int k,int h){
        //base 
        if(root == null){
            return;
        }
        
        //calls
        if(k == h){
            System.out.print(root.data+" ");
            return;
        }
        kthEle(root.left, k, h+1);
        kthEle(root.right, k, h+1);
    }

    //Iterative approach    O(n)
    public static void kthEle(BTI.node root, int k){
        Queue<BTI.node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int lvl = 1;
        while(!q.isEmpty()){
            BTI.node curr = q.remove();
            if(curr == null){
                lvl++;
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(lvl == k){
                    System.out.print(curr.data+" ");
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static void main(String[] args){
         /*
         *      1
         *     2 3
         *   4 5 6 7
         */
        BTI.node root = new BTI.node(1);
        root.left = new BTI.node(2);
        root.right = new BTI.node(3);
        root.left.left = new BTI.node(4);
        root.left.right = new BTI.node(5);
        root.right.left = new BTI.node(6);
        root.right.right = new BTI.node(7);
        kthEle(root, 3);
        System.out.println();
        kthEle(root, 3, 1);
    }
}
