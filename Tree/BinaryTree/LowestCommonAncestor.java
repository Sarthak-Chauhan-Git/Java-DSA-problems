package Tree.BinaryTree;

import java.util.*;

public class LowestCommonAncestor {

    //appraoch 1 : space complexity : O(n), time complexity : O(n)
    public static boolean pathFinder(BTI.node root, int n, ArrayList<BTI.node> path){
        //base
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        
        boolean leftPath = pathFinder(root.left, n, path);
        boolean rightPath = pathFinder(root.right, n, path);

        if(leftPath || rightPath){
            return true;
        }
        path.remove(path.size()-1);
        return false;

    }
    public static BTI.node lca(BTI.node root, int n1, int n2){
        ArrayList<BTI.node> p1 = new ArrayList<>();
        ArrayList<BTI.node> p2 = new ArrayList<>();

        //path calculator
        pathFinder(root, n1, p1);
        pathFinder(root, n2, p2);

        int i = 0;
        for(; i< p1.size() && i< p2.size(); i++){
            if(p1.get(i).data != p2.get(i).data){
                break;
            }
        }

        BTI.node lca = p1.get(i-1);
        return lca;
    }

    //appraoch 2 : space complexity : O(1), time complexity : O(n)
    public static BTI.node lca2(BTI.node root, int n1, int n2){
        //base
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        BTI.node left = lca2(root.left, n1, n2);
        BTI.node right = lca2(root.right, n1, n2);

        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }
        return root;
    }
    public static void main(String[] args){
        /*
         *      1
         *     2 3
         *   4 5 6 7
         */
        int n1 = 4, n2 = 7;
        BTI.node root = new BTI.node(1);
        root.left = new BTI.node(2);
        root.right = new BTI.node(3);
        root.left.left = new BTI.node(4);
        root.left.right = new BTI.node(5);
        root.right.left = new BTI.node(6);
        root.right.right = new BTI.node(7);
        System.out.println(lca(root,n1,n2).data);
        System.out.println(lca2(root,n1,n2).data);
    }    
}
