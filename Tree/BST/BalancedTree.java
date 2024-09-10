package Tree.BST;

import java.util.*;

import BasicDSA.Array.printer;

public class BalancedTree {
    public static ArrayList<Integer> inorder(BSTI.node root, ArrayList<Integer> newArr) {
        if(root == null){
            return newArr;
        }
        inorder(root.left, newArr);
        newArr.add(root.data);
        inorder(root.right, newArr);
        return newArr;
    }
    public static void inorder(BSTI.node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" -> ");
        inorder(root.right);
    }
    public static BSTI.node creater(ArrayList<Integer> newArr, int min, int max){
        if(min > max){
            return null;
        }
        int mid = (min+max)/2;
        BSTI.node root = new BSTI.node(newArr.get(mid));
        root.left = creater(newArr, min, mid-1);
        root.right = creater(newArr, mid+1, max);
        return root;
    }
    public static BSTI.node convert(BSTI.node root){
        //inorder
        ArrayList<Integer> newArr = inorder(root, new ArrayList<>());

        //balanced BST formation
        BSTI.node newRoot = creater(newArr, 0, newArr.size()-1);
        return newRoot;
    }

    public static void main(String[] args) {
        BSTI.node root = new BSTI.node(8);
        root.left = new BSTI.node(6);
        root.left.left = new BSTI.node(5);
        root.left.left.left = new BSTI.node(3);
        root.right = new BSTI.node(10);
        root.right.right = new BSTI.node(11);
        root.right.right.right = new BSTI.node(12);

        ArrayList<Integer> newArr = inorder(root, new ArrayList<>());
        printer.print(newArr);
        root = convert(root);
        inorder(root);
    }
}
